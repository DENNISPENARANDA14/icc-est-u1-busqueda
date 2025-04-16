import java.lang.reflect.Method;
import java.util.Arrays;
import controladores.MetodosBusqueda;
import controladores.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        int[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        MetodosBusqueda mb= new MetodosBusqueda();
        //B úsqueda de la posición de forma secuencial		
        int index = mb.busquedaLineal(datos,11); // Busca 11
        System.out.println("Buscando 11 ...");
        //Mostrar resultado
        if (index != (-1)) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
		
        index = mb.busquedaLineal(datos, 12); // Busca 12
        System.out.println("Buscando 12 ...");
        //Mostrar resultado
        if (index != -1) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
