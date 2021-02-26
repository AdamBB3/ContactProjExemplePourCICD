package com.abdelatif.contact.Dao;


import org.springframework.data.repository.PagingAndSortingRepository;


import com.abdelatif.contact.entities.Contact;

public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>{


}
