package com.example.spring_demo.repository;

import com.example.spring_demo.model.CloudVendor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CloudVendorRepositoryTest {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    @BeforeEach
    void setUp() {
        CloudVendor cloudVendor = new CloudVendor();
        // TODO: setup your CloudVendor object here
        cloudVendorRepository.save(cloudVendor);
    }

    @Test
    void testFindById() {
        Optional<CloudVendor> foundCloudVendor = cloudVendorRepository.findById(String.valueOf(1L));
        assertTrue(foundCloudVendor.isPresent());
    }

    // TODO: write more tests here
}