package org.example.tx.dao;

public interface BookDao {
    Integer getPriceByBookId(Integer bookId);

    void updateBookStock(Integer bookId);
}
