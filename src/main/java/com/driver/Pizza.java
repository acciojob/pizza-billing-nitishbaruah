package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int topping;
    private Boolean extraTopping;
    private Boolean extraCheese;
    private Boolean takeaway;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
            this.topping=70;
        }
        else {
            this.price=400;
            this.topping=120;
        }
        this.extraCheese=false;
        this.extraTopping=false;
        this.takeaway=false;
        System.out.println("Base Price Of The Pizza: "+price);

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheese) {
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        if(!extraTopping) {
            extraTopping = true;
        }
    }

    public void addTakeaway(){
        if(!takeaway) {
            takeaway = true;
        }
    }

    public String getBill(){
        String s="";
        int pizzaprice=price;
        if(extraCheese){
            s+="Extra Cheese Added: "+80+"\n";
            pizzaprice+=80;
        }
        if(extraTopping){
            s+="Extra Toppings Added: "+topping+"\n";
            pizzaprice+=topping;
        }
        if(takeaway){
            s+="Paperbag Added: "+20+"\n";
            pizzaprice+=20;
        }
        s+="Total Price: "+(price+topping+100)+"\n";
        return s;

    }

}
