package models;

public class Persona {
    int edad;
    String nombre;


    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Persona [edad=" + edad + ", nombre=" + nombre + "]";
    } 
}
