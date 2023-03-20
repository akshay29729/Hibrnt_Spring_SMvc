package com.hibernate.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
					          + "hb-01-one-to-one-uni?useSSL=false",
					                 "hbstudent","hbstudent");
			System.out.println("Successfully connected...");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
