package com.tuempresa.libreria.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idProducto;

    @Column(length = 100)
    @Required
    String titulo;

    @Column(length = 100)
    @Required
    String autor;

    @Column(length = 50)
    @Required
    String genero;

    @Column(length = 20)
    @Required
    String ISBN;

    @Column
    @Required
    int cantidad;

    @Column
    @Required
    float precio;

    @Temporal(TemporalType.DATE)
    @Required
    Date fechaIngreso;

    // relacion con Inventario (Muchos a Uno)
    @ManyToOne
    Inventario inventario;

    // relacion con categoriaProducto (Muchos a Uno)
    @ManyToOne
    @DescriptionsList
    CategoriaProducto categoria;

    // relacion con historialMovimientos (Uno a Muchos)
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    List<HistorialMovimientos> movimientos = new ArrayList<>();
}
