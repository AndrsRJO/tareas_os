import java.util.concurrent.TimeUnit;

public class Interrupcion extends Thread {
    
    private int contador;

    public Interrupcion() {
        this.contador = 1;
    }

    public void ejecutar() {
        while(true) {
            try {
                Thread.sleep(200);
                System.out.println("Procesando... " + this.contador);
                this.contador++;

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Proceso interrumpido.");
                    TimeUnit.MILLISECONDS.sleep(1);
                    System.out.println("Este mensaje no se presentará.");
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                System.out.println("Proceso interrumpido.");
                return;
            }
        }
    }

    @Override
    public void run() {
        System.out.println("Proceso en ejecucion (1)...");
        ejecutar();
        System.out.println("Proceso en ejecucion (2)...");    
    }
}
