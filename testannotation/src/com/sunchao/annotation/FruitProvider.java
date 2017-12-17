package com.sunchao.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface FruitProvider {
	/**
	 * ��Ӧ�̱��
	 * 
	 * @return
	 */
	public int id() default -1;

	/**
	 * ��Ӧ������
	 * 
	 * @return
	 */
	public String name() default "";

	/**
	 * ��Ӧ�̵�ַ
	 * 
	 * @return
	 */
	public String address() default "";
	
}
