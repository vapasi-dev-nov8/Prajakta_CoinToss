package com.CoinToss;

import java.util.Objects;

public class Probability {
    double OUTCOME=2;
    double FAVOURABLE_OUTCOMES=1;
    double probability;

    public Probability(double OUTCOME, double FAVOURABLE_OUTCOMES) {
        this.OUTCOME = OUTCOME;
        this.FAVOURABLE_OUTCOMES = FAVOURABLE_OUTCOMES;
        this.probability= probabilityOfFavourableOutcome().probability;
    }

    public Probability(double probability) {
        this.probability = probability;
    }

    public  Probability probabilityOfFavourableOutcome() {
        return new Probability( FAVOURABLE_OUTCOMES / OUTCOME);
    }

    public Probability probabilityOfEventOccurringTogether(Probability favourableOutcome1,Probability favourableOutcome2){

        return new Probability(favourableOutcome1.probability* favourableOutcome2.probability);
    }

    public Probability probabilityOfEventNotOccurring(Probability favourableOutcome){

        return new Probability( 1- favourableOutcome.probability);
    }

    public Probability probabilityOfEitherEventsOccurring(Probability favourableOutcome1,Probability favourableOutcome2,Probability eventOccurringTogether){

        return new Probability(favourableOutcome1.probability+ favourableOutcome2.probability- eventOccurringTogether.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.OUTCOME, OUTCOME) == 0 && Double.compare(that.FAVOURABLE_OUTCOMES, FAVOURABLE_OUTCOMES) == 0 && Double.compare(that.probability, probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(OUTCOME, FAVOURABLE_OUTCOMES, probability);
    }

    @Override
    public String toString() {
        return "Probability{" +
                "OUTCOME=" + OUTCOME +
                ", FAVOURABLE_OUTCOMES=" + FAVOURABLE_OUTCOMES +
                ", probability=" + probability +
                '}';
    }
}
