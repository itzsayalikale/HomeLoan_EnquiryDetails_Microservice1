package com.main.homeloan.enquiry.service;


import com.main.homeloan.enquiry.model.Enquiry;

public interface EnquiryService {

	public String addData(Enquiry enquirydetails);

	public Enquiry getSingleData(int enquiryId);

	

}
