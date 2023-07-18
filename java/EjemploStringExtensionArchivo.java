public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.jpeg";

        //int i = archivo.indexOf(".");  // cuando solo hay un punto en el nombre
        int i = archivo.lastIndexOf("."); // cuando hay varios puntos en el nombre

        System.out.println("archivo.length() = " + archivo.length());

        System.out.println("archivo.substring(14) = " + archivo.substring(14));

        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length() - 4));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i));
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1));

    }
}
