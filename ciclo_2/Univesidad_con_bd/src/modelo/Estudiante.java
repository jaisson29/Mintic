package modelo;

public class Estudiante extends Persona {

    // ATRIBUTOS
    private String codigo;

    // CONSTRUCTOR
    public Estudiante(String nombre, String apellido, int edad, String cedula, char sexo, String codigo) {
        super(nombre, apellido, edad, cedula, sexo);
        this.codigo = codigo;
    }

    // CONSULTOR
    public String getCodigo() {
        return codigo;
    }

    // MODIFICADOR
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // ACCIONES


}
