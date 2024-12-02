package com.tuempresa.libreria.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idUsuario;

    @Column(length = 100)
    @Required
    String nombre;

    @Column(length = 50)
    @Required
    String rol;

    @Column(length = 100)
    @Required
    String credenciales;
}
