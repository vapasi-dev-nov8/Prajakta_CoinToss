package com.CoinToss;

public class Toss {

   double head=1;
   double tails=1;
   double outcomes=2;
   //int numberOfToss=0;

    public  double probabilityOfHead() {
        return head/outcomes;
    }

    public  double probabilityOfTails() {
        return tails/outcomes;
    }

    public double probabilityOfEventOccurringTogether(){
        return probabilityOfHead()*probabilityOfTails();
    }

    public double probabilityOfEventNotOccurring(){
        return 1-probabilityOfHead();
    }

    public double probabilityOfEitherEventsOccurring(){

        return probabilityOfHead()+probabilityOfTails()-probabilityOfEventOccurringTogether();
    }
}
