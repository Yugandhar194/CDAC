let totalCost = 0;

const tax = 0.75;

//function
function addCost(price) {
    totalCost += price;
}

function calculateTotalCost() {
    return totalCost * (1 + tax);
}
addCost(500);
addCost(37.50);
addCost(1250);
document.writeln("Total cost including tax: "+calculateTotalCost());