public class RegistroAcademico {
    
    
    public static int generacionDeDatos (int x, int y){
        return (int) (Math.random() * (y - x + 1) + x);
    }
    
    public static int obtenerMinimo (int [] a){
        int x = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < x){
                x = a[i];
            }
        }
        return x;
    }

    public static int obtenerMaximo(int[] a){
        int x = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > x){
                x = a[i];
            }
        }
        return x;
    }

    public static double calcularPromedio(int [] a){
        double suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return (suma/a.length);
    }

    public static void analizarRepetidos(int []a){
        for (int i = 3; i <= 9 ; i++) {
            int contador = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j] == i){
                    contador++;
                }
            }
            if(contador > 1){
                System.out.println("el numero " + i + " se repite: "+ contador);
            }
        }
    }

    public static void main(String[] args) {
        
        int [] calificaciones = new int [10]; 
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = generacionDeDatos(3, 9);
        }
        
        System.out.print("Calificaciones: " + "[");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i] + ", ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Valor minimo: " + obtenerMinimo(calificaciones));
        System.out.println("Valor maximo: " + obtenerMaximo(calificaciones));
        System.out.println("Promedio: " + calcularPromedio(calificaciones));
        System.out.println("---------------------------------------------");
        System.out.println("Analisis de repeticiones: ");
        analizarRepetidos(calificaciones);
        
    }
}
