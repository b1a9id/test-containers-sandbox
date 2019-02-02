package com.b1a9idps.testcontainerssandbox.repository;

import com.b1a9idps.testcontainerssandbox.domain.Brand;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@DataJpaTest(excludeAutoConfiguration = AutoConfigureTestDatabase.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class BrandRepositoryTest {

	@Autowired
	private BrandRepository brandRepository;

	@Test
	@Sql(scripts = "classpath:/db/migration/brand/initial_data.sql")
	void test() {
		Assertions.assertThat(brandRepository.findAll())
				.extracting(Brand::getName, Brand::getDesigner, Brand::getGender)
				.containsExactly(Tuple.tuple("ETHOSENS", "橋本 唯", Brand.Gender.MAN));
	}

}
