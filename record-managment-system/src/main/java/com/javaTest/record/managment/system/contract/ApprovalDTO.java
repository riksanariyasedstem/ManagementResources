package com.javaTest.record.managment.system.contract;

import com.javaTest.record.managment.system.model.ApprovalStatus;
import com.javaTest.record.managment.system.model.ApproverDepartment;
import com.javaTest.record.managment.system.model.DocumentWorkflow;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class ApprovalDTO {
    private Long id;

    private LocalDateTime approvalDate;
    private  String approver;
    private ApprovalStatus status;
    private ApproverDepartment department;
    private DocumentWorkflow workflow;
}
