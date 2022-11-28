package com.course.demo.domain.subject.core.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Builder
public class SubjectIdentifier {
    private final Long id;
}
