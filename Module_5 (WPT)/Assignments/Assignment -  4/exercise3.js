function fetchData(url, callback) {
    console.log(`Fetching data from ${url}...`);
    setTimeout(() => {
        const response = "Data received from " + url;
        callback(response);
    }, 2000);
}

fetchData("https://example.com", (response) => {
    document.writeln(response);
});
