package com.example.spring_demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.spring_demo.model.CloudVendor;
import com.example.spring_demo.repository.CloudVendorRepository;

// service test
@ExtendWith(MockitoExtension.class)
class CloudVendorServiceImplTest {

	// create mock object for the CloudVendorServiceImplTest
	@InjectMocks
	CloudVendorServiceImpl cloudVendorServiceImpl;

	// create mock object for the CloudVendorServiceImpl class
	@Mock
	CloudVendorRepository cloudVendorRepository;

	// add unit test for the createCloudVendor Method
	@Test
	void testCreateCloudVendor() {
		// create object using a Builder for the CloudVendor
		CloudVendor cloudVendor = CloudVendor.builder().vendorId("1").vendorName("AWS").vendorAddress("USA")
			.vendorPhoneNumber("1234567890").build();
		// check the condition
		assertEquals(cloudVendorServiceImpl.createCloudVendor(cloudVendor), "Success");
	}

	// Write test code to verify the input and return value of the getByVendorName method
	@Test
	void testGetByVendorName2() {
		// create object using a Builder for the CloudVendor
		CloudVendor cloudVendor = CloudVendor.builder().vendorId("1").vendorName("AWS").vendorAddress("USA")
			.vendorPhoneNumber("1234567890").build();
		// mock the findByVendorName method
		when(cloudVendorRepository.findByVendorName("AWS")).thenReturn(java.util.Arrays.asList(cloudVendor));
		// check the condition
		assertEquals(cloudVendorServiceImpl.getByVendorName("AWS"), "Success");
	}


	// Write test code to validate the getByVendorName method
	@Test
	void testGetByVendorName() {
		// create object using a Builder for the CloudVendor
		CloudVendor cloudVendor = CloudVendor.builder().vendorId("1").vendorName("AWS").vendorAddress("USA")
			.vendorPhoneNumber("1234567890").build();
		// mock the findByVendorName method
		when(cloudVendorRepository.findByVendorName("AWS")).thenReturn(java.util.Arrays.asList(cloudVendor));
		// check the condition
		assertEquals(cloudVendorServiceImpl.getByVendorName("AWS"), "Success");
	}

}