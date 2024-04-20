public class App extends Thread {
    public static void main(String[] args) throws Exception {
        Thread hilo1 = new Thread( new Runnable() {
            @Override
            public void run() {
                System.out.println( Thread.currentThread().getName() );
            }
        } );
        Runnable tarea = new Tarea();
        Thread hilo2 = new Thread(tarea);
        Thread hilo3 = new Thread( () -> System.out.println( Thread.currentThread().getName() ) ); 
        Thread hilo4 = new Thread( App::ejecutar );
        Thread hilo5 = new App();

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
    }

    public static void ejecutar( ){
        System.out.println( Thread.currentThread().getName() );
    }

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );
    }
}
