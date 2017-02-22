/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BO.Empresas;
import BO.Personas;
import BO.Profesionales;
import BO.Puestos;
import BO.Usuarios;
import Controllers.BusquedaController;
import Controllers.PublicEmpController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class Conexion {
    public Connection cn;
    private Statement st;
    private ResultSet rs;
    
    
    public Connection conectar() throws SQLException 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pro", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
        
    }
    
    public void cerrarConeccion()
    {
        try {cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);}
    }
    
    public int buscarUsuario(String correo)
    { 
        try
        {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE Correo = '" + correo + "'");
            Usuarios usu = null;
            while(rs.next())
            {
                usu = new Usuarios(rs.getString("Correo"), rs.getString("Contrasena"),rs.getInt("id_persona"));
            }
            cerrarConeccion();
            return usu.getIdPersona();
        }
        catch(SQLException e)
            {return -1;}
        finally{cerrarConeccion();}
    }
     
    public Usuarios validUser(String cor,String contra) 
    {
        Usuarios usu = null;
         try
        {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE Correo = '" + cor + "' and Contrasena='"+contra+"'");
            
            while(rs.next())
            {
                usu = new Usuarios(rs.getString("Correo"), rs.getString("Contrasena"),rs.getInt("id_persona"));
            }
            
        }
         catch (SQLException ex) {  }
         finally{cerrarConeccion();}
         return usu;
    }
    
    public Empresas BuscarEmp(int idpersona)
    {
        Empresas emp = null;
        try {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM empresas WHERE id_persona = '" + idpersona + "'");
            while(rs.next())
            {
            emp = new Empresas(rs.getLong("Cuit"),rs.getString("Razon"),rs.getString("Area"),rs.getInt("id_persona"),rs.getString("Descripcion"),rs.getString("url"));
            }
            return emp;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return emp;}
        finally{cerrarConeccion();}
    }
    
    public Profesionales BuscarPro(int idpersona)
    {
        Profesionales pro = null;
        try {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM profesionales WHERE id_persona = '" + idpersona + "'");
            while(rs.next())
            {
                pro = new Profesionales(rs.getString("Titulo"),rs.getString("Cursos"),rs.getString("Idiomas"),rs.getInt("id_persona"),rs.getString("Antecedentes"),rs.getString("url"));
            }
             return pro;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return pro; }
        finally{cerrarConeccion();}
    }
    
    public Empresas BuscarPorCuit(long a)
    {
        Empresas emp = null;
        try {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM empresas WHERE cuit = '" + a + "'");
            while(rs.next())
            {
                emp = new Empresas(rs.getLong("Cuit"), rs.getString("Razon"),rs.getString("Area"),rs.getInt("id_persona"),rs.getString("Descripcion"),rs.getString("url"));
            }
            return emp;
        } catch (SQLException ex) {
            Logger.getLogger(PublicEmpController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }finally{cerrarConeccion();}
    }
    
    public Personas buscarPersona(int a)
    {
        try
        {
            cn=conectar();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM personas WHERE id_persona = '" + a + "'");
            Personas per = null;
            while(rs.next())
            {
                per = new Personas(rs.getString("Nombre"), rs.getString("Apellido"),rs.getString("Sexo").charAt(0),rs.getDate("Fecha_nac"));
            }
            return per;
        }
        catch(SQLException e)
        {  return null; }
        finally{cerrarConeccion();}
    }
     
    public ArrayList<Puestos> listarPuestos(long idempresa)
    {
        ArrayList<Puestos> lista = new ArrayList<Puestos>();
        try
        {
            cn=conectar();
            st = cn.createStatement();
            rs=st.executeQuery("select * from puestos where id_empresa='"+idempresa+"'" ); 
            Puestos p=null;
            while(rs.next())
            {             
                p = new Puestos(rs.getInt("id_puesto"), rs.getString("Puesto"), rs.getString("Area"), rs.getDouble("Salario"),rs.getDate("Fecha"),rs.getString("Descripcion"), rs.getLong("id_empresa"),rs.getInt("Disponible"));
                if (p.getDisponible()>0)
                    lista.add(p);
            }
            cn.close();
            return lista;
        }
        catch(SQLException e)
        {return null; }  
        finally{cerrarConeccion();}
    }
      
    public ArrayList BuscarAreas()
    {
      ArrayList Areas =new ArrayList();
      String area;
      try {
           cn=conectar();
           st = cn.createStatement();
           rs=st.executeQuery("select DISTINCT Area from puestos" );
           while(rs.next())
           {             
               area = rs.getString("area");
               Areas.add(area);
           }
         
      }catch (SQLException ex) {Logger.getLogger(BusquedaController.class.getName()).log(Level.SEVERE, null, ex);}
      finally{cerrarConeccion();}
        return Areas;}
   
    public ArrayList BuscarPuesto(String ar)
    {
        ArrayList<Puestos> lista = new ArrayList<Puestos>();
        try
        {
            conectar();
            st = cn.createStatement();
            rs=st.executeQuery("select * from puestos where Area='"+ar+"'" ); 
            Puestos p;
            while(rs.next())
            {             
                p = new Puestos(rs.getInt("id_puesto"), rs.getString("Puesto"), rs.getString("Area"), rs.getDouble("Salario"),rs.getDate("Fecha"),rs.getString("Descripcion"), rs.getLong("id_empresa"),rs.getInt("Disponible"));
                if (p.getDisponible()>0)
                    lista.add(p);
            }
            return lista;
        }
        catch(SQLException e)
        {
            return null;
        }  
        finally{cerrarConeccion();}
    }
       
    
    public void EditarDisponibilidad(int id_puesto,int disponible)
    {
        disponible-=1;
        try {
            conectar();
            st = cn.createStatement();
            st.executeUpdate("update puestos set Disponible='"+disponible+"' where id_puesto='"+id_puesto+"'"); 
            cerrarConeccion();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
