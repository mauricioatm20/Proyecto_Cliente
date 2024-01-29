package tienda.negocio;

import java.io.IOError;
import java.io.IOException;
import java.util.Set;

import tienda.modelo.Cliente;

public interface AgendaC {

	void insertarCliente(Cliente c);
	Cliente eliminar (int idCliente);
	Cliente buscar (int idCliente);
	boolean eliminar (Cliente c);
	void actualizar (Cliente c);
	
	Set<Cliente> buscarTtodos();
	Set<Cliente> buscarContactoPorNombre(String nombre);
	
	int importarCSV(String fichero) throws IOException;
	
	
}
/*	Set<> : es una interfaz de collection que representa una coleccion sin duplicados
 	hereda de la interfaz Collection y proporciona los metodos add, remove ,contains */
