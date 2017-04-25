package JavaOOPBasicsExam12March2017.abstraction;

import java.util.*;

/**
 * Created by Mihail on 3/12/2017.
 */
public abstract class Race {

    private String racesType;
    private int racesLength;
    private String racesRoute;
    private int racesPrizePool;
    private Map<String, Car> racesCars;

    public Race(String racesType, int racesLength, String racesRoute, int racesPrizePool) {
        this.racesType = racesType;
        this.racesLength = racesLength;
        this.racesRoute = racesRoute;
        this.racesPrizePool = racesPrizePool;
        this.racesCars = new HashMap<>();
    }

    public Map<String, Car> getRacesCars() {
        return Collections.unmodifiableMap(this.racesCars);
    }



}
