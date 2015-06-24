package epis.unsa.producto;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Producto {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nomb;
	
	@Persistent
	private int cant;
	@Persistent
	private int cost;
	


	public Producto(String nombre, int cantidad, int costo) {
		super();
		nomb = nombre;
		cant = cantidad;
		cost = costo;
	}
	public String getNom() {
		return nomb;
	}
	public void setNom(String nombre) {
		nomb = nombre;
	}
	public int getCantidad() {
		return cant;
	}
	public void setCantidad(int cantidad) {
		 cant = cantidad;
	}
	public int getCosto() {
		return cost;
	}
	public void setCosto(int costo) {
		cost=costo;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td>" + "<font color='white'>_</font>" + nomb+"<font color='white'>__</font></td>"+"<td><font color='white'>_</font>"+cant+"<font color='white'>_</font>"+"</td><td><center>" +"S/. "+ cost +"</center></td>";  
		return resp;
	}
}