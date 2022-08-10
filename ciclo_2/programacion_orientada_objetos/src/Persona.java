import java.util.Scanner;

public class Persona{
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String telefono;
    private String email;
    private char genero;
    
    //METODO CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String cedula, char genero){
        //this.nombre -> Atributo
        //nombre -> parámetro
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
    }


	//METODOS CONSULTORES
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public int getEdad(){
        return edad;
    }

    public String getCedula(){
        return cedula;    
    }

    public String getTelefono(){
        return telefono;
    }

    public String getEmail(){
        return email;
    }
    
    public char getGenero(){
        return genero;
    }

    //METODOS MODIFICADORES
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }

    //ACCIONES
    public double calcular_nomina(double cant_horas){
        int valor_hora = 0;
        double nomina = 0;
        //&& -> and
        if(edad < 20 && edad >= 18){
            valor_hora = 10;
        }else if(edad >= 20 && edad <= 30){
            valor_hora = 15;
        }else if(edad > 30 && edad <= 50){
            valor_hora = 20;
        }else if(edad > 50){
            valor_hora = 25;
        }

        nomina = valor_hora * cant_horas;

        return nomina;
    }

    public void crear_carro(){
        Scanner leer = new Scanner(System.in);
        //SOLICITAR LOS DATOS PARA CREAR UN CARRO
        System.out.println("Que color desea para su vehiculo? ");
        String color = leer.nextLine();

        System.out.println("Matricula del vehiculo: ");
        String matricula = leer.nextLine();

        System.out.println("Modelo del vwehiculo: ");
        String modelo = leer.nextLine();

        System.out.println("¿Que capacidad de personas desea que tenga el vehiculo? (ej: 4): ");
        int cap_personas = leer.nextInt();

        System.out.println("Tipo de vehiculo: ");
        String tipo_carro = leer.nextLine();

        System.out.println("Velocidad maxima del vehiculo (ej: 200): ");
        Double vel_maxima = leer.nextDouble();

        System.out.println("¿Desea que el vehiculo sea  a gasolina? (s-->Si / n-->No): ");
        String str_gasolina = leer.next();
        Boolean gasolina = (str_gasolina.equalsIgnoreCase("s"));
        /* if(str_gasolina.equalsIgnoreCase("s")){
            gasolina = true;
        } */

        //CREAR CARRO
        Carro carro = new Carro(color, matricula, modelo, cap_personas, tipo_carro, vel_maxima, gasolina);

        System.out.println( carro.toString());

        leer.close();
    }

}














