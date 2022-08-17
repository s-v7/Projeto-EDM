
package br.com.projeto.controller;

import br.com.projeto.projeto.Cliente;
import br.com.projeto.service.ClienteService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.component.message.Message;

@Named
@ViewScoped
public class ClienteCd implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Inject
    private Cliente cliente;
    
    @Inject
    private ClienteService service;
    
    private List<Cliente> clientet;
    
    @PostConstruct
    public void carregar() {
        setCliente((Cliente) service.todosClientes());
    }

    public void adicionar() {
        try {
            
            service.salvar(getCliente());
            setCliente(new Cliente());
            carregar();
            
           
            
        } catch (Exception e) {
          
        
        }

    }
    
    public void excluir(){
        try {
            
            service.remover(getCliente());
            carregar();
            
            
        } catch (Exception e) {
            
            
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientet() {
        return clientet;
    }
    
    
}
