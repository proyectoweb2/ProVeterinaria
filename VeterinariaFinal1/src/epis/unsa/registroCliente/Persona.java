package epis.unsa.registroCliente;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Persona{
	
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private String name;
	
	@Persistent
	private String last;
	
	@Persistent
	private String username;
	
	@Persistent
	private String pass;
	
	@Persistent
	private String adress;
	
	@Persistent
	private String phone;
	
	@Persistent
	private String pet;

	
	public Persona(String username, String pass){
		super();
		this.username = username;
		this.pass = pass;
	}
	
	public Persona(String name, String last, String username, String pass, String adress, String phone, String pet){
		super();
		this.name = name;
		this.last = last;
		this.username = username;
		this.pass = pass;
		this.adress = adress;
		this.phone = phone;
		this.pet = pet;
	}
	
	public String getId() {
		return Long.toString(id);
	}

	public void setId(String idPersona) {
		Long clave =Long.parseLong(idPersona);
		this.id = clave;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public String getLast() {
		return this.last;
	}
	public void setLast(String last) {
		this.last = last;
	}

	
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username =  username;
	}

	
	public String getPass() {
		return this.pass;
	}
	public void setPass(String pass) {
		this.pass = pass ;
	}
	
	
	public String getAdress() {
		return this.adress;
	}
	public void setAdress(String adress) {
		this.adress = adress ;
	}

	
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public String getPet() {
		return this.pet;
	}
	public void setPet(String pet ) {
		this.pet = pet;
	}
}