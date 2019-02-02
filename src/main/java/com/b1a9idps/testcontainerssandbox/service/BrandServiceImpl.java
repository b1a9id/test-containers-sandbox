package com.b1a9idps.testcontainerssandbox.service;

import com.b1a9idps.testcontainerssandbox.domain.Brand;
import com.b1a9idps.testcontainerssandbox.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

	private final BrandRepository brandRepository;

	public BrandServiceImpl(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public List<Brand> getBrands() {
		return brandRepository.findAll();
	}
}
