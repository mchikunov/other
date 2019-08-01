import java.util.HashMap;
import java.util.Map;

public class Korobka {
    private static Map<Integer, Character> korobka;
    public static void main(String[] args) {
        korobka = new HashMap<>();
        String bykvy = "абвгдежзиклмнопрстуфхцчьшщъэюя";
        int strlong = bykvy.length();
        for (int i=0; i<bykvy.length(); i++){
            korobka.put(i+1, bykvy.charAt(i));
        }
        System.out.println(strlong);
        korobka.forEach((x, y) -> System.out.println("Номер буквы "+x+" Буква "+y));

    }


}

