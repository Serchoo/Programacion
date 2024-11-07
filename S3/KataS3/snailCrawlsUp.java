public class snailCrawlsUp {
    public static int snail(int column, int day, int night) {
      int dias = 0;
      int altura = 0;
      
      //Siempre que la altura subida sea menor a la altura de la columna 
      //seguira el bucle
      while(altura < column){
        dias++;
        // se suma la altura del dia
        altura += day;
        
        //se comprueba si ha ha llegdo, durante el dia
        if(altura >= column){
          //si ha llegado se devuelven los dias
          return dias;
        }
        
        //si no ha llegado, significa que sigue subiendo, asi que por la noche va ha perder altura
        altura -= night;
      }
      
      return dias;
    }
}
