package com.example.spring_demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

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

	// add unit test for the updateCloudVendor Method
	@Test
	void testUpdateCloudVendor() {
		// create object using a Builder for the CloudVendor
		CloudVendor cloudVendor = CloudVendor.builder().vendorId("1").vendorName("AWS").vendorAddress("USA")
			.vendorPhoneNumber("1234567890").build();
		// check the condition
		assertEquals(cloudVendorServiceImpl.updateCloudVendor(cloudVendor), "Success");
	}

	// add unit test for the deleteCloudVendor Method
	@Test
	void testDeleteCloudVendor() {
		// check the condition
		assertEquals(cloudVendorServiceImpl.deleteCloudVendor("1"), "Success");
	}

	// add unit test for the getCloudVendor Method
	@Test
	void testGetCloudVendor() {
		// check the condition
		assertEquals(cloudVendorServiceImpl.getCloudVendor("1"), "Success");
	}

	// add unit test for the getAllCloudVendor Method
	@Test
	void testGetAllCloudVendors() {
		// check the condition
		assertEquals(cloudVendorServiceImpl.getAllCloudVendors(), "Success");
	}

	// add unit test for the getByVendorName Method
	@Test
	void testGetByVendorName() {
		// check the condition
		assertEquals(cloudVendorServiceImpl.getByVendorName("AWS"), "Success");
	}


}