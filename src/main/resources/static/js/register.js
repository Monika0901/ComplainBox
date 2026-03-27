function saveuser() {
    alert("Mona");

    let data = {
        fullname: $("#fullname").val(),
        email: $("#email").val(),
        phone: $("#phone").val(),
        password: $("#password").val(),
        confirmpassword: $("#confirmpassword").val(),
		

    };

    $.ajax({
        url: "SaveUser",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(data),

        success: function(res) {
            alert("Registration Successfully");
            window.location.href = "/";
        },
        error: function() {
            alert("Server Error!");
        }
    });
}