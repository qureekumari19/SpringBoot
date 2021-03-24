package com.psl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psl.dao.IEmpDAO;
import com.psl.entity.Employee;

@Service
public class TestService {

	@Autowired
	private IEmpDAO dao;
	public Employee getEmployee(int id)
	{
		return dao.findById(id).get();
	}	
	public void addEmployee(Employee e)
	{
		dao.save(e);
		System.out.println("Employee has been added with id "+e);
	}
	public void updateEmployee(Employee e)
	{
		dao.save(e);
		System.out.println("Employee has been updated of id "+ e);
	}
	public void deleteEmployee(int id)
	{
		dao.deleteById(id);
		System.out.println("Employee has been deleted of id "+id);
	}
}
