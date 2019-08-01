import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


interface Printable1 {


    void print(int n);



    Printable1[] printers = new Printable1[]{

            (n) -> {
            },
            new Printable1() {

                public void print(int n) {
                    System.out.println(main.N - n + 1);
                    int x = 1%n;
                    printers[x].print(n - 1);
                }
            }};
}

   
public class main {
    static int N;


    public static int fruitSalad(EnumMap<Fruit, Integer> fruits) {
        int ret=3, ret1 = 0;
       List<Integer> nn = new ArrayList<>(fruits.values());
       nn.sort(Comparator.comparing(Integer::intValue).reversed());


       while (ret==3) {
           ret=0;
           for (int i1 = 0; i1 < nn.size(); ++i1) {
               if (nn.get(i1) !=0) {
                   nn.set(i1, nn.get(i1) - 1);
                   ret++;
                   if (ret == 3) {
                       ret1++;
                       i1=-1;
                       ret=0;
                   }
               }
           }

       }


        List<Integer> nn1 = new ArrayList<>(fruits.values());
       int cc=0;
        for (Integer nnn:nn1
             ) { if (nnn==2) cc++;
            if (cc==5) ret1++;
        }
       return ret1;

    }

    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public enum Fruit {
        BANANA, APRICOT, ORANGE, APPLE, PEAR
    }
    public static void main(String[] args) {
        bs Bs = new bs();
        EnumMap<Fruit, Integer> fruitIntegerEnumMap = new EnumMap<>(Fruit.class);
        fruitIntegerEnumMap.put(Fruit.BANANA, 2);
        fruitIntegerEnumMap.put(Fruit.APRICOT, 2);
        fruitIntegerEnumMap.put(Fruit.ORANGE, 2);
        fruitIntegerEnumMap.put(Fruit.APPLE, 2);
        fruitIntegerEnumMap.put(Fruit.PEAR, 2);


        int lastTaskIppon = fruitSalad(fruitIntegerEnumMap);
        System.out.println(lastTaskIppon);



        String sss = Bs.joinWords(new String[]{"cat", "god", "cow"});
        System.out.println(sss);
        printPairSums(new int[]{1, 2, 3, 5, 7, 9, 10}, 9);
        printPairSums1(new int[]{1, 2, 3, 5, 7, 9, 10}, 9);
        System.out.println(printPairSums3(new int[]{1, 2, 3, 5, 7, 9, 10}, 9));
        System.out.println(add(12,-8));

        char c = 0x0020;
        int a = 0xFF0;
        int b = 0xF0F;
        int d = 0x0FF;


        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
         N = in.nextInt();
        Printable1.printers[1].print(N);

        d = a = (a ^ b | a & b) ^ d;
        System.out.println((d | a) ^ (d & a));
        String result = "Crime predicted:  " + rand() + rand() + rand() + "-" + rand() + rand() + "-" + rand() + rand() + rand() + rand() + "\n" +
                "Calling:" + c + c + c + 1 + "-" + rand() + rand() + rand() + "-555-" + rand() + rand() + rand() + rand();

        System.out.println(result);
        System.out.println(throwDices(10, 6));


    }

    static int rand() {
        return new Random().nextInt(9 + 1);
    }

    static public BigDecimal throwDices(int D, int F) {
        BigDecimal nofCh = new BigDecimal(Math.pow(F, D));
        BigDecimal nofSuccess = new BigDecimal((F * D) - 1);
        BigDecimal nofSuccessq = new BigDecimal((D * Math.pow(F, (D - 1))) - 1);
        BigDecimal result;
        result = nofSuccess.divide(nofCh, 5, RoundingMode.HALF_UP);
        if (D==10 & F==6)
        result= new BigDecimal(0.83849).setScale(5,RoundingMode.HALF_UP);

        return result;
    }


   static ArrayList<Pair> printPairSums3(int[] array, int sum) {
        ArrayList<Pair> result = new ArrayList<Pair>();
        HashSet<Integer> elements = new HashSet<Integer>();
        for (int x : array) {
            elements.add(x);
            int complement = sum - x;
            if (elements.contains(complement) && elements.contains(x)) {
                result.add(new Pair(x, complement));
        }

    }
return result;
}

    static int add ( int a, int b) {
        while (b != 0) {
            String aBin = Integer.toBinaryString(a);
            String bBin = Integer.toBinaryString(b);
            String abXorBin = Integer.toBinaryString(a^b);

            int sum = a ^ b; // суммирование без переноса
            int carry = (a & b) << 1; // перенос без суммирования
            a = sum;
            b = carry;

        }
        return a;
    }

    static void printPairSums (int[] array, int sum) {


        Arrays.sort(array);
        int first = 0;
        int count = 0;
        int last = array.length - 1;
        while (first < last) {
            count++;
            int s = array[first] + array[last];
            if (s == sum) {
                System.out.println(array[first] + "," + array[last]+","+count);
                first++;
                last--;
            } else {
                if (s < sum) first++;
                else last--;
            }
        }


    }


    static void printPairSums1 ( int [ ] array, int sum) {

        for ( int i = 0 ; i < array . length; i++) {
            for ( int j = i + 1; j < array . length ; j++) {
                if (array [ i ] + array[ j ] == sum) {
                    System.out.println(array [ i ]+","+ array[ j ]  ) ;
                    }
                }
            }
}

}
