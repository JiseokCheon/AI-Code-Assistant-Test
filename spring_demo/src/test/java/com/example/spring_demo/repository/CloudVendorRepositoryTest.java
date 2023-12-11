package com.example.spring_demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.spring_demo.model.CloudVendor;

@DataJpaTest
class CloudVendorRepositoryTest {

	// create object for the CloudVendorRepositoryTest
	@Autowired
	CloudVendorRepository cloudVendorRepository;

	// test case for the findByVendorName
	@Test
	void testFindByVendorName() {
		// create object using a Builder for the CloudVendor
		CloudVendor cloudVendor = CloudVendor.builder().vendorId("1").vendorName("AWS").vendorAddress("USA")
				.vendorPhoneNumber("1234567890").build();
		// save the data
		cloudVendorRepository.save(cloudVendor);
		// get the data from the database
		CloudVendor cloudVendor2 = cloudVendorRepository.findByVendorName("AWS").get(0);
		// check the condition
		assertEquals(cloudVendor2.getVendorName(), "AWS");
	}

}