package com.course.demo.infrastructure;

import com.course.demo.domain.subject.core.SubjectFacade;
import com.course.demo.domain.subject.core.ports.incoming.AddNewSubject;
import com.course.demo.domain.subject.core.ports.incoming.GetSubject;
import com.course.demo.domain.subject.core.ports.outgoing.SubjectDatabase;
import com.course.demo.domain.subject.infrastructure.SubjectDatabaseAdapter;
import com.course.demo.domain.subject.infrastructure.SubjectRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BorrowingDomainConfig {

    @Bean
    public SubjectDatabase subjectDatabase(SubjectRepository subjectRepository) {
        return new SubjectDatabaseAdapter(subjectRepository);
    }


    @Bean
    @Qualifier("AddNewSubject")
    public AddNewSubject addNewSubject(SubjectDatabase subjectDatabase) {
        return new SubjectFacade(subjectDatabase);
    }

    @Bean
    @Qualifier("GetSubject")
    public GetSubject getSubject(SubjectDatabase subjectDatabase) {
        return new SubjectFacade(subjectDatabase);
    }
}
