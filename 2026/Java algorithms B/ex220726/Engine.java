package ex220726;

import java.time.DateTimeException;
import java.util.Date;

public class Engine {
    private int volume;
    private String type;
    private boolean isTurbo;
    private Date lastCare;

    public Engine() {
        this.volume = 0;
        this.type = "";
        this.isTurbo = false;
        this.lastCare = null;
    }

    public Engine(int volume, String type, boolean isTurbo, Date lastCare) {
        this.volume = volume;
        this.type = type;
        this.isTurbo = isTurbo;
        this.lastCare = lastCare;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTurbo() {
        return isTurbo;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }

    public Date getLastCare() {
        return lastCare;
    }

    public void setLastCare(Date lastCare) {
        this.lastCare = lastCare;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", type='" + type + '\'' +
                ", isTurbo=" + isTurbo +
                ", lastCare=" + lastCare +
                '}';
    }
}
