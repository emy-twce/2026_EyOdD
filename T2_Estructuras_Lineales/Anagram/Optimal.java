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

public class Optimal {
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
        //  si tienen longitudes diferentes no es anagrama
        if (s.length() != t.length()) {
            System.out.println("false");
            return;
        }

        int[] frecuencia = new int[26];

        // se recorren las dos  cadenas al mismo tiempo
        for (int i = 0; i < s.length(); i++) {
            frecuencia[s.charAt(i) - 'a']++;
            frecuencia[t.charAt(i) - 'a']--;
        }

        boolean esAnagrama = true;
        for (int count : frecuencia) {
            if (count != 0) {
                esAnagrama = false;
                break;
            }
        }

        System.out.println(esAnagrama ? "true" : "false");
    }

    public static void main(String[] args) {
        Optimal solver = new Optimal();
        solver.leerDatos();
        solver.resuelve();
    }   
}