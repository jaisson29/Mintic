public class App {
    public static void main(String[] args) throws Exception {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
        System.out.println("************************************************************");
        BecaUniversitaria becaUniversitaria_2 = new BecaUniversitaria(10000,2.0,48);
        System.out.println(becaUniversitaria_2.calcularInteresSimple());
        System.out.println(becaUniversitaria_2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria_2.compararInversion());
        System.out.println("************************************************************");
        BecaUniversitaria becaUniversitaria_3 = new BecaUniversitaria();
        System.out.println(becaUniversitaria_3.calcularInteresSimple());
        System.out.println(becaUniversitaria_3.calcularInteresCompuesto());
        System.out.println(becaUniversitaria_3.compararInversion());
    }
}
