package miPrimerProyecto;

import java.util.Scanner;

public class Ejercicio_1 {
    
    
    public static void main(String[] args){
        //Capturar datos por consola
        Scanner entrada = new Scanner(System.in);
        entrada.close();
        System.out.print("Por favor ingrese su nombre: ");
        //Quedar a la escucha para capturar datos por teclado
        //Capturar un string
        String nombre = entrada.next();
        //Mostrar nombre
        System.out.println("Su nombre es: "+nombre);
        
        System.out.print("Por favor ingrese su edad: ");
        int edad = entrada.nextInt();
        
        System.out.print("Por favor ingrese su nota: ");
        double nota = entrada.nextDouble();
        
        System.out.print("Nombre: "+nombre+"\nEdad: "+edad+"\nNota: "+nota);

        
        
        suerte();

    }

    public static void suerte(){
        //Crear objeto scanner para datos por consola
        Scanner entrada = new Scanner(System.in);
        entrada.close();
        //Capturar el dia
        System.out.print("Por favor ingrese el dia de su nacimineto: ");
        int dia = entrada.nextInt();

        System.out.print("Por favor ingrese el mes de su nacimineto: ");
        int mes = entrada.nextInt();

        System.out.print("Por favor ingrese el año de su nacimineto: ");
        int año = entrada.nextInt();

        String calculo = ""+(dia+mes+año);

        int finalSuerte = Integer.parseInt(""+calculo.charAt(0));
        finalSuerte += Integer.parseInt(""+calculo.charAt(1));
        finalSuerte += Integer.parseInt(""+calculo.charAt(2));
        finalSuerte += Integer.parseInt(""+calculo.charAt(3));

        System.out.print("Su numero de la suerte es: "+finalSuerte);
    }
}

