package controller;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    public  static List<Book> bookList = new ArrayList<>();

    public static void addNewBook(Book book){
        bookList.add(book);
    }

    public static void deleteById(int index){
        bookList.remove(index);
    }

    public BookController() {
    }

    public BookController(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
