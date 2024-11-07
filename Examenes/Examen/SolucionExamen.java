package Examenes.Examen;

public class SolucionExamen {
    public static void main(String[] args) {
        int a = 18;
        int b = 2;

        int n = 46232378;

        //Llamada al metodo sumaImapres
        System.out.println("la suma de los impares en el intervalo ["+ a + ", "+ b +"] es igual a "+ sumaImpares(a, b));

        //Llamada al metodo esPrimo
        if(esPrimo(a)){
            System.out.println("El numero "+ a +" es primo");
        }else{
            System.out.println("El numero "+ a +" no es primo");
        }

        //Llamada al metodo invertirNumero
        System.out.println("El numero "+ n + " invertido es "+ invertirNumero(n));

        //Llamda al metodo costeConsulta
        System.out.println("El coste de la consulta "+ a +" es igual a "+costeConsulta(a));
    }

    public static int sumaImpares(int a, int b){
        int suma = 0;

        //Si el el primero es mayor al segundo se devuelve 0: sumaImpares(7,3)-->0
        if (a > b) {
            return 0;
        }else if (a == b) {//Si el primero y segundo son iguales devuelve directamente el primero
            if((a % 2) != 0){//sumaImpares(7,7)--> 7
                return a;
            }else{//sumaImpares(8,8)--> 0
                return 0;
            }
        }


        for(int i = a; i <= b; i++){//reocrremos el intervalo
            if ((i % 2) != 0){//si es impar sumamos
                suma += i;
            }
        }

        return suma;//devuelve la suma
    }


    public static boolean esPrimo(int n){
        //Si es menor que dos directamente sabemos que no es primo
        if(n < 2){
            return false;
        }

        //Si no tenemos que mirar si es divisible por un numero menor a el
        for(int i = 2; i < n; i++){
            if((n % i) == 0){//Si el resto da 0 es que es divisible por lo tanto no es primo
                return false;
            }
        }
        //Si ha llegado hasta aqui sabemos que es un primo
        return true;
    }

    public static int invertirNumero(int n){
        int numeroInvertido = 0;
        int multiplicador = 1;
        int contador = 0;
        int aux = n;

        // Paso 1: Contar los dígitos del número para definir el tamaño del array
        while (aux > 0) {
            aux = aux / 10;
            contador++;
        }

        int [] lista = new int[contador];
        contador = 0;

        while(n > 10){//Vamos añadiendo los restos a un array 574 / 10
            lista[contador] = n % 10;                      //   4   57 / 10               
            n = n / 10;                                    //        7   5   cogemos el primer resto, segundo...    
            contador++;                                    //                y por ultimo el resultado de la division y te queda invertido
        }
        lista[contador] = n;//Una vez n sea menor a 10 guardamos el resultado de la division
        
        for(int i = 0; i < lista.length; i++){//Recorremos el array y ya tendra los numeros invertidos

            for(int j = contador; j > 0; j--){//Con el contador sabemos cuantos digitos tiene el numero, si tiene 4 se multiplicara por 1000, si tiene 3 por 100...
                multiplicador *= 10;
            }
            numeroInvertido += (lista[i] * multiplicador);//para el 574 se sumara 4*100 = 400 + 7*10 = 470 + 5*1 = 475
            multiplicador = 1;//reseteamos multiplicador 
            contador--;//y reducimos los 0's
        }

        return numeroInvertido;//devolvemos el numero invertido
    }

    public static int costeConsulta(int numConsulta){
        if (numConsulta >= 1 && numConsulta <= 2) {//Si es la cita 1 o 2 cuesta 200
            return 200;
        }else if(numConsulta > 2 && numConsulta <= 5){//Si es la 3, 4 o 5 cuesta 150
            return 150;
        }else if (numConsulta > 6) {//Si es de la 6 a adelante cuesta 100
            return 100;
        }
        return 0;//en cualquier otro caso va a devolver 0
    }

}
