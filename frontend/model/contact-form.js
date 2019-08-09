$(document).ready(function () {

    function successAdd(response) {

        alert("Created");

    };

    function errorCallback(request, status, error) {

        alert("error");
   }



    function add (){

        

    $.ajax({
        url: 'http://localhost:8080/hackathon/api/sendmail',
        type: 'POST',
        data: JSON.stringify({
            id: localStorage.getItem("storageName"),
            subject: $('#name').val(),
            message: $('#a').val(),
            phone: $('#phone').val()
        }),
        async: true,
        contentType: 'application/json',
        success: successAdd,
        error: errorCallback
    });


}

//alert(localStorage.getItem("storageName"));

$('.contact-form-id').click(function () {

    add();
});



});