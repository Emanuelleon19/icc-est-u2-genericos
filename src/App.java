import java.util.ArrayList;
import models.Persona;
import models.Personas;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaIngeger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);
        
        //Par<String,Integer> par = new Par<>();
        //par.establecerClave("123213");
        //par.establecerValor(200);

        cajaString.guardar("Guardar un String");
        cajaIngeger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaIngeger.obtener());
        System.out.println(cajaPersona.obtener());
        System.out.println(cajaPersona.obtener().getNombre());

        //System.out.println(par.obtenerValor());
        //System.out.println(par.obtenerClave());

        // --------------------
        System.out.println("------------");
        Personas[] personas = {
            new Personas("Anais", 25),
            new Personas("Luis", 32),
            new Personas("Carlos", 40),
            new Personas("María", 19),
            new Personas("José", 14),
            new Personas("Laura", 11),
            new Personas("Pedro", 28),
            new Personas("Marta", 17),
            new Personas("Jorge", 15),
            new Personas("Sofía", 22),
        };

        int personasMayores = 0;
        int personasMenores = 0;

        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() >= 18){
                personasMayores++;
            } else{
                personasMenores++;
            }
        }
        Par<String,Integer>[] mayores = new Par[personasMayores];
        Par<Integer,String>[] menores = new Par[personasMenores];

        int contadorMayores = 0;
        int contadorMenores = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[contadorMayores] = new Par<String, Integer>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
            }else{
                menores[contadorMenores] = new Par<Integer, String>();
                menores[contadorMenores].establecerClave(personas[i].getEdad());
                menores[contadorMenores].establecerValor(personas[i].getNombre());
                contadorMenores++;
            }
        }
        System.out.println("MAYORES DE EDAD");
        for (Par<String, Integer> par : mayores) {
            System.out.println(par.obtenerClave() + " - " + par.obtenerValor());
        }
        System.out.println("MENORES DE EDAD");
        for(Par<Integer, String> par : menores){
            System.out.println(par.obtenerClave() + " - " + par.obtenerValor());
        }
    }
}
