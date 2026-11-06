package T2_Estructuras_Lineales.Anagram;

/*
ITESS 2026
Agosto-Diciembre 2026
Estructura y organización de datos
Profesor Dr. Francisco Javier Montecillo Puente
Tema 2. Estructuras lineales
Programadr Emily Sánchez Medina
Descripción: en esta tarea voy a usar lists, arrays, stacks y queues
para resolver problemas tipo icpc por fuerza bruta y de manera optima
31/10/2026
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FB {
    String s, t;
    FastReader reader = new FastReader();

    static class FastReader {
        BufferedReader b;
        StringTokenizer s; 

        public FastReader() {
            b = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (s == null || !s.hasMoreElements()) {
                try {
                    s = new StringTokenizer(b.readLine());
                } catch (IOException e) {
                    e.printStackTrace(); 
                }
            }
            return s.nextToken();
        }
    }

    public void leerDatos() {
        s = reader.next(); // primera cadena
        t = reader.next(); // segunda cadena
    }

    public void resuelve() {
        // si tienen longitudes diferentes no es anagrama
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        boolean esAnagrama = true;
        char[] tChars = t.toCharArray();
        boolean[] visitado = new boolean[t.length()];

        // buscamks cada carácter de s en t 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean encontrado = false;
            for (int j = 0; j < t.length(); j++) {
                if (!visitado[j] && tChars[j] == c) {
                    visitado[j] = true;
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                esAnagrama = false;
                break;
            }
        }

        System.out.println(esAnagrama ? "true" : "false");
    }

    public static void main(String[] args) {
        FB solver = new FB();
        solver.leerDatos();
        solver.resuelve();
    }   
}