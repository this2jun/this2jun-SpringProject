package com.dustmq.sample;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleTest {

	/**
	 * 전체 테스트 케이스가 시작되기 전에 한번만 실행됩니다.
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass 실행");
	}

	/**
	 * 전체 테스트 케이스가 끝난 후 한번만 실행됩니다.
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass 실행");
	}

	/**
	 * 테스트 케이스가 시작할 때마다 시작전에 실행됩니다.
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp 실행");
	}

	/**
	 * 테스트 케이스가 끝날때 마다 끝난 후 실행됩니다.
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown 실행");
	}

	/**
	 * 테스트 케이스를 실행합니다.
	 */
	@Test
	public void test() {
		System.out.println("test 실행");
		//fail("Not yet implemented");
		String test = "SimpleTest";
		assertEquals("SimpleTest", test);
	}
}
