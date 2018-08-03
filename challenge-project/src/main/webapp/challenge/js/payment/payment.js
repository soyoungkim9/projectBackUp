


/*swal("결제가 완료되었습니다.", "화이또", "success");

location.href="../main/main.html"*/
if (location.href.split("?").length > 1) {
	
	
		
	
		
		
	var no = location.href.split("?")[1].split("=")[1];
	$.getJSON(serverRoot + "/json/program/" + no, (data) => {
		$('.project-title').append("<b>"+data.name+"</b>");
		function addComma(num) {
			var regexp = /\B(?=(\d{3})+(?!\d))/g;
			return num.toString().replace(regexp, ',');
		}
		var num = data.price;
		$('.p-price').append(addComma(num)+" 원");
		$('.p-trainer').append(data.trainerNo.name);
	}); 

//	------------------------- 수량 증가 ---------------------------//



	var Clicks = 1 ;
	function AddClick() {
		$.getJSON(serverRoot + "/json/program/" + no, (data) => {

			Clicks = Clicks + 1;
			document.getElementById('p-value').innerHTML = Clicks ;

			function addComma(num) {
				var regexp = /\B(?=(\d{3})+(?!\d))/g;
				return num.toString().replace(regexp, ',');
			}
			var num = data.price * document.getElementById('p-value').innerHTML;
//			$('.p-price').html(data.price * document.getElementById('p-value').innerHTML  +' 원');
			$('.p-price').html(addComma(num)  +' 원');

		}); 

	}
	function MinusClick() {

		$.getJSON(serverRoot + "/json/program/" + no, (data) => {

			Clicks = Clicks - 1;
			document.getElementById('p-value').innerHTML = Clicks ;
			function addComma(num) {
				var regexp = /\B(?=(\d{3})+(?!\d))/g;
				return num.toString().replace(regexp, ',');
			}
			var num = data.price * document.getElementById('p-value').innerHTML;
			$('.p-price').html(addComma(num)  +' 원');



		}); 


	}


//	--------------------------카카오페이 api--------------------------//
	

	function requestPay() {
		
			



	

		$.getJSON(serverRoot + "/json/program/" + no, (data) => {
			
			
			IMP.init("imp63287981"); // "imp00000000" 대신 발급받은 "가맹점 식별코드"를 사용합니다.
			IMP.request_pay({
				
				pg : 'kakaopay',
				pay_method : 'card',
				merchant_uid : 'merchant_' + new Date().getTime(),
				name : data.name,
				amount : data.price * document.getElementById('p-value').innerHTML ,
				buyer_email : userInfo.email,
				buyer_name : userInfo.name,
				buyer_tel : userInfo.userPhone,
				buyer_addr : '서울특별시 강남구 삼성동',
				buyer_postcode : '123-456',
				kakaoOpenApp : true

			}
			, function(rsp) {
				if ( rsp.success ) {
					$.ajax({
						url: serverRoot + '/json/programMember/add',
						type:"post",
						dataType:"json",
						data:{
							programNo: data.no,
							userNo: userInfo.userNo,
							userType: 1
						},
						complete: function(data){

							swal({
								  title: "결제가 완료되었습니다.",
								  text: "확인을 누르시면 메인화면으로 이동합니다",
								  type: "success",
									 
								  preConfirm: () => {
									  location.href='../main/main.html'
										  }
								})
						}
					}).done(function(data) {
							
					});
				} else {
					var msg = '결제에 실패하였습니다.';
					msg += '에러내용 : ' + rsp.error_msg;

					alert(msg);
				}
			});
		}); 
	}




}