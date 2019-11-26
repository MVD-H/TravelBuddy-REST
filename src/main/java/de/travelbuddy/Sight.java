package de.travelbuddy;

import java.time.LocalDateTime;

public class Sight extends Place {

    private static int IDCounter;
    private int sightID;
    private boolean indoor;

    public Sight(int placeID, String name, Coordinates coordiantes, Adress adress, LocalDateTime arrive, LocalDateTime departure, Connection connectionToNextDestination, Expense expense, int sightID, boolean indoor) {
        super(placeID, name, coordiantes, adress, arrive, departure, connectionToNextDestination, expense);
        IDCounter++;
        this.sightID = IDCounter;
        this.indoor = indoor;
    }
}