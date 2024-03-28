package com.lms.LMS.repositories;

import com.lms.LMS.model.ExamEntity;
import com.lms.LMS.model.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(collectionResourceRel = "exams", path = "exams")
public interface ExamRepository extends JpaRepository<ExamEntity,Long> {
}
