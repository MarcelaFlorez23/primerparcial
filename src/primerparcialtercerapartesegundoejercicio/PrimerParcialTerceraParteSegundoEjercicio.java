/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialtercerapartesegundoejercicio;

import entidades.Persona;
import util.Utilidades;

/**
 *
 * @author Jherom Chacon
 */
public class PrimerParcialTerceraParteSegundoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.setNombre("Carlitos");
        System.out.println("El nombre es: " + persona.getNombre());
        
        persona.setSexo("Masculino");
        System.out.println("El sexo es: " + persona.getSexo());
       
        
        System.out.println("---------------------------");
        
        int resultado = Utilidades.suma(1,1);
        System.out.println("El resultado de la suma es: "+ resultado);
        int resultadoResta = Utilidades.resta(3,2);
        System.out.println("EL resultado de la resta es: " + resultadoResta);
    }

  
    
}
