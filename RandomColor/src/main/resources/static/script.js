//--------------------------Copy-to-Clipboard-Function------------------------
const copyButton = document.getElementById('copy-button');
let copyNum = document.getElementById('gen-num');
async function copyToClipboard() {
    await navigator.clipboard.writeText(copyNum.textContent);
    copyButton.textContent = 'Copied!';
    new Promise(resolve => setTimeout(resolve, 2000)).then(() => {
        copyButton.textContent = 'Copy to Clipboard';
    });
}
copyButton.addEventListener('click', copyToClipboard);

//----------------------------Save-Color-Function-----------------------------
const saveButton = document.getElementById('save-color-button');
let currentColor = document.getElementById('current-color-text');
function saveColorInApi() {
    const request = new XMLHttpRequest();
    request.open("POST", `/save/${currentColor.textContent}`, true);
    request.send();
}
saveButton.addEventListener('click', saveColorInApi);
