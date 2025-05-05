package com.javaTest.record.managment.system.contract;

import com.javaTest.record.managment.system.model.CurrentState;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class DocumentWorkflowDTO {
    private CurrentState state;
    private LocalDateTime lastModifiedDate;
    private Long modifiedById;
}
