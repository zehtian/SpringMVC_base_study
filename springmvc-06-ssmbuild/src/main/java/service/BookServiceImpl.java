package service;

import dao.BookMapper;
import pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    //service层调用dao层：组合dao层
    private BookMapper bookMapper;
    //用于spring set注入
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String name) {
        return bookMapper.queryBookByName(name);
    }
}
