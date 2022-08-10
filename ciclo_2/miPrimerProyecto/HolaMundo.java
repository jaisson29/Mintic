
package miPrimerProyecto;

public class HolaMundo{

    public static void main(String[] args){

        //Moatrar mensaje en consola
        System.out.println("Hola mundo");
        System.out.print("Otra linea");

        //VARIABLES
        int entero = 5;
        entero = 10;
        double decimales = 5.5;
        boolean bandera = true;
        String nombre = "Jaisson Valbuena";
        char caracter = 'a';

        //Concatenar dentro de un print
        System.out.println("Entero->"+entero);
        System.out.println("Decimales->"+decimales);
        System.out.println("Bandera->"+bandera);
        System.out.println("Nombre->"+nombre);
        System.out.println("Caracter->"+caracter);

        //OPERACIONES
        double suma;
        suma = 10+10;
        double multiplicacion = 5*10;
        int modulo = 10%2;
        double division = 10/2;
        int resta = 10-5;

        suma+=10;
        multiplicacion *=2;
        modulo %= 2;
        division /= 2;
        resta -= 2;

        System.out.println("SUma->"+suma);
        suma ++;
        System.out.println("Suma->"+suma);

        System.out.println("Resta->"+resta);
        resta--;
        System.out.println("Resta->"+resta);

        System.out.println("Division->"+division);
        System.out.println("Multiplicacion->"+multiplicacion);
        System.out.println("Modulo->"+modulo);

        //LLamar funcion 'incremental'
        incremental();
        decremental();
        operadores_logicos();
        cadenas();
        libreria_math();
    }

    //Funcion incremental, esta funcion no retorna ningun dato (void)
    public static void incremental(){
        System.out.println("---------------------------------------------INCREMENTAL--------------------------------");
        int x = 0;
        //Imprimir el valor inicial de 'x'
        System.out.println(x);
        //INCREMENTAL
    System.out.println("INCREMENTAL");
    System.out.println(++x);
    System.out.println(++x);
    
    //POST INCREMENTAL
    System.out.println("POSTINCREMENTAL");
    System.out.println(x++);
    System.out.println(x);
    x++;
    System.out.println(x);
    }

    public static void decremental(){
        System.out.println("------------------------------DECREMENTAL-----------------------------");
        int x = 10;
        //Imprimir valor inicial de 'x'
        System.out.println(x);
        System.out.println("DECREMENTAL");
        System.out.println(--x);
        System.out.println(--x);

        //POSTDECREMENTAL
        System.out.println("POSTDECREMENTAL");
        System.out.println(x--);
        System.out.println(x);
    }

    public static void operadores_logicos(){

        int n1 = 10;
        int n2 = 10;
        int n3 = 5;
        int n4 = 8;
        boolean resultado;

        resultado = n1 == n2;
        System.out.println(resultado);
        resultado = n1 > n3;
        System.out.println(resultado);
        resultado = n4 <= n3;
        System.out.println(resultado);
        resultado = n4 != n3;
        System.out.println(resultado);

    }

    public static void cadenas(){

        String mensaje_1 = "Hola Mundo";
        String mensaje_2 = "UTP MISION TIC 2022";
        int n1 = 10;
        double n2 = 3.1416;

        String mensaje = mensaje_1 +" "+ mensaje_2 +" "+ n1;
        System.out.println(mensaje);

        mensaje = mensaje_1+" "+n2;
        System.out.println(mensaje);

        mensaje = mensaje_2+" "+n2;
        System.out.println(mensaje);

        //-------------------
        //COnvertir cadena/string en mayusculas

        mensaje = mensaje_1.toUpperCase();
        System.out.println(mensaje);
        //Convertir cadena/string en minusculas
        mensaje = mensaje.toLowerCase();
        System.out.println(mensaje);

        //-------
        //Obtener tamaño del string
        int tamaño = mensaje_1.length();
        System.out.println(tamaño);
        //Obtener caracter a partir de su posicion
        char caracter = mensaje_1.charAt(0);
        System.out.println("Caracter->"+caracter);
        //Obtener posicion de un caracter
        int index = mensaje_1.indexOf('o');
        System.out.println(index);

        mensaje_1 = "HOLA";
        mensaje_2 = "hola";
        //Igualar cadena de caracteres (strings) equals diferencia entre mayusculas y minusculas
        boolean igual = mensaje_1.equals(mensaje_2);
        System.out.println("igual->"+igual);

        igual= mensaje_1.equalsIgnoreCase(mensaje_2);
        System.out.println("igual->"+igual);

    }

    public static void libreria_math(){
        //Elevar a la paotencia un numero
        double resultado = Math.pow(5,2);
        System.out.println("5^2-> "+resultado);

        //Raiz cuadrada de 5
        resultado = Math.sqrt(5);
        System.out.println("Raiz cuadrada de 5 -> "+resultado);

    }
}