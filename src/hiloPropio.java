public class hiloPropio extends Thread{
    @Override
    public void run() {
        int contador = 10;

        while(contador > 0){
            System.out.println("Estoy gastando CPU: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            contador--;
        }
    }

}
