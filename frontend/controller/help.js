const apiURL = "http://localhost:8080/hackathon/api/post/posts";


function successCallback(response) {
  // do something with the data
  let person = response;
  person.forEach(element => {
    var card = `<div class="the-cards">
  <div class="card mb-3" style="max-width: 540px;">
    <div class="row no-gutters">
      <div class="col-md-4">
        <img src="../../assets/avatar.jpg" class="card-img" alt="..." />
      </div>
      <div class="col-md-8">
        <div class="card-body">
          <h5 class="card-title">${element.title}</h5>
          <p class="card-text">${element.message.slice(0, 50)}
          </p>
          <p class="card-text">
            <small class="text-muted">    <button id="user${
              element.id
            }" class="see-more shadow-none" data-toggle="modal" data-target="#exampleModalCenter">
            See more...
          </button></small>
          </p>
        </div>
      </div>
    </div>
  </div>
  </div>`;
    $(".main-cards").append(card);
  });

  let buttons = $(".see-more");

  for (let index = 0; index < buttons.length; index++) {
    $(`#user${index + 1}`).click(function() {

      $(".modal-body").text(person[index].message);


      $("#contact").click(function() {
        //alert(index+1);
        //var getInput = prompt("2");
        localStorage.setItem("storageName",index+1);
      });

    });
  }
}

function errorCallback(request, status, error) {
  // do something with the error
  console.log(error);
}

// perform an ajax http get request
$.ajax({
  url: apiURL,
  async: true,
  success: successCallback,
  error: errorCallback
});



/* let person = [
  {
    id: 1,
    name: "Thiago Tavares",
    description: "Thiago Description"
  },
  {
    id: 2,
    name: "Rui Magalhães",
    description: "Rui description"
  },
  {
    id: 3,
    name: "Hugo Monteiro",
    description: "Hugo Description"
  },
  {
    id: 4,
    name: "Pedro Albuquerque",
    description: "Pedro description"
  },
  {
    id: 5,
    name: "Bruno Alves",
    description: "Bruno description"
  },
  {
    id: 6,
    name: "João Faustino",
    description: "Faustino description"
  }
]; */

/* let mainCard = document.querySelector(".main-cards"); */

/*buttons.forEach(element => {
  $("#user1").click(function() {
    alert("The paragraph was clicked." + element.id);
  });
});*/
/* 
var card = `<div class="the-cards">
<div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="../../assets/avatar.jpg" class="card-img" alt="..." />
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Card title</h5>
        <p class="card-text">
          This is a wider card with supporting text below as a natural
          lead-in to additional content. This content is a little bit
          longer.
        </p>
        <p class="card-text">
          <small class="text-muted"><a href="#">See more...</a></small>
        </p>
      </div>
    </div>
  </div>
</div>
</div>`; */

/* name.innerHTML = person[0].name;
description.innerHTML = person[0].description; */
