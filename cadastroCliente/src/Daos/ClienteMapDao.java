package Daos;

import Domain.Cliente;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
/** Essa class implementa os metodos de IClienteDAO,*/
public class ClienteMapDao implements IClienteDAO{
    /** cria um Map passando os parametros de chave(Cpf) e valor(cliente)  */
    private Map< Long, Cliente > map;
    /**Implementa a interace de hashMap*/
    public ClienteMapDao() {
        this.map = new HashMap<>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void deletar(Long cpf) {

    }

    @Override
    public void alterar(Cliente cliente) {

    }

    @Override
    public Cliente consultar(Cliente cliente) {
        return null;
    }

    @Override
    public Collection<Cliente> buscarClientes() {
        return null;
    }
}
