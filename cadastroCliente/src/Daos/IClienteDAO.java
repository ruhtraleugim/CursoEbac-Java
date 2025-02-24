<<<<<<< HEAD
package Daos;

import Domain.Cliente;

import java.util.Collection;
import java.util.List;

/**
 * É de boa pratica a ultilização do prefixo I na frente de uma interface
 * essa interface é de cliente */
public interface IClienteDAO {
    /** o metodo cadastrar adiciona um objeto da classe Cliente chamdo de cliente
     * dento de uma lista ou de um DB*/
    public boolean cadastrar(Cliente cliente);
    /** o metodo delete , retira um Cliente de dentro da lista ou de um DB*/
    public  void deletar(Long cpf);
    /** O metodo alterar , muda as propriedades de um Cliente dentro do DB */
    public void alterar(Cliente cliente);
    /** O metodo consulta, consulta o banco de dados em busca do que procura */
    public Cliente consultar(Cliente cliente);
    /** O metodo Collections cria uma lista de crintes e retorna ela se necessario */
    public Collection<Cliente> buscarClientes();

}
=======
package Daos;

import Domain.Cliente;

import java.util.Collection;
import java.util.List;

/**
 * É de boa pratica a ultilização do prefixo I na frente de uma interface
 * essa interface é de cliente */
public interface IClienteDAO {
    /** o metodo cadastrar adiciona um objeto da classe Cliente chamdo de cliente
     * dento de uma lista ou de um DB*/
    public boolean cadastrar(Cliente cliente);
    /** o metodo delete , retira um Cliente de dentro da lista ou de um DB*/
    public  void deletar(Long cpf);
    /** O metodo alterar , muda as propriedades de um Cliente dentro do DB */
    public void alterar(Cliente cliente);
    /** O metodo consulta, consulta o banco de dados em busca do que procura */
    public Cliente consultar(Cliente cliente);
    /** O metodo Collections cria uma lista de crintes e retorna ela se necessario */
    public Collection<Cliente> buscarClientes();

}
>>>>>>> cc41bfd39beddbcf387a11d66ec6ed2e0473dd1f
