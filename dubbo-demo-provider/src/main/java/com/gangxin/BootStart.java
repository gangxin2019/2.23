package com.gangxin;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动服务提供者
 * @author GX
 *
 */
public class BootStart {

	public static void main(String[] args) throws IOException {
		//加载上下文文件
		ClassPathXmlApplicationContext cpx 
		= new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载服务器到容器
		cpx.start();
		
		//阻塞
		System.in.read();
	}
	
	
	
	
}
