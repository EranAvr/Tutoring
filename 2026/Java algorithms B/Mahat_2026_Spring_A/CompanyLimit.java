package Mahat_2026_Spring_A;

public class CompanyLimit {
    private String companyName;
    private int companyLimit;


    public CompanyLimit(String companyName, int companyLimit) {
        this.companyName = companyName;
        this.companyLimit = companyLimit;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyLimit() {
        return companyLimit;
    }

    public void setCompanyLimit(int companyLimit) {
        this.companyLimit = companyLimit;
    }
}
