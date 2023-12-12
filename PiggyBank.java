public class PiggyBank{
    //gloabl variables
    int myQuarter;
    int myDime;
    int myNickel;
    int myPenny;
   
    double totalAmount;
   
    public PiggyBankL(){
        myQuarter = 0;
        myDime = 0;
        myNickel = 0;
        myPenny = 0;
       
        totalAmount = 0;
    }
   
   
    public PiggyBankL(int q, int d, int n, int p){
        myQuarter = q;
        myDime = d;
        myNickel = n;
        myPenny = p;
    }
   
    public int getQuarter(){
       return myQuarter;
    }
   
    public int getDime(){
        return myDime;
    }
    //type the rest
    public int getNickel(){
        return myNickel;
    }
   
    public int getPenny(){
        return myPenny;
    }
   

    public double quaterValue(){
        return myQuarter * .25;
    }
   
    public double dimeValue(){
        return myDime * .10;
    }
    //type the rest
    public double nickelValue(){
        return myNickel * .05;
    }
   
    public double pennyValue(){
        return myPenny * .01;
    }
   
    public double calculateTotal(){
        totalAmount = this.quaterValue() + this.dimeValue() + this.nickelValue() + this.pennyValue();
        return totalAmount;
    }
}
