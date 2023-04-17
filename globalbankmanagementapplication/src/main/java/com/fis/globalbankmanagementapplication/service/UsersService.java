package com.fis.globalbankmanagementapplication.service;

import java.util.List;

import com.fis.globalbankmanagementapplication.model.Users;

public interface UsersService {
	/*
	public void deleteCustomer();
	public void addBranch();
	public void deleteBranch();
	public void openAccount();
	public void closeAccount();
	public void displayCustomers();
	public void branchDetails();
	public void customerLoans();
	*/
	public List<Users> getAllUsers();
	public String register(Users user);
	public void applyLoan();
	public void showTransactions();
	public void displayAllTransactions();
}
