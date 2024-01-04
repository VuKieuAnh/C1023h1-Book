package storage;

import model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
//    doc file
    public List<Book> readFile(){
        File file = new File("book.dat");
        try {
            InputStream inputStream = new  FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Book> bookList = null;
            bookList = (List<Book>) ois.readObject();
            return bookList;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }

    }

//    ghi file
    public void writeFile(List<Book> bookList){
        File file = new File("book.dat");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(bookList);
            objectOutputStream.close();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
