package com.koushik.dao;

	import org.apache.catalina.User;

import com.koushik.uservalidationcode.Login;


	public interface UserDao {
	 
	  User validateUser(Login login);
	}


