/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine.models;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author rawan
 */
public class SnackMachine {
    final double [] coinsList = {0.10,0.20,0.50,1,20,50};
    private Hashtable <String,SnackItem> snackMachineHTable;
    private String KeyPaid;
    private double changes=0.00;
    int capacity=5;
 
    public SnackMachine() {
        /**
         * Initialize Snack Hash Table 
         */
        initializeSnackMachine();
        
    }

    void initializeSnackMachine(){
        this.snackMachineHTable = new Hashtable<>();
        
         /**
         * initialize HashTable 
         */
         
        this.snackMachineHTable.put("1",new SnackItem("item1","1",0.20,5));
        this.snackMachineHTable.put("2", new SnackItem("item2","2",0.10,5));
        this.snackMachineHTable.put("3",new SnackItem("item3","3",1.00,5));
        this.snackMachineHTable.put("4",new SnackItem("item4","4",0.50,5));
        this.snackMachineHTable.put("5",new SnackItem("item5","5",0.30,5));
               
        this.snackMachineHTable.put("6", new SnackItem("item6","6",1.00,1));
        this.snackMachineHTable.put("7",new SnackItem("item7","7",1.50,2));
        this.snackMachineHTable.put("8",new SnackItem("item8","8",1.20,3));
        this.snackMachineHTable.put("9",new SnackItem("item9","9",1.10,4));
        this.snackMachineHTable.put("10",new SnackItem("item10","10",1.80,4));
           
        this.snackMachineHTable.put("11",new SnackItem("item11","11",2.10,5));
        this.snackMachineHTable.put("12",new SnackItem("item12","12",2.20,5));
        this.snackMachineHTable.put("13",new SnackItem("item13","13",2.30,5));
        this.snackMachineHTable.put("14",new SnackItem("item14","14",2.40,5));
        this.snackMachineHTable.put("15",new SnackItem("item15","15",2.70,5));
        
        
        this.snackMachineHTable.put("16",new SnackItem("item16","16",3.00,5));
        this.snackMachineHTable.put("17",new SnackItem("item17","17",3.10,4));
        this.snackMachineHTable.put("18", new SnackItem("item18","18",3.20,3));
        this.snackMachineHTable.put("19", new SnackItem("item19","19",3.10,2));
        this.snackMachineHTable.put("20",new SnackItem("item20","20",3.00,1));
        
        this.snackMachineHTable.put("21",new SnackItem("item21","21",4.00,3));
        this.snackMachineHTable.put("22",new SnackItem("item22","22",3.50,3));
        this.snackMachineHTable.put("23",new SnackItem("item23","23",3.00,5));
        this.snackMachineHTable.put("24",new SnackItem("item24","24",2.50,4));
        this.snackMachineHTable.put("25",new SnackItem("item25","25",2.00,4));
               
        
    }
   
    
    
    public String purchased(String Key){
        
        if (changes == 0.00){
           return "NO COINS EXIST";
        }else if (!snackMachineHTable.containsKey(Key)) {
            return "INVALID KEY PAID";
        }else if(changes < snackMachineHTable.get(Key).getPrice()) {
          return "NOT ENOUGH MONEY";
        }else if (snackMachineHTable.get(Key).getAmount()==0){
          return "ITEM NOT EXIST";
        }else {
           SnackItem item = snackMachineHTable.get(Key);
           changes -= item.getPrice();
           item.setAmount(item.getAmount()-1);item.getAmount();
           return "SUCCESSFUL BUYING";
        }
        
       
    }
    public Hashtable<String, SnackItem> getSnackMachineHTable() {
        return snackMachineHTable;
    }

    public void setSnackMachineHTable(Hashtable<String, SnackItem> snackMachineHTable) {
        this.snackMachineHTable = snackMachineHTable;
    }

    public String getKeyPaid() {
        return KeyPaid;
    }

    public void setKeyPaid(String KeyPaid) {
        this.KeyPaid = KeyPaid;
    }

    public double getChanges() {
        return changes;
    }

    public void setChanges(double changes) {
        this.changes = changes;
    }
    
    
    
    
}
