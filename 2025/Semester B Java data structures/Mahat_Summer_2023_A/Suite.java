package Mahat_Summer_2023_A;

public class Suite extends Room{
    private boolean jacuzzi;

    @Override
    public int calcCleaningTime() {
        return super.calcCleaningTime() +
                (jacuzzi ? 20 : 0) +
                15;
    }

    @Override
    public int floorAndDust() {
        return 20;
    }
}
