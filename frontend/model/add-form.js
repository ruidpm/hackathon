$(document).ready(function () {

    function successAdd(response) {

        alert("Created");

    };

    function errorCallback(request, status, error) {

        alert("error");
   }



    function add (){

        

    $.ajax({
        url: 'http://localhost:8080/hackathon/api/post',
        type: 'POST',
        data: JSON.stringify({
            title: $('#inputName').val(),
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
    /*if(!validate()){
        console.log("fuckyou")
        errorCallback();
        return;
    }*/
    console.log("batata")
    add();
});

/*function validateEmail(email) {
    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(String(email).toLowerCase());
}

function validate() {
    var $result = $("#result");
    console.log($('#inputEmail').val());
    var email = $('#inputEmail').val();
    $result.text("");
  
    if (validateEmail(email)) {
      $result.text(email + " is valid :)");
      $result.css("color", "green");
    } else {
      $result.text(email + " is not valid :(");
      $result.css("color", "red");
    }
    return false;
  }*/


});