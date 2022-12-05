package com.development.todo1.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ParentEntity implements Serializable {
    private static final long serialVersionUID = -4611815928732870812L;

    /**
     * <h1>Serializador</h1>
     * Un serializador para implementarlo en las diferentes entidades.
     *
     * @author  Jose luis CC
     * @version 1.0
     * @since   2020-05-30
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}