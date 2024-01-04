package controller;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookController {
    List<Book> bookList = new ArrayList<>();

    public void addNewBook(Book book){
        bookList.add(book);
    }

    public void deleteById(int index){
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
