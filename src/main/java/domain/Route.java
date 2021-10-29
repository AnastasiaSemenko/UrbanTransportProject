package domain;

import java.util.ArrayList;

public class Route extends Entity{
    private Transport transport;
    private ArrayList<Station> stations;

    public Route(int id, Transport transport, ArrayList<Station> stations) {
        this.setId(id);
        this.transport = transport;
        this.stations = stations;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public ArrayList<Station> getStations() {
        return stations;
    }

    public void setStations(ArrayList<Station> stations) {
        this.stations = stations;
    }

    @Override
    public String toString() {
        return "Route{" +
                "id=" + getId() +
                "transport=" + transport +
                ", stations=" + stations +
                '}';
    }
}
