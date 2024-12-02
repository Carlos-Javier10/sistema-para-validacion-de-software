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

    // Relaci�n con Usuario (Uno a Muchos)
    @ManyToOne
    @DescriptionsList
    Usuario usuario;

    // Relaci�n con Producto (Uno a Muchos)
    @OneToMany(mappedBy = "inventario", cascade = CascadeType.ALL)
    List<Producto> productos = new ArrayList<>();

    // Relaci�n con Proveedor (Muchos a Muchos)
    @ManyToMany
    @JoinTable(
        name = "inventario_proveedor",
        joinColumns = @JoinColumn(name = "idInventario"),
        inverseJoinColumns = @JoinColumn(name = "idProveedor")
    )
    List<Proveedor> proveedores = new ArrayList<>();
}
