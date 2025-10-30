
const menu = document.querySelector("#side-menu");

  const width = window.innerWidth;
    if (width < 992) {
        menu.classList.add("offcanvas");
        menu.classList.add("offcanvas-start")
        menu.classList.add("hide")
      } 
    if(width >= 992) {
        menu.classList.remove("offcanvas");
        menu.classList.remove("offcanvas-start");
      }

const resize = ()=>{
  console.log("entro")
}