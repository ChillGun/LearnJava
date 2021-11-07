package com.itranswarp.learnjava;
import java.lang.reflect.Method;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) throws Exception {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		Method m1 = p.getClass().getDeclaredMethod("setName", String.class);
		m1.setAccessible(true);
		m1.invoke(p, name);
		Method m2 = p.getClass().getDeclaredMethod("setAge", int.class);
		m2.setAccessible(true);
		m2.invoke(p,age);
		// TODO: 利用反射调用setName和setAge方法:

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
