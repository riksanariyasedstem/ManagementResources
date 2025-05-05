package com.javaTest.record.managment.system.service;

import com.javaTest.record.managment.system.contract.DepartmentDTO;
import com.javaTest.record.managment.system.contract.DocumentDTO;
import com.javaTest.record.managment.system.model.Department;
import com.javaTest.record.managment.system.model.Document;
import com.javaTest.record.managment.system.model.DocumentType;
import com.javaTest.record.managment.system.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public DocumentDTO getDocByType(DocumentType documentType){
        Document document =documentRepository.findDocByType(documentType);
               // .orElseThrow(() -> new RuntimeException("Given document not found with id: " + id));//need to find something that alligns with the list in the repo!!
        return DocumentDTO.builder()
                .title(document.getTitle())
                .description(document.getDescription())
                .creationDate(document.getCreationDate())
                .type(document.getType())
                .build();
    }
}
