package com.development.todo1.controller;


import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.service.CandidateService;
import com.development.todo1.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*")
@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    protected CandidateService candidateService;
    // rolValidator = new RolValidator();

    protected ObjectMapper mapper;

    @GetMapping("/list")
    public List<CandidateEntity> list(){
        return this.candidateService.findAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public RestResponse save(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        CandidateEntity data = this.mapper.readValue(json, CandidateEntity.class);
        this.candidateService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Guardado");
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public RestResponse  update(@RequestBody String json)
            throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        CandidateEntity data = this.mapper.readValue(json, CandidateEntity.class);
        this.candidateService.save(data);
        return new RestResponse(HttpStatus.OK.value(),"Actualizado");
    }


}
