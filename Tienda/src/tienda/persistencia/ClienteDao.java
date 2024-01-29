package tienda.persistencia;

import java.util.Set;

import tienda.modelo.Cliente;

public interface ClienteDao {
	
	public void insertar (Cliente c);
	public void actualizar (Cliente c);
	public boolean eliminiar (int idCliente);
	public boolean eliminiar (Cliente c);
	public Cliente buscar (int idCliente);
	
	public Set<Cliente> buscar (String cadena);
	public Set<Cliente> buscarTodos();
	
	
	
}
