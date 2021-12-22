package com.springTest.test.Repositories;

import com.springTest.test.Beans.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<Job,Integer> {
    List<Job> findByEndDate (Date endDate);
    List<Job> findByEndDateBetween (Date start,Date end);

}
