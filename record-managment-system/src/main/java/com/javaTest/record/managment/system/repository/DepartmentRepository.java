package com.javaTest.record.managment.system.repository;

import com.javaTest.record.managment.system.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository  extends JpaRepository<Department,Long> {
    List<Department> findByDeptCode(Long id);
}
