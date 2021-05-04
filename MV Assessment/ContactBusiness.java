package com.org;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
public List<Contact> getContactList(){
	List<Contact>listContact= new ArrayList<>();
	listContact.add(new Contact("Part Jimin","park.jimin@gmail.com","South Korea"));
	listContact.add(new Contact("Kim Taehyung","kim.taehyung@gmail.com","Japan"));
	listContact.add(new Contact("Kim Soekjin","kim.soekjin@gmail.com","India"));
	listContact.add(new Contact("Min Yoongi","min.yoongi@gmail.com","US"));
	listContact.add(new Contact("Damon Salvatore","salvatore.damon@gmail.com","UK"));
	listContact.add(new Contact("Caroline phobes","phobes.caroline@gmail.com","London"));
	listContact.add(new Contact("Rebekah Mikaelson","mikaelson.rebekah@gmail.com","Australia"));
return listContact;
}

 
}
