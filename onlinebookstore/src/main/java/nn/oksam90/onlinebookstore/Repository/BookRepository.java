package nn.oksam90.onlinebookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nn.oksam90.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
