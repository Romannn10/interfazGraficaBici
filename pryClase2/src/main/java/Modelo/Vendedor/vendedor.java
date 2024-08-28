/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Vendedor;

import repositorio.RepositorioDeDatos;
import Modelo.persona.Persona1;
/**
 *
 * @author Alumno
 */
public class vendedor extends Persona1 {
    private String codigo;
    private String sucursal;

    public vendedor(){
        super();
    }
    
    public vendedor(String codigo, String sucursal) {
        this.codigo = codigo;
        this.sucursal = sucursal;
    }

    public vendedor(String sucursal, String nombre, String apellido, int dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
        this.codigo = generarCodigo();
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String generarCodigo() {
        return "V-"+contarVendedores();
    }
    
    
    private int contarVendedores(){
        int contar=0;
        for(int i=0;i<RepositorioDeDatos.personas.length;i++){
            if(RepositorioDeDatos.personas[i] instanceof vendedor)
                contar++;
        }
        
        return contar;
    }
    
    public String toStringVendedor(){
        
        return toString()+ " CODIGO: "+this.codigo+ " SUCURSAL: "+this.sucursal;
    }
    
}
