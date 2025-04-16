package controladores;

import models.persona;
import views.showConsole;

public class MetodoBusquedaBinaria {
    private persona[] person;
    private showConsole showConsole;
    public MetodoBusquedaBinaria(persona[] person){
        this.person=person;
        showConsole = new showConsole();
        showConsole.showMessage("Metodo de busqueda binaria");
    }

    private int findPersonByCode(int code){
        int bajo = 0;
        int alto = person.length-1;
        while (alto>=bajo) {
            int central= (bajo+alto)/2;
            if (person[central].getCode()==code) {
                return central;
            }else if(person[central].getCode()>code){
                alto=central-1;
            }else{
                bajo=central+1;
            }    
        }
        return -1;
    }
    public void showPersonByCode(){
        int codigo=showConsole.inputCode();
        int indexPerson= findPersonByCode(codigo);
        if (indexPerson== -1) {
            showConsole.showMessage("persona con "+codigo+ " no encontrada");
        }else{
            showConsole.showMessage("Persona con codigo "+codigo+" encontrada ");
            showConsole.showMessage(person[indexPerson].toString());
        }
    }

    public void showPersonByName(){
        String nameToFind = showConsole.inputName();
        showConsole.showMessage("PERSONAS ARREGLO ORIGINAL");
        printPerson();
        int indexPerson = findPersonByName(nameToFind);
        showConsole.showMessage("PERSONAS ORDENADAS POR NOMBRE");
        printPerson();
        if (indexPerson != -1) {
            showConsole.showMessage("LA PERSONA "+nameToFind+" encontrada");
            showConsole.showMessage(person[indexPerson].toString()+"");
            } else {
                showConsole.showMessage("LA PERSONA "+nameToFind+" no encontrada");
                showConsole.showMessage(person[indexPerson].toString());
            
        }
    }
    public void printPerson(){
        for(int i = 0; i < person.length; i++){
            showConsole.showMessage(person[i].toString());
        }
    }
    public void ordenarPersona(){
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                // to compare one string with other strings
                if (person[i].getName().compareTo(person[j].getName()) > 0) {
                    // swapping
                    persona temp = person[i];
                    person[i]= person[j];
                    person[j]= (temp);
                }
            }
        }
    }
    private int findPersonByName(String name){
        ordenarPersona();
        int bajo = 0;
        int alto = person.length-1;
        while (alto>=bajo) {
            int central= (bajo+alto)/2;
            if (name.equals(person[central].getName())) {
                return central;
            }else if(person[central].getName().compareTo(name)>0){
                alto=central-1;
            }else{
                bajo=central+1;
            }    
        }
        return -1;
    }

}
