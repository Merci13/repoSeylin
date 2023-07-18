public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = "a";

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i= 0; i < 100000; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 2ms, 1000 => 5ms, 10000 => 137ms, 100000 => 6653
            //c += a + b + "\n"; // 500 => 19ms, 1000 => 21ms, 10000 => 77ms, 100000 => 2361
            //sb.append(a).append(b).append("\n"); // se puede usar ; en vez de . [ sb.append(a); ] // 500 => 0ms, 1000 => 0ms, 10000 => 2ms, 100000 => 13ms
        }

        long fin = System.currentTimeMillis();
        System.out.println( fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
