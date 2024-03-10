package com.main.homeloan.enquiry.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.homeloan.enquiry.model.Enquiry;
import com.main.homeloan.enquiry.repository.EnquiryRepository;
import com.main.homeloan.enquiry.service.EnquiryService;
@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private EnquiryRepository enquiryrepository;

	
	@Override
	public String addData(Enquiry enquirydetails) {
		enquiryrepository.save(enquirydetails);
		return "data Added";
	}

	@Override
	public Enquiry getSingleData(int enquiryId) {
		Optional<Enquiry> getrecord=enquiryrepository.findById(enquiryId);
		return getrecord.get();
	}
	
}
