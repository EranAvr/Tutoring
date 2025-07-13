package Matkonet_July_2025;

public class Hotel {
    private Room[] rooms = new Room[200];

    public int checkIn(int type, int nights){
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomType() == type && rooms[i].getNights() == 0){
                rooms[i].setNights(nights);
                if (type == 1)
                    return nights * 300;
                if (type == 2)
                    return nights * 500;
            }
        }
        return -1;
    }
}
