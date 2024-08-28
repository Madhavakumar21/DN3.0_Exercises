package com.madhav.employeemanagementsystem.repository;

import com.madhav.employeemanagementsystem.entity.Employee;
import com.madhav.employeemanagementsystem.entity.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
    List<EmployeeProjection> findByName(String name);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findByEmail(@Param("email") String email);

    <S extends Employee> List<S> saveAll(Iterable<S> entities);
}
