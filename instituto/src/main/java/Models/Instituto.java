package Models;

import Utils.IotHK;

import java.util.ArrayList;


public class Instituto {
    private int num;
    private final ArrayList<Aula> listaAulas = new ArrayList<>();
    private static Instituto instance = null;


    /**
     * Este patron nos permite que la clase tenga una única instancia.
     * @return
     */
    public static Instituto getInstance(){
        if (instance == null){
            return   instance = new Instituto();
        }else {
            return instance;
        }
    }


    /**
     * Constructor.
     */
    public Instituto() {
        initInstituto();
    }

    /**
     * Inicializamos el instituto con las aulas.
     */
    private void initInstituto(){
        final int NUMERO_AULAS = 10;
        for (int i = 0; i < NUMERO_AULAS; i++) {
            listaAulas.add(new Aula());
        }
    }

    /**
     * Imprime las aulas
     * @return
     */
   public String printInstituto(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < listaAulas.size(); i++) {
            result.append("\n").append("Aula ").append(i+1).append(" :").append("\n");
            result.append(listaAulas.get(i).toString()).append("\n");
            result.append(listaAulas.get(i).numeroDeAlumnos()).append("\n");
        }
        return result.toString();
    }



    public void seleccionaAula(){
       IotHK sc = new IotHK();
       do {
           try{
               System.out.println("Tenemos 10 aulas, que aula deseas ver," +
                       "introduce una numero ente [1-10]");
               num = sc.readInt();
           }catch (Exception e){
               System.out.println("Has introducido un número fuera del rango.");
               num = 0;
               sc.read();
           }
       }while (num < 1 || num > 10);

    }

    /**
     * Imprime el aula seleccionada.
     * @return Devuelve ordenada el aula que hemos seleccionado.
     */
    public String printAulaOrdenada(){
       StringBuilder result = new StringBuilder();
       seleccionaAula();
       listaAulas.get(this.num - 1).ordenarAlumnos();
       for (Aula aula : listaAulas){
           if (aula == listaAulas.get(this.num - 1)){
               result.append(aula.toString()).append("\n");
           }
       }
       return result.toString();
    }





}
