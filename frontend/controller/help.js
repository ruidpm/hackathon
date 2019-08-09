let person = [
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
];

/* let mainCard = document.querySelector(".main-cards"); */

person.forEach(element => {
  var card = `<div class="the-cards">
<div class="card mb-3" style="max-width: 540px;">
  <div class="row no-gutters">
    <div class="col-md-4">
      <img src="../../assets/avatar.jpg" class="card-img" alt="..." />
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">${element.name}</h5>
        <p class="card-text">${element.description.slice(0, 50)}
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
console.log(person[1].description);

for (let index = 0; index < buttons.length; index++) {
  $(`#user${index + 1}`).click(function() {
    $(".modal-body").text(person[index].description);
  });
}

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
