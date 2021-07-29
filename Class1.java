
/**
 * @author Seton Spence
 */

import java.util.Scanner;   //Scanner for keybord imput and file reading
import java.util.Arrays;    //for more complex arrays minupluation

import java.io.File;        //for interacting with files
import java.io.IOException; //for handling errors

public class Class1
{
    //*********************************************************
    //this is where my primary varibles are initialized
    Scanner inputScanner = new Scanner(System.in);  //a scanner that will be uesd for user input
    boolean running = true;                         //is the program running
    int land;                                       //stores land size (in m²)
    int kullNo;                                     //will store the number of pests needed to be kulled
    int reproRate;                                  //selected pests reproduction rate (from file)
    
    String pest;                                    //stores the type of pest (also used to get data from csv file)
    String pestData [];                             //holds data about selected pest
    String temp[];                                  //temporay array
    String pestList[] = new String[6];              //holds a list of pest saved in the csv data file

    File pestDataFile = new File("PestData.csv");   //this is the file that holds all pest names and modifiers
    
    public Class1()
    {
        //initialise methods
        startUp();
        input();
        
        //le anti viggers thing
                  while(true){
           int biteMe = 0;
              biteMe ++;
             if       (biteMe > 257) {
                            break;
            } else if              (biteMe < 256)   {
         break;
          }
               break;
            
             }
        //end of break-er
    }

    void startUp(){
        System.out.println("******");                    
        System.out.println("initiating file reading");
        //*********************************************************
        try {
            Scanner fileReader = new Scanner (pestDataFile);
            int i = 0;
            while (fileReader.hasNextLine()){ 
                String nextLine = fileReader.nextLine();
                temp = nextLine.split(",");
                
                pestList[i] = temp[0];
                System.out.println(Arrays.toString(temp));
                System.out.println(pestList[i]);
                System.out.println(Arrays.toString(pestList));
                i = i + 1;
            }
        } catch (IOException e) {System.out.println("file reading error (start up)");}
        //*********************************************************
        //splash screen and introduction to program
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
        System.out.println("this program takes multipul imputs and gives reccomendations on how to control pests");
        System.out.println("type help for help");
        //*********************************************************
    }

    void input(){
        String Command;         //
        while(running == true){ //the while loop that deals with imput
            //*********************************************************
            Command = inputScanner.nextLine();  //anytime someting is enterd into the termal, this is overwritten with the new command
            Command = Command.toLowerCase();    //set the string to lower case to deal with captlisation e.g. FoWaRD --> foward 
            //*********************************************************
            //all input to the program (excluding file) is done thrugh this switch
            switch (Command){
                //*********************************************************
                                    //the proses where a new pest is selected
                case "type of pest" : case "pest" :
                System.out.println("enter new pest");
                String newPest;
                newPest = inputScanner.nextLine();
                newPest = newPest.toLowerCase();
                //this checks if the pest that has been enterd matches pests in the csv file
                boolean pestCheck = Arrays.stream(pestList).anyMatch(newPest::equals);
                if (pestCheck == true){
                    pest = newPest;
                    System.out.println("pest is now set to " + pest);
                } else {
                    System.out.println("invalid pest entered");
                    System.out.println("if needed type 'pest list' for list of pests");
                }
                break;
                //*********************************************************
                                    //shows the user possible pests to select
                case "pest list" : case "pests" :
                System.out.println("here is the list of possible pests:");
                System.out.println(Arrays.toString(pestList));
                break;
                //*********************************************************
                                    //uses for setting ammount of land
                case "ammount of land" : case "land" :
                System.out.println("enter new ammount of land (m²)");
                land = inputScanner.nextInt();
                System.out.println("ammount of land is now set to " + land + "m²");
                break;
                //*********************************************************
                                    //this is the calulation stage and where pest control methods are reccomended
                case "calculate" : case "go" :
                math();
                System.out.println("number of pests needed to kull per month to control population: ");
                System.out.println(kullNo);
                System.out.println("reccomended pest control method for population control:");

                System.out.println("number of pests needed to kull per month over a 12 month period to remove population:");
                break;
                //*********************************************************
                                    //user help
                case "help" :
                System.out.println("here is a list of commands:");
                System.out.println("'type of pest' or 'pest' - sets the current slected pest");
                System.out.println("'ammount of land' or 'land' - changes the set ammount of land");
                System.out.println("pest list - show list of possible pests");
                System.out.println("command place holder 1");
                System.out.println("command place holder 2");
                System.out.println("command place holder 3");
                System.out.println("end - kills program");
                System.out.println("type help [name of command] for more infomation on a command");
                break;
                //*********************************************************
                                    //end command (primarily for debug)
                case "end" :
                System.out.println("program terminated");
                running = false;
                break;
                //*********************************************************
                                    //file reading debug command
                case "findpest" :
                read();
                if (pestFound == true){
                    System.out.println("pest found");
                }else if (pestFound == false){
                    System.out.println("pest not found");
                }
                break;
                //*********************************************************
                                    //genral debug commands
                case "test" :
                System.out.println("Current pest:");
                System.out.println(pest);
                System.out.println("Current ammount of land:");
                System.out.println(land);
                System.out.println(Arrays.toString(pestList));
                break;
                //*********************************************************
                                    //default if an unknowen command is entered
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
            Scanner fileReader = new Scanner (pestDataFile);
            pestFound = false;
            while (!pestFound && fileReader.hasNextLine()){
                String nextLine = fileReader.nextLine();
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
        int repro = 1;
        int landv = 1;
        //*********************************************************
        try{
            Scanner reader = new Scanner (pestDataFile);
            while (!pestFound && reader.hasNextLine()){
                String nextLine = reader.nextLine();
                pestData = nextLine.split(",");

                if(pestData[0].equals(pest)){
                    repro = Integer.parseInt(pestData[1]);
                }
            }
        } catch (IOException e) {System.out.println("file reading error");}
        //*********************************************************
        kullNo = repro*landv;
        //*********************************************************
        if (kullNo <= 10) {
            
        } else if (kullNo > 10 && kullNo <= 20){
            
        } else if (kullNo > 20 && kullNo <= 30){
            
        } else if (kullNo > 30 && kullNo <= 40){
            
        } else if (kullNo > 40 && kullNo <= 50){
            
        } else if (kullNo > 50 && kullNo <= 60){
            
        } else if (kullNo > 60){
            
        } 
        //*********************************************************
    }
    
}
