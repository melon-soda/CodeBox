/**
 * 
 */

function proceedToJoin() {
	if($('.agree')[0].checked === true) {
		$('#join').attr('action', 'join_form').submit();
	} else {
		alert("회원 가입 약관에 동의하셔야 가입하실 수 있습니다!");
		$('.agree').focus();
	}
}