package Mahat_Summer_2024_A;

public class Network {
    private College[] colleges;

    public void printInCity(String city){
        boolean printed = false;
        for (int i = 0; i < colleges.length; i++) {
            if ( colleges[i].getCity().equals(city) ){
                printed = true;
                System.out.println(colleges[i].getName());
            }
        }
        if (!printed)
            System.out.println("No colleges were found");
    }

    public String[] addNewMajor(int code){
        // לחפש בין כל המכללות שברשת
        // ולמצוא באיזו מכללה אין מקצוע עם הקוד הנתון
        String[] names = new String[80];
        int idx = 0;

        boolean hasEmpty = false;
        for (int i = 0; i < colleges.length; i++) {
            College c = colleges[i];

            for (int j = 0; j < c.getMajors().length; j++) {
                if (c.getMajors()[j].getCode() == code){
                    hasEmpty = false;
                    break;
                }
                if (c.getMajors()[j] == null)
                    hasEmpty = true;
            }
            if (hasEmpty == true){
                names[idx] = c.getName();
                idx++;
            }
        }
        if(idx == 0)
            return null;
        else
            return names;
    }
}
