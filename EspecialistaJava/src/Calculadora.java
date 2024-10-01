public class Calculadora {

    static double calcularMedia(Integer[] notas){

        int total = 0;

        // Primeira forma
        for(int nota : notas){
            total += nota;
        }

        // Segunda forma
        //for(int i = 0; i < notas.length; i++){
          //  total += notas[i];
        //}

        return (double)total / notas.length;
    }

}
