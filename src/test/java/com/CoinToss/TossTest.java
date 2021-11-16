package com.CoinToss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TossTest {

    @Test
    void probabilityOfHeadInOneCoinToss(){
        Toss tossObj=new Toss();

        assertEquals(0.5,tossObj.probabilityOfHead());

    }

    @Test
    void probabilityOfTailsInOneCoinToss(){
        Toss tossObj=new Toss();

        assertEquals(0.5,tossObj.probabilityOfTails());

    }

    @Test
    void probabilityOfEventOccurringTogether(){
        Toss tossObj=new Toss();

        assertEquals(0.25,tossObj.probabilityOfEventOccurringTogether());

    }

    @Test
    void probabilityOfEventNotOccurring(){
        Toss tossObj=new Toss();

        assertEquals(0.5,tossObj.probabilityOfEventNotOccurring());

    }

    @Test
    void probabilityOfEitherEventsOccurring(){
        Toss tossObj=new Toss();

        assertEquals(0.75,tossObj.probabilityOfEitherEventsOccurring());

    }

}
