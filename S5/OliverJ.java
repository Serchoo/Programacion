package S5;


public class OliverJ{
    public static void main(String []args){
        //Ejercicio 1 
        int edad = 18;
        int nota = 4;
        //Ejercicio 2
        int notaExamen = 6;
        int notaPracticas = 6;
        int numEntregas = 91;
        //Ejercicio 3
        int temperatura = 40;
        int peso = 63;


        curso_ciclo(edad);
        notaFinal(notaExamen, notaPracticas,numEntregas);
        temperatura(temperatura, edad, peso);
    }


    //EJERCICIO 1
    public static void curso_ciclo(int edad){
        System.out.println("--------------------------- EJERCICIO 1 ----------------------------------");
        final int MINIMA = 3;
        int ciclo = -1;
        int curso = 0;

        if (edad < MINIMA) {
            System.out.println("Es demasiado pequeño.");
        }else if(edad < 6){
            ciclo = 0;
        }else if (edad < 7) {
            curso = 1;
            ciclo = 1;
        }else if (edad < 8) {
            curso = 2;
            ciclo = 1;
        }else if (edad < 9) {
            curso = 3;
            ciclo = 2;
        }else if (edad < 10) {
            curso = 4;
            ciclo = 2;
        }else if (edad < 11) {
            curso = 5;
            ciclo = 3;
        }else if (edad < 12) {
            curso = 6;
            ciclo = 3;
        }else{
            System.out.println("Es demasiado grande.");
        }

        valorCiclo(ciclo);
        if (curso > 0) {
            System.out.println("Curs assignat: " + curso);
        }
        
    }

    public static void valorCiclo(int n){
        switch (n) {
            case 0: System.out.println("Es de educación infantil.");
            case 1: System.out.println("Es de educación primaria. Ciclo inicial.");
            case 2: System.out.println("Es de educación primaria. Ciclo medio.");
            case 3: System.out.println("Es de educación primaria. Ciclo superior.");
            default:;//Default se dara cuando la edad sea < a 3 ya que inicializamos el ciclo en -1 y como no coincide con ningun caso no hara nada
        }
    }

    //EJERCICIO 2
    public static void notaFinal(double notaExamen, double notaPracticas, int numEntregas){
        System.out.println("--------------------------- EJERCICIO 2 ----------------------------------");
        final int TOTAL_ENTREGAS = 100;
        final int EXCELENTE = 10;
        final int NOTABLE = 8;
        final int BIEN = 6;
        final int SUFICIENTE = 5;
        final int INSUFICIENTE = 4;

        boolean evaluacionContinua = true;
        double notaEntregas = 0;
        double notaFinal = 0;

        if(notaExamen <= BIEN){
            System.out.println("Has suspendido el examen final.");
        }else if (numEntregas < num_porcentajeEntregas(70,TOTAL_ENTREGAS)){
            System.out.println("Has suspendido. No has seguido la evaluacion continua.");
            evaluacionContinua = false;
        }else if (numEntregas == TOTAL_ENTREGAS) {
            notaEntregas = EXCELENTE;
        }else if (numEntregas >= num_porcentajeEntregas(90, TOTAL_ENTREGAS)) {
            notaEntregas = NOTABLE;
        }else if (numEntregas >= num_porcentajeEntregas(80, TOTAL_ENTREGAS)) {
            notaEntregas = BIEN;
        }else if (numEntregas >= num_porcentajeEntregas(70, TOTAL_ENTREGAS)) {
            notaEntregas = INSUFICIENTE;
        }

        notaFinal = (notaExamen * 20/100) + (notaEntregas * 10/100) + (notaPracticas * 70/100);

        if (notaFinal < SUFICIENTE) {
            if (evaluacionContinua) {
                System.out.println("Haz los ejercicios preparatorios.");
            }else{
                System.out.println("Debes seguir la evaluacion continua.");
            }
        }else{
            System.out.println("Tu nota final es: "+ notaFinal);
        }
    }

    public static int num_porcentajeEntregas(int p, int n){
        return p*n/100;
    }

    //EJERCICIO 3
    public static void temperatura(int temperatura, int edad, int peso){
        System.out.println("--------------------------- EJERCICIO 2 ----------------------------------");
        if (temperatura < 38) {
            System.out.println("El nen està bé.");
        } else {
            if (temperatura < 39) {
                System.out.println("És recomanable donar-li un bany per baixar la temperatura.");
            } else {
                if (edad < 3) {
                    System.out.println("Has de consultar al metge.");
                } else {
                    int dosisParacetamol;
                    if (edad < 12) {
                        dosisParacetamol = (int) (15 * peso);
                        System.out.println("Cal donar-li: " + dosisParacetamol + " mg de paracetamol cada 8h.");
                    } else {
                        dosisParacetamol = 500;
                        System.out.println("Cal donar-li: " + dosisParacetamol + " mg de paracetamol cada 8h.");
                    }
                }
            }
        }

        if (temperatura >= 40) {
            System.out.println("Atenció: per temperatura de més de 40, cal portar-lo a l'hospital.");
        }
    }

}