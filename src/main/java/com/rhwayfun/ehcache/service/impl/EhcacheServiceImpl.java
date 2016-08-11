package com.rhwayfun.ehcache.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rhwayfun.ehcache.service.EhcacheService;

@Service
public class EhcacheServiceImpl implements EhcacheService {

	@Cacheable(value = "cacheTest", key="#param")
	public String getTime(String param) {
		return String.valueOf(System.currentTimeMillis());
	}

}
