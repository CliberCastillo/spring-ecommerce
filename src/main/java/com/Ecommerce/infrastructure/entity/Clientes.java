package com.Ecommerce.infrastructure.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class Clientes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private String id;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "apellidos")
    private String apellidos;
    @Basic
    @Column(name = "celular")
    private BigInteger celular;
    @Basic
    @Column(name = "direccion")
    private String direccion;
    @Basic
    @Column(name = "correo_electronico")
    private String correoElectronico;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public BigInteger getCelular() {
        return celular;
    }

    public void setCelular(BigInteger celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clientes clientes = (Clientes) o;

        if (id != null ? !id.equals(clientes.id) : clientes.id != null) return false;
        if (nombre != null ? !nombre.equals(clientes.nombre) : clientes.nombre != null) return false;
        if (apellidos != null ? !apellidos.equals(clientes.apellidos) : clientes.apellidos != null) return false;
        if (celular != null ? !celular.equals(clientes.celular) : clientes.celular != null) return false;
        if (direccion != null ? !direccion.equals(clientes.direccion) : clientes.direccion != null) return false;
        if (correoElectronico != null ? !correoElectronico.equals(clientes.correoElectronico) : clientes.correoElectronico != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + (celular != null ? celular.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (correoElectronico != null ? correoElectronico.hashCode() : 0);
        return result;
    }
}
