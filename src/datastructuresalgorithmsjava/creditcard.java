public class CreditCard{

//instance variables
private String number;
private String name;
private String bank;
private double balance;
private int limit;

//Constructor
CreditCard(String no, String nm, String bk, double bal, int lim){
number=no;
name=nm;
bank=bk;
balance=bal;
limit=lim;
}

//Accessor Method
public String getNumber{return number;}
public String getName{return name;}
public String getBank{return bank;}
public double getBalance(){return balance;}
public int getLimit(){return limit;}

//Action methods
public boolean chargeIt(double price){ //Make a payment
if(price+balance>(double)limit)
return false;///there is not enough money left to charge it
balance += price;
return true;
}

public void makePayment(double payment){ //Make payment
balance -= payment;
}

public static void printCard(CreditCard c){//print a card's information
System.out.println("Number=" + c.getNumber());
System.out.println("Name=" + c.getName());
System.out.println("Bank=" + c.getBank());
System.out.println("Balance=" + c.getBalance()); //Implicit cast
}
}

