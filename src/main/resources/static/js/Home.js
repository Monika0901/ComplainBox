function saveCake() {
    let data = {
        cakename: $("#cakeName").val(),
        caketype: $("#cakeType").val(),
        cakeprice: $("#cakePrice").val()
    };

    $.ajax({
        url: "/create",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(data),

        success: function(res) {
            alert(res);
			window.location.href = "/Home";
        },

        error: function() {
            alert("Error while saving cake!");
        }
    });
}


$(document).ready(function () {
	    loadCakes();
	});

	function loadCakes() {
	    $.ajax({
	        url: "getAll",
	        type: "GET",
	        success: function (data) {

	            console.log("DATA = ", data);   // check response

	            $("#cakeTableBody").empty();

	            for (var i = 0; i < data.length; i++) {

	                $("#cakeTableBody").append(
	                    "<tr>" +
	                    "<td>" + data[i].id + "</td>" +
	                    "<td>" + data[i].cakename + "</td>" +
	                    "<td>" + data[i].caketype + "</td>" +
	                    "<td>" + data[i].cakeprice + "</td>" +
	                    "</tr>"
	                );
	            }
	        },
	        error: function (xhr) {
	            alert("Error: " + xhr.status);
	        }
	    });
	}