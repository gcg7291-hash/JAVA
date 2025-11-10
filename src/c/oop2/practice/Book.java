//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package c.oop2.practice;

public class Book {
    String title;
    String author;
    int price;
    String isbn;

    public Book(String title, String author) {
        this(title, author, 0, (String)null);
    }

    public Book(String title, String author, int price) {
        this(title, author, price, (String)null);
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayInfo() {
        System.out.println("Title-" + this.title + "Author:" + this.author + ",Price: " + this.price + "원");
    }

    public void displayInfo(boolean detailed) {
        String info = String.format("제목:, 저자: , 가격: ", this.title, this.author, this.price);
        if (detailed && this.isbn != null) {
            info = info + String.format(", ISBN: %s", this.isbn);
        }

        System.out.println(info);
    }

    public void applyDiscount(int percent) {
        this.price = this.price * (100 - percent) / 100;
    }

    public void applyDiscount(int amount, boolean isPercent) {
        if (isPercent) {
            this.applyDiscount(amount);
        } else {
            this.price -= amount;
        }

    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }
}
