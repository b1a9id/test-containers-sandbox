package com.b1a9idps.testcontainerssandbox.repository;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.junit.jupiter.api.Assertions.*;

@Testcontainers
class BrandRepositoryTest {

	@Container
	private static final MySQLContainer MY_SQL_CONTAINER = new MySQLContainer();

	@Test
	void test() {
		assertTrue(MY_SQL_CONTAINER.isRunning());
	}

}
