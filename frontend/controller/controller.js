const apiURL = "http://localhost:8080/hackathon/api/post/posts";

function successCallback(response) {
  // do something with the data
  console.log(response);
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
