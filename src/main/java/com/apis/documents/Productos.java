package com.apis.documents;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document("productos")
public class Productos implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	private Long codigoProducto;
	
	private String nombreProducto;
	
	private Long nit;
	
	private double precioCompra;
	
	private double ivaCompra;
	
	private double precioVenta;

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Long getNit() {
		return nit;
	}

	public void setNit(Long nit) {
		this.nit = nit;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getIvaCompra() {
		return ivaCompra;
	}

	public void setIvaCompra(double ivaCompra) {
		this.ivaCompra = ivaCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	
}
