/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.cliente;

import Modelo.persona.Persona1;
import repositorio.RepositorioDeDatos;
/**
 *
 * @author Alumno
 */
public class cliente extends Persona1{
    private String codigo;
    private String cuil;

    
    public cliente(){
        super();
    }
    
    public cliente(String cuil) {
        this.codigo = generarCodigo();
        this.cuil = cuil;
    }

    public cliente(String cuil, String nombre, String apellido, int dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
        this.codigo = generarCodigo();
        this.cuil = cuil;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    @Override
    public String generarCodigo() {
        return "C-"+contarClientes();
    }
    private int contarClientes(){
        int contar=0;
        for(int i=0;i<RepositorioDeDatos.personas.length;i++){
            if(RepositorioDeDatos.personas[i] instanceof cliente)
                contar++;
        }
        
        return (contar==0)?1:contar;
    }
    
    public String toStringCliente(){
        
        return toString()+ " CODIGO: "+this.codigo+ " CUIL: "+this.cuil;
    }
    
    
    

   
    
    
}
