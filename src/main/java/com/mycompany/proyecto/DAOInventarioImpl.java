
package com.mycompany.proyecto;
import com.mycompany.interfaces.DAOinventario;
import com.mycompany.modelos.InventarioP;
import com.mycompany.db.Database;
import com.mycompany.vistas.Inventario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOInventarioImpl extends Database implements DAOinventario {

    @Override
    public void registrar(InventarioP articulo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO inventario(articulo, cantidad, precio, categoria) VALUES(?,?,?,?);");
            st.setString(1, articulo.getArticulo());
            st.setString(2, articulo.getCantidad());
            st.setString(3, articulo.getPrecio());
            st.setString(4, articulo.getCategoria());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void modificar(InventarioP articulo) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE inventario SET articulo = ?, cantidad = ?, precio = ?, categoria = ? WHERE codigo = ?");
            st.setString(1, articulo.getArticulo());
            st.setString(2, articulo.getCantidad());
            st.setString(3, articulo.getPrecio());
            st.setString(4, articulo.getCategoria());
            st.setInt(5, articulo.getCodigo());
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int articuloId) throws Exception {
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM inventario WHERE codigo = ?;");
            st.setInt(1, articuloId);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<InventarioP> listar(String name) throws Exception {
        List<InventarioP> lista = null;
        try{
            this.Conectar();
            String Query = name.isEmpty() ? "SELECT * FROM inventario;" : "SELECT * FROM inventario WHERE articulo LIKE '%"+name+"%';";
            PreparedStatement st = this.conexion.prepareStatement(Query); //para regresarnos a todos los usuarios de la base de datos
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) { //para iterar los registros que existan en la base de datos
                InventarioP arti = new InventarioP();
                arti.setCodigo(rs.getInt("codigo"));
                arti.setArticulo(rs.getString("articulo"));
                arti.setCantidad(rs.getString("cantidad"));
                arti.setPrecio(rs.getString("precio"));
                arti.setCategoria(rs.getString("categoria"));
                lista.add(arti);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
        return lista;
    }


    @Override
    public InventarioP getArticuloId(int articuloId) throws Exception {
        InventarioP arti = new InventarioP();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM inventario WHERE codigo = ? LIMIT 1;"); //para regresar el codigo
            st.setInt(1, articuloId);
            ResultSet rs = st.executeQuery();
            while(rs.next()) { //para iterar los registros que existan en la base de datos
                arti.setCodigo(rs.getInt("codigo"));
                arti.setArticulo(rs.getString("articulo"));
                arti.setCantidad(rs.getString("cantidad"));
                arti.setPrecio(rs.getString("precio"));
                arti.setCategoria(rs.getString("categoria"));
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        } finally {
            this.Cerrar();
        }
        return arti;
    }

    
}
