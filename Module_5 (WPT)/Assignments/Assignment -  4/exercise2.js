function forEachElement(arr, callback) {
    for (let i = 0; i < arr.length; i++) {
        callback(arr[i], i);
    }
}

const numbers = [1, 2, 3, 4, 5];
forEachElement(numbers, (element, index) => {
    document.writeln(`Index ${index}: ${element * 5}`);
});
