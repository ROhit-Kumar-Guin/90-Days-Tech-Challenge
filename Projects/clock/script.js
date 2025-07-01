let DispTime = document.querySelector("h1");
let DispDate = document.querySelector("h2");
setInterval(()=>{
    DispTime.innerText = updateClock();
    DispDate.innerText = updateDate();
},1000);


function updateDate(){
    const now = new Date();

    let date = now.getDate();
    let month = now.getMonth();
    let year = now.getFullYear();

    date = date<10?`0${date}`:date;
    month = month<10?`0${month}`:month;
    year = year<10?`0${year}`:year;

    let currentDate = `${date}/${month}/${year}`;
    return currentDate;
}


function updateClock(){
    const now = new Date();

    let hour = now.getHours();
    let min = now.getMinutes();
    let sec = now.getSeconds();
    

    hour = hour<10?`0${hour}`:hour;
    min = min<10?`0${min}`:min;
    sec = sec<10?`0${sec}`:sec;


    let currentTime = `${hour}:${min}:${sec}`;
    return currentTime;
}


let toggle = document.querySelector(".toggle")
toggle.addEventListener("click",()=>{
    let nav = document.querySelector(".nav");
    let body = document.querySelector("body");
    let display = document.querySelector(".display");
    if(toggle.innerText=="Light mode"){
        nav.style.backgroundColor = "#fcedb8"; //yellow
        nav.style.color = "#162954";  //blue
        toggle.innerText="Dark mode"
        toggle.style.backgroundColor = "#162954";
        toggle.style.color = "#fcedb8";

        body.style.backgroundColor = "#fff"; //white
        display.style.backgroundColor = "#fcedb8"; //yellow
        display.style.color = "#162954";  //blue

    }
    else if(toggle.innerText=="Dark mode"){
        nav.style.backgroundColor = "#162954";
        nav.style.color = "#fcedb8";
        toggle.innerText="Light mode";
        toggle.style.backgroundColor = "#fcedb8";
        toggle.style.color = "#162954";

        body.style.backgroundColor = "#0f172a"; //blue
        display.style.backgroundColor = "#1e293b"; //light blue
        display.style.color = "#fff";  //blue
    }

})