/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaLogica;
import java.util.*;

/**
 *
 * @author Pabs
 */
public class Gestor {
    private ArrayList<Cliente> listaClientes = new ArrayList<>();

    /**
     * @return the listaClientes
     */
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    /**
     * @param listaClientes the listaClientes to set
     */
    public void agregarCliente(String pidentificacion, String pnombre, String pcorreo ) {
        Cliente objCliente = new Cliente(pidentificacion,pnombre,pcorreo);
        listaClientes.add(objCliente);
    }
    
  
}
