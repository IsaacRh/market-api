package com.market.api.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clientes")
public class Client {
    @Id
    private String id;

    @Column(name = "nombre")
    private String name;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "celular")
    private Long phone;

    @Column(name = "direccion")
    private String address;

    @Column(name="correo_electronico")
    private String email;

    @OneToMany(mappedBy = "client")
    private List<Purchase> purchases;
}
