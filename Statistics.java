import java.io.*;
import java.util.Scanner;

public class Statistics {
    private int[] myData = new int[1000];
    private int myHowMany;
    
    public Statistics(String fileName) {
        myHowMany = 0;
        loadFile(fileName);
    }
    
    public void loadFile(String fileName) {
        int index = 0;
        Scanner inFile;
        
        try {
            inFile = new Scanner(new File(fileName));
            while(inFile.hasNext()) {
                myData[index] = inFile.nextInt();
                index++;
            }
        } catch(IOException i) {
            System.out.println("Error: " + i.getMessage());
        }
        myHowMany = index;
    }
    
    public double findAverage(int[] myData) {
        int sum = 0;
        for (int i = 0; i < myHowMany; i++) {
            sum += myData[i];
        }
        return sum / (double) myHowMany;
    }
    
    public double findStandardDeviation(int[] myData) {
        double average = findAverage(myData);
        double sum = 0;
        for (int i = 0; i < myHowMany; i++) {
            sum += Math.pow(myData[i] - average, 2);
        }
        return Math.sqrt(sum / (myHowMany - 1));
    }
     
    public double findMode(int[] myData) {
        int maxFrequency = 0;
        int mode = myData[0];
        
        for (int i = 0; i < myHowMany; i++) {
            int currentFrequency = 0;
            for (int j = 0; j < myHowMany; j++) {
                if (myData[i] == myData[j]) {
                    currentFrequency++;
                }
            }
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;  
                mode = myData[i];
            }
        }
        
        return mode;
    }
    
    public void printAll() {
        double average = findAverage(myData);
        double standardDeviation = findStandardDeviation(myData);

        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
         System.out.println("Mode: " + findMode(myData));
        System.out.println("By: Aidan Zap");
    }
}
