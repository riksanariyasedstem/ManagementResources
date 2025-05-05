package com.javaTest.record.managment.system.repository;

import com.javaTest.record.managment.system.model.Approval;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprovalRepository extends JpaRepository<Approval,Long> {
}
