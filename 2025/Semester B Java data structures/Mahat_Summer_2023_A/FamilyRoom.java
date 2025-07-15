package Mahat_Summer_2023_A;

public class FamilyRoom extends Room{
    private boolean babyBed;
    private boolean balcony;

    public boolean isBabyBed() {
        return babyBed;
    }

    @Override
    public int calcCleaningTime() {
        return super.calcCleaningTime() +
                (balcony ? 5 : 0) +
                (babyBed ? 5 : 0);
    }

}
