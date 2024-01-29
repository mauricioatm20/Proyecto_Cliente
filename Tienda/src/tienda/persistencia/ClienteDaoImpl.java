package tienda.persistencia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import tienda.modelo.Cliente;

public class ClienteDaoImpl implements ClienteDao{
	
	Map<Integer, Cliente> almacen;
	int proximoId =1;
	
	ClienteDaoImpl(){
		almacen = new HashMap<Integer, Cliente>();
		proximoId=1;
	}
	

	@Override
	public void insertar(Cliente c) {
		c.setIdCliente(proximoId++);
		almacen.put(c.getIdCliente(), c);
	}

	@Override
	public void actualizar(Cliente c) {
		almacen.replace(c.getIdCliente(), c);		
	}

	@Override
	public boolean eliminiar(int idCliente) {
		return almacen.containsKey(idCliente) && almacen.remove(idCliente) != null;
		
	// verifica si el mapa almacen contiene la clave idCliente si es asi elimina el id correspondiente
	// y devuelve true. sino esta pressente o a ocurrido un error devolvera false.
	}

	@Override
	public boolean eliminiar(Cliente c) {

		return eliminiar(c.getIdCliente());
	}

	@Override
	public Cliente buscar(int idCliente) {
		return almacen.get(idCliente);
	}

	@Override
	public Set<Cliente> buscar(String cadena) {
		cadena = cadena.toLowerCase();// esto se hace para realizar una busqueda sin distinciones entre mayusculas y minisculas

		Set<Cliente> resu = new HashSet<Cliente>(); // se crea resu para alamacenar los resultados de la busqueda 
		
		//se crea un bucle para iterar sobre todos los contactos alamacenado en almacen
		for(Cliente c : almacen.values()) {
			if(c.getNombre().contains(cadena) || c.getApellido().contains(cadena))
			resu.add(c);// si el contacto cumple con las condiciones se agrega a resu
		}
		return resu;// devuelve el conjunto de resultados
	}

	@Override
	public Set<Cliente> buscarTodos() {
	
		return new HashSet<Cliente>(almacen.values());
	}

}
