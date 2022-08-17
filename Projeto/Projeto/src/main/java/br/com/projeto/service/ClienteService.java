
package br.com.projeto.service;

import br.com.projeto.dao.DAO;
import br.com.projeto.projeto.Cliente;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

public class ClienteService implements Serializable{
    
    @Inject
    private DAO< Cliente> dao;
    
    public void salvar(Cliente c) {
     dao.salvar(c);
    }
    public void remover(Cliente c){
     dao.remover(Cliente.class, c.getId());
    }    

    public List<Cliente> todosClientes() {
     return dao.buscarTodos("select c from Cliente c order by c.nome");
    }

    public void salvar(List<Cliente> cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
