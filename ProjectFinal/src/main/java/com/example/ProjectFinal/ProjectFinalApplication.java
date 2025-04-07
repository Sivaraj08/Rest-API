package com.example.ProjectFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectFinalApplication.class, args);
		//System.out.println("Hello");
		connect();
	}
	
	public static void connect() {
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String pass="root";
		
		try(Connection conn=DriverManager.getConnection(url, user, pass)){
			if(conn!=null) {
				System.out.print("Connection Succesful");
			}
		}
		catch(SQLException e)
		{
			System.out.print("Connection UnSuccesful"+e.getMessage());
		}
		
	}
}
