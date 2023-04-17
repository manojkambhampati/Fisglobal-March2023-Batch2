package com.fis.globalbankmanagementapplication.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fis.globalbankmanagementapplication.dao.UsersDao;
import com.fis.globalbankmanagementapplication.model.Users;
@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	UsersDao dao;
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public String register(Users user) {
		// TODO Auto-generated method stub
		return dao.register(user);
	}

	@Override
	public void applyLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showTransactions() {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayAllTransactions() {
		// TODO Auto-generated method stub

	}

}
