public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMIENTO_BASE = 50;
    // Variable
    private Integer almacenamiento;

    // Constructor
    public ComputadoresMesa() {
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W, ALMACENAMIENTO_BASE);
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso) {
        this(precioBase, peso, CONSUMO_W, ALMACENAMIENTO_BASE);
    }

    // Constructor
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento = almacenamiento;
    }

    // Métodos
    public Double calcularPrecio() {
        // Código return adicion;
        Double adicion = super.calcularPrecio();
        if(almacenamiento > 100){
            adicion += 50.0;
        }

        return adicion;
    }
    
    public Integer getCarga() {

        return almacenamiento;
    }
}


