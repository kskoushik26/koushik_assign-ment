package com.koushik.validate1;

import java.util.ArrayList;



public class UserDAO {
 ArrayList<User> all=new ArrayList<User>();
 public UserDAO() {
 all.add(new User("sunil","Jagga","Admin"));
 all.add(new User("Jagga","sunil","User"));
 all.add(new User("sunil","Jagga","User"));
 }
public String getUserType(String userName, String password) {
	
	for(User user:all) {
		if(user.getUserName().equals(userName) && user.getPassword().equals(password))
		{
			return user.getUserType();
		}
	
	//throw new InvalidUserException("User Name and Password doesnt exists...");
}
	return "null";
}
}