let person = [
  {
    name: "Thiago Tavares",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
  },
  {
    name: "Rui Magalhães",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
  },
  {
    name: "Hugo Monteiro",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
  },
  {
    name: "Pedro Albuquerque",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
  },
  {
    name: "Bruno Alves",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
  },
  {
    name: "João Faustino",
    description:
      "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
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
        <p class="card-text">${element.description}
        </p>
        <p class="card-text">
          <small class="text-muted">    <button class="see-more shadow-none" data-toggle="modal" data-target="#exampleModalCenter">
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
