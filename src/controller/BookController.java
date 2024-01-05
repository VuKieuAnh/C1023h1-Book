package controller;

import model.Book;
import storage.IReadWriteFile;
import storage.ReadWriteFile;
import storage.ReadWriteFileExcel;
import storage.ReadWriteFileText;

import java.util.ArrayList;
import java.util.List;

public class BookController {
//    private static IReadWriteFile readWriteFile = ReadWriteFile.getInstance();
    private static IReadWriteFile readWriteFile = new ReadWriteFileText();
    public  static List<Book> bookList = readWriteFile.readFile();

    public static void addNewBook(Book book){
        bookList.add(book);
        readWriteFile.writeFile(bookList);
    }

    public static void deleteById(int index){
        bookList.remove(index);
       readWriteFile.writeFile(bookList);
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
