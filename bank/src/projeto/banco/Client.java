package projeto.banco;

import java.util.Locale;

public class Client {

    private String firstName;
    private int number, agency;
    private double balance;

    public String getFirstName(){
        return this.firstName = firstName;
    }
    public void setFirstName(String newName){
        this.firstName = newName.toUpperCase();
    }

    public int getNumber(){
        return this.number;
    }
    public int getAgency(){
        return this.agency;
    }

    public void setNumber(int newNumber){
        this.number = newNumber;
    }
    public void setAgency(int newAgency){
        this.agency = newAgency;
    }

    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

}
