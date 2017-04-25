package JavaOOPBasicsExam12March2017.races;

import JavaOOPBasicsExam12March2017.abstraction.Race;

/**
 * Created by Mihail on 3/12/2017.
 */
public class DragRace extends Race {

    private static final String RACE_TYPE = "Drag";

    public DragRace(int racesLength, String racesRoute, int racesPrizePool) {
        super(RACE_TYPE, racesLength, racesRoute, racesPrizePool);
    }
}



