package com.bgsix.bookmanagement.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bgsix.bookmanagement.dto.BookForm;
import com.bgsix.bookmanagement.model.Book;

public interface IBookService {

	Book addBook(BookForm addBookForm);

	Book saveBook(Book book);

	void deleteBook(Long id);

	Book findById(Long id);

	Page<Book> findByTitleAndGenres(String title, List<String> genres, Pageable pageable);

	BookForm updateBook(Long bookId, BookForm bookForm);

	Page<Book> searchBooks(String searchInput, String searchBy, List<String> selectedGenres, String sortBy, int page, int size);
}