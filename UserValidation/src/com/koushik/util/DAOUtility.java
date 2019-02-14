package com.koushik.util;

import com.koushik.dao.UserDAOVer2;
import com.koushik.dao.pojo.IUserDao;

public class DAOUtility 
{
	public static IUserDao getUserDAO(){
		return new UserDAOVer2();
	}
  
}
