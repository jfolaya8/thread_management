package thread_management;

public class Main {

    public static void main(String[] args) {
        Clear limpiar = new Clear();
        limpiar.start();
        
        Generate generar = new Generate();
        generar.start();
        
        Consume consumir = new Consume();
        consumir.start();
        
    }
    
}