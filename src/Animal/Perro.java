/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author marti
 */
class Perro extends Animal {
   private String nombre; 
   private String raza;
    private String peso;
    // Constructor

    public Perro(String nombre, String raza, String peso, String paisOrigen, String fechaNacimiento) {
        super(paisOrigen, fechaNacimiento);
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
    }

    public Perro(String paisOrigen, String fechaNacimiento) {
        super(paisOrigen, fechaNacimiento);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

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
    
    
   

   
   
    
    // Método específico para la clase Perro
    public String darDeComerAlPerro() {
        String impri;
        impri=("Dando de comer al perro...");
        return impri;
    }  
    
    
    
    public String imprimirdatos() {
        String imprime;
        imprime=("Mi nombre es "+nombre+" soy un perro de raza "+raza+", naci el dia "+fechaNacimiento
        +". Aproximadamente cuento con un peso de "+peso+" y soy del pais de "+paisOrigen);
        return imprime;
    }  
}
