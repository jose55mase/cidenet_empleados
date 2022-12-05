package com.development.todo1.service;

import com.development.todo1.entity.CandidateEntity;

import java.util.List;

public interface CandidateService {

    /**
     * <h1>Servicios</h1>
     * Un manto para identificar las propiedades que se implementaran en el
     * reposirotio usando un CRUD (FindAll, Save, Update)
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2022-12-04
     */
    List<CandidateEntity> findAll();
    CandidateEntity save(CandidateEntity billEntity);
    CandidateEntity upDate(CandidateEntity billEntity);
}
