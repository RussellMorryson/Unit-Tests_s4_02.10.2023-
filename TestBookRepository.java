/*
Задание 2.
У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах из базы данных. 
Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
 */

class TestBookService {
    public void setUp(BookService object) {
        object.BookService = BookService(Mock());
    }

    public void findById(BookService object) {
        int bookId = 3;
        Book b = object.findBookById(bookId);
    }

    public void findAll(BookService object) {        
        List<Book> books = object.findAll(); 
    }
}
