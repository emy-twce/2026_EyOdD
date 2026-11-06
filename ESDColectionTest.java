/*
ITESS 2026
Agosto-Diciembre 2026
Estructura y organización de datos
Tema 2. Estructuras lineales
Hola voy a usar list, arrays, colas y esas cosas c:
01/10/2026
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ESDColectionTest {
    public static void main(String[] args) {
        // 1. Arreglo inicial de colores (corregido de () a {})
        String[] colors = {"RED", "BLUE", "YELLOW", "GREEN"};
        List<String> list = new ArrayList<>();

        // Llenar la primera lista
        for (String color : colors) {
            list.add(color);
        }

        // 2. Arreglo de colores a eliminar
        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<>();

        // Llenar la segunda lista
        for (String color : removeColors) {
            removeList.add(color);
        }

        // Mostrar contenido inicial de la lista
        System.out.println("ArrayList content (Original):");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();

        // 3. Uso de Collection e Iterator para remover elementos
        removeColors(list, removeList);

        // Mostrar contenido después de eliminar
        System.out.println("\nArrayList content (After removing colors):");
        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }

    // Método que utiliza la interfaz Collection y un Iterator para filtrar elementos
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove(); // Elimina el elemento actual si está en la segunda colección
            }
        }
    }
}