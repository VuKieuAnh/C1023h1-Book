package views;

import controller.BookController;
import model.Book;
import model.FictionBook;
import model.ProgrammingBook;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public static List<Book> bookList = BookController.bookList;

    public static void main(String[] args) {
//        menu
//        1. tao moi
        System.out.println(BookController.bookList);
        Book book = createNewBook();
        BookController.addNewBook(book);
        System.out.println(BookController.bookList);
    }
//    tao moi book
    public static Book createNewBook(){
//        code, name, price, author
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap code cua sach");
        String code = scanner.nextLine();
        System.out.println("Moi ban nhap ten cua sach");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap gia cua sach");
        Scanner ta = new Scanner(System.in);
        int price = ta.nextInt();
        System.out.println("Moi ban nhap tac gia cua sach");
        String author = scanner.nextLine();
//        1 -> PB
//        2 -> FB
        System.out.println("Lua chon 1 de nhap Programing Book");
        System.out.println("Lua chon 2 de nhap Fiction Book");
        int type = scanner.nextInt();
        switch (type){
            case 1:
//                language, framework;
                Scanner scanner1 =new Scanner(System.in);
                System.out.println("Moi ban nhap ngon ngu lap trinh");
                String language = scanner1.nextLine();
                System.out.println("Moi ban nhap Framework");
                String framework = scanner1.nextLine();
                ProgrammingBook a = new ProgrammingBook(code, name, price, author, language, framework);
                return a;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Moi ban nhap Category");
                String category = scanner2.nextLine();
                FictionBook f = new FictionBook(code, name,price, author, category);
                return f;
            default:
                return null;
        }
    }
}
