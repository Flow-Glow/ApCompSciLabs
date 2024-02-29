import java.io.*;
import java.util.Scanner;

public class Compact {
    private int[] myData = new int[100];
    private int myHowMany;
    
    public Compact(String fileName) {
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
    
    public void compact() {
        int i = 0;
        while (i < myHowMany) {
            if (myData[i] == 0) {
                for (int j = i; j < myHowMany - 1; j++) {
                    myData[j] = myData[j+1];
                }
                myHowMany--;
            }
            else {
                i++;
            }
        }
    }
    
    public void print() {
        for (int i = 0; i < myHowMany; i++) {
            System.out.print(myData[i] + " ");
        }
        System.out.println();
    }
}
