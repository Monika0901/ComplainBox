$(document).ready(function () {
    loadCakes();
});

// ---------------- SAVE OR UPDATE CAKE ----------------
function saveOrUpdateCake() {

    let id = $("#cakeId").val();

    let data = {
        cakename: $("#cakeName").val(),
        caketype: $("#cakeType").val(),
        cakeprice: $("#cakePrice").val()
    };

    // -------- SAVE --------
    if (id == null || id == "") {

        $.ajax({
            url: "/create",
            type: "POST",
            contentType: "application/json",
            data: JSON.stringify(data),

            success: function (res) {
                alert(res);

                $("#cakeForm")[0].reset();
                loadCakes();
            },

            error: function (xhr) {
                alert("Error while saving cake: " + xhr.status);
            }
        });

    }

    // -------- UPDATE --------
    else {

        $.ajax({
            url: "/updateCake/" + id,
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify(data),

            success: function (res) {
                alert("Cake Updated Successfully");

                $("#cakeForm")[0].reset();
                $("#cakeId").val("");
                $("#submitBtn").text("Submit");

                loadCakes();
            },

            error: function (xhr) {
                alert("Error while updating cake: " + xhr.status);
            }
        });
    }
}


// ---------------- LOAD CAKES ----------------
function loadCakes() {

    $.ajax({
        url: "/getAll",
        type: "GET",

        success: function (data) {

            $("#cakeTableBody").empty();

            for (var i = 0; i < data.length; i++) {

                $("#cakeTableBody").append(
                    "<tr>" +
                    "<td>" + data[i].id + "</td>" +
                    "<td>" + data[i].cakename + "</td>" +
                    "<td>" + data[i].caketype + "</td>" +
                    "<td>" + data[i].cakeprice + "</td>" +

                    "<td>" +
                    "<i class='fa fa-edit' style='color:green; cursor:pointer; font-size:18px; margin-right:15px;' " +
                    "onclick=\"editCake('" + data[i].id + "','" + data[i].cakename + "','" + data[i].caketype + "','" + data[i].cakeprice + "')\"></i>" +

                    "<i class='fa fa-trash' style='color:red; cursor:pointer; font-size:18px;' " +
                    "onclick='deleteCake(" + data[i].id + ")'></i>" +
                    "</td>" +

                    "</tr>"
                );
            }
        },

        error: function (xhr) {
            alert("Error loading cakes: " + xhr.status);
        }
    });
}


// ---------------- EDIT CAKE ----------------
function editCake(id, cakename, caketype, cakeprice) {

    $("#cakeId").val(id);
    $("#cakeName").val(cakename);
    $("#cakeType").val(caketype);
    $("#cakePrice").val(cakeprice);

    $("#submitBtn").text("Update Cake");
}


// ---------------- DELETE CAKE ----------------
function deleteCake(id) {

    if (confirm("Are you sure you want to delete?")) {

        $.ajax({
            url: "/deleteCake/" + id,
            type: "DELETE",

            success: function (res) {
                alert(res);
                loadCakes();
            },

            error: function (xhr) {
                alert("Error while deleting cake: " + xhr.status);
            }
        });
    }
}