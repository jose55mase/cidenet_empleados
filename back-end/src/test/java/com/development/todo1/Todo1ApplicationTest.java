package com.development.todo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Todo1ApplicationTest {

    @Test
    public void main(){
        String esperado = "hola";
        String resultado = "hola";
        Assertions.assertEquals(esperado,resultado);
    }

}