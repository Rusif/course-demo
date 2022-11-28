package com.course.demo.domain.subject.core.ports.incoming;

import com.course.demo.domain.subject.core.model.entity.Subject;

import java.util.List;

public interface GetSubject {
    List<Subject> handle();
}
