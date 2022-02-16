package Models;

import Utils.AlumnosCreators;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Alumnas extends  Alumns{

    public Alumnas() {
        setNombre(AlumnosCreators.listaDeNombresChicas());
        setApellido(AlumnosCreators.listaDeApellidosRandom());
        setEdad(AlumnosCreators.edadRandom());
    }


    @Override
    public String toString() {
        return (colorize("Alumnas 👩{" +
                " Nombre: " + getNombre() +
                ", Apellido: " + getApellido() +
                ", Edad: " + getEdad() +
                '}', Attribute.RED_TEXT()));
    }


}
