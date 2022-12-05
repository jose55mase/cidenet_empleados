package com.development.todo1.validator;

public class RolValidator {

    public boolean delete(Long code){
        if(code==null){
            return false;
        }else{
            return true;
        }
    }

}
