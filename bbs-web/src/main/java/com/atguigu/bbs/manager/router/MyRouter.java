package com.atguigu.bbs.manager.router;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyRouter extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		
		//1.从线程上获取之前绑定的键
		String key = KeyBinder.getKey();
		
		//2.从线程上将之前绑定的键立即移除
		KeyBinder.removeKey();
		
		//3.给Spring框架返回，让Spring框架据此判断该访问哪个数据库
		return key;
	}

}
