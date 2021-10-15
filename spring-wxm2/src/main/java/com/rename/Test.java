package com.rename;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @author: wangxinming@qiyi.com
 * @date: 2021/10/14 下午5:32
 */
public class Test {

	public static void main(String[] args) {
		System.out.println("-----");
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MazhichuConfig.class);
		Hello hello = ac.getBean(Hello.class);
		hello.hello();
	}
}
