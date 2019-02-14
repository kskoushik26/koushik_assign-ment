package com.koushik.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.net.aso.d;
import oracle.net.aso.p;

import com.koushik.dao.pojo.IUserDao;
import com.koushik.dao.pojo.User;

public class UserDAOVer2 implements IUserDao {

	@Override
	public String getUserType(String userName, String password){
		String userType = "Invalid";
		Connection con = ConnectionFactory.getConnection();
		try {
			PreparedStatement preparedStatement=con.prepareStatement("select USERTYPE from Usertable where userName=? and password=?");
			preparedStatement.setString(1, userName);
			preparedStatement.setString(2, password);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()){
				userType=resultSet.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userType;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void changePassword(String userName, String oldpassword,
			String newpassword) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(String userName) {
		// TODO Auto-generated method stub

	}
}
