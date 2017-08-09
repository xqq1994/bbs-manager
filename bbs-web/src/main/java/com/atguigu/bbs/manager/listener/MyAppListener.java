package com.atguigu.bbs.manager.listener;

import javax.servlet.ServletContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * 这个监听器用于在服务器开始运行时，向application域中保存一些需要整个工程共享数据
 * @ClassName MyAppListener
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author Administrator
 * @Date 2017年7月4日 下午6:23:42
 * @version 1.0.0
 */
public class MyAppListener implements ServletContextListener{

    
    @Override
       /**
        * 用于在工程初始化时，向向application域中保存一些共享数据
        */
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("ctp", servletContext.getContextPath());
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        
    }

}
