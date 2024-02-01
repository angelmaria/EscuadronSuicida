package com.adecco.EsquadronSuicida;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "ATENDEE" )
public class Atendee {
    @Id
    @Column( name = "ID")
    private int id;

    @Column(name= "NAME")
    private String name;

    @Column(name= "SURNAME")
    private int surname;

    @Column(name= "ADDRESS")
    private String address;
}
