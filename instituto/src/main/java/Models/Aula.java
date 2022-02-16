package Models;

import java.util.ArrayList;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Aula {
    private final ArrayList<Alumns> listaAlumnos;

    /**
     * Constructor de la clase.
     */
    public Aula() {
        listaAlumnos = new ArrayList<>();
        initAula();

    }

    /**
     * Inicializa el aula, y crea los alumnos
     */
    private void  initAula(){
        int random;
        final int NUMERO_ALUMNOS = 15;
        for (int i = 0; i < NUMERO_ALUMNOS; i++) {
            random = (int) (Math.random() *100)+1;
            if (random < 60){
                listaAlumnos.add(new Alumnas());
            }else if (random < 100){
                listaAlumnos.add(new Alumnos());
            }
        }
    }


    /**
     * Imprime el aula
     * @return
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for ( Alumns alumno : listaAlumnos) {
            if (alumno instanceof Alumnas){
                result.append(alumno).append("\n");
            }else if (alumno instanceof Alumnos){
                result.append(alumno).append("\n");
            }
        }
        return result.toString();
    }


    /**
     * Ordena la lista de alumnos
     */
    public void ordenarAlumnos(){
        Alumns aux;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            for (int j = 0; j < listaAlumnos.size(); j++) {
                if (listaAlumnos.get(i) != null && listaAlumnos.get(j) != null
                        && listaAlumnos.get(i).getNombre().compareToIgnoreCase(listaAlumnos.get(j)
                        .getNombre()) < 0){

                    aux = listaAlumnos.get(i);
                    listaAlumnos.set(i,listaAlumnos.get(j));
                    listaAlumnos.set(j,aux);
                }
            }
        }
    }


    /**
     * Cuenta el numero de alumnos y alumnas por clase.
     * @return
     */
    public String numeroDeAlumnos(){
        int alumnos = 0;
        int alumnas = 0;
        for (Alumns alu: listaAlumnos){
            if (alu instanceof Alumnos){
                alumnos++;
            }else {
                alumnas++;
            }
        }
        return (colorize("Numero de alumnos es: "+alumnos +"\n"+ "Número de alumnas es: "+alumnas));
    }









}
