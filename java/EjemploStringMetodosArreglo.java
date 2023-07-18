public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {


        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.length() = " + trabalengua.length());
        
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char [] arreglo = trabalengua.toCharArray();

        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for (int i = 0; i < largo; i++){
            //System.out.println("arreglo = " + arreglo[i]); //imprime de forma vertical
            System.out.print(arreglo[i]);
        }

        System.out.println(); //2 saltos de linea
        System.out.println("\ntrabalengua = " + trabalengua.split("a"));

        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for(int j=0; j<l; j++){
            System.out.println(arreglo2[j]);
        }
        String archivo = "alguna.imagen.jpeg";
        String[] archivoArr = archivo.split("\\."); // \\. o [.,a] solo imprime las palabras
        l = archivoArr.length;
        System.out.println("l = " + l);
        for(int j=0; j<l; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);
    }
}
