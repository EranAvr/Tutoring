package Mahat_2026_Spring_A;

public class CompanyCar {
    private String licensePlate;
    private String manufacturer;
    private String company;

    public CompanyCar(String licensePlate, String manufacturer, String company) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.company = company;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
