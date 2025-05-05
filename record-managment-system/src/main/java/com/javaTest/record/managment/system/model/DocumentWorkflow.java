package com.javaTest.record.managment.system.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "document_workflow")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentWorkflow {
    //ID (auto-generated)
    // Document (reference to Document)
    // Current state (DRAFT, REVIEW, APPROVED, PUBLISHED, ARCHIVED)
    // Last modified date
    // Last modified by (user ID)
    // Comments
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Document document;
    private CurrentState state;
    private LocalDateTime lastModifiedDate;
    private Long modifiedById;
    private String comments;
}
