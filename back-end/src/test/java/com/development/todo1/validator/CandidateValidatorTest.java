package com.development.todo1.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidateValidatorTest {

    @Test
    void delete() {
        Long code = 1L;
        Long expected = code;
        if(code==null){
            assertNotEquals(expected,null);
        }else{
            assertEquals(code,1L);
        }
    }
}