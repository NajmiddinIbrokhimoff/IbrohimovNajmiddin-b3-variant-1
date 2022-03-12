package uz.ibrokhimoff.services.book;

import com.google.common.collect.Lists;
import org.springframework.web.multipart.MultipartFile;
import uz.ibrokhimoff.dto.book.BookCreateDto;
import uz.ibrokhimoff.dto.book.BookUpdateDto;
import uz.ibrokhimoff.models.Book;

import java.io.IOException;
import java.util.List;

public interface BookService {

    List<Book> BOOK_LIST = Lists.newArrayList();

    Book get(String id);

    List<Book> getAll();

    String create(BookCreateDto dto, MultipartFile file,MultipartFile image) throws IOException;

    void delete(String id);

    boolean update(BookUpdateDto dto);

}
