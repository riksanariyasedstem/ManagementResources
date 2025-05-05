package com.javaTest.record.managment.system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "document")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Document {// ID (auto-generated)
    // Document number (unique, follows pattern: [DEPT_CODE]-[YYYY]-[SEQUENCE])
    // Title
    // Description
    // Creation date
    // Owner department (reference to Department)
    // Document type (MEMO, LETTER, REPORT, POLICY, ORDER)
    // Security classification (PUBLIC, INTERNAL, CONFIDENTIAL, RESTRICTED)
    // Digital file location (URL/path)
    // Version (major.minor format, starts at 1.0)
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime documentNumber;
    private String title;
    private String description;
    private LocalDateTime creationDate;
    private String ownerDepartment;
    private DocumentType type;
    private String fileLocation;
    private String version;
}
