package com.course.demo.domain.subject.application;

import com.course.demo.domain.subject.core.model.AddSubjectCommand;
import com.course.demo.domain.subject.core.model.entity.Subject;
import com.course.demo.domain.subject.core.ports.incoming.AddNewSubject;
import com.course.demo.domain.subject.core.ports.incoming.GetSubject;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
@RequiredArgsConstructor
public class SubjectCommandController {
    @Qualifier("AddNewSubject")
    private final AddNewSubject addNewSubject;
    @Qualifier("GetSubject")
    private final GetSubject getSubject;

    @GetMapping
    public ResponseEntity<List<Subject>> getSubjects() {

        return new ResponseEntity<>(getSubject.handle(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addNewSubject(@RequestBody AddSubjectCommand addSubjectCommand) {
        addNewSubject.handle(addSubjectCommand);
        return new ResponseEntity<>("New Subject was added to course", HttpStatus.CREATED);
    }
}
