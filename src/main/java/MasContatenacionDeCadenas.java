public class MasContatenacionDeCadenas {
    public static void main(String[] args) {
        //Otras formas de concatenar
        //Metodo concat
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1.concat(" ").concat(cadena2);

        System.out.println(cadena3);

        //String Builder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        var resultado = constructorCadenas.toString();
        System.out.println(resultado);

        //String buffer = eficiente para cuando se trabaja con varios hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println(stringBuffer);

        //join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println(resultado);
    }
}
