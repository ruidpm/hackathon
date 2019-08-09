$(document).ready(function() {
  function successAdd(response) {
    alert("Created");
    console.log(response);
  }

  function errorCallback(request, status, error) {
    alert("Create");
  }

  function add() {
    $.ajax({
      url: "http://localhost:8080/hackathon/api/crowdpost",
      type: "POST",
      data: JSON.stringify({
        title: $("#inputName").val(),
        message: $("#inputMessage").val(),
        email: $("#inputEmail").val(),
        url: $("#inputURL").val(),
        moneyNeeded: 500,//parseInt($("#b").val),
        moneyDonated: 0
      }),
      async: true,
      contentType: "application/json",
      success: successAdd,
      error: errorCallback
    });
  }

  console.log($("#inputName").val());
  console.log($("#inputMessage").val());
  console.log($("#inputEmail").val());
  console.log($("#inputURL").val());
  //console.log($("#b").val());
  

  $(".btn-primary").click(function() {
    add();
  });
});
