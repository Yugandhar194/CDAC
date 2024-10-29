function toUpperCase(str) {
    return str.toUpperCase();
}

function processData(input, callback) {
    const result = callback(input);
   document.writeln(result);
}

processData("welcome to cdac, yugandhar !!", toUpperCase);
