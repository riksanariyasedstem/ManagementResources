package com.javaTest.record.managment.system.controller;

import com.javaTest.record.managment.system.contract.ApprovalDTO;
import com.javaTest.record.managment.system.contract.DepartmentDTO;
import com.javaTest.record.managment.system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1/documents/search")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<DepartmentDTO>> getDocumentByDocNum(@PathVariable Long id) {
        return ResponseEntity.ok(Collections.singletonList(departmentService.getDocumentByDocNum(id)));
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<List<DepartmentDTO>> getDocumentByDocNum(@PathVariable Long id) {
//        return ResponseEntity.ok(Collections.singletonList(departmentService.getDocumentByDocNum(id)));
//    }
}
