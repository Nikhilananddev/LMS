package com.lms.LMS.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;


@Entity
@Data
@Table(name = "exam_table")
@AllArgsConstructor
@NoArgsConstructor
public class ExamEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JdbcTypeCode(SqlTypes.JSON)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "id")
    @ToString.Exclude
    private SubjectEntity subject;

    @ManyToMany(mappedBy = "registered_exams", fetch = FetchType.LAZY)
    @JdbcTypeCode(SqlTypes.JSON)
    @ToString.Exclude
    private List<StudentEntity> students;

}
