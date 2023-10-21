package com.greatLearning.studentManagement.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class EncryptedPassword {

	public static void main(String[] args) {
		PasswordEncoder encoder=new BCryptPasswordEncoder();
		System.out.println(encoder.encode("yogesh"));
		System.out.println(encoder.encode("atul"));
		

	}

}
