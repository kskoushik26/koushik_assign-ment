package com.koushik.validate1;



public interface IUserDao 
{
	public String getUserType(String userName,String password);
	public void addUser(User user);
	public void changePassword(String userName,String oldpassword,String newpassword);
	public void removeUser(String userName);
}
