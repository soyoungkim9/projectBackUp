//li-template
var liTemplateSrc = $("#li-template").html();
var templateFn = Handlebars.compile(liTemplateSrc);
console.log();
$.getJSON(serverRoot + "/json/plan/list1", (data) => {
 $('#programList').html(templateFn({list:data}));
});

/* 탭 메뉴 이벤트 */
$(document).on('click','.tabSelect', function(){
	if ($(".tabSelect").find(".active")) {
		$(".tabSelect").removeClass("active");
	}
	$(this).addClass("active");
});