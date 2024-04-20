public class App {
    public static void main(String[] args) throws Exception {
        Interrupcion proceso = new Interrupcion();
        proceso.start();

        Thread.sleep(2000);
        
        System.out.println("Se lanza una interrupcion.");
        proceso.interrupt();
        System.out.println("Finalizacion.");
    }
}
