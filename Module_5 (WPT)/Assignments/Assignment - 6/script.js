const TAX_RATE = 0.72;
let totalExpense = 0;
let expenseList = [];

async function fetchInitialExpenses() {
    const initialExpenses = await getInitialExpenses();
    expenseList = [...initialExpenses];
    displayExpenses();
    updateTotalExpense();
}


function getInitialExpenses() {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve([
                { s: "Groceries", amount: 30, date: "2024-10-01" },
                { description: "Rent", amount: 500, date: "2024-10-02" },
                { description: "Utilities", amount: 100, date: "2024-10-03" }
            ]);
        }, 1000);
    });
}

function addExpense() {
    const description = document.getElementById("description").value;
    const amount = parseFloat(document.getElementById("amount").value);
    const date = document.getElementById("date").value;
    
    if (description && amount && date) {
        const expense = { description, amount, date };
        expenseList = [...expenseList, expense]; 

        displayExpenses();
        updateTotalExpense();
        showSuccessMessage(() => console.log("Expense added successfully!"));
    } else {
        alert("Please fill out all fields.");
    }
}


const displayExpenses = () => {
    const expenseListElement = document.getElementById("expenseList");
    expenseListElement.innerHTML = "";

    expenseList.forEach(({ description, amount, date }) => {
        const listItem = document.createElement("li");
        listItem.textContent = `Rs{description} - {amount} on Rs{date}`;
        expenseListElement.appendChild(listItem);
    });
};


function updateTotalExpense() {
    totalExpense = expenseList.reduce((total, { amount }) => total + amount, 0);
    document.getElementById("totalExpense").textContent = totalExpense.toFixed(2);
}

function showSuccessMessage(callback) {
    callback();
}

function filterHighExpenses() {
    const highExpenses = expenseList.filter(expense => expense.amount > 20);
    console.log("Expenses above Rs20:", highExpenses);
}


function createExpenseTracker() {
    let total = 0;
    return (expense) => {
        total += expense;
        return total;
    };
}

const expenseTracker = createExpenseTracker();

fetchInitialExpenses();
