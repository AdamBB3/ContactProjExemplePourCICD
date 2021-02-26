package com.abdelatif.contact.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author Abdelatif BOUKEHIL
 *
 */
@Entity(name = "CONTACT")
public class Contact implements Serializable{

	public Contact(String name, String lastName,Date date, String email, Long tel, String photo) {
		super();
		Name = name;
		LastName = lastName;
		Email = email;
		Tel = tel;
		Photo = photo;
		BirthDay= date;
	}
	@Override
	public String toString() {
		return "Contact [Name=" + Name + ", LastName=" + LastName + ", BirthDay=" + BirthDay + ", Email=" + Email
				+ ", Tel=" + Tel + ", Photo=" + Photo + "]";
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Name;
	private String LastName;
	@Temporal(TemporalType.DATE)
	private Date BirthDay;
	public Date getBirthDay() {
		return BirthDay;
	}
	public void setBirthDay(Date birthDay) {
		BirthDay = birthDay;
	}
	private String Email;
	private Long Tel;
	private String Photo;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getTel() {
		return Tel;
	}
	public void setTel(Long tel) {
		Tel = tel;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

}
