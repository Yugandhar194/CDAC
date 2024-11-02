function executeAfterDelay(callback, delay) {
    setTimeout(callback, delay);
}

executeAfterDelay(() => console.log("Executed after delay"), 2000);
