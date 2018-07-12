$("#addBtn").click(() => {
	$.post("../../json/community/add", {
		type: $(CMU_TYPE).val(),
		title: $(cmu_title).val(),
        content: $(cmu_content).val()
	}, () => {
		location.href = "list.html";
	});
});