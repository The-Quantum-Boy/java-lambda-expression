package sumit.JavaTechie;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBookinSort(){
        List<Book> books=new BookDao().getBooks();
        Collections.sort(books,((o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        }));

        return books;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBookinSort());
    }

}

class MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
