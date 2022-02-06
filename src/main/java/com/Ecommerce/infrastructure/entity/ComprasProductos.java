package com.Ecommerce.infrastructure.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "compras_productos", schema = "Ecommerce", catalog = "postgres")
@IdClass(ComprasProductosPK.class)
public class ComprasProductos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_compra")
    private Integer idCompra;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic
    @Column(name = "cantidad")
    private Integer cantidad;
    @Basic
    @Column(name = "total")
    private BigDecimal total;
    @Basic
    @Column(name = "estado")
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_compra", referencedColumnName = "id_compra", nullable = false)
    private Compras comprasByIdCompra;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComprasProductos that = (ComprasProductos) o;

        if (idCompra != null ? !idCompra.equals(that.idCompra) : that.idCompra != null) return false;
        if (idProducto != null ? !idProducto.equals(that.idProducto) : that.idProducto != null) return false;
        if (cantidad != null ? !cantidad.equals(that.cantidad) : that.cantidad != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompra != null ? idCompra.hashCode() : 0;
        result = 31 * result + (idProducto != null ? idProducto.hashCode() : 0);
        result = 31 * result + (cantidad != null ? cantidad.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }

    public Compras getComprasByIdCompra() {
        return comprasByIdCompra;
    }

    public void setComprasByIdCompra(Compras comprasByIdCompra) {
        this.comprasByIdCompra = comprasByIdCompra;
    }
}
