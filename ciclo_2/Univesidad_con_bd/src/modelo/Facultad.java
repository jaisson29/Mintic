package modelo;

public class Facultad {
    // ATRIBUTOS
    private int id;
    private String codigo;
    private String nombre;

    // CONSTRUCTOR
    public Facultad(int id, String codigo, String nombre) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Facultad(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // CONSULTORES

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    // MODIFICADORES
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
