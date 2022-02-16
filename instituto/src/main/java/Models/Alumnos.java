package Models;

import Utils.AlumnosCreators;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Alumnos extends Alumns{

    public Alumnos() {
        setNombre(AlumnosCreators.listaDeNombresChicos());
        setApellido(AlumnosCreators.listaDeApellidosRandom());
        setEdad(AlumnosCreators.edadRandom());
    }



    @Override
    public String toString() {
        return (colorize("Alumnos 👨{" +
                " Nombre: " + getNombre() +
                ", Apellido: " + getApellido() +
                ", Edad: " + getEdad() +
                '}', Attribute.BLUE_TEXT()));
    }

}
