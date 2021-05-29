/**
 *
 * @author Seton Spence
 * @version 0.1
 */

import java.util.Scanner;   //Scanner for keybord imput and file reading
import java.io.File;        //for interacting with files
import java.io.IOException; //for handling errors

public class Class1
{
    // instance variables - replace the example below with your own
    private int x;
    
    Scanner scanner = new Scanner(System.in);//create a scanner


    public Class1()
    {
        // initialise instance variables
        startUp();
        imput();
    }
    
    void startUp(){
        System.out.println("******");
        
        System.out.println("┏━━━┓━━━━━━━━━┏┓━━━━━┏━━━┓━━━━━━━━━┏┓━━━━━━━━┏┓━━━━━┏━━━┓━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃┏━┓┃━━━━━━━━┏┛┗┓━━━━┃┏━┓┃━━━━━━━━┏┛┗┓━━━━━━━┃┃━━━━━┃┏━┓┃━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("┃┗━┛┃┏━━┓┏━━┓┗┓┏┛━━━━┃┃━┗┛┏━━┓┏━┓━┗┓┏┛┏━┓┏━━┓┃┃━━━━━┃┗━┛┃┏━┓┏━━┓┏━━┓┏━┓┏━━┓━┏┓┏┓");
        System.out.println("┃┏━━┛┃┏┓┃┃━━┫━┃┃━━━━━┃┃━┏┓┃┏┓┃┃┏┓┓━┃┃━┃┏┛┃┏┓┃┃┃━━━━━┃┏━━┛┃┏┛┃┏┓┃┃┏┓┃┃┏┛┗━┓┃━┃┗┛┃");
        System.out.println("┃┃━━━┃┃━┫┣━━┃━┃┗┓━━━━┃┗━┛┃┃┗┛┃┃┃┃┃━┃┗┓┃┃━┃┗┛┃┃┗┓━━━━┃┃━━━┃┃━┃┗┛┃┃┗┛┃┃┃━┃┗┛┗┓┃┃┃┃");
        System.out.println("┗┛━━━┗━━┛┗━━┛━┗━┛━━━━┗━━━┛┗━━┛┗┛┗┛━┗━┛┗┛━┗━━┛┗━┛━━━━┗┛━━━┗┛━┗━━┛┗━┓┃┗┛━┗━━━┛┗┻┻┛");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┏━┛┃━━━━━━━━━━━━");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┗━━┛━━━━━━━━━━━━");
        
        System.out.println("type help for help");
        //System.out.println("******");
    }
    
    boolean running = true;
    void imput(){
        String Command;
        while(running == true){//the while loop that deals with imput
            Command = scanner.nextLine();//each time the loop runs thrugh set command as the line enterd next. this givs a neer instant responce when a command in enterd
            Command = Command.toLowerCase();//set the string to lower case to deal with captlisation e.g. FoWaRD --> foward 
            switch (Command){
                case "pest" :
                    
                break;
                
                case "help" :
                    System.out.println("here is a list of commands:");
                    System.out.println("command place holder 1");
                    System.out.println("command place holder 2");
                    System.out.println("command place holder 3");
                break;
                
                case "end" :
                System.out.println("program terminated");
                running = false;
                break;
            }
        }   
    }
}
