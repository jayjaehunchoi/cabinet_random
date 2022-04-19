import java.util.ArrayList;
import java.util.List;

public class Cabinet {

    private final int number;

    public Cabinet(int number) {
        this.number = number;
    }

    public static List<String> allocate(String names) {
        List<String> cabinets = new ArrayList<>();
        for (int i = 0; i < 108; i++) {
            cabinets.add("X");
        }

        List<String> crews = Crews.names;
        String[] nameAndNumbers = names.split(",");
        for (String nameAndNumber : nameAndNumbers) {
            String[] infos = nameAndNumber.split(":");
            int number = Integer.parseInt(infos[0]);
            String name = infos[1];

            cabinets.add(number, name);
            cabinets.remove(number + 1);
            crews.remove(name);
        }

        System.out.println(crews);
        int idx = 0;
        for (int i = 1; i < cabinets.size(); i++) {
            if (i % 27 == 0) {
                continue;
            }
            if (cabinets.get(i).equals("X")) {
                cabinets.add(i, crews.get(idx++));
                cabinets.remove(i + 1);
            }
            if (idx == 76) {
                break;
            }
        }

        cabinets.add("조커 " + crews.get(76));
        return cabinets;

    }
}
