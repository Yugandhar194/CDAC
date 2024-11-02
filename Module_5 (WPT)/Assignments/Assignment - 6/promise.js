const delayedPromise = new Promise((resolve) => {
    setTimeout(() => {
        resolve("Resolved after 3 seconds");
    }, 3000);
});

delayedPromise.then((message) => console.log(message));
