package com.javaTest.record.managment.system.controller;

import com.javaTest.record.managment.system.contract.ApprovalDTO;
import com.javaTest.record.managment.system.model.ApprovalStatus;
import com.javaTest.record.managment.system.service.ApprovalService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/documents/search")
public class ApprovalController {
    private  ApprovalService approvalService;

    public ApprovalController(ApprovalService approvalService) {
       this.approvalService=approvalService;
    }
@GetMapping
    public ResponseEntity<List<ApprovalDTO>> getAllApprovals() {
        return ResponseEntity.ok(approvalService.getAllApproves());
    }
    @PostMapping
    public ResponseEntity<ApprovalDTO> createFacility() {
        return ResponseEntity.ok(approvalService.createApproval());
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<ApprovalDTO>> getApprovalById(@PathVariable Long id) {
        return ResponseEntity.ok(approvalService.getAllApproves());
    }
    @GetMapping("/{id}")
    public ResponseEntity<ApprovalStatus> getApprovalStatus(@PathVariable Long id) {
        return ResponseEntity.ok(approvalService.getApprovalStatus(id));
    }
@PostMapping
    public ResponseEntity<ApprovalDTO> createApproval(@PathVariable Long id, @Valid @RequestBody ApprovalDTO approvalDTO) {
       ApprovalDTO createdapproval = approvalService.createApproval();

        return ResponseEntity.status(HttpStatus.CREATED).body(createdapproval );
    }
}
