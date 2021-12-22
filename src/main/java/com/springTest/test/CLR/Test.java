package com.springTest.test.CLR;

import com.springTest.test.Service.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
@Order(2)
@RequiredArgsConstructor
public class Test implements CommandLineRunner {
    private final Company company;

    @Override
    public void run(String... args) throws Exception {
        System.out.println();
        System.out.println("printing one employee");
        System.out.println(company.getOneEmployeeById(2));

        System.out.println();
        System.out.println("printing employees by name");
        System.out.println(company.getEmployeesByName("shalom"));

        System.out.println();
        System.out.println("printing all employees");
        System.out.println(company.getAllEmployees());

        System.out.println();
        System.out.println("printing all jobs");
        System.out.println(company.getAllJobs());

        System.out.println();
        System.out.println("printing jobs by date");
        System.out.println(company.getAllJobsByEndDate(Date.valueOf("2021-6-29")));

        System.out.println();
        System.out.println("printing jobs between dates");
        System.out.println(company.getAllJobsBetweenEndDates(Date.valueOf("2021-6-30"),Date.valueOf("2021-10-29")));


        System.out.println("\nfinish :)");
        System.out.println("thank you very much");


    }
}
