package com.fis.globalbankmanagementapplication.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.fis.globalbankmanagementapplication.model.Users;
import com.fis.globalbankmanagementapplication.model.UsersRowMapper;
@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		String sql="select * from users";
		List<Users> users = template.query(sql, new UsersRowMapper());
		return users;
	}

	@Override
	public String register(Users user) {
		return null;
		// TODO Auto-generated method stub

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
