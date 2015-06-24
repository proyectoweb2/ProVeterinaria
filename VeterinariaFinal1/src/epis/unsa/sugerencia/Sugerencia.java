package epis.unsa.sugerencia;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Sugerencia {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String apd;
	
	@Persistent
	private int num;
	
	@Persistent
	private String sdoc;
	
	@Persistent
	private String sug;

	public Sugerencia(String nombre, int numero, String sdoctor,String sugiere) {
		super();
		apd = nombre;
		num = numero;
		sdoc=sdoctor;
		sug = sugiere;
	}
	public String getNom() {
		return apd;
	}
	public void setNom(String nombre) {
		apd = nombre;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int numero) {
		 num = numero;
	}
	public String getSdoc() {
		return sdoc;
	}
	public void setSdoc(String sdoctor) {
		sdoc = sdoctor;
	}
	public String getSug() {
		return sug;
	}
	public void setSug(String sugiere) {
		sug = sugiere;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td>"+".<center>"+num+"</center></td><td>" + "><font size=4 color='white'>_</font>" + apd+"<font size=4 color='white'>__</font>"+"</td><td>" + "" + sug +"</td>";  
		return resp;
	}
}