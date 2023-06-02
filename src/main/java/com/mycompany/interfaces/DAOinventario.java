
package com.mycompany.interfaces;

import com.mycompany.modelos.InventarioP;
import java.util.List;

public interface DAOinventario {
    public void registrar(InventarioP articulo) throws Exception;
    public void modificar(InventarioP articulo) throws Exception;
    public void eliminar(int articuloId) throws Exception;
    public List<InventarioP> listar(String name) throws Exception;
    public InventarioP getArticuloId(int articuloId) throws Exception;
    
    

}
