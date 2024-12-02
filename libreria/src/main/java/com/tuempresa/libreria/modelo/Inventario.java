package com.tuempresa.libreria.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idInventario;

    @Column(length = 100)
    @Required
    String nombre;

    @Column
    @Required
    int capacidadMaxima;

    // relacion con usuario (Uno a Muchos)
    @ManyToOne
    @DescriptionsList
    Usuario usuario;

    // relacion con producto (Uno a Muchos)
    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    List<Producto> productos = new ArrayList<>();

    // relacion con proveedor (Muchos a Muchos)
    @ManyToMany
    @JoinTable(
        name = "inventario_proveedor",
        joinColumns = @JoinColumn(name = "idInventario"),
        inverseJoinColumns = @JoinColumn(name = "idProveedor")
    )
    List<Proveedor> proveedores = new ArrayList<>();
}
