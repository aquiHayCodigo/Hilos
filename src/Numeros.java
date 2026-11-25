import java.util.List;

public class Numeros extends Thread{
    private List<Integer> lista;
    private int suma;
    private int producto;

    public Numeros(List<Integer> lista){
        this.lista = lista;
    }

    public int suma(List<Integer> lista){
        this.suma=0;
        for (Integer integer : lista) {
            suma += integer;
        }

        return this.suma;
    }

    public int producto(List<Integer> lista){
        this.producto=1;
        for (Integer num : lista) {
            producto =  producto * num;
        }
        return this.producto;
    }

    public int resta(int num1, int num2){
        int resta = num2 - num1;
        System.out.println(resta);
        return resta;
    }

    @Override
    public void run() { // This method is called when the thread is started
        suma(this.lista);
        producto(lista);
        resta(this.suma, this.producto);
    }

    

}
