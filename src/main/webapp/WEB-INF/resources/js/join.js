/**
 * 
 */

function register() {
	if($('#id').val() === "") {
		alert("아이디를 입력해 주세요!");
		$('#id').focus();
/*	} else if($('#id').val() !== $('#reid').val()) {
		alert("아이디 중복체크를 해주세요!");
		$('#id').focus();	*/
	} else if($('#pwd').val() === "") {
		alert("비밀번호를 입력해주세요!");
		$('#pwd').focus();
	} else if($('#pwd').val() !== $('#pwdCheck').val()) {
		alert("비밀번호가 일치하지 않습니다!");
		$('#pwd').focus();
	} else if($('#email').val() === "") {
		alert("이메일을 입력해주세요!");
		$('#email').focus();
	} else {
		$('#join_form').attr('encoding', 'multipart/form-data');
		$('#join_form').attr('action', 'join').submit();
	}
}

function update() {
	if($('#pwd').val() === "") {
		alert("비밀번호를 입력해주세요!");
		$('#pwd').focus();
	} else if($('#pwd').val() !== $('#pwdCheck').val()) {
		alert("비밀번호가 일치하지 않습니다!");
		$('#pwd').focus();
	} else if($('#email').val() === "") {
		alert("이메일을 입력해주세요!");
		$('#email').focus();
	} else {
		$('#join_form').attr('encoding', 'multipart/form-data');
		$('#join_form').attr('action', 'update').submit();
	}
}