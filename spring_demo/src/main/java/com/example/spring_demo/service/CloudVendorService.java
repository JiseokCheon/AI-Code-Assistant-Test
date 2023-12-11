package com.example.spring_demo.service;

import java.util.List;

import com.example.spring_demo.model.CloudVendor;

public interface CloudVendorService {
	String createCloudVendor(CloudVendor cloudVendor);

	String updateCloudVendor(CloudVendor cloudVendor);

	String deleteCloudVendor(String cloudVendorId);

	CloudVendor getCloudVendor(String cloudVendorId);

	List<CloudVendor> getAllCloudVendors();

	List<CloudVendor> getByVendorName(String vendorName);
}
