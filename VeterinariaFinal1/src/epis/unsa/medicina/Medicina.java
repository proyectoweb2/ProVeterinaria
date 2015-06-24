package epis.unsa.medicina;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Medicina {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String nom;
	
	@Persistent
	private int can;
	
	@Persistent
	private String doc;

	public Medicina(String nombre, int cantidad, String doctor) {
		super();
		nom = nombre;
		can = cantidad;
		doc = doctor;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nombre) {
		nom = nombre;
	}
	public int getCui() {
		return can;
	}
	public void setCui(int cantidad) {
		 can = cantidad;
	}
	public String getSex() {
		return doc;
	}
	public void setSex(String doctor) {
		doc = doctor;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td>" + "><font size=4 color='white'>_</font>" + nom+"<font size=4 color='white'>__</font>"+"</td><td><center>" + "" + can +"</center></td>";  
		return resp;
	}
}