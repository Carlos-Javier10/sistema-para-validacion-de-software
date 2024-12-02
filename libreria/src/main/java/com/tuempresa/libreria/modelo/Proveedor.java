package com.tuempresa.libreria.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idProveedor;

    @Column(length = 100)
    @Required
    String nombre;

    @Column(length = 100)
    @Required
    String contacto;
    
    @Column(length = 200)
    @Required
    String direccion;

    // Relaci�n con Inventario (Muchos a Muchos)
    @ManyToMany(mappedBy = "proveedores")
    List<Inventario> inventarios = new ArrayList<>();
}
