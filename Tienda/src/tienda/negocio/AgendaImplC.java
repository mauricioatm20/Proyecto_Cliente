package tienda.negocio;


import java.io.IOException;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import tienda.modelo.Cliente;
import tienda.persistencia.ClienteDao;
import tienda.persistencia.ClienteDaoJDBC;

public class AgendaImplC implements AgendaC{
	
//	se crea la variable para inyectar la implementacion
	
	private ClienteDao cDao;
	
//	 se crea un constructor para inyectar las dependencias 
	
	public AgendaImplC(ClienteDao cDao) {
		this.cDao = cDao;
	}
//	se inicializa la variablae de instacia cDao con un objeto ClienteDaoJdbc
	
	public AgendaImplC() {
		cDao = new ClienteDaoJDBC();
	}

	@Override
	public void insertarCliente(Cliente c) {
		cDao.insertar(c);
		
	}

	@Override
	public Cliente eliminar(int idCliente) {
		Cliente elim = cDao.buscar(idCliente);
		cDao.eliminiar(elim);
		
		return elim;
	}

	@Override
	public boolean eliminar(Cliente c) {
		
		return cDao.eliminiar(c);
	}

	@Override
	public void actualizar(Cliente c) {
		cDao.actualizar(c);
		
	}

	@Override
	public Set<Cliente> buscarTtodos() {
		Set<Cliente> resu = new TreeSet<Cliente>(getComNombre());
		resu.addAll(cDao.buscarTodos());
		return resu;
	}
	
	private Comparator<Cliente> getComNombre(){
		Collator col = Collator.getInstance(new Locale("es"));
		return new Comparator<Cliente>() {
//			collato es una clase que realiza comparaciones de cadena de caracteres teniendo en cuenta reglas de ordenacion del idioma
			@Override
			public int compare(Cliente o1, Cliente o2) {
				return col.compare(o1.getNombre() + o1.getIdCliente(), o2.getNombre() + o2.getIdCliente());
			}
		};
	}

	@Override
	public Set<Cliente> buscarContactoPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int importarCSV(String fichero) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Cliente buscar(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
