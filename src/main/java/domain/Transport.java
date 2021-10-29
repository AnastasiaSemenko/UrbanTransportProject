package domain;

import domain.enums.TransportType;

public class Transport extends Entity{
    private TransportType type;
    private int number;
    private int interval;

    public Transport(int id,TransportType type, int number, int interval) {
        this.setId(id);
        this.type = type;
        this.number = number;
        this.interval = interval;
    }

    public TransportType getType() {
        return type;
    }

    public void setType(TransportType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + getId() +
                ", type=" + type +
                ", number=" + number +
                ", interval=" + interval +
                '}';
    }
}
