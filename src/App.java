import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Batería hilos!!!!");
        boolean menu = true;

        while (menu) {
            System.out.println("0. Iniciación.");
            System.out.println("1. Calcular medias.");
            System.out.println("2. ");
            System.out.print("Escribe la opción: ");
            int opc = Integer.parseInt(sc.nextLine());
            System.out.println("- - - - - - - - - ");
            switch (opc) {
                case 0:
                    List<Integer> listaNum = List.of(1, 2, 3, 4, 5, 6);
                    int multi = 1;
                    for (Integer integer : listaNum) {
                        multi = multi * integer;
                    }
                    System.out.println(multi);

                    Numeros num1 = new Numeros(listaNum);
                    num1.start();

                    hiloPropio hilo = new hiloPropio();
                    hilo.start();
                    hiloPropio hilo2 = new hiloPropio();
                    hilo2.start();

                    try {
                        hilo.join();
                        hilo2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Fin de ejecución de hilos");
                    break;

                case 1:
                    int[] lista = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
                    System.out.print("Dime cuántos hilos va a haber: ");
                    int cantHilos = Integer.parseInt(sc.nextLine());
                    double media = calcularMedia(lista, cantHilos);
                    System.out.println("La media es: " + media);
                    break;

                default:
                    menu = false;
                    break;
            }
        }
    }

    public static double calcularMedia(int[] lista, int cantHilos) {
        // Calcular la media por cachos (cada hilo hace un tramo de la media)
        double resultado = 0;
        List<Ejercicio1> listaHilos =  new ArrayList<>();
        int longArrayHilo = lista.length / cantHilos;
        double suma = 0;
        for(int i = 0; i < lista.length; i ++){
            int[] listaHilo = new int[longArrayHilo];
            for(int j = 0; j<longArrayHilo; j++){
                suma += lista[j];
            }
            Ejercicio1 ej = new Ejercicio1(listaHilo, suma);
        }

        return resultado;
    }

}
