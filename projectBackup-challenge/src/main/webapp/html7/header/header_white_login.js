//div#header 태그에 /html/header.html 내용을 삽입한다.
$.get("/projectBackup-challenge/html7/header/header_white_login.html", (data) => {
	$("#header").html(data);
});
