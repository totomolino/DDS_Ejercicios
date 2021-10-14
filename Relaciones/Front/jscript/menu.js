/* When the user clicks on the button,
toggle between hiding and showing the dropdown content */
function myFunction(x) {
  x.classList.toggle("change"); 
  document.getElementById("myDropdown").classList.toggle("show");
}
/*
// Close the dropdown menu if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
*/

function toggleSideBar() {
  document.getElementById("side-bar").classList.toggle("open")
}

window.onclick = function(event) {
  if (!event.target.matches("#menu2")) {
    var sideBar = document.getElementById("side-bar");
    var i;
    console.log("entro")
    if(sideBar.classList.contains("open")) { /*si tiene la clase open, es decir, si esta abierto, que lo saque*/
      sideBar.classList.remove("open")
    }
  }
}