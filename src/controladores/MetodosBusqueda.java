package controladores;

import models.persona;
import views.showConsole;
public class MetodosBusqueda {
    private persona [] people;
    private showConsole showConsole;

    public MetodosBusqueda(){}
    
    public MetodosBusqueda(persona [] persona) {
        showConsole = new showConsole();
        this.people = persona;
        showPerson();
        showPersonByName();
    }


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

    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (code == people[i].getCode()) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind =showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson != -1) {
            showConsole.showMessage("LA PERSONA CON CODIGO "+codeToFind+" encontrada");
            showConsole.showMessage(people[indexPerson].toString()+"");
            } else {
                showConsole.showMessage("LA PERSONA CON CODIGO "+codeToFind+" no encontrada");
            
        }
    }
    public int findPersonByName(String name){
        for (int i = 0; i < people.length; i++) {
            if (name.equals(people[i].getName())) {
                return i;
            }
        }
        return -1;
   }
    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson != -1) {
            showConsole.showMessage("LA PERSONA "+nameToFind+" encontrada");
            showConsole.showMessage(people[indexPerson].toString()+"");
            } else {
                showConsole.showMessage("LA PERSONA "+nameToFind+" no encontrada");
            
        }
    }
}