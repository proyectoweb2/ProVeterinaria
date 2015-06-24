package epis.unsa.registroMascota;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Mascota{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	String nombre;
	@Persistent
	String especie;
	@Persistent
	String edad;
	@Persistent
	String sexo;
	@Persistent
	String mensaje;
	
	public Mascota(String n, String e,String ed,String s,String m){
		super();
		this.nombre=n;
		this.especie=e;
		this.edad=ed;
		this.sexo=s;
		this.mensaje=m;
	}
	
	
	public String getName(){ 
		return this.nombre;
		}
	public String getEspecie(){
		return this.especie;
		}
	public String getEdad(){
		return this.edad;
		}
	public String getSexo(){
		return this.sexo;
		}
	public String getMensaje(){
		return this.mensaje;
		}
	
	public void setName(String n){
		this.nombre=n;
		}
	public void setEspecie(String a){
		this.especie=a;
		}
	public void setEdad(String c){
		this.edad=c;
		}
	public void setSexo(String con){
		this.sexo=con;
		}
	public void setMensaje(String con){
		this.mensaje=con;
		}
	@Override
	public String toString() {
		String resp =  "<td><center>" + "<font>_</font>" + nombre+"<font>__</font></td>"
				+"<td><font>_</font>"+especie+"<font>_</font>"
				+"<td><font>_</font>"+edad+"<font>_</font>"
				+"<td><font>_</font>"+sexo+"<font>_</font>"
				+"</td><td>" +mensaje +"</center></td>";  
		return resp;
	}
}
