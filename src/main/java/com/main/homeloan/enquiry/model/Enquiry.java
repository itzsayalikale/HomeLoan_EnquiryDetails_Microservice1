package com.main.homeloan.enquiry.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Enquiry {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private  int enquiryId;	
		private String enquiryName;	
		private String email;	
		private String panCard;	
		private long mobileNo;	
		private String address;	
		private String gender;	
		private boolean enquiryStatus;	
		@OneToOne(cascade = CascadeType.ALL)	
		private CibilScoreCheck cibilcheck;	

}
