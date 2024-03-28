package com.lms.LMS.eventhandle;

import com.lms.LMS.exception.ObjectIsNullException;
import com.lms.LMS.exception.StudentNotEnrolledException;
import com.lms.LMS.model.ExamEntity;
import com.lms.LMS.model.StudentEntity;
import com.lms.LMS.model.SubjectEntity;
import com.lms.LMS.repositories.ExamRepository;
import com.lms.LMS.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Component
@RepositoryEventHandler()
public class EventHandler {

       @Autowired
    StudentRepository studentRepository;

    @Autowired
    ExamRepository examRepository;


//    @HandleAfterCreate
//    public void handleStudentExamRegistration(StudentEntity student) throws ObjectIsNullException, StudentNotEnrolledException {
//        List<SubjectEntity> enrolledSubjects = student.getEnrolledSubjects();
//
//        System.out.println("enrolledSubjects  "+enrolledSubjects);
//
//
//        List<ExamEntity> registeredExams = student.getRegistered_exams();
//
//        System.out.println("registeredExams  "+registeredExams);
//
//        if (registeredExams==null ||registeredExams.isEmpty() )
//            throw new ObjectIsNullException("registeredExams List  is null");
//
//
//        for (ExamEntity exam : registeredExams) {
//
//            if (exam==null )
//                throw new ObjectIsNullException("registeredExams  is null");
//
//            SubjectEntity subject = exam.getSubject();
//            if (enrolledSubjects==null )
//                throw new ObjectIsNullException("enrolledSubjects list is null");
//
//            if (!enrolledSubjects.contains(subject)) {
//                throw new StudentNotEnrolledException("Student must enroll in the subject to register for the exam");
//            }
//
//        }
//    }
//




}