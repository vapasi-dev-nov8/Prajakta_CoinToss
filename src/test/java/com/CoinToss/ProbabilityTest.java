package com.CoinToss;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProbabilityTest {

    @Test
    public void shouldCheckProbabilityOfHeadsAndTailsIsSame(){
        //Given
        Probability heads=new Probability(2,1);

        //When
        Probability tails=new Probability(2,1);

        //Expected
        assertEquals(heads,tails);
        //assertEquals(heads.probabilityOfFavourableOutcome(),tails.probabilityOfFavourableOutcome());

    }

    @Test
    public void shouldCheckProbabilityOfEventOccurringTogether(){
        //Given
        Probability heads=new Probability(2,1);
        Probability tails=new Probability(2,1);

        //When
        Probability eventsOccurringTogether=new Probability(2,1);

        //Expected
        assertEquals(new Probability(0.25),eventsOccurringTogether.probabilityOfEventOccurringTogether(heads,tails));

    }

    @Test
    void shouldCheckProbabilityOfEventNotOccurring(){
        //Given
        Probability heads=new Probability(2,1);

        //When
        Probability eventsNotOccurringTogether=new Probability(2,1);

        //Expected
        assertEquals(new Probability(0.5),eventsNotOccurringTogether.probabilityOfEventNotOccurring(heads));

    }

    @Test
    void shouldCheckProbabilityOfEitherEventsOccurring(){
        //Given
        Probability heads=new Probability(2,1);
        Probability tails=new Probability(2,1);

        //When
        Probability eventsOccurringTogether=heads.probabilityOfEventOccurringTogether(heads,tails);

        //Expected
        assertEquals(new Probability(0.75),eventsOccurringTogether.probabilityOfEitherEventsOccurring(heads,tails,eventsOccurringTogether));

    }
}
