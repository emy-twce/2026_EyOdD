package T2_Estructuras_Lineales.Contains_Duplicate;

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
    int n;
    int[] nums;
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

        int nextInt() { 
            return Integer.parseInt(next()); 
        }
    }

    public void leerDatos() {
        n = reader.nextInt(); // Tamaño del arreglo
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = reader.nextInt(); // Elementos del arreglo
        }
    }

    public void resuelve() {
        boolean duplicado = false;

        // Comparamos cada elemnto con los demás
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (duplicado) break;
        }

        // Imprime true o false
        if (duplicado) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        FB solver = new FB();
        solver.leerDatos();
        solver.resuelve();
    }   
}