package com.example.test;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

	private String lombok;
	private String hello;

	public static void main(String[] args) {
		HelloLombok helloLombok = new HelloLombok();
	}

}
