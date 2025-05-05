package com.javaTest.record.managment.system.contract;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class DepartmentDTO {
    private Long id;
    private Long deptCode;
    private String deptName;
}
