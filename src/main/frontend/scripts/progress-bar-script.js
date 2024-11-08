
let playerMaxHealth = 27;
const barHiddenWidth = 97;
const barVisibleWidth = 352;
const bar = document.getElementById('progress-bar');


window.setProgressHealth = function(currentHealth) {
  let currentPercentage = (currentHealth / playerMaxHealth) * 100;
  
  let barNewWidth = (currentPercentage / 100) * barVisibleWidth;
  bar.style.width = (barNewWidth + barHiddenWidth) + "px";
}

// Correct function declaration
window.setPlayerMaxHealth = function(newMax) {
  // Parse the newMax value as an integer
  var intValue = parseInt(newMax, 10);
  
  // Check if the parsed value is a valid number
  if (isNaN(intValue)) {
    console.error("Invalid value provided to setPlayerMaxHealth: ", newMax);
    return;
  }
  
  // Set the player's max health to the parsed integer value
  playerMaxHealth = intValue;
  console.log("Player's max health set to", playerMaxHealth);
};

window.hello = function(number) {
  let userinput = number;
  alert("hello, the number you said was " + userinput);
}