
let playerMaxHealth = 27;
const barHiddenWidth = 97;
const barVisibleWidth = 352;
const bar = document.getElementById('progress-bar');


function setProgressHealth(currentHealth){
  let currentPercentage = (currentHealth / playerMaxHealth) * 100;
  
  let barNewWidth = (currentPercentage / 100) * barVisibleWidth;
  bar.style.width = (barNewWidth + barHiddenWidth) + "px";
}

function setPlayerMaxHealth(newMax) {
  playerMaxHealth = newMax;
  
}