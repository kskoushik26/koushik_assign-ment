package com.koushik.jdbcProject;

import org.springframework.jdbc.core.JdbcTemplate;

public class DemoBean 
{
	private JdbcTemplate jt;

	public DemoBean(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}
	
	public void createTable(){
		jt.execute("Create Table employee (eid Number(4),ename Varchar(10),esal number(7,2))");
		System.out.println("table is created");
	}
	public void insertRow(){
		jt.update("insert into employee values (101,'sidda',20000) ");
		System.out.println("table is updated ");
	}

}
