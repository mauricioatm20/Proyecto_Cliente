package tienda.modelo;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;

public class Cliente implements Comparable<Cliente>, Serializable{

	private int idCliente;
	private String nombre;
	private String apellido;
	private Domicilio dom;
	private Set<String> emails;
	private Set<String> telefonos;
	
	public Cliente() {
		
		telefonos = new LinkedHashSet<String>();
		emails= new LinkedHashSet<String>();
		dom = new Domicilio();
	}
	

	public Cliente(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
	}


	//	****************************************
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
//	****************************************
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}
//	****************************************
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;

	}
//	****************************************
	public Domicilio getDom() {
		return dom;
	}
	public void setDomicilio(Domicilio dom) {
		this.dom = dom;
	}
	
//	****************************************
	public Set<String> getEmail() {
		return emails;
	}
	public void setEmail(Set<String> email) {
		this.emails = email;
	}
//	****************************************
	public Set<String> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}
//	****************************************
	@Override
	public int hashCode() {
		return Objects.hash(idCliente);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return idCliente == other.idCliente;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion="
				+ dom + ", email=" + emails + ", telefonos=" + telefonos + "]";
	}
	@Override
	public int compareTo(Cliente o) {
		
//		si el objeto actual es menor que objeto proporcionado(o) devuelve un negativo :
//		si el objeto actual es igual al objeto proporcionado (o) devuelve 0
		if(this.equals(o)) return 0;

//		collator se utiliza para realizar compraraciones de cadenas con las reglas de ordenacion del español"es"
		Collator col = Collator.getInstance(new Locale("es"));
		return col.compare(this.nombre + this.idCliente, o.nombre + o.idCliente);
	}
	
//	este comparator es util para ordenar una lista por sus indicadores en orden
	public static Comparator<Cliente> getComparator(){
		return new Comparator<Cliente>() {
			
			@Override
			public int compare(Cliente o1, Cliente o2) {

				return o1.getIdCliente() - o2.getIdCliente();
			}
		};	
	}
}
