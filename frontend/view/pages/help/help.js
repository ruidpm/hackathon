let person = {
  name: "Hugo Pedro",
  description:
    "This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer."
};

let name = document.querySelector(".card-title");
let description = document.querySelector(".card-text");

name.innerHTML = person.name;
description.innerHTML = person.description;
