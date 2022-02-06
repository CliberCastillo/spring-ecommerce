package com.Ecommerce.infrastructure.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Productos {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic
    @Column(name = "nombre")
    private String nombre;
    @Basic
    @Column(name = "id_categoria")
    private Integer idCategoria;
    @Basic
    @Column(name = "codigo_barras")
    private String codigoBarras;
    @Basic
    @Column(name = "precio_venta")
    private BigDecimal precioVenta;
    @Basic
    @Column(name = "cantidad_stock")
    private Integer cantidadStock;
    @Basic
    @Column(name = "estado")
    private Boolean estado;
    @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria", nullable = false)
    private Categorias categoriasByIdCategoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
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

        Productos productos = (Productos) o;

        if (idProducto != null ? !idProducto.equals(productos.idProducto) : productos.idProducto != null) return false;
        if (nombre != null ? !nombre.equals(productos.nombre) : productos.nombre != null) return false;
        if (idCategoria != null ? !idCategoria.equals(productos.idCategoria) : productos.idCategoria != null)
            return false;
        if (codigoBarras != null ? !codigoBarras.equals(productos.codigoBarras) : productos.codigoBarras != null)
            return false;
        if (precioVenta != null ? !precioVenta.equals(productos.precioVenta) : productos.precioVenta != null)
            return false;
        if (cantidadStock != null ? !cantidadStock.equals(productos.cantidadStock) : productos.cantidadStock != null)
            return false;
        if (estado != null ? !estado.equals(productos.estado) : productos.estado != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idProducto != null ? idProducto.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (idCategoria != null ? idCategoria.hashCode() : 0);
        result = 31 * result + (codigoBarras != null ? codigoBarras.hashCode() : 0);
        result = 31 * result + (precioVenta != null ? precioVenta.hashCode() : 0);
        result = 31 * result + (cantidadStock != null ? cantidadStock.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        return result;
    }


    public Categorias getCategoriasByIdCategoria() {
        return categoriasByIdCategoria;
    }

    public void setCategoriasByIdCategoria(Categorias categoriasByIdCategoria) {
        this.categoriasByIdCategoria = categoriasByIdCategoria;
    }
}
