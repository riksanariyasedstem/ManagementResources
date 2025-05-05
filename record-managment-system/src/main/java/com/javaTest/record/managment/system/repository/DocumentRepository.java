package com.javaTest.record.managment.system.repository;

import com.javaTest.record.managment.system.model.Document;
import com.javaTest.record.managment.system.model.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentRepository extends JpaRepository<Document,Long> {
    List<Document> findDocByType();
}
