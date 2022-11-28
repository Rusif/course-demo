package com.course.demo.domain.subject.infrastructure;

import com.course.demo.domain.subject.core.model.SubjectIdentifier;
import com.course.demo.domain.subject.core.model.entity.Subject;
import com.course.demo.domain.subject.core.ports.outgoing.SubjectDatabase;
import com.course.demo.domain.subject.infrastructure.entity.SubjectEntity;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class SubjectDatabaseAdapter implements SubjectDatabase {

    private final SubjectRepository subjectRepository;

    @Override
    public SubjectIdentifier save(Subject subject) {
        SubjectEntity subjectEntity = SubjectEntity.builder()
                .subjectName(subject.getSubjectName())
                .build();
        subjectRepository.save(subjectEntity);
        return SubjectIdentifier.builder()
                .id(subjectEntity.getId())
                .build();
    }

    @Override
    public List<Subject> getSubjects() {
        return subjectRepository.findAll()
                .stream()
                .map(subjectEntity -> mapEntityToSubject(subjectEntity))
                .collect(Collectors.toList());
    }

    private Subject mapEntityToSubject(SubjectEntity subjectEntity) {
        return Subject.builder()
                .subjectName(subjectEntity.getSubjectName())
                .build();
    }
}
