package com.atguigu.bbs.manager.cache;

import java.lang.reflect.Method;

import org.springframework.cache.interceptor.KeyGenerator;

public class MyCacheKeyGenerator implements KeyGenerator {

	/**
	 * target：调用目标方法的对象
	 * method：目标方法
	 * params：调用目标方法时传入的参数
	 */
	public Object generate(Object target, Method method, Object... params) {
		
		StringBuilder builder = new StringBuilder();
		
		String className = target.getClass().getName();
		
		builder.append(className);
		
		String methodName = method.getName();
		
		builder.append(".").append(methodName);
		
		for(int i = 0; params != null && i < params.length; i++) {
			Object param = params[i];
			builder.append(".").append(param);
		}
		
		String key = builder.toString();
		
		System.out.println(key);
		
		return key;
	}

}
