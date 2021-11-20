package com.CoinToss;

public class Toss {

   double HEAD =1;
   double TAILS =1;
   double OUTCOMES =2;
   //int numberOfToss=0;

    public  double probabilityOfHead() {
        return HEAD / OUTCOMES;
    }

    public  double probabilityOfTails() {
        return TAILS / OUTCOMES;
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
