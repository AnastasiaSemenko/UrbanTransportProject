package domain;

public class Station extends Entity{
    private String street;
    private int time_range;

    public Station(int id, String street, int time_range) {
        this.setId(id);
        this.street = street;
        this.time_range = time_range;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getTime_range() {
        return time_range;
    }

    public void setTime_range(int time_range) {
        this.time_range = time_range;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id=" + getId() +
                ", street='" + street + '\'' +
                ", time_range=" + time_range +
                '}';
    }
}
