import java.lang.reflect.Method;
import java.util.Arrays;
import controladores.MetodosBusqueda;
import models.persona;
import controladores.*;

public class App {
    public static void main(String[] args) throws Exception {

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


        persona [] personas= new persona[7];
        personas[0]= new persona(101, "JUAN");
        personas[1]= new persona(102, "MARIA");
        personas[2]= new persona(103, "CARLO");
        personas[3]= new persona(104, "ANA");
        personas[4]= new persona(105, "LUIS");
        personas[5]= new persona(106, "SOFIA");
        personas[6]= new persona(107, "PEDRO");
        MetodosBusqueda mb1 = new MetodosBusqueda(personas);  
        
        

    }
}
