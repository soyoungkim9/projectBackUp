// 로그인이 필요한 페이지일 때 interceptor로 튕겨내기.
  $.getJSON(serverRoot + "/json/timeline/list/1/6", (data) => {
    }).done(function(data) {
    }).fail(function(data) {
    	console.log(data);
    	
    	if (userInfo == null) {
    		console.log("여기는 로그인 페이지로 보내야지")
    	}
    	
    	
    	
    	swal({
    		title: '프로그램 멤버 전용 타임라인',
    		text: '프로그램 참여 후 이용 가능합니다.',
    		type: 'error',
    		confirmButtonText: '로그인 페이지로'
    	}).then(function (result) {
    		if (result.value) {
    			location.href = "../login/login.html" 
    		}
    	})
    	
//    	, function() {
//    		if(data.responseText == "loginNeed") {
//    		}
//    	})
    	
    	
    });

var addedPostCount = 0;
$(document).ready(function() {
  // 글쓰기 모달에 글쓴이 이름 출력
  $(".tl-user-name-json").html(userInfo.name);

  // 강의이름 출력
  console.log(userInfo.programs[0].name)
  $("#sh-Class-Title").html(userInfo.programs[0].name);
  
  $("#sh-class-more").html(userInfo.programs[0].description);
  
  // 스크롤 위치 맨 위로 고정
  $("body").scrollTop(0);

  var pageCount = 1; // 타임라인 첫번째 page 카운트임.
  loadCards(pageCount);

  $(window).on('scroll', function() {
    infiniteScroll();
  });


  function infiniteScroll() {
    var documentHeight = $(document).height();
    var scrollHeight = $(window).scrollTop() + $(window).height();

    // 스크롤한 높이와 문서의 높이가 같을 때
    if (documentHeight <= scrollHeight + 100) { // 스크롤이 바닥에 닿으면?
      pageCount++;
      setTimeout(loadCards(pageCount), 10000); //=====================> 얘가 문제... 불러오는 동안 여러번 요청(불러오는 동안 스크롤 길이가 안맞음)
      console.log("무한스크롤 다음 카드 불러옴! pageCount 값 : " + pageCount);
    }
  }


});


// 타임라인 카드리스트 불러오기
function loadCards(pageCount) {
  var trTemplateSrc = $("#tr-template").html();
  var templateFn = Handlebars.compile(trTemplateSrc);

  $.getJSON(serverRoot + "/json/timeline/list/" + pageCount + "/6", (data) => {
    $('#sh_tl_card_add').append(templateFn({
      list: data
    }));
  }).done(function(data) {
    var i;
    for (i = 0; i < data.length; i++) {
      loadComments(data[i].no);
      timelineLikeCount(data[i].no);
      if (data[i].picture) {
    	  // 얘는 타임라인 카드의 이미지임.
        $("#img" + data[i].no).append("<img src='../../../files/" + data[i].picture + "_600x600.jpg'>");
      } 
    }
    $('.sh-tl-user-img-load').attr("src", "../../../files/" + userInfo.userPath);
  });
}

// 타임라인 카드 하나 불러오기 (EDITED)
function loadOneCard(postNo) {
	  console.log("불렸음.")
	  var trTemplateSrc = $("#tr-edited-template").html();
	  var templateFn = Handlebars.compile(trTemplateSrc);

	  $.getJSON(serverRoot + "/json/timeline/" + postNo, (data) => {
	    $('.sh-tl-card-modal' + postNo).after(templateFn({data}));
	    $('.sh-tl-card-modal' + postNo).remove();
	  }).done(function(data) {
		  console.log(data.no)
		  loadComments(data.no);
		  timelineLikeCount(data.no);
		  if(data.picture) {
			  $("#img" + data.no).append("<img src='../../../files/" + data.picture + "_600x600.jpg'>");
		  }
		  
		  $('.sh-tl-card-modal').attr("class","sh-tl-card-modal" + postNo + " sh-tl-card sh-card");
		  
	  });
	}

// 댓글 JSON 리스트 가져와서 댓글 붙이기(handleBars)
function loadComments(cardNo) {
  //	console.log(cardNo)
  var cmTemplateSrc = $("#cm-template").html();
  var cmtemplateFn = Handlebars.compile(cmTemplateSrc);

  $.getJSON(serverRoot + "/json/comment/listWithNo/" + cardNo, (data) => {
    $('.cm' + cardNo).html(cmtemplateFn({
      list: data
    }));
  });
	$("#commentUser").attr("src","../../../files/" + userInfo.userPath);
}

// 좋아요 체크 여부
function timelineLikeChecked(cardNo) {
  $.post({
    url: "../../../json/timeline/isChecked",
    data: {
      pno: userInfo.programs[0].no,
      pono: cardNo,
      uno: userInfo.userNo
    },
    async: false
  }).done(function(isChecked) {
    if (isChecked) {
      $('.lk-thumbs' + cardNo).attr("style", "color:#DD1F26;")
      $('.lk' + cardNo).prepend("회원님 외 ").attr("style", "color:#DD1F26;");
      $('.lk-clicked' + cardNo).attr("style", "color:#DD1F26;");
    }
  });
}

// 좋아요 개수 카운트
function timelineLikeCount(cardNo) {
  $.get(serverRoot + "/json/timeline/timelineLikeCount/" + cardNo, function(data) {
    $('.lk' + cardNo).html(data);
    timelineLikeChecked(cardNo)
  });
}
