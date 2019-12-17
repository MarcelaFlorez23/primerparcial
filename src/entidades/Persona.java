/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Jherom Chacon
 */
public class Persona {
    String nombre;
    String apellido;
    String sexo;
    int edad;
    
    public Persona(){};
    public Persona (String nombre){};
    public Persona (String nombre, String apellido){};
    public Persona (String nombre, String apellido, int edad){};
    public Persona (String nombre, String apellido, int edad , String sexo){};
    
     // Setters & Getters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public String getSexo(){
        return sexo;
    }

}
