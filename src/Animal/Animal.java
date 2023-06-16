/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author marti
 */
class Animal {
    protected String paisOrigen;
    protected String fechaNacimiento;
    
    // Constructor
    public Animal(String paisOrigen, String fechaNacimiento) {
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getters y Setters
    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Métodos
    public void respirar() {
        System.out.println("El animal está respirando.");
    }
    
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }  
}
