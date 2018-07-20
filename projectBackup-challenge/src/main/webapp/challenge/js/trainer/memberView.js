if (location.href.split("?").length > 1) {
	var no = location.href.split("?")[1].split("=")[1];

	$.getJSON(serverRoot + "/json/programMember/" + no, function(data) {
		$("#mName").append(data[no].users.name);
        $("#mSex").append(data[no].users.sex);
        $("#mTel").append(data[no].users.userPhone);
        $("#mProgram").append(data[no].name);
				$("#mDate1").append(data[no].startDate);
				$("#mDate2").append(data[no].endDate);
        $("#mTarget").append(data[no].proGoal);
        $("#mAttend").append(data[no].diarys.dcheck);
        $("#mTargetPer").append(data[no].proGoalNum);
	});

	$(".close").click(function() {
		location.href= serverRoot + "/challenge/html/trainer/memberList.html";
		});

}
