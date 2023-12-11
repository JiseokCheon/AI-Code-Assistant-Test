package com.example.spring_demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_demo.exception.CloudVendorNotFoundException;
import com.example.spring_demo.model.CloudVendor;
import com.example.spring_demo.repository.CloudVendorRepository;
import com.example.spring_demo.service.CloudVendorService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CloudVendorServiceImpl implements CloudVendorService {

    @Autowired
    private final CloudVendorRepository cloudVendorRepository;

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        // More Business Logic
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        // More Business Logic
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId)  {
        // More Business Logic
        if(!cloudVendorRepository.findById(cloudVendorId).isPresent())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        // More Business Logic
        return cloudVendorRepository.findAll();
    }

    @Override
    public List<CloudVendor> getByVendorName(String vendorName)
    {
        return cloudVendorRepository.findByVendorName(vendorName);
    }
}
