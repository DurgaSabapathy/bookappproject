package com.chainsys.jdbc;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BookDAOTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After");
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	public void testAddBook() throws Exception {
		BookDAO bookDao=new BookDAO();
		Book book=new Book();
		book.id=199;
		book.name="Java";
				book.price=200;
				book.publishdate=LocalDate.parse("2019-09-19");
				bookDao.addBook(book);
				Book book1=new Book();
				book1.id=199;
				Book b=bookDao.findById(book1);
				assertEquals(book.id,b.id);
		
				
		
		
	}

	@Test
	public void testUpdateBook() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteBook() throws Exception {
		BookDAO bookDao=new BookDAO();
		Book book=new Book();
		book.id=3;
	
			
				bookDao.deleteBook(book);
				Book book1=new Book();
				book1.id=3;
				Book b=bookDao.findById(book1);
				
				
				assertEquals(null,b);
	}

	@Ignore
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindById() throws Exception {
		BookDAO bookDao=new BookDAO();
		Book book=new Book();
		book.id=4;
	
			
		Book book1=new Book();
				book1.id=4;
				Book b=bookDao.findById(book1);
				
				
				assertEquals(null,b);
	}

}
