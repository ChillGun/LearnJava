package com.itranswarp.learnjava;
import java.lang.reflect.Field;

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
		Class c = p.getClass();
		Field f = c.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, name);
		
		Field k = c.getDeclaredField("age");
		k.setAccessible(true);
		k.set(p, age);
		
		
		// TODO: 利用反射给name和age字段赋值:

		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
