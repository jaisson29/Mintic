package com.animales;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal[] animales = new Animal[3];
        //Crear animales y guardarlos en el array
        Rana rana = new Rana("Verde", 15, 1, "Anfibio", true);
        animales[0] = rana;

        Pez pez = new Pez("Gris", 10, 1, "Acuatica");
        animales[1] = pez;

        Perro perro = new Perro("Café", 60, 2, "Canino", "Criollo");
        animales[2] = perro;

        for(int i = 0; i < animales.length; i++){
            animales[i].avanzar();
        }

        
    }
}
