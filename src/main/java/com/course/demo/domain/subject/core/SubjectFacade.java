package com.course.demo.domain.subject.core;

import com.course.demo.domain.subject.core.model.AddSubjectCommand;
import com.course.demo.domain.subject.core.model.SubjectIdentifier;
import com.course.demo.domain.subject.core.model.entity.Subject;
import com.course.demo.domain.subject.core.ports.incoming.AddNewSubject;
import com.course.demo.domain.subject.core.ports.incoming.GetSubject;
import com.course.demo.domain.subject.core.ports.outgoing.SubjectDatabase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SubjectFacade implements AddNewSubject, GetSubject {

    private final SubjectDatabase subjectDatabase;

    @Override
    public SubjectIdentifier handle(AddSubjectCommand addSubjectCommand) {
        Subject subject = Subject.builder()
                .subjectName(addSubjectCommand.getSubjectName())
                .build();
        SubjectIdentifier subjectIdentifier = subjectDatabase.save(subject);
        return subjectIdentifier;
    }

    @Override
    public List<Subject> handle() {
        return subjectDatabase.getSubjects();
    }
}
