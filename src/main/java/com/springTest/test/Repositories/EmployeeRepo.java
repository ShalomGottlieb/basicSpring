package com.springTest.test.Repositories;

import com.springTest.test.Beans.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    Employee findById (long id);       //i did this because of the problem integer-long
    List<Employee> findByName (String name);
}
