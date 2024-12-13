package GeneradorDeEmail;

public class GeneradorDeEmail {
    public static void main(String[] args) {
        //Nombre y nombre normalizado
        var nombres = "Julio Felipe Alexander  ";
        var nombreNormalizado = nombres.trim().replaceAll(" ", ".").toLowerCase();
        System.out.println("Nombres: "  + nombres + "\n");

        //Empresa
        var nombreEmpresa = "  Global Mentoring";
        var nombreEmpresaNormalizado = nombreEmpresa.replaceAll(" ", "").toLowerCase();
        System.out.println("Empresa: " + nombreEmpresa + "\n");
        //dominio
        var extensionDominio = ".com.gt";
        extensionDominio = String.join("", nombreEmpresaNormalizado, extensionDominio);

        var email = String.join("@", nombreNormalizado, extensionDominio);
        System.out.println("Correo: " + email);

    }
}
