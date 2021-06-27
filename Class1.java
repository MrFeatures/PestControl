/**
 * @author Seton Spence
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
    String temp[];
    String pestList[] = new String[6];

    File pestDataFile = new File("PestData.csv");
    //File pestDataFile = new File();
    //File pestDataFile = new File();

    public Class1()
    {
        // initialise instance variables
        startUp();
        imput();
    }

    void startUp(){
        System.out.println("******");
        System.out.println("initiating file reading");
        try {
            Scanner reader = new Scanner (pestDataFile);
            int i = 0;
            while (reader.hasNextLine()){ 
                String nextLine = reader.nextLine();
                temp = nextLine.split(",");
                
                pestList[i] = temp[0];;
                System.out.println(Arrays.toString(temp));
                System.out.println(pestList[i]);
                System.out.println(Arrays.toString(pestList));
                i = i + 1;
            }
        } catch (IOException e) {System.out.println("file reading error (start up)");}

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
                String newPest;
                System.out.println("enter new pest");
                newPest = scanner.nextLine();
                newPest = newPest.toLowerCase();
                boolean pestCheck = Arrays.stream(pestList).anyMatch(newPest::equals);
                if (pestCheck == true){
                    pest = newPest;
                    System.out.println("pest is now set to " + pest);
                } else {
                    System.out.println("invalid pest entered");
                }
                
                break;
                //*********************************************************
                case "ammount of land" : case "land" :
                System.out.println("enter new ammount of land (m²)");
                land = scanner.nextInt();
                System.out.println("ammount of land is now set to " + land + "m²");
                break;
                //*********************************************************
                case "calculate" : case "go" :
                math();
                System.out.println("number of pests needed to kull per month to control population: ");
                System.out.println(kullNo);
                System.out.println("reccomended pest control method for population control:");

                System.out.println("number of pests needed to kull per month over a 12 month period to remove population:");
                break;
                //*********************************************************
                case "help" :
                System.out.println("here is a list of commands:");
                System.out.println("command place holder 1");
                System.out.println("command place holder 2");
                System.out.println("command place holder 3");
                System.out.println("end - kills program");
                System.out.println("type help [name of command] for more infomation on a command");
                break;
                //*********************************************************
                case "end" :
                System.out.println("program terminated");
                running = false;
                break;
                //*********************************************************
                case "findpest" :
                read();
                if (pestFound == true){
                    System.out.println("pest found");
                }else if (pestFound == false){
                    System.out.println("pest not found");
                }
                break;
                //*********************************************************
                case "test" :
                System.out.println("Current pest:");
                System.out.println(pest);
                System.out.println("Current ammount of land:");
                System.out.println(land);
                System.out.println(Arrays.toString(pestList));
                break;
                //*********************************************************
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
        try{
            Scanner reader = new Scanner (pestDataFile);
            pestFound = false;
            while (!pestFound && reader.hasNextLine()){
                String nextLine = reader.nextLine();
                pestData = nextLine.split(",");

                System.out.println("finding pest");
                System.out.println(pestData[0]);
                //System.out.println(Arrays.toString(pestData));
                if(pestData[0].equals(pest)){
                    pestFound = true;
                    //System.out.println("pestFound");
                }
            }
        } catch (IOException e) {System.out.println("file reading error");}

    }

    void math(){
    }
}
