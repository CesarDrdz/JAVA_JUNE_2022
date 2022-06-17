package com.john.relationships.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.john.relationships.models.Book;
import com.john.relationships.models.Library;
import com.john.relationships.models.User;
import com.john.relationships.services.BookService;
import com.john.relationships.services.LibraryService;
import com.john.relationships.services.UserService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookServ;
	@Autowired
	private LibraryService libServ;
	@Autowired
	private UserService userServ;
	
//	@GetMapping("/")
//	public String index() {
//		System.out.println("index");
//		return "redirect:/books";
//	}
	
//	SHOW ALL THE BOOKS
	@GetMapping("/books")
	public String index(Model model) {
		List<Book> alldabooks = bookServ.allBooks();
		model.addAttribute("alldabooks", alldabooks);
		return "/books/index.jsp";
	}
	
//	SHOW ONE RENDER
//	localhost:8080/books/3
	@GetMapping("/books/{id}")
	public String showOne(@PathVariable("id") Long id, Model model) {
		Book oneBook = bookServ.findBook(id);
//		System.out.println(oneBook.getTitle());
		model.addAttribute("oneBook", oneBook);
		
//		randomz
		int random1 = (int)(Math.random() * 50 + 150);
		int random2 = (int)(Math.random() * 50 + 150);
		model.addAttribute("random1", random1);
		model.addAttribute("random2", random2);
		return "/books/show.jsp";
	}
	
	
//	@GetMapping("/new")
//	public String createBook(Model model) {
//		Book book = new Book();
//		model.addAttribute("book", book);
//		return "new.jsp";
//	}
//	---- CREATE - RENDER PAGE ------
	@GetMapping("/books/new")
	public String createBook(@ModelAttribute("book") Book book,
							Model model, HttpSession sesh) {
//		passes all the books
		List<Book> alldabooks = bookServ.allBooks();
		model.addAttribute("alldabooks", alldabooks);
		
//		pass all the libraries
		List<Library> allLibs = libServ.allLibraries();
		model.addAttribute("allLibs", allLibs);
		
//		grab the user from session and pass it to the jsp
		Long userId = (Long) sesh.getAttribute("user_id");
		
		User thisLoggedInUser = userServ.findOne(userId);
		model.addAttribute("thisLoggedInUser", thisLoggedInUser.getUserName());
		return "/books/new.jsp";
	}
	
//	----- CREATE - POST METHOD -----
	@PostMapping("/books")
	public String create(
			@Valid @ModelAttribute("book") Book book, 
			BindingResult result, 
			@RequestParam("unicorn") String unicorn,
			Model model, HttpSession sesh) {
		
		System.out.println(unicorn);
		
		if (result.hasErrors()) {
			List<Book> alldabooks = bookServ.allBooks();
			model.addAttribute("alldabooks", alldabooks);
//			pass all the libraries
			List<Library> allLibs = libServ.allLibraries();
			model.addAttribute("allLibs", allLibs);
			return "/books/new.jsp";
        } else {
//        	book.setAuthor(unicorn);
//        	book.setLibrary()
        	
//        	ALTERNATIVE WAY
////    		grab the user from session and pass it to the jsp
//    		Long userId = (Long) sesh.getAttribute("user_id");
//    		
//    		User thisLoggedInUser = userServ.findOne(userId);
//    		book.setAuthor(thisLoggedInUser);
//        	bookServ.createBook(book);
            return "redirect:/books";
        }
	}
	
//	---- RENDER EDIT PAGE ----
	
    @RequestMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookServ.findBook(id);
//        book.getAuthor()
        model.addAttribute("book", book);
        return "/books/edit.jsp";
    }
    
//    @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
    @PutMapping("/books/{id}")
    public String update(
    			@Valid @ModelAttribute("book") Book book, 
    			BindingResult result, @PathVariable("id") Long bookId) {
        if (result.hasErrors()) {
            return "/books/edit.jsp";
        } else {
//        	Book oldBook = bookServ.findBook(bookId);
//        	book.setLibrary(oldBook.getLibrary());
        	
        	
//        	Library thisBooksLib = book.getLibrary();
//        	 System.out.println(thisBooksLib); 
        	
//        	bookServ.findBook(book.getId());
//        	book.setAuthor(null)
        	bookServ.updateBook(book);
            return "redirect:/books";
        }
    }
	
	
//	DELETE
    @DeleteMapping("/books/{id}/delete")
    public String destroy(@PathVariable("id") Long id, RedirectAttributes flash) {
    	bookServ.deleteBook(id);
    	flash.addFlashAttribute("delete_success", "you have deleted a book!");
        return "redirect:/books";
    }
	
//    =========================================
//    ========     LIBRARY       ==============
//    =========================================
    
//    RENDER THE CREATE PAGE - LIBRARY
    @GetMapping("/library/new")
    public String newLibraryPage(@ModelAttribute("library") Library library) {
    	
    	return "/library/new.jsp";
    }
    
    @PostMapping("/library")
    public String createLibraryMethod(
    		@Valid @ModelAttribute("library") Library library, 
    		BindingResult res) {
    	
    	if (res.hasErrors()) {
//    		render the page again and display errors
    		return "/library/new.jsp";
    	} else {
//    		save
    		libServ.createLibrary(library);
    		return "redirect:/library/new";
    	}
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
