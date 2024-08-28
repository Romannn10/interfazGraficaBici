/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Modelo;

import Modelo.cliente.cliente;
import Modelo.Vendedor.vendedor;
import repositorio.RepositorioDeDatos;

/**
 *
 * @author Alumno
 */
public class PryClase2 {

    public static void main(String[] args) {
       cliente c1=new cliente("30-33721457-0", "JUAN", "Perez", 33521457,"34546534534" , "jperez@gmail.com");
       cliente c2=new cliente("31-33721457-0", "JOAQUIN", "Perez", 33521321,"34546534321" , "jperez@gmail.com");
       vendedor v1 = new vendedor("CENTO","VERONICA","LOPEZ",298785475, "3521441233", "veronicalopez@gmail.com");
       cliente c3 = new cliente("33-33721457-0", "LORENA", "RAMOS", 34555457,"34555534534" , "lorena@gmail.com");
       
       RepositorioDeDatos.personas[0]=c1;
       RepositorioDeDatos.personas[1]=c2;
       RepositorioDeDatos.personas[2]=v1;
       RepositorioDeDatos.personas[3]=c3;
       
       
       System.out.println("Listar Clientes");
       int indice=0;
       while(indice<RepositorioDeDatos.personas.length-1){
           if(RepositorioDeDatos.personas[indice] !=null && RepositorioDeDatos.personas[indice] instanceof cliente)
               System.out.println(((cliente)RepositorioDeDatos.personas[indice]).toStringCliente());
              indice++;
       }
       System.out.println("Listar Vendedores");
       indice=0;
       while(indice<RepositorioDeDatos.personas.length-1){
           if(RepositorioDeDatos.personas[indice] !=null && RepositorioDeDatos.personas[indice] instanceof vendedor)
               System.out.println(((vendedor)RepositorioDeDatos.personas[indice]).toStringVendedor());
              indice++;}
    }
}
