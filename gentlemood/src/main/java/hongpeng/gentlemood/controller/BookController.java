package hongpeng.gentlemood.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import hongpeng.gentlemood.entity.Book;
import hongpeng.gentlemood.mapper.BookMapper;

/**
 * @author hongpeng liang
 */

@RestController
public class BookController {

    private final BookMapper bookMapper;

    public BookController(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @GetMapping("/allBook")
    public List<Book> selectAll(){
        return bookMapper.selectList(null);
    } 

    @GetMapping("/getOne/{id}")
    public Book selectOne(@PathVariable int id){
        return bookMapper.selectById(id);
    }

}
