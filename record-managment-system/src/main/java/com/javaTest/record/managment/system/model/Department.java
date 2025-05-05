package com.javaTest.record.managment.system.model;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@Table(name = "dep_table")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
   //ID (auto-generated)
    // Department code (unique)
    // Department name
    // Description
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long deptCode;
private String deptName;
private String description;
private String activeStatus;


}
