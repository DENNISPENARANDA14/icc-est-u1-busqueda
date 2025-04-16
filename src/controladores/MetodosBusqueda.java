package controladores;

public class MetodosBusqueda {

    public int busquedaLineal(int[] arreglo, int valor){
        int pos= -1;
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}