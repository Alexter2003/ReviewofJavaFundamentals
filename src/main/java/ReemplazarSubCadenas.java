public class ReemplazarSubCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        System.out.println(cadena1);

        var nuevaCadena = cadena1.replace("mundo", "A todos");

        System.out.println(nuevaCadena);
        //Hola a todos

        nuevaCadena = cadena1.replace("Hola", "Saludos");

        System.out.println(nuevaCadena);
        //Saludos Mundo

        //Las cadenas son inmutables por lo que no se modifica la cadena original, sino que se crea  una nueva
    }
}
