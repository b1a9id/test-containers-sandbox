package com.b1a9idps.testcontainerssandbox.repository;

import com.b1a9idps.testcontainerssandbox.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

	List<Brand> findAllByGender(Brand.Gender gender);
}
