public class Main {
    public static void main(String[] args) throws Exception {
        // Pruebas Públicas
        /* Computadores computadores[] = new Computadores[6];
        computadores[0] = new Computadores(150.0, 70, 'A');
        computadores[1] = new ComputadoresMesa(70.0, 40);
        computadores[2] = new ComputadoresPortatiles(600.0, 70, 'D', 50, false);
        computadores[3] = new Computadores();
        computadores[4] = new Computadores(500.0, 60, 'A');
        computadores[5] = new Computadores(700.0, 50, 'D');
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println(); */
        Computadores computadores[] = new Computadores[4];
        computadores[0] = new Computadores(60.0, 10, 'D');
        computadores[1] = new ComputadoresMesa(300.0, 40, 'Z', 40);
        computadores[2] = new ComputadoresPortatiles(50.0, 10, 'A', 70, false);
        computadores[3] = new Computadores(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(computadores);
        solucion1.mostrarTotales();
        System.out.println();
    }
    
}
