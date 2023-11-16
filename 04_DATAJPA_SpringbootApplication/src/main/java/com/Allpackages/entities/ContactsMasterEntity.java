package com.Allpackages.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="contacts_master")
public class ContactsMasterEntity {
	
	@Id
	@Column(name="contact_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int contactId;
	
	@Column(name="contact_name")
	private  String contactName;
	
	@Column(name="contact_number")
	private int contactNumber;

}
