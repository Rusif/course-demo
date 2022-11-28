package com.course.demo.domain.subject.infrastructure;

import com.course.demo.domain.subject.infrastructure.entity.SubjectEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SubjectRepository extends CrudRepository<SubjectEntity, Long> {
    List<SubjectEntity> findAll();
}
