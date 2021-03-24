package com.psl.dao;

import org.springframework.data.repository.CrudRepository;

import com.psl.entity.Employee;

public interface IEmpDAO extends CrudRepository<Employee, Integer> {

	
}
