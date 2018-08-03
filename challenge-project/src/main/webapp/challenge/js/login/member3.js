 $(function() {
   $("#signupForm").validate({
     rules: {
       fName: "required",

       sex: {
         required: true,
         minlength: 1
       },
       pwd: {
         required: true,
         minlength: 4,
         maxlength: 8
       },
       pwd_re: {
         required: true,
         equalTo: "#pwd"
       },

       /*tel1 : "required",*/
       tel2: "required",

       email: {
         required: true,
         email: true
       },

       agree: "required"
     },
     messages: {
       fName: "이름은 필수 입력 항목 입니다.",

       sex: {
         required: "성별 선택은 필수입니다..",
         minlength: " 최소 {0}개 입니다."
       },
       pwd: {
         required: "비밀번호를 입력해 주세요.",
         minlength: "비밀번호는 최소 {0}글자 입니다.",
         maxlength: "비밀번호는 최대 {0}글자 입니다.",
       },
       pwd_re: {
         required: "비밀번호 확인값을 입력해 주세요.",
         equalTo: "비밀번호 확인이 잘못되었습니다."
       },

       /*                        tel1 : "전화번호는 필수 입력 항목입니다.",*/
       tel2: "전화번호는 필수 입력 항목입니다.",

       email: {
         required: "이메일을 입력해 주세요.",
         email: "이메일이 형식에 맞지 않습니다."
       },


       agree: "약관 동의에 체크해 주세요."
     },

   });
 });

 $("#addBtn").click(() => {
	 var userPic = $("#fPath").val();
	 
	if (userPic == "") {
		userPic = "default.jpeg"
			console.log("사진은 등록 안됨")
	} else {
		userPic = userPic.split('\\')[2];
		console.log(userPic)
	}
   $.post(serverRoot + "/json/member/add", {
     name: $("#fName").val(),
     sex: $('input[name]:checked').val(),
     email: $("#fId").val(),
     //	      + '@' + $("#fid2 option:selected").val(),
     password: $("#pwd").val(),
     userPhone: $("#fPhone1").val() + '-' + $("#fPhone2").val() + '-' + $("#fPhone3").val(),
     userPath: userPic,
     userType: '1'
   })
   /*.done(() => {
       postUserValidatingEmail();
   	alert("회원 등록 완료!");
       location.href = "../login/login.html";
   })
   .fail(() => {
   	alert("회원 등록 실패!")
   });*/
 });

 /*function postUserValidatingEmail() {
 	$.post("http://localhost:3000/index", {
 	      email: $("#fId").val()
 	    })
 	 .done(() => {
 		 alert("회원 등록 완료!");
 	        location.href = "../login/login.html";
 	 });
 }*/
