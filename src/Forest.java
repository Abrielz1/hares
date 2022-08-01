import java.util.List;

public class Forest {



    private static String season;

   public static List<MountainHare> hares;
    public Forest(List<MountainHare> hares) {
        hares = hares;
    }
    public static String getSeason() {
        return season;
    }

    public static void setSeason(String season) {
        Forest.season = season;

        if (season.equals("лето")) {
            MountainHare.setColor("серо-рыжий");
        } else {
            MountainHare.setColor("белый");
        }
    }

    public static void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}




