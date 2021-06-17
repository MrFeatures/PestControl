/**
 *
 * @author Seton Spence
 * @version 0.1
 */

import java.util.Scanner;   //Scanner for keybord imput and file reading
import java.util.Arrays;

import java.io.File;        //for interacting with files
import java.io.IOException; //for handling errors

public class Class1
{
    boolean running = true;//is the program running
    int land;           //stores land size (in m²)
    String pest;        //stores the type of pest 
    Scanner scanner = new Scanner(System.in);//create a scanner
    int kullNo;
    String pestMe;
    int reproRate;      
    String pestData [];
    
    File pestDataFile = new File();
    File pestDataFile = new File();
    File pestDataFile = new File();

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
        System.out.println("┃┃━━━┃┗━┫┣━━┃━┃┗┓━━━━┃┗━┛┃┃┗┛┃┃┃┃┃━┃┗┓┃┃━┃┗┛┃┃┗┓━━━━┃┃━━━┃┃━┃┗┛┃┃┗┛┃┃┃━┃┗┛┗┓┃┃┃┃");
        System.out.println("┗┛━━━┗━━┛┗━━┛━┗━┛━━━━┗━━━┛┗━━┛┗┛┗┛━┗━┛┗┛━┗━━┛┗━┛━━━━┗┛━━━┗┛━┗━━┛┗━┓┃┗┛━┗━━━┛┗┻┻┛");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┏━┛┃━━━━━━━━━━━━");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┗━━┛━━━━━━━━━━━━");
        System.out.println("Welcome to a pest control program");
        System.out.println("created by Seton Spence");
        System.out.println("this program takes multipul imputs and givs reccomendations on how to control pests");
        System.out.println("type help for help");
        //System.out.println("******");
    }
    
    void imput(){
        String Command;
        while(running == true){//the while loop that deals with imput
            Command = scanner.nextLine();//each time the loop runs thrugh set command as the line enterd next.
            Command = Command.toLowerCase();//set the string to lower case to deal with captlisation e.g. FoWaRD --> foward 
            switch (Command){
                case "type of pest" : case "pest" :
                    
                break;
                
                case "ammount of land" : case "land" :
                    
                break;
                
                case "calculate" : case "go" :
                    math();
                    System.out.println("number of pests needed to kull per month to control population: ");
                    System.out.println(kullNo);
                    System.out.println("reccomended pest control method for population control:");
                    
                    System.out.println("number of pests needed to kull per month over a 12 month period to remove population:");
                break;
                
                case "help" :
                    System.out.println("here is a list of commands:");
                    System.out.println("command place holder 1");
                    System.out.println("command place holder 2");
                    System.out.println("command place holder 3");
                    System.out.println("end - kills program");
                    System.out.println("type help [name of command] for more infomation on a command");
                break;
                
                case "end" :
                System.out.println("program terminated");
                running = false;
                break;
                
                default :
                System.out.println("unknown command");
                break;
            }
        }   
    }
    
    void write(){
        
    }
    
    
    boolean pestFound = false;
    void read(){
        pestFound = false;
        
        while (!pestFound && file.hasNextline()){
            String nextLine = file.nextLine();
            pestData = line.split(",");
            
            if(pestData[0] == pest){
                pestFound = true;
            }
        }
        
        
        
    }
    
    void math(){
        
    }
}
