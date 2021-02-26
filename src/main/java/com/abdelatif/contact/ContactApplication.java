package com.abdelatif.contact;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abdelatif.contact.Dao.ContactRepository;
import com.abdelatif.contact.entities.Contact;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Abdelatif BOUKEHIL
 *
 */

@SpringBootApplication
@EnableSwagger2
public class ContactApplication implements CommandLineRunner{

	@Autowired
	private ContactRepository contactrep;
	public static void main(String[] args) {
		SpringApplication.run(ContactApplication.class, args);
	}

	/**
	 * Méthode pour allémenter l'app ( pour tester )
	 */
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		contactrep.save(new Contact("BRAHIIMI","Kais", df.parse("09/10/2000"), "kais@home.dd",0006000000011L,""));
		 contactrep.save(new Contact("DUUPONT","Julien", df.parse("08/01/1990"), "dupont@home.dd",0003300600000000L,""));
		 contactrep.save(new Contact("ABDEL","Elias", df.parse("001/09/2010"), "abdel@home.dd",003300600010000L,""));
		 contactrep.save(new Contact("SAMIR","Haroun", df.parse("03/10/2012"), "samir@home.dd",0033600000000L,""));
		 contactrep.save(new Contact("DUUPONT","Claaudine", df.parse("15/01/1950"), "dclaudine@home.dd",0033600000050L,""));
		 contactrep.save(new Contact("DUURANT","Patrick", df.parse("22/02/1960"), "durantp@home.dd",000000000L,""));
		 contactrep.save(new Contact("PAAPIN","PHilipe", df.parse("17/10/1999"), "paapin@home.dd",00600000000L,""));
		 contactrep.save(new Contact("LEVVY","Ammar", df.parse("02/02/1975"), "lammar@home.dd",0011000000L,""));
		 contactrep.save(new Contact("MACHINN","Jcp", df.parse("02/03/1970"), "mjcp@home.dd",00222000000000L,""));
		 
		 contactrep.findAll().forEach(c->{
			 System.out.print(c.toString());
		 });
	}

}
