package com.example.spring_demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.example.spring_demo.model.CloudVendor;

@DataJpaTest
public class CloudVendorRepositoryTest {

	@Autowired
	private CloudVendorRepository cloudVendorRepository;

	@BeforeEach
	public void setUp() {
		cloudVendorRepository.deleteAll();
	}

	@AfterEach
	public void tearDown() {
		cloudVendorRepository.deleteAll();
	}

	@Test
	public void testFindByVendorNameWhenVendorNameExistsThenReturnListOfCloudVendors() {
		// Arrange
		CloudVendor cloudVendor = new CloudVendor();
		cloudVendor.setVendorId("1");
		cloudVendor.setVendorName("Vendor1");
		cloudVendor.setVendorAddress("Address1");
		cloudVendor.setVendorPhoneNumber("1234567890");
		cloudVendorRepository.save(cloudVendor);

		// Act
		List<CloudVendor> result = cloudVendorRepository.findByVendorName("Vendor1");

		// Assert
		assertEquals(1, result.size());
		assertEquals(cloudVendor, result.get(0));
	}

	@Test
	public void testFindByVendorNameWhenVendorNameDoesNotExistThenReturnEmptyList() {
		// Act
		List<CloudVendor> result = cloudVendorRepository.findByVendorName("NonExistentVendor");

		// Assert
		assertTrue(result.isEmpty());
	}
}