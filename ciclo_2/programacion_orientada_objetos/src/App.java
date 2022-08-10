public class App {
    public static void main(String[] args) throws Exception {
        //Construir un objeto de tipo persona
        Persona objPersona1 = new Persona("Jaissson", "Valbuena", 17, "1070004545", 'H');
        //Obtener el nombre y apellido
        String nombre = objPersona1.getNombre();
        String apellido = objPersona1.getApellido();
        //Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        objPersona1.setNombre("Camilo");
        objPersona1.setApellido("Torres");
        nombre = objPersona1.getNombre();
        apellido = objPersona1.getApellido();
        //Imprimir en consola
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido);

        System.out.println("-----------------------------------\n--------------------------------------");

        //Crear mas personas
        Persona objPersona2 = new Persona("Laura", "Sandoval", 18, "987654321", 'F');
        objPersona2.setTelefono("312345789");
        objPersona2.setEmail("laura@gamil.com");

        Persona objPersona3 = new Persona("Laila", "Narvaez", 15, "111144456789", 'F');
        objPersona3.setTelefono("3145678902");
        objPersona3.setEmail("laila@gmail.com");


        //Obtener valor nomina 
        double nomina = objPersona1.calcular_nomina(10);
        System.out.println("Nomina: "+nomina);

        apellido = objPersona2.getApellido();
        nomina = objPersona2.calcular_nomina(10);
        System.out.println(apellido+" - Nomina: "+nomina);

        apellido = objPersona3.getApellido();
        nomina = objPersona3.calcular_nomina(10);
        System.out.println(apellido+" - Nomina: "+nomina);

        Persona objPersona4 = new Persona("Luis", "Hernandez", 35, "123098765", 'M');
        Persona objPersona5 = new Persona("Edward", "Quintana", 55, "112222222", 'M');

        apellido = objPersona4.getApellido();
        nomina = objPersona4.calcular_nomina(10);
        System.out.println(apellido+" - Nomina: "+nomina);

        apellido = objPersona5.getApellido();
        nomina = objPersona5.calcular_nomina(10);
        System.out.println(apellido+" - Nomina: "+nomina);

        objPersona1.crear_carro();
    }
}

