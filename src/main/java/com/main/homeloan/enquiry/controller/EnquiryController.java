package com.main.homeloan.enquiry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.main.homeloan.enquiry.model.Enquiry;
import com.main.homeloan.enquiry.service.EnquiryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/enquiry")
public class EnquiryController {

	@Autowired
	private EnquiryService enquiryservice;
	
	//Here Get & Post method is used for EnquiryDetails..
	
	@PostMapping("/saveEnquiryData")
	public ResponseEntity<String> addData(@RequestBody Enquiry enquirydetails){
		String response=enquiryservice.addData(enquirydetails);
		return new ResponseEntity<String>(response,HttpStatus.CREATED);
	}
	@GetMapping("/getEnquiryRecord/{enquiryId}")
	public ResponseEntity<Enquiry> getSingleData(@PathVariable int enquiryId){
		Enquiry getrecord=enquiryservice.getSingleData(enquiryId);
		return new ResponseEntity<Enquiry>(getrecord,HttpStatus.OK);
	}
	
	
}
