package abstractClasses;

public abstract class Weather {
    private String wType; // wType = Weather Type
    private int wind;
    private int destruction;

    public Weather(int w, int d) {
        wind = w;
        destruction = d;
    }

    public String toString() {
        String str = "Weather Type: " + wType;

        return str;
    }

    public abstract void tClassification(int wind);

    public String getWType() {
        return wType;
    }

    public void setWType(String wType) {
        this.wType = wType;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public int getDestruction() {
        return destruction;
    }

    public void setDestruction(int destruction) {
        this.destruction = destruction;
    }
}
