package Mahat_Summer_2023_A;

public class Hotel {
    private Room[] rooms;

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public int totalTime(int[] numArr){
        int total = 0;
        int countBabyBeds = 0;
        for (int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < rooms.length; j++) {
                if (numArr[i] == rooms[j].getNum()){
                    total += rooms[j].calcCleaningTime();
                    if (rooms[j] instanceof FamilyRoom && ((FamilyRoom) rooms[j]).isBabyBed())
                        countBabyBeds++;
                }

            }
        }
        System.out.println("Baby beds found: " + countBabyBeds);
        return total;
    }
}
