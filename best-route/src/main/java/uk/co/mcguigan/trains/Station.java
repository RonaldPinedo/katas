package uk.co.mcguigan.trains;

import static java.lang.Integer.MAX_VALUE;

public class Station implements Comparable<Station>  {
    private final String name;
    private Route[] getNextStations;
    private Integer minDistance;

    public Station(final String station) {
        name = station;
        minDistance = MAX_VALUE;
    }

    public String getName() {
        return name;
    }

    public Integer getMinimumDistance() {
        return minDistance;
    }

    public void setMinimumDistance(final Integer distance) {
        this.minDistance = distance;
    }

    public Route[] getNextStations() {
        return getNextStations;
    }

    public void setNextStations(final Route[] emanatingEdges) {
        this.getNextStations = emanatingEdges;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Station other) {
        return minDistance.compareTo(other.getMinimumDistance());
    }
}
