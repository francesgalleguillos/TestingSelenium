/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Empleado {
    private String rut;
    private String nombre;
    private String cargo;
    private float sbase;
    private float hextras;
    private float ausencia;
    
    public Empleado(){
    
    }    

    public Empleado(String rut, String nombre, String cargo, float sbase, float hextras, float ausencia) {
        this.rut = rut;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sbase = sbase;
        this.hextras = hextras;
        this.ausencia = ausencia;
    }
    
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSbase() {
        return sbase;
    }

    public void setSbase(float sbase) {
        this.sbase = sbase;
    }

    public float getHextras() {
        return hextras;
    }

    public void setHextras(float hextras) {
        this.hextras = hextras;
    }

    public float getAusencia() {
        return ausencia;
    }

    public void setAusencia(float ausencia) {
        this.ausencia = ausencia;
    }
    
    public void crear() throws ClassNotFoundException{
        String sql = "insert into empleado (rut,nombre,cargo,sbase,hextras,ausencia)"
                + " values('" + rut + "','" + nombre + "','"+ cargo + "','"+ sbase + "','"+ hextras + "','" + ausencia + "')";
        
        Statement ps=null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }
    
    public void eliminar() throws ClassNotFoundException {
        
        String sql = "delete from empleado \n"
                 + "where \n"
                + "rut="+rut;
        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }
    
    public void modificar() throws ClassNotFoundException {
        
        System.out.println(nombre+cargo+sbase+hextras+ausencia+rut);
        String sql = "UPDATE empleado \n"
                + "SET \n"
                + "nombre='"+ nombre +"',\n"
                + "cargo='"+ cargo+"',\n"
                + "sbase='"+ sbase+"',\n"
                + "hextras='"+hextras+"',\n"
                + "ausencia='"+ausencia+"'\n"
                + "where rut ="+rut; 
        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            ps.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
    }
    public ArrayList <Empleado> Listar() throws ClassNotFoundException{
        
        ArrayList <Empleado> listaEmpleados=new ArrayList <Empleado>(); 
        
        String sql ="select * from empleado";        

        Statement ps = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing", "root", "");
            System.out.println("Conectado.");
            ps = conect.createStatement();
            
            ResultSet rs = ps.executeQuery(sql);
            while(rs.next()){
                Empleado empleado=new Empleado();
                empleado.setRut(rs.getString("rut"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setCargo(rs.getString("cargo"));
                empleado.setSbase(rs.getFloat("sbase"));
                empleado.setHextras(rs.getFloat("hextras"));
                empleado.setAusencia(rs.getFloat("ausencia"));
                listaEmpleados.add(empleado);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error." + ex);
        }
        return listaEmpleados;
    }
    
}
