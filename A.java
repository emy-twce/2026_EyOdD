/*
* javac A.java
* java A < caso0.txt
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A {

    FastReader reader = new FastReader();
    int N;
    String pasos;

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
        N = reader.nextInt();
        pasos = reader.next();
    }

    public void resuelve() {
        int x = 0;

        for (int i = 0; i < N; i++) {
            char paso = pasos.charAt(i);
            if (paso == 'R') {
                x++;
            } else if (paso == 'L') {
                x--;
            }
        }

        if (x < 0) {
            System.out.println("Izquierda");
        } else if (x > 0) {
            System.out.println("Derecha");
        } else {
            System.out.println("Linea Recta");
        }
    }

    public static void main(String[] args) {
        A p = new A();
        p.leerDatos();
        p.resuelve();
    }
}