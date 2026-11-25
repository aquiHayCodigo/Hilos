
public class Ejercicio1 extends Thread{
    private int[] lista;
    private double resultado;

    public Ejercicio1(int[] lista, double  resultado){
        this.lista= lista;
        this.resultado = resultado;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.lista.length; i++){
            this.resultado += this.lista[i];
        }
        this.resultado = this.resultado /this.lista.length;
    }

    public double getresultado() {
        return resultado;
    }
    
}
