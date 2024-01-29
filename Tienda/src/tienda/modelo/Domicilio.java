package tienda.modelo;

import java.util.Objects;

public class Domicilio {
	
	private String via;
	private int numero;
	private int piso;
	private String puerta;
	private String ciudad;
	private String provincia;
	private String codigoPostal;

	public Domicilio() {
		super();
	}
	
	public Domicilio(String via, int numero, int piso, String puerta, String ciudad, String provincia,
			String codigoPostal) {
		super();
		this.via = via;
		this.numero = numero;
		this.piso = piso;
		this.puerta = puerta;
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.codigoPostal = codigoPostal;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
	}

	public String getPuerta() {
		return puerta;
	}

	public void setPuerta(String puerta) {
		this.puerta = puerta;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, codigoPostal, numero, piso, provincia, puerta, via);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domicilio other = (Domicilio) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(codigoPostal, other.codigoPostal)
				&& numero == other.numero && piso == other.piso && Objects.equals(provincia, other.provincia)
				&& Objects.equals(puerta, other.puerta) && Objects.equals(via, other.via);
	}

	@Override
	public String toString() {
		return "Domicilio [via=" + via + ", numero=" + numero + ", piso=" + piso + ", puerta=" + puerta + ", ciudad="
				+ ciudad + ", provincia=" + provincia + ", codigoPostal=" + codigoPostal + "]";
	}
	

	
	
}
