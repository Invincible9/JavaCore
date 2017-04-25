package JavaOOPBasicsExam12March2017.races;

import JavaOOPBasicsExam12March2017.abstraction.Race;

/**
 * Created by Mihail on 3/12/2017.
 */
public class CasualRace extends Race {

    private static final String RACE_TYPE = "Casual";

    public CasualRace(int racesLength, String racesRoute, int racesPrizePool) {
        super(RACE_TYPE, racesLength, racesRoute, racesPrizePool);
    }

}
