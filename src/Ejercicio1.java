import java.util.List;

public class Ejercicio1 extends Thread{
    private List<Integer> lista;
    private int cant;

    public Ejercicio1(List<Integer> lista, int cant){
        this.lista=lista;
        this.cant =  cant;
    }

    int[] lista1 = new int[this.cant];
    public static void media1(List<Integer> lista, int num){
        if (!lista.isEmpty()){
            for (Integer integer : lista) {
                
            }
        }
    }

    @Override
    public void run() {
        media1(this.lista, this.cant);
    }
    
}
