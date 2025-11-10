package c.oop2.practice;

import java.util.Arrays;

public class Library {
     Book[] books;
     int bookCount;


    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    private void ensureCapacity() {
        if (bookCount == books.length) {

            books = Arrays.copyOf(books, books.length * 2);
            System.out.println("도서 목록의 크기를 " + books.length + "로 확장했습니다.");
        }
    }

    public void addBook(Book book) {
        if ( bookCount >= books.length ) {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
            return;
        }
        books[bookCount] = book;
        bookCount++;
    }


    public void addBook(String title, String author) {
//        Book b = new Book(title, author);
//        addBook(b);
        addBook(new Book(title, author));
    }


    public void addBook(String title, String author, int price) {
        addBook(new Book(title, author, price));
    }


    public void searchByTitle(String keyword) {
        for (int i = 0; i < bookCount; i++) {
           boolean check =  books[i].getTitle().toLowerCase().contains(keyword.toLowerCase());
           if (check) {
               books[i].displayInfo();
           }
        }
    }

    public void searchByAuthor(String keyword) {
       for (int  i = 0; i < bookCount; i++) {
           boolean check =  books[i].getAuthor().toLowerCase().contains(keyword.toLowerCase());
            if (check) {
                books[i].displayInfo();
            }
       }
    }


    public void displayAllBooks() {
        for (int i =0; i < bookCount; i++){
            books[i].displayInfo();
        }
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < bookCount; i++) {
            total += books[i].getPrice();
        }
        return total;
    }


    public double getAveragePrice() {
        if (bookCount == 0) {
            return 0;
        }
        return getTotalPrice() / bookCount;
    }


    public int getBookCount() {
        return bookCount;
    }


    public int applyDiscountToAll(int percent) {

        for (int i = 0; i < bookCount; i++) {

            books[i].applyDiscount(percent);
        }
        return bookCount;
    }

}