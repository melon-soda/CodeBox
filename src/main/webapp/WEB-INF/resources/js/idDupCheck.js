/**
 * 
 */

function useId() {
	console.log($('id').val());
	opener.document.join_form.id.value=$("input[name=id]").val();
	opener.document.join_form.reid.value=$("input[name=id]").val();
	
	self.close();
}