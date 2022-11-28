package com.course.demo.domain.subject.infrastructure.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "course_subject")
@EqualsAndHashCode
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "subject_name")
    private String subjectName;
}
