package com.Ecommerce.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class ComprasProductosPK implements Serializable {
    @Column(name = "id_compra")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    @Column(name = "id_producto")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComprasProductosPK that = (ComprasProductosPK) o;

        if (idCompra != null ? !idCompra.equals(that.idCompra) : that.idCompra != null) return false;
        if (idProducto != null ? !idProducto.equals(that.idProducto) : that.idProducto != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompra != null ? idCompra.hashCode() : 0;
        result = 31 * result + (idProducto != null ? idProducto.hashCode() : 0);
        return result;
    }
}
