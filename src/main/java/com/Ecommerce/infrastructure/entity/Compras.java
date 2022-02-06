package com.Ecommerce.infrastructure.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Compras {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
    @Basic
    @Column(name = "id_cliente")
    private String idCliente;
    @Basic
    @Column(name = "fecha")
    private Timestamp fecha;
    @Basic
    @Column(name = "medio_pago")
    private String medioPago;
    @Basic
    @Column(name = "comentario")
    private String comentario;
    @Basic
    @Column(name = "estado")
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id", nullable = false)
    private Clientes clientesByIdCliente;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Compras compras = (Compras) o;

        if (idCompra != null ? !idCompra.equals(compras.idCompra) : compras.idCompra != null) return false;
        if (idCliente != null ? !idCliente.equals(compras.idCliente) : compras.idCliente != null) return false;
        if (fecha != null ? !fecha.equals(compras.fecha) : compras.fecha != null) return false;
        if (medioPago != null ? !medioPago.equals(compras.medioPago) : compras.medioPago != null) return false;
        if (comentario != null ? !comentario.equals(compras.comentario) : compras.comentario != null) return false;
        if (estado != null ? !estado.equals(compras.estado) : compras.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompra != null ? idCompra.hashCode() : 0;
        result = 31 * result + (idCliente != null ? idCliente.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (medioPago != null ? medioPago.hashCode() : 0);
        result = 31 * result + (comentario != null ? comentario.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    public Clientes getClientesByIdCliente() {
        return clientesByIdCliente;
    }

    public void setClientesByIdCliente(Clientes clientesByIdCliente) {
        this.clientesByIdCliente = clientesByIdCliente;
    }
}
