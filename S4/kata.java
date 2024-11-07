public class kata{
    public static int repeats(int [] arr){
      int cont = 0;
      int suma = 0;
      
      //Recorremos el array elemento a elemento
      for(int i = 0; i < arr.length; i++){
        //Por cada elemento comprobamos si hay otro repetido en la lista, por lo que la recorremos otra vez
        for(int j = 0; j < arr.length; j++){
          //Si la i i la j coinciden, no se mira porque estariamos mirando el propio elemento[i] entonces siempre 
          //nos daria que esta repetido
          if(i != j){
            //Si encuentra otro elemento igual, aumenta el contador
            if(arr[i] == arr[j]){
              cont ++;
            }
          }
        }
        //Si el contador esta en 0, es que no se ha repetido
        if(cont == 0){
          suma += arr[i];
        }
        //volvemos a poner el contador a 0, para el siguiente elemento
        cont = 0;cont = 0;
      }

      //devolvemos la suma de los elementos del array no repetidos
      return suma;
    }
}