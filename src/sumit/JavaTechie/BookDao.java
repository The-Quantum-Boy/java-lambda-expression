package sumit.JavaTechie;

import java.util.Arrays;
import java.util.List;

public class BookDao {

    public List<Book> getBooks(){
        return List.of(
                new Book(1, "core java", 400),
                new Book(2,"angualr",500),
                new Book(3,"spring",600),
                new Book(4,"WebService",340)
        );

    }
}
