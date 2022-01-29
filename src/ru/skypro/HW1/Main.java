package ru.skypro.HW1;

public class Main {

    public static void main(String[] args) {
        // Книга "Печаль"
        Book Pechal = new Book("Pechal", 2017, new Author("Azamat"));
        Book Radost = new Book("Radost", 2020, new Author("Azamat"));
        System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.yearBook + ", автор книги " + Radost.Author.getAuthorName());
        System.out.println("Книга " + Pechal.getBookName() + ", год выпуска: " + Pechal.yearBook + ", автор книги " + Pechal.Author.getAuthorName());
        Radost.setYearBook(2016);
        System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.yearBook + ", автор книги " + Radost.Author.getAuthorName());
    }
}
