package com.course.demo.domain.subject.core.ports.outgoing;

import com.course.demo.domain.subject.core.model.SubjectIdentifier;
import com.course.demo.domain.subject.core.model.entity.Subject;

import java.util.List;

public interface SubjectDatabase {
    SubjectIdentifier save(Subject subject);

    List<Subject> getSubjects();
}
