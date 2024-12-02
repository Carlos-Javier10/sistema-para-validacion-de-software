package com.tuempresa.libreria.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class CategoriaProducto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCategoria;

    @Column(length = 100)
    @Required
    String nombreCategoria;

    @Column(length = 200)
    String descripcion;

    // rrelacion con producto (Uno a Muchos)
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    List<Producto> productos = new ArrayList<>();
}

