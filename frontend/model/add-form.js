$(document).ready(function () {

    function successCallback(response) {

        alert("Created");

    };

    function errorCallback(request, status, error) {
    console.log('Errrrroorrrrr');
alert("error");
   }



    function add (){

    $.ajax({
        url: 'http://localhost:8080/hackathon/api/post',
        type: 'POST',
        data: JSON.stringify({
            title: $('#inputName"').val(),
            message: $('#inputMessage').val(),
            email: $('#inputEmail').val(),
            url: $('#inputURL').val()
        }),
        async: true,
        contentType: 'application/json',
        success: successAdd,
        error: errorCallback
    });

}

$('.btn-primary').click(function () {
    add();

});


});