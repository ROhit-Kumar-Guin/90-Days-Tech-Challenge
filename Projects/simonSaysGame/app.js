let h2 = document.querySelector("h2");


let gameSeq = [];
let userSeq = [];
let btns = ["yellow","red","green","purple"];

let started = false;
let level = 0;
let hiScore;

document.addEventListener("keypress", function () {
    if(started==false){
        console.log("Game is started");
        started = true;
        levelUp();
    }
}); 



function gameFlash(btn){
    btn.classList.add("flash");
    setTimeout(function () {
        btn.classList.remove("flash")
    },150)
} 
function userFlash(btn){
    btn.classList.add("userflash");
    setTimeout(function () {
        btn.classList.remove("userflash")
    },200)
}
function levelUp() {
    userSeq = []; 
    level++;
    h2.innerText = `level ${level}`;


    let randomIdx = Math.floor(Math.random()*3);
    let randomClr = btns[randomIdx];
    let randomBtn = document.querySelector(`.${randomClr}`)
    
    gameSeq.push(randomClr);
    console.log(gameSeq)

    gameFlash(randomBtn);
}

function checkAns(idx) {

    if(userSeq[idx] == gameSeq[idx]){
        if(userSeq.length == gameSeq.length){
            setTimeout(levelUp,350)
        }
    }else{
        h2.innerHTML = `Game Over! Your Score was <b>${level}</b><br> Press any key to start.`;
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout(function(){
            document.querySelector("body").style.backgroundColor = "white";
        },150)
        reset();
    }
}

function btnPress(){
    let btn = this;
    userFlash(btn);

    userColor = btn.getAttribute("id");
    userSeq.push(userColor)

    checkAns(userSeq.length-1);
}
let allBtns = document.querySelectorAll(".btn");
for(btn of allBtns){
    btn.addEventListener("click",btnPress)
}
function reset(){
    gameSeq = [];
    userSeq = [];
    started = false;
    level = 0;
}
