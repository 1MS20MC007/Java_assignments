package com.example.demo.boot.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.boot.entity.Book;
import com.example.demo.boot.repo.BookRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class BookServeiceImpl implements BookService {

	@Autowired
	private  BookRepository  bookRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book updateBook(Book car) {
		// TODO Auto-generated method stub
		return bookRepository.save(car);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.getReferenceById(id);
		
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public Book getAllBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.getReferenceById(id);

	}

}
