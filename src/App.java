import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciación hilos!!!!");

        List<Integer> listaNum = List.of(1, 2, 3, 4, 5, 6);
        int multi = 1;
        for (Integer integer : listaNum) {
            multi = multi * integer;
        }
        System.out.println(multi);

        Numeros num1 = new Numeros(listaNum);
        num1.start();

        List<Integer> lista2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        Ejercicio1 ej1 = new Ejercicio1(lista2, 2);
        
    }

}
