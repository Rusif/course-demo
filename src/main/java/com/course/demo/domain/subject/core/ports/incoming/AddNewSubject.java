package com.course.demo.domain.subject.core.ports.incoming;

import com.course.demo.domain.subject.core.model.AddSubjectCommand;
import com.course.demo.domain.subject.core.model.SubjectIdentifier;

public interface AddNewSubject {
    SubjectIdentifier handle(AddSubjectCommand addSubjectCommand);
}
