package com.example.spring_demo.repository;

import com.example.spring_demo.model.CloudVendor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
 
@DataJpaTest
class CloudVendorRepositoryTest {

  @Autowired
  private TestEntityManager entityManager;

  @Autowired
  private CloudVendorRepository cloudVendorRepository;

  @Test
  void whenFindByVendorName_then_ReturnVendor() {
    // given
    CloudVendor vendor = new CloudVendor();
    vendor.setVendorId("vendor1");
    vendor.setVendorName("Vendor Name");
    entityManager.persistAndFlush(vendor);

    // when
    List<CloudVendor> vendors = cloudVendorRepository.findByVendorName(vendor.getVendorName());

    // then
    assertThat(vendors).isNotEmpty();
    assertThat(vendors.get(0)).isEqualTo(vendor);
  }
}