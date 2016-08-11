package com.rhwayfun.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rhwayfun.ehcache.service.EhcacheService;

@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EhcacheTest extends AbstractJUnit4SpringContextTests{

	@Autowired
	private EhcacheService ehcacheService;
	
	@Test
	public void testEhcache() throws InterruptedException{
		System.out.println("第一次调用：" + ehcacheService.getTime("param"));
		Thread.sleep(2000);
		System.out.println("第二次调用（2秒后）：" + ehcacheService.getTime("param"));
		Thread.sleep(10000);
		System.out.println("第三次调用（10秒后）：" + ehcacheService.getTime("param"));
	}
}
