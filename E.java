import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class E {

    FastReader reader = new FastReader();

    // datos
    char color; // guarda el color de la cuenta inicial
    int N; // cantidad de cambios del color

    static class FastReader {

        BufferedReader b;
        StringTokenizer s;

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    String line = b.readLine();
                    if (line == null) return null;
                    s = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return s.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public void leerDatos() {
        color = reader.next().charAt(0);
        N = reader.nextInt();
    }

    public void mostrarDatos() {
        System.out.println(color);
    }

    public void resuelve() {
        for (int i = 1; i <= N; i++) {
            if (color == 'R') {
                color = 'A';
            } else if (color == 'A') {
                color = 'V';
            } else if (color == 'V') {
                color = 'R';
            }
        }
    }

    public static void main(String[] args) {

        E e = new E();

        e.leerDatos();
        e.resuelve();
        e.mostrarDatos();
    }
}