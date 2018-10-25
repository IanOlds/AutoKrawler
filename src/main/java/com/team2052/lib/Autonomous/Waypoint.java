package com.team2052.lib.Autonomous;

/**
 * Created by KnightKrawler on 10/24/2018.
 */
public class Waypoint {

    public Position2d position;
    public double velocity;
    public double curvature;

    /**
     *
     * @param position in inches
     * @param velocity in inches per second
     */
    public Waypoint(Position2d position, double velocity){
        this.position = position;
        this.velocity = velocity;
    }
}
