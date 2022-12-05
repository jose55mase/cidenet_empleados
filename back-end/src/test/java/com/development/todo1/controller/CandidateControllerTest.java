package com.development.todo1.controller;

import com.development.todo1.entity.CandidateEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandidateControllerTest {

    @Test
    public void listCandidate(){
        CandidateEntity candidateEntity = new CandidateEntity();
        candidateEntity.setCode(1L);
        Long expected = candidateEntity.getCode();
        Long actual = 1L;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void saveCandidate(){
        CandidateEntity candidateEntity = new CandidateEntity();
        candidateEntity.setContry("Colombia");
        String expected = candidateEntity.getContry();
        String actual = "Colombia";
        Assertions.assertEquals(expected,actual);
    }

}