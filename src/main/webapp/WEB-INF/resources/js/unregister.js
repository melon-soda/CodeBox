/**
 * 
 */

function unregisterCheck() {
	if($('.agree')[0].checked === true) {
		$('#unregister').attr('action', 'unregister').submit();
	} else {
		alert("탈퇴를 위해서는 위 내용에 동의해주셔야 합니다!");
		$('.agree').focus();
	}
}