package com.b1a9idps.testcontainerssandbox.repository;

import com.b1a9idps.testcontainerssandbox.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
