package com.springTest.test.Service;

import com.springTest.test.Beans.Employee;
import com.springTest.test.Beans.Job;
import com.springTest.test.Repositories.EmployeeRepo;
import com.springTest.test.Repositories.JobRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class Company {
    private final EmployeeRepo employeeRepo;
    private final JobRepo jobRepo;

    public void addEmployee (Employee employee){
        employeeRepo.save(employee);
    }

    public Employee getOneEmployeeById (long id){
        return employeeRepo.findById(id);
    }

    public List<Employee> getEmployeesByName (String name){
        return employeeRepo.findByName(name);
    }

    public List<Employee> getAllEmployees (){
        return employeeRepo.findAll();
    }

    public List<Job> getAllJobs (){
        return jobRepo.findAll();
    }

    public List<Job> getAllJobsByEndDate (Date date){
        return jobRepo.findByEndDate(date);
    }

    public List<Job> getAllJobsBetweenEndDates (Date startDate, Date endDate){
        return jobRepo.findByEndDateBetween(startDate, endDate);
    }
}
