package com.sunchao.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface FruitColor {
	/**
	 * ��ɫö��
	 * 
	 * @author peida
	 *
	 */
	public enum Color {
		BULE, RED, GREEN
	};

	/**
	 * ��ɫ����
	 * 
	 * @return
	 */
	Color fruitColor() default Color.GREEN;
}
