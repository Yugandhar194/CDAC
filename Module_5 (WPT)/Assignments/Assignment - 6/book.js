const book = {
    title: "Harry Potter",
    author: "J.K. Rowling",
    yearPublished: 1997,
    displayDetails() {
        document.writeln(`Title: ${this.title}, Author: ${this.author}, Year: ${this.yearPublished}`);
    }
};

book.displayDetails();
