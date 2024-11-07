import java.util.Scanner;

public class S05_OliverJ {
    //Color para que el mensaje de error se muestre en rojo
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET="\033[0m";
    public static void main(String[] args){
        int registroAlumnos;
        int puntos = 0;

        final int INCORRECTO = 3;

        final int HERMANO = 40;
        final int POBLACION = 30;
        final int TRABAJO = 20;
        final int DISCAPACIDAD = 10;
        final int FAMILIA = 15;
        final int ESCOLARIZADO = 5;

        int hermano;
        int poblacion;
        int trabajoPadres;
        int discapacidad;
        int familiaNumerosa;
        int escolarizado;

        int inscribirAlumnos = 1;
        //Nos perimte la lectrura por teclado
        Scanner lectura;

        //Cada vez que inscriba uno nos va a pedir si queremos seguir inscribiendo si es asi volvemos a empezar hasta 
        //indicar que no queremos inscribir mas
        while(inscribirAlumnos != 0){

            lectura = new Scanner (System.in);
            System.out.println("--------------------------------------------------------------");
            System.out.print("\nNumero  de registro del alumno: ");

            if(lectura.hasNextInt()){

                registroAlumnos = lectura.nextInt();           

                if(rangoRegistro(registroAlumnos)){


                    //----------------------APARTADO 1-----------------------------------------------
                    System.out.print("\nTienes un hermano en el centro (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        hermano = lectura.nextInt();
                    }else{
                        hermano = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }

                        if(controlErrores(hermano)){
                            //si tiene un hermano en el centro suma 40
                            if(hermano == 1){
                                puntos += HERMANO;
                            }
                        }

                    //----------------------APARTADO 2-----------------------------------------------
                    System.out.print("\nResides cerca de la escuela (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        poblacion = lectura.nextInt();
                    }else{
                        poblacion = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }

                    //Comprobamos si es correcta la entrada, 1 o 0
                    if(controlErrores(poblacion)){
                        //Si lo es pregunta tambien si los padres trabajan cerca
                        System.out.print("\nPadres trabajan cerca de la escuela (0: no / 1:si)?");
                        if (lectura.hasNextInt()) {
                            trabajoPadres = lectura.nextInt();
                        }else{
                            trabajoPadres = INCORRECTO;
                            //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                            lectura = new Scanner (System.in);
                            System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                        }
                        

                        //Si la entrada es correcta
                        if(controlErrores(trabajoPadres)){

                            //Si vive cerca y sus padres trabajan cerca, nos quedamos con vivir cerca
                            if(poblacion == 1 && trabajoPadres == 1){
                                puntos += POBLACION;
                            }else //Si no priorizamos mirar que viva cerca, si es asi sumamos 30
                                if(poblacion == 1){
                                puntos += POBLACION;
                            }else//Si no se mira si sus padres trabajan cerca, si es asi sumamos 20
                                if(trabajoPadres == 1){
                                puntos += TRABAJO;
                            }

                        }else{//Si no es correcta suma directamente los de poblacion
                            if(poblacion == 1){
                                puntos += POBLACION;
                            }
                        }

                    }else{//Si no es correcta comprueba directamente el trabajo de los padres esta cerca
                        System.out.print("\nPadres trabajan cerca de la escuela (0: no / 1:si)?");
                        if(lectura.hasNextInt()){
                            trabajoPadres = lectura.nextInt();
                        }else{
                            trabajoPadres = INCORRECTO;
                            //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                            lectura = new Scanner (System.in);
                            System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                        }

                        if(controlErrores(trabajoPadres)){
                            if(trabajoPadres == 1){
                                puntos += TRABAJO;
                            }
                        }
                    }
                    //----------------------APARTADO 3-----------------------------------------------
                    System.out.print("\nDiscapacidad o enfermedad crónica (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        discapacidad = lectura.nextInt();
                    }else{
                        discapacidad = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }

                    if(controlErrores(discapacidad)){
                        //Si tiene dicapacidad o enfermedad crónica, suma 10
                        if(discapacidad == 1){
                            puntos += DISCAPACIDAD;
                        }
                    }

                    //----------------------APARTADO 4-----------------------------------------------
                    System.out.print("\nFamilia numerosa / Monoparental (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        familiaNumerosa = lectura.nextInt();
                    }else{
                        familiaNumerosa = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }

                    if(controlErrores(familiaNumerosa)){
                        //Si es familia numerosa o monoparental, sumamos 15
                        if(familiaNumerosa == 1){
                            puntos += FAMILIA;
                        }
                    }
                    

                    //----------------------APARTADO 5-----------------------------------------------
                    System.out.print("\nTutor legal o hermano escolarizado (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        escolarizado = lectura.nextInt();
                    }else{
                        escolarizado = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }
                    
                    if(controlErrores(escolarizado)){
                        //Si un familiar fue escolarizado, sumamos 5
                        if(escolarizado == 1){
                            puntos += ESCOLARIZADO;
                        }
                    }

                    //----------------------PUNTOS TOTALES-----------------------------------------------
                    System.out.println("\n------------El alumno "+registroAlumnos+ " tiene "+puntos+"pts -----------------");

                    System.out.print("\nQuieres seguir inscribiendo alumnos (0: no / 1:si)?");
                    if(lectura.hasNextInt()){
                        inscribirAlumnos = lectura.nextInt();
                    }else{
                        inscribirAlumnos = INCORRECTO;
                        //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                        lectura = new Scanner (System.in);
                        System.err.println(ANSI_RED +"Numero introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
                    }

                    if(!controlErrores(inscribirAlumnos)){
                        inscribirAlumnos =  0;
                    }
                    puntos = 0;
                }
            }else{
                //Reseteamos en Scanner porque si no detectara siempre que el dato introducido no es correcto
                lectura = new Scanner (System.in);
                System.err.println(ANSI_RED +"Registro introducido incorrecto (Debe ser un entero, NO SE SUMARAN PUNTOS)."+ ANSI_RESET);
            }
        }
    }

    //Metodo para comprobar si un numero no es ni 1 ni 0
    public static boolean controlErrores(int numero){
        if(numero != 0 && numero != 1){
            System.err.println(ANSI_RED +"Dato incorrecto (Debe ser 0 o 1) NO SE SUMARAN PUNTOS."+ ANSI_RESET);
            return false;
        }
        return true;
    }

    //Compruba que este entre el rango de registros indicado
    public static boolean rangoRegistro(int numero){
        if(numero > 0 && numero <= 499){
            return true;
        }
        System.err.println(ANSI_RED +"Numero de registro incorrecto (Debe ser entre un rango de 1 a 499)."+ ANSI_RESET);
        return false;
    }
    
}
