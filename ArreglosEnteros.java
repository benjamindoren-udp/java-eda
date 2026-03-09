public class ArreglosEnteros {
    public static void main(String[] args) {
        //int numerosVarios[3] = {1,2,3}; //error de sintaxis
        int otroNumerosVarios[] = {1,2,3};
        System.out.println(otroNumerosVarios[0]); //sout y tabular
        System.out.println(otroNumerosVarios[1]);
        System.out.println(otroNumerosVarios[2]);
        System.out.println("---");
        System.out.println("largo del arreglo: " + otroNumerosVarios.length);
        for (int i = 0; i < otroNumerosVarios.length; i++) {
            System.out.println(otroNumerosVarios[i]);
        }
    }
}
