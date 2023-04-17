package com.fis.globalbankmanagementapplication.model;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsersRowMapper implements RowMapper<Users>{
	@Override
	public Users mapRow(ResultSet rs,int arg1) throws SQLException {
		Users user = new Users(rs.getString(1),rs.getString(2),rs.getString(3)
				,rs.getString(4),rs.getInt(5));
		return user;
	}
}

