package Utils;

import java.util.ArrayList;
import java.util.Arrays;

public class AlumnosCreators {

    /**
     * Generar nombre de chicas random
     * @return
     */
    public static String listaDeNombresChicas(){
        ArrayList<String> listaNombreChicas = new ArrayList(Arrays.asList("Lucia", "Rocío", "Rosa", "Sonia", "Sofia", "Marisol", "Martina", "Valeria", "Emma", "Julia"));
       return listaNombreChicas.get((int)(Math.random() * listaNombreChicas.size()));
    }

    /**
     * Generar nombre de chicos random
     * @return
     */
    public static String listaDeNombresChicos(){
        ArrayList<String> listaNombresChicos = new ArrayList(Arrays.asList("Adán", "Fabián", "Felipe", "Mario", "Ricardo", "Gonzalo", "Kevin","Leandro", "Nelson", "William"));
        return listaNombresChicos.get((int)(Math.random() * listaNombresChicos.size()));
    }

    /**
     * Generar apellidos random
     * @return
     */
    public static String listaDeApellidosRandom(){
        ArrayList <String> listaDeApellidos = new ArrayList(Arrays.asList("Sanchez", "Gonzales", "Garcia", "Rodriguez", "Pérez", "Gomez", "Martínez","López", "Fernández", "Martin"));
        return listaDeApellidos.get((int)(Math.random() * listaDeApellidos.size()));
    }

    /**
     * Generar rangos de edad.
     * @return
     */
    public static int edadRandom(){
        int random = 18 + (int)(Math.random()* 40 -18);
        int edad = 0;
        if (random < 25){
            edad = (int) (Math.random()*(25 - 18))+18;
        }else if (random < 32){
            edad = (int) (Math.random()*(32 - 25))+25;
        }else{
            edad = (int) (Math.random()*(40 - 32))+32;
        }
        return edad;
    }




}
