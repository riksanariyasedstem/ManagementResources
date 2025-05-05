package com.javaTest.record.managment.system.service;

import com.javaTest.record.managment.system.contract.ApprovalDTO;
import com.javaTest.record.managment.system.model.Approval;
import com.javaTest.record.managment.system.model.ApprovalStatus;
import com.javaTest.record.managment.system.repository.ApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ApprovalService {
    @Autowired
    private ApprovalRepository approvalRepository;

    public List<ApprovalDTO> getAllApproves(){
     List<Approval>approvals= approvalRepository.findAll();
     return approvals.stream()
             .map(approval->ApprovalDTO.builder()
                     .id(approval.getId())
                     .approvalDate(approval.getApprovalDate())
                     .approver(approval.getApprover())
                     .status(approval.getStatus())
                     .department(approval.getDepartment())
                     .workflow(approval.getWorkflow())
                     .build())
             .toList();
    }
    public ApprovalDTO getApprovalById(Long id){
    Approval approval=approvalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Given Approval not found with id: " + id));
        return ApprovalDTO.builder()

                        .id(approval.getId())
                        .approvalDate(approval.getApprovalDate())
                        .approver(approval.getApprover())
                        .status(approval.getStatus())
                        .department(approval.getDepartment())
                        .workflow(approval.getWorkflow())
                        .build();
    }
//  public ApprovalDTO getApprovalByDate(LocalDateTime Date){
//        Approval approval=approvalRepository.findBy(getApprovalByDate(LocalDateTime Date))
//  }
  public ApprovalStatus getApprovalStatus(Long id){
        Approval approval=approvalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Public Facility not found with id: " + id));
      return approval.getStatus();
  }
  public ApprovalDTO createApproval(){
      ApprovalDTO approval= ApprovalDTO.builder().build();
      return ApprovalDTO.builder()
              .id(approval.getId())
              .approvalDate(approval.getApprovalDate())
              .approver(approval.getApprover())
              .status(approval.getStatus())
              .department(approval.getDepartment())
              .workflow(approval.getWorkflow())
              .build();
  }
}
