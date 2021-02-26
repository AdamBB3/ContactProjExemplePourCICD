package com.abdelatif.contact.controller;


 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.abdelatif.contact.entities.*;
import com.abdelatif.contact.Dao.ContactRepository;

/**
 * 
 * @author Abdelatif BOUKEHIL
 *
 */

@RestController
@RequestMapping("/api")
public class ContactController {
	
	@Autowired
	private ContactRepository  contactrep;
	
	@GetMapping("/contacts")
	public Iterable<Contact> All(){
		return contactrep.findAll();	
	}
	
	@GetMapping("/contacts/{id}")
	public Optional<Contact> getContact(@PathVariable Long id) {
		return contactrep.findById(id);
	}
	
	@PostMapping("/addContact")
	public Contact postContac(@RequestBody Contact contact) {
		
		return contactrep.save(contact);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteContact(@PathVariable Long id) {
		contactrep.deleteById(id);
		return true;
	}
	
	@PutMapping("/update/{id}")
	public boolean updateContact(@PathVariable Long id,@RequestBody Contact contact) {
		contact.setId(id);
		contactrep.save(contact);
		return true;
	}
	
	@GetMapping("searchById")
	public Page<Contact> search(int page, int size){
		Pageable pageable = PageRequest.of(0, 3);
		Page<Contact> p = contactrep.findAll(pageable);	
		 
		return p;
	}

}
