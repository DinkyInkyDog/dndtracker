
let playerMaxHealth = 27;
const barHiddenWidth = 97;
const barVisibleWidth = 352;
const bar = document.getElementById('progress-bar');


window.setProgressHealth = function(currentHealth) {
  var intValue2 = parseInt(currentHealth, 10);
  if (isNaN(intValue2)) {
    alert("Invalid value provided to setPlayerMaxHealth: ", newMax);
    return;
  }
  let currentPercentage = (currentHealth / playerMaxHealth) * 100;
  
  let barNewWidth = (currentPercentage / 100) * barVisibleWidth;
  let widthAndHidden = (barNewWidth + barHiddenWidth) + "px";
  bar.style.setProperty("width", widthAndHidden, "important");

  alert("set progress health has been activated and current health set to " + currentHealth);
}

// Correct function declaration
window.setPlayerMaxHealth = function(newMax) {
  // Parse the newMax value as an integer
  var intValue = parseInt(newMax, 10);
  
  // Check if the parsed value is a valid number
  if (isNaN(intValue)) {
    alert("Invalid value provided to setPlayerMaxHealth: ", newMax);
    return;
  }
  
  // Set the player's max health to the parsed integer value
  playerMaxHealth = intValue;
  alert("max health has been set to " + newMax);
};

window.hello = function(number) {
  let userinput = number;
  alert("hello, the number you said was " + userinput);
}