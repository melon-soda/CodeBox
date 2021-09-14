/**
 * 
 */

function articleWrite() {
	if($('#id').val() === "" ) {
		alert("제목을 입력해 주세요!");
		$('#id').focus();
	} else if($('#content').val() === "") {
		alert("내용을 입력해 주세요!");
		$('#content').focus();
	} else {
		$('#article_form').attr('action', 'articleWrite').submit();
	}
}

function articleUpdateForm() {
	$('#article_form').attr('action', 'articleUpdateForm').submit();
}

function articleUpdate() {
	if($('#title').val() === "") {
		alert("제목은 빈칸으로 둘 수 없습니다!");
		$('#title').focus();
	} else if($('#content').val() === "") {
		alert("내용은 빈칸으로 둘 수 없습니다!");
	} else {
		$('#article_form').attr('action', 'articleUpdate').submit();
	}
}

function articleDeleteConfirm() {
	var response = confirm("게시글 삭제 이후에는 복구 불가능합니다.\n정말로 삭제하시겠습니까?");
	
	if(response === true) {
		alert("삭제되었습니다.");
		articleDelete();
	}
}

function articleDelete() {
	$('#article_form').attr('action', 'articleDelete').submit();
}