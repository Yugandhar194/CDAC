function processNumbers(numbers) {
    return numbers
        .filter(number => number % 2 === 0)    
        .map(number => number * 2)             
        .reduce((total, number) => total + number, 0); 
}

console.log(processNumbers([1, 2, 3, 4, 5, 6])); 