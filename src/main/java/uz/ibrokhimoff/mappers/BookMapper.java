package uz.ibrokhimoff.mappers;

import org.springframework.stereotype.Component;
import uz.ibrokhimoff.dto.book.BookCreateDto;
import uz.ibrokhimoff.dto.book.BookUpdateDto;
import uz.ibrokhimoff.models.Book;

import java.util.UUID;

@Component
public class BookMapper {

    public Book toEntity(BookCreateDto dto) {
        Book book = new Book();
        book.setId(UUID.randomUUID());
        book.setName(dto.getName());
        book.setAuthor(dto.getAuthor());
        book.setDescription(dto.getDescription());
        book.setPageCount(dto.getPageCount());
        return book;
    }
    public Book toEntity(BookUpdateDto dto) {
        Book book = new Book();
        book.setId(dto.getUuid());
        book.setName(dto.getName());
        book.setAuthor(dto.getAuthor());
        book.setDescription(dto.getDescription());
        book.setPageCount(dto.getPageCount());
        return book;
    }
}
