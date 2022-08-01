import java.util.List;

public class Forest {

    private static String season;

    public List<MountainHare> hares;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String season) {
        Forest.season = season;

        if (season.equals("лето")) {
            MountainHare.setColor("серо-рыжий");
        } else {
            MountainHare.setColor("белый");
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }
}




