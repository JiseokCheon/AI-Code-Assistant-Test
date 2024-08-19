package com.example.spring_demo.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.extension.ExtendWith;

import com.example.spring_demo.exception.CloudVendorNotFoundException;
import com.example.spring_demo.model.CloudVendor;
import com.example.spring_demo.repository.CloudVendorRepository;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class CloudVendorServiceImplTest {

    @Mock
    private CloudVendorRepository cloudVendorRepository;

    @InjectMocks
    private CloudVendorServiceImpl cloudVendorServiceImpl;

    @Test
    void shouldReturnCloudVendorWhenExists() {
        String testCloudVendorId = "testId";
        CloudVendor testCloudVendor = new CloudVendor();
        testCloudVendor.setVendorId(testCloudVendorId);

        // Set the behaviour for the Cloud Vendor Repository Mock
        Mockito.when(cloudVendorRepository.findById(testCloudVendorId)).thenReturn(Optional.of(testCloudVendor));

        // Call the method to test
        CloudVendor retrievedCloudVendor = cloudVendorServiceImpl.getCloudVendor(testCloudVendorId);

        // Validate the result
        Assertions.assertEquals(testCloudVendor, retrievedCloudVendor);
    }

    @Test
    void shouldThrowExceptionWhenCloudVendorDoesNotExist() {
        String testCloudVendorId = "doesNotExistId";

        // Set the behaviour for the Cloud Vendor Repository Mock
        Mockito.when(cloudVendorRepository.findById(testCloudVendorId)).thenReturn(Optional.empty());

        // Call the method to test and validate that the CloudVendorNotFoundException is thrown
        Assertions.assertThrows(CloudVendorNotFoundException.class, () -> cloudVendorServiceImpl.getCloudVendor(testCloudVendorId));
    }
}