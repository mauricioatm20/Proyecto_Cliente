package tienda.persistencia;

import java.util.Set;

import tienda.modelo.Cliente;

public class ClienteDaoJDBC implements ClienteDao {

	@Override
	public void insertar(Cliente c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente c) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean eliminiar(int idCliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminiar(Cliente c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cliente buscar(int idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> buscar(String cadena) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
