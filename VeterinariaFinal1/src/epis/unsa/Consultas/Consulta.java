package epis.unsa.Consultas;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Consulta{
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	@Persistent
	String nombre;
	@Persistent
	String apellido;
	@Persistent
	String correo;
	@Persistent
	String consulta;
	
	public Consulta(String n, String a,String c,String com){
		super();
		this.nombre=n;
		this.apellido=a;
		this.correo=c;
		this.consulta=com;
	}
	
	
	public String getName(){ 
		return this.nombre;
		}
	public String getApellido(){
		return this.apellido;
		}
	public String getCorreo(){
		return this.correo;
		}
	public String getConsulta(){
		return this.consulta;
		}
	
	public void setName(String n){
		this.nombre=n;
		}
	public void setApellido(String a){
		this.apellido=a;
		}
	public void setCorreo(String c){
		this.correo=c;
		}
	public void setConsulta(String con){
		this.consulta=con;
		}
	@Override
	public String toString() {
		String resp =  "<td><center>" + "<font>_</font>" + nombre+"<font>__</font></td>"
				
				+"<td><font>_</font>"+apellido+"<font>_</font>"
				+"<td><font>_</font>"+correo+"<font>_</font>"
				+"</td><td>" +consulta+"</center></td>";  
		return resp;
	}
}
