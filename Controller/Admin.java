package Controller;

import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import Model.TrainDatabase;
import Model.TrainInformation;

public class Admin {
    Scanner input=new Scanner(System.in);
    private static ArrayList<TrainInformation>trainlist=new ArrayList<>();
    public static void main(String[] args) throws SQLException {

        new Admin().addTrain();
       

    }
    public void addTrain() throws SQLException {
        System.out.println("Enter how many train");
        int no=input.nextInt();
        for (int i = 0; i < no; i++) {
            new Admin().createTrain();
        }
        System.out.println("Train successfully created");
    }
    public void createTrain() throws SQLException {
        System.out.println("Enter the Train number");
        int trainNo=input.nextInt();
        input.nextLine();
        System.out.println("Enter the train departure place");
        String departure=input.next();
        input.nextLine();
        System.out.println("Enter the train arrival place");
        String arrival=input.next();
        System.out.println("Enter the upper berth");
        int upperBerth=input.nextInt();
        System.out.println("Enter the lower berth");
        int lowerBerth=input.nextInt();
        System.out.println("Enter the middle berth");
        int middleBerth=input.nextInt();
        System.out.println("Enter the RAc berth");
        int racBerth=input.nextInt();
        System.out.println("Enter the waiting list");
        int waitingList=input.nextInt();
        System.out.println("Enter the upper berth");
        int upperberthCost=input.nextInt();
        System.out.println("Enter the lower berthCost");
        int lowerberthCost=input.nextInt();
        System.out.println("Enter the middle berthCost");
        int middleberthCost=input.nextInt();
        System.out.println("Enter the RAc berthCost");
        int racberthCost=input.nextInt();
        System.out.println("Enter the waiting list");
        int waitinglistCost=input.nextInt();
        
        trainlist.add(new TrainInformation(trainNo, departure,arrival, upperBerth, lowerBerth, middleBerth, racBerth, waitingList,upperberthCost,lowerberthCost,middleberthCost,racberthCost,waitinglistCost));
         new TrainDatabase().updateTrainlist(trainlist);
    }
    
}
