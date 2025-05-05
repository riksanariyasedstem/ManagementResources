package com.javaTest.record.managment.system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;



@Getter
@Setter
@Entity
@Table(name = "approval")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Approval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    private LocalDateTime approvalDate;
    private  String approver;
    private ApprovalStatus status;
    private ApproverDepartment department;
    private DocumentWorkflow workflow;




}
