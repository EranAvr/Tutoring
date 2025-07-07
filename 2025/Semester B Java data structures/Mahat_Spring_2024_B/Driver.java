package Mahat_Spring_2024_B;

public class Driver {
    private String id;
    private String fullName;
    private String licenceNumber;
    private String birthDay;
    private int charges;
    private boolean isActive;

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public int getCharges() {
        return charges;
    }

    public boolean isActive() {
        return isActive;
    }

    public int getAge(){
        return 0;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public void setCharges(int charges) {
        this.charges = charges;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
