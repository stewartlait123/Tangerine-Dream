/**
 * FAQ script
 */

  function toggle(btnID){
    var faq = document.getElementById("faq"+btnID);
    var info = document.getElementById("info"+btnID);
    var toggle_button = document.getElementById("toggle_button_"+btnID);

    if (info.style.visibility == "hidden"){
      // Open the div
       faq.style.height = "300px";
       info.style.visibility = "visible";
       toggle_button.innerHTML = "-";
    }
    else{
       // Close the div
       faq.style.height = "50px";
       info.style.visibility = "hidden";
       toggle_button.innerHTML = "+";
    }
  }

  function closeAllButtons(){
     for (var i=1; i<=5; ++i){
       document.getElementById("faq"+i).style.height = "50px";
       document.getElementById("info"+i).style.visibility = "hidden";
       document.getElementById("toggle_button_"+i).innerHTML = "+";
     }
  }

  function initPage(){
     closeAllButtons()
  }