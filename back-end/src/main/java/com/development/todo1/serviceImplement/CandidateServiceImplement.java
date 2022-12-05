package com.development.todo1.serviceImplement;

import com.development.todo1.dao.CandidateRepository;
import com.development.todo1.entity.CandidateEntity;
import com.development.todo1.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImplement implements CandidateService {

    @Autowired
    protected CandidateRepository candidateRepository;

    /**
     * <h1>findAll( Todos los Candidate )</h1>
     * Busca por la lista de candidatos en DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-04
     */
    @Override
    public List<CandidateEntity> findAll(){
        return this.candidateRepository.findAll();
    }

    /**
     * <h1>save( Guarda Facturas )</h1>
     * Guarda los facturas de tipo CandidateEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-04
     */
    @Override
    public CandidateEntity save(CandidateEntity billEntity){
        return this.candidateRepository.save(billEntity);
    }

    /**
     * <h1>upDate( Actualiza )</h1>
     * Actualiza los facturas de tipo CandidateEntity en  DB.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-04
     */
    @Override
    public CandidateEntity upDate(CandidateEntity billEntity){
        return this.candidateRepository.save(billEntity);
    }

}
