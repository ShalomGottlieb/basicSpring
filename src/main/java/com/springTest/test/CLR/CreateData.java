package com.springTest.test.CLR;

import com.springTest.test.Beans.Employee;
import com.springTest.test.Beans.Job;
import com.springTest.test.Service.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.Arrays;

@Component
@Order(1)
@RequiredArgsConstructor
public class CreateData implements CommandLineRunner {
    private final Company company;

    @Override
    public void run(String... args) throws Exception {
        Job job1 = Job.builder()
                .description("project Face 1")
                .endDate(Date.valueOf("2021-6-29"))
                .build();

        Job job2 = Job.builder()
                .description("spring basic test")
                .endDate(Date.valueOf("2021-6-30"))
                .build();

        Job job3 = Job.builder()
                .description("home work")
                .endDate(Date.valueOf("2021-7-30"))
                .build();

        Job job4 = Job.builder()
                .description("project Face 2")
                .endDate(Date.valueOf("2021-8-22"))
                .build();


        Employee employee1= Employee.builder()
                .name("shalom")
                .salary(100000)
                .jobs(Arrays.asList(job1,job2))
                .build();

        Employee employee2= Employee.builder()
                .name("yehushua")
                .salary(200000)
                .jobs(Arrays.asList(job3,job4))
                .build();

        company.addEmployee(employee1);
        company.addEmployee(employee2);

    }
}
