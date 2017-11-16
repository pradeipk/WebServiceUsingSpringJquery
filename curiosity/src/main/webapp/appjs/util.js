/**
 * http://usejsdoc.org/
 */

var server = 'http://localhost:8080/curiosity/';
var extn = '.json';
var data;
var url;
function submitForm(resource) {
	//alert('Hello :'+ $("#fName").val());
	alert('Line 11'+ resource);
	var json = {fName :$("#fname").val(), lname:$("#lname").val()}
	url = server + resource + extn;
	data = JSON.stringify(json)
	alert(url);
	$.ajax({
		type : "POST",
		url : url,
		data : data,
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(result) {
			alert(JSON.stringify(result))
		}
	});

}
function fetchData(resource) {
	
	alert("Hello ------------ 29");
	
	url = server + resource+"/hi" + extn;
	$.ajax({
		type : "GET",
		url : url,
		accept : "application/json; charset=utf-8",
		success : function(data) {
			alert("Hello ------------ 29" + JSON.stringify(data));
			var r = new Array(), j = -1;
			 for (var key=0, size=data.length; key<size; key++){
			     r[++j] ='<tr><td>';
			     r[++j] = data[key][0];
			     r[++j] = '</td><td class="whatever1">';
			     r[++j] = data[key][1];			    
			     r[++j] = '</td></tr>';
			 }
			 $('#dataTable').html(r.join('')); 
		}
	});
}
function formSuccess() {
	$("#msgSubmit").removeClass("hidden");
}