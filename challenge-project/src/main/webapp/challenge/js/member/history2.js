(function() {

  'use strict';

  // define variables
  var items = document.getElementsByTagName("li");

  // check if an element is in viewport
  // http://stackoverflow.com/questions/123999/how-to-tell-if-a-dom-element-is-visible-in-the-current-viewport
  function isElementInViewport(el) {
    var rect = el.getBoundingClientRect();
    return (
      rect.top >= 0 &&
      rect.left >= 0 &&
      rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
      rect.right <= (window.innerWidth || document.documentElement.clientWidth)
    );
  }

  function callbackFunc() {
    for (var i = 0; i < items.length; i++) {
      if (isElementInViewport(items[i])) {
        items[i].classList.add("in-view");
      }
    }
  }

  // listen for events
  window.addEventListener("load", callbackFunc);
  window.addEventListener("resize", callbackFunc);
  window.addEventListener("scroll", callbackFunc);

})();


//$(function() {
//	var trTemplateSrc = $("#tr-template").html();
//	
//	//위에서 준비한 템플릿 데이터를 가지고 HTML을 생성할 템플릿 엔진 준비
//	var templateFn = Handlebars.compile(trTemplateSrc);
//	
//	$.getJSON(serverRoot + "/json/program/list", (data) => {
//		console.log(data);
//		//$tableBody.innerHTML = templateFn({list:data});
//		$("#cccc").html(templateFn({list:data}));
//	});
//});