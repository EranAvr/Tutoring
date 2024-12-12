
// create event listener for page when it's loaded-
window.addEventListener('load', function () {
    alert("Hello!\nPage is fully loaded.");
})


/*
    This function adds input-boxes to our page, dynamically: 
    1. we use 'document' (DOM system) to access HTML tags on our page.
    2. we use 'getElementById' function to select div tag with id='input_container_id'.
    3. the 'innerHTML' property allows us to get/replace the content inside the <div></div> tags.
    4. we use the '+=' operator to only add (!!) text.
    5. NOW we can see the new text on our web-page!
    6. our new text is '<div><input type='text' placeholder='enter name'></div>'.
        it contains <input/> HTML-tag, so we can see a new input-box on our page.
*/
function pressed_button() {
    document.getElementById("input_container_id").innerHTML += "<div><input type='text' placeholder='enter text here..'/></div>";
    
    //document.getElementById("btn_id").value = "text changed";
}

