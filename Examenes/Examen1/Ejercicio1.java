package Examenes.Examen1;

//1. Dada una lista de números y un número k, implementa una función en java que devuelva si dos 
//números cualesquiera de la lista suman k.
//Por ejemplo, dada la siguiente lista de números [10, 15, 3, 8, 22] y k con un valor de 30, devuelve 
//verdadero ya que 22 + 8 es 30. (3 p):

public class Ejercicio1{
    public static boolean sumaDosNumerosIgualK(int [] lista, int k){
        //Recorremos uno a uno los elementos de la lista
        for(int i = 0; i < lista.length; i++){
            //Por cada elemento recorremos la lista elemento a elemento otra vez
            for(int j = 0; j < lista.length; j++){
                //Siempre que no coincida la posicion al recorrer las listas
                if(i != j){
                    //Sumaremos
                    if(lista[i] + lista[j] == k){
                        //Si la suma da k devuelve true
                        return true;
                    }
                }
            }
        }
        //Si ya se ha comprobado cada elemento y no se ha encontrado ningun numero que sume k
        //devuelve false
        return  false;
    }
}