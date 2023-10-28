//--------------------------Copy-to-Clipboard-Function------------------------
let copyButton = document.getElementById('copy-button');
let copyNum = document.getElementById('gen-num');
async function copyToClipboard() {
    await navigator.clipboard.writeText(copyNum.textContent);
    copyButton.textContent = 'Copied!';
    new Promise(resolve => setTimeout(resolve, 2000)).then(() => {
        copyButton.textContent = 'Copy to Clipboard';
    });
}
copyButton.addEventListener('click', copyToClipboard);
//-----------------------------Toggle-Function--------------------------------

let integerButton = document.getElementById('integer');
let decimalButton = document.getElementById('decimal');
let currentButton = "integer";
function switchButton() {
    if (currentButton === "integer") {
        currentButton = "decimal";
    } else {
        currentButton = "integer";
    }
}
function renderToggle() {
    if (currentButton === "integer") {
        integerButton.style.backgroundColor = "#1c6411";
        decimalButton.style.backgroundColor = "#7e7474";

    } else {
        integerButton.style.backgroundColor = "#7e7474";
        decimalButton.style.backgroundColor = "#1c6411";
    }
    switchButton()
}
integerButton.addEventListener('click', renderToggle);
decimalButton.addEventListener('click', renderToggle);

//----------------------------Request-Random-Number---------------------------
let genButton = document.getElementById("gen-button");

function random() {
    let request = new XMLHttpRequest();
    request.open("GET", `/random?type=${currentButton}`, true);
    request.onload = function () {
        let fragResponse = request.responseText;
        let numDisplayFragment = document.getElementById("num-display-fragment");
        numDisplayFragment.outerHTML = fragResponse;
        attachListeners();
    }
    request.send();
}
attachListeners();

function attachListeners() {
    genButton = document.getElementById("gen-button");
    integerButton = document.getElementById('integer');
    decimalButton = document.getElementById('decimal');

    genButton.removeEventListener("click", random);
    genButton.addEventListener("click", random);
    integerButton.removeEventListener("click", renderToggle);
    integerButton.addEventListener("click", renderToggle);
    decimalButton.removeEventListener("click", renderToggle);
    decimalButton.addEventListener("click", renderToggle);

    copyButton = document.getElementById('copy-button');
    copyNum = document.getElementById('gen-num');
    copyButton.removeEventListener("click", copyToClipboard);
    copyButton.addEventListener("click", copyToClipboard);
}