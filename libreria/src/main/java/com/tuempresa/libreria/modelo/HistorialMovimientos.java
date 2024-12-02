package com.tuempresa.libreria.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter @Setter
public class HistorialMovimientos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idMovimiento;

    @Temporal(TemporalType.TIMESTAMP)
    @Required
    Date fecha;

    @Column(length = 50)
    @Required
    String tipoMovi;

    @Column
    @Required
    int cantidad;

    // Relación con Producto (Muchos a Uno)
    @ManyToOne
    Producto producto;
}
