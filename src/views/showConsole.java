package views;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class showConsole {
    private Scanner scanner;
    public showConsole(){
        this.scanner=new Scanner(System.in);
        showBanner();
        //105inputCode();
    }
    public void showBanner(){
        System.out.println("METODOS DE BUSQUEDA");
    }
    
    public int inputCode() {
        System.out.println("ingrese el codigo a buscar");
        int code = scanner.nextInt();
        return code;
    }

    public String inputName(){
        System.out.println("ingrese el nombre a buscar");
        String name = scanner.next();
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }

}
