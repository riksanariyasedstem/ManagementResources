package com.javaTest.record.managment.system.contract;

import com.javaTest.record.managment.system.model.DocumentType;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@Data
@Builder
public class DocumentDTO {    private LocalDateTime documentNumber;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private DocumentType type;
}
