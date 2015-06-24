package epis.unsa.publicacion;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Publicacion {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String admin;
	
	@Persistent
	private int nume;
	
	@Persistent
	private String pdoc;
	
	@Persistent
	private String pub;

	public Publicacion(String nombr, int numer, String pdoctor,String publicacion) {
		super();
		admin = nombr;
		nume = numer;
		pdoc=pdoctor;
		pub = publicacion;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String nombr) {
		admin = nombr;
	}
	public int getNume() {
		return nume;
	}
	public void setNume(int numer) {
		 nume = numer;
	}
	public String getPdoc() {
		return pdoc;
	}
	public void setPdoc(String pdoctor) {
		pdoc = pdoctor;
	}
	public String getPub() {
		return pub;
	}
	public void setSug(String publicacion) {
		pub = publicacion;
	}
	public Key getKey() {
		return key;
	}
	
	@Override
	public String toString() {
		String resp = "<td><img src='http://www.javet.es/imagenes/logo.jpg' width='100' height='100'></td><td>"+".<center>"+nume+"</center></td><td>" + "><font size=4 color='white'>_</font>" + admin+"<font size=4 color='white'>__</font>"+"</td><td>" + "" + pub +"</td>";  
		return resp;
	}
}