public class Piscinas{ 
    public static void main(String[] args){
        //Sergi Oliver
        //Martí Salom
        
        //PISCINA 1
        int largo1 = 300;
        int ancho1 = 150;
        int profundidad1 = 20;

        //PISCINA 2
        int largo2 = 300;
        int ancho2 = 80;
        int profundidad2 = 35;

        //Apartado 1
        int area1 = ancho1 * largo1;

        System.out.println("El área de la primera piscina es: " + area1 + "m²"); 

        int area2 = ancho2 * largo2;

        System.out.println("El área de la segunda piscina es: " + area2 + "m²");

        //Apartado 2
        int volumen1 = area1 * profundidad1;

        System.out.println("El volumen de la primera piscina es: " + volumen1 + " Litros");

        int volumen2 = area2 * profundidad2;

        System.out.println("El volumen de la segunda piscina es: " + volumen2 + " Litros");
        

        //Apartado 3
        int largoTotal = largo1;
        int anchoTotal = ancho1 + ancho2;

        System.out.println("El ancho y el largo de ambas piscinas juntas es: " + largoTotal + "m de largo y " + anchoTotal + "m de ancho");

        // Apartado 4
        int areaTotal = anchoTotal * largo1;

        System.out.println("El área de ambas piscinas es de: " + areaTotal + " Litros");

        //Apartado 5

        int volumenTotal = areaTotal * profundidad1;
        
        System.out.println("El volumen de ambas piscinas es de: " + volumenTotal + " Litros");

        //Apartado 6
        int aux = profundidad1;
        profundidad1 = profundidad2;
        profundidad2 = aux;

        volumen1 = area1 * profundidad1;

        System.out.println("El nuevo volumen de la primera piscina es: " + volumen1 + " Litros");

        volumen2 = area2 * profundidad2;
        
        System.out.println("El nuevo volumen de la segunda piscina es: " + volumen2 + " Litros");
    }
}