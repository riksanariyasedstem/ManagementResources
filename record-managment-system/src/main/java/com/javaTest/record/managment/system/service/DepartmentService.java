package com.javaTest.record.managment.system.service;

import com.javaTest.record.managment.system.contract.DepartmentDTO;
import com.javaTest.record.managment.system.model.Department;
import com.javaTest.record.managment.system.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    public DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }
    public DepartmentDTO getDocumentByDocNum(Long id){
        Department department =departmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Given document not found with id: " + id));
        return DepartmentDTO.builder()
                .id(department.getId())
                .deptCode(department.getDeptCode())
                .deptName(department.getDeptName())
                .build();
    }


    public DepartmentDTO getDocumentByDocCode(Long id){
        Department department =departmentRepository.findByDeptCode(id)
                .orElseThrow(() -> new RuntimeException("Given document not found with id: " + id));//need to find something that alligns with the list in the repo!!
        return DepartmentDTO.builder()
                .id(department.getId())
                .deptCode(department.getDeptCode())
                .deptName(department.getDeptName())
                .build();
    }







}
