package com.company;


import javafx.util.Pair;
import sun.misc.Unsafe;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws Exception {
      test();
        //System.out.println(" *\n ***\n*****\n ***\n *\n");
        //System.out.println(rangeExtrsaction(new int[] {-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        //System.out.println(isMerge("codewars", "cdwr", "oeas"));
        //checl();
      /*  int a=1;
        int day=1;
        int year=0;
        int b=10;
        while (a<168775){
            if (day%30==0)b+=10;
            Thread.sleep(100);
            System.out.printf("Год-%d\nДень-%d\nБольных-%d",year,day,a);
            a+=1+a/b;
            day++;
            if (day>=364){
                year++;
                day=0;
            }
        }*/

        /*for (int i = 0; i < ts.size(); i++) {
            for (int j = 0; j < ts.size(); j++) {
                for (int k = 0; k < ts.size(); k++) {
                    list.add(ts.get(i)+ts.get(j)+ts.get(k));
                }
            }
        }
        System.out.println(list);*/
        //System.out.println(best_travel.chooseBestSum(230,3,ts));
        //System.out.println(best_travel.parseInt("one million"));
                long time= System.currentTimeMillis();
               /*Primes.stream().forEach(prime->{
                    for (int i = 2; i <=Math.sqrt(prime) ; i++) {
                        if (prime%i==0)throw new RuntimeException("NON PRIME DESU:"+prime + "$"+i);
                    }
                });*/
           // System.out.println(Primes.stream().count());
            //Primes.stream();
//            Pi.getPi();
//        System.out.println((System.currentTimeMillis()-time)/1000);

      /*  time = System.currentTimeMillis();
        System.out.println(Test.optimizedSieve().count());
        System.out.println((System.currentTimeMillis() - time) / 1000);
        System.out.println("Ero");*/
        /*Test.isPrime=new boolean[1];
        System.gc();
        Thread.sleep(10000);
       time=System.currentTimeMillis();
        Test.primeSieve();
        System.out.println((System.currentTimeMillis()-time)/1000);
        System.out.println("indian");
*/
    }
    public static void square(int[]a){
        a[0]*=a[0];
    }
    public static void test() throws NoSuchFieldException, IllegalAccessException {

        int N = 7; // N times we do binary search to approximate values
        System.out.printf("N is %d\n",N);
        double x_=180d/Math.pow(2,N);  // delta x
        double y_=360d/Math.pow(2,N); // delta y
        long count=0;
        Cl c=new Cl(Integer.MAX_VALUE-5);
      for (double x=-90d;x<=90;x+=x_){
          for (double y=-180d;y<=180;y+=y_){
              //int hash = Objects.hash(x,y); //
              count++;
             // String s = x+","+y;
           //   System.out.println(s);
              c.set(Objects.hash(x,y),(byte)1);
             // geo.put(hash,new Pair<>(x,y));
          }
      }
        System.out.println(count);
        Scanner sc= new Scanner(System.in);
        int sentinel = -1;
        while (true){
            int a=sc.nextInt();
            if(a ==sentinel)break;
            double latitude = Math.random()*180-90;  //used for test purpose
            double longitude = Math.random()*360-180;
            System.out.printf("Latitude is %f\nLongitude is %f\n",latitude,longitude); //
            int counter=0;
            double lower=-90d;
            double upper=90d;
            while (counter++<N){
                if (latitude>(lower+upper)/2){
                    lower= (lower+upper)/2;
                }
                else {
                    upper=(lower+upper)/2;
                }
            }

            System.out.printf("(latitude)Lower for is %f\nUpper is %f\n",lower,upper);
            double x2= upper;



             counter=0;
             lower=-180d;
             upper=180d;
            while (counter++<N){
                if (longitude>(lower+upper)/2){
                    lower= (lower+upper)/2;
                }
                else {
                    upper=(lower+upper)/2;
                }
            }

            System.out.printf("(longitude) Lower for is %f\nUpper is %f\n",lower,upper);
            double y2=upper;
            double dop = -90d;
            System.out.println(Objects.hash(x2,y2));// not always give corect reslut coz hash map takes hash of hash value
            System.out.println(c.get(Objects.hash(x2,y2))==1?"Found":"Not found");
            // result can be checked by loop with increment 180/2^n for lat
            // and 360/2^n for long


        }
    }

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        // your code here
        String[] st = {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        Arrays.sort(st, (o1, o2) -> {
            String[] o11 = o1.split(" ");
            String[] o22 = o2.split(" ");
            return o11[0].compareTo(o22[0]);
        });
        System.out.println(Arrays.toString(st));
        if (lstOfArt == null || lstOf1stLetter == null) return "";
        HashMap<Character, Integer> result = new HashMap<>();
        Arrays.sort(lstOfArt);
        Arrays.sort(lstOf1stLetter);
        int a = 0;
       /* for (int i = 0; i < lstOf1stLetter.length; i++) {
            int sum=0;
            while (lstOf1stLetter[i].equals(lstOfArt[a])){
                a++;
            }

        }*/
        return "";
    }

    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static String print(int n) {
        if (n % 2 == 0 || n < 1) return null;
        char space = ' ';
        StringBuilder builder = new StringBuilder();
        for (int a = 0; a <= (n / 2) - 1; a++) {
            StringBuilder line = new StringBuilder();
            for (int x = 0; x < n / 2 + 1; x++) {
                if (x < n / 2 - a) line.append(space);
                else line.append('*');
            }
            String s = line.toString().substring(0, line.length() - 1);
            line.append(new StringBuilder(s).reverse().toString().replace(" ", "X"));

            builder.append(line).append("\n");
        }
        String top = builder.toString();
        builder = new StringBuilder(builder.toString().replace("X", ""));
        for (int a = 0; a < n; a++) builder.append("*");
        top = new StringBuilder(top).reverse().toString();
        top = top.replace(" ", "");
        top = top.replace("X", " ");
        builder.append(top);
        return builder.toString();

    }

    /*public static String revRot(String strng, int sz) {
        if(strng==null||strng.equals("")||sz>strng.length())return "";
        else return strng.substring(0,sz);
    }*/
    public static double findUniq(double arr[]) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (Objects.hashCode(arr[i]) != Objects.hashCode(arr[i - 1]) && (Objects.hashCode(arr[i]) != Objects.hashCode(arr[i + 1])))
                return arr[i];
        }
        if (Objects.hashCode(arr[0]) == Objects.hashCode(arr[1])) return arr[arr.length - 1];
        return arr[0];
    }

    /*public static int greedy(int[] dice){
        Arrays.sort(dice);
        int sum=0;
        if (dice[0]==1&&dice[1]==1)sum+=1000;

    }*/
    public static boolean validate(String n) {
        char[] numbers = n.toCharArray();
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int a = Character.getNumericValue(numbers[i]);
            if ((n.length() % 2 == 0 && i % 2 != 0) || (n.length() % 2 != 0 && i % 2 == 0))
                a = a * 2 > 9 ? a * 2 - 9 : a * 2;
            sum += a;
        }
        return sum % 10 == 0;
    }

    public static String convertFrac(long[][] lst) {
        StringBuilder builder = new StringBuilder();
        Stack<long[]> stack = new Stack<>();
        long LCD = 1;
        Arrays.stream(lst).forEach(l -> {
            long gcd = gcd(l[0], l[1]);
            stack.push(new long[]{l[0] / gcd, l[1] / gcd});
        });
        while (stack.size() > 1) {
            long a = stack.pop()[1];
            long b = stack.pop()[1];
            stack.push(new long[]{1, lcm(a, b)});
        }
        if (stack.size() == 0) return "";
        LCD = stack.peek()[1];
        for (long[] a : lst) {
            builder.append("(").append(a[0] * LCD / a[1]).append(",").append(LCD).append(")");
        }
        return builder.toString();
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static String rangeExtrsaction(int[] arr) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < arr.length; ) {
            if (i < arr.length - 2 && arr[i] - arr[i + 1] == -1 && arr[i + 1] - arr[i + 2] == -1) {
                builder.append(arr[i]).append("-");
                while (i < arr.length - 1 && arr[i] - arr[i + 1] == -1) {
                    i++;
                }
                builder.append(arr[i++]).append(",");
            } else {
                builder.append(arr[i++]).append(",");
            }
        }
        return builder.delete(builder.length() - 1, builder.length()).toString();
    }

    public static boolean isMerge(String s, String part1, String part2) {
        if (part1.length() + part2.length() != s.length()) return false;
        if (s.length() <= 0) return true;
        if (part1.toCharArray()[0] == s.toCharArray()[0] && isMerge(s.substring(0, 1), part1.substring(0, 1), part2)) {
            return true;
        }

        if (part2.toCharArray()[0] == s.toCharArray()[0] && isMerge(s.substring(0, 1), part1, part2.substring(0, 1))) {
            return true;
        }

        return false;
    }

    static int find(int[] integers) {
        if (integers[0] % 2 == 0 && integers[1] % 2 == 0) for (int i = 1; i < integers.length; i++) {
            if (integers[i] % 2 != 0) return integers[i];
        }
        else if (integers[0] % 2 != 0 && integers[1] % 2 != 0) for (int i = 1; i < integers.length; i++) {
            if (integers[i] % 2 == 0) return integers[i];
        }
        return integers[0];
    }

    static void checl() throws Exception {
        Random random = new Random();
        man[] men = new man[10000000];
        HashSet<man> sick = new HashSet<>();
        for (int a = 0; a < 10000000; a++) {
            men[a] = new man((short) random.nextInt(90));
        }
        man first = men[random.nextInt(10000000)];
        first.sick = true;
        sick.add(first);
        int day = 0;
        int year = 0;
        while (true) {
            System.out.printf("Год-%d\nДень-%d\nБольных-%d", year, day, sick.size());
            Thread.sleep(10);
            day++;
            if (day >= 365) {
                year++;
                day = 0;
            }
            Iterator<man> id = sick.iterator();
            while (id.hasNext()) {
                try {
                    man Man = id.next();
                    if (!Man.isAlive) continue;
                    Man.days_sick++;
                    if (Man.days_sick > 14) {
                        for (int i = 0; i < 1000; i++) {
                            if (true) {
                                man m = men[random.nextInt(10000000)];
                                m.sick = true;
                                sick.add(m);
                            }
                        }
                    }
                } catch (Exception e) {
                    break;
                }
                //if (Man.age>80)Man.isAlive
            }
            System.out.printf("Год-%d\nДень-%d\nБольных-%d", year, day, sick.size());
        }
    }

    static class man {
        short age;
        boolean sick = false;
        boolean isAlive = true;
        short days_sick = 0;

        public man(short age) {
            this.age = age;
        }
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        return 0;
    }

    public static List<Integer> s(Stack<Integer> stack, int deaph, int k, List<Integer> ls) {
        if (deaph == k) {
            System.out.println(stack);
            List<Integer> integers = new LinkedList<>(ls);
            System.out.println(integers);
            return integers;
        }
        List<Integer> result = new LinkedList<>();
        System.out.println(result);
        while (!stack.isEmpty()) {
            int a = stack.pop();
            List<Integer> l = s(stack, deaph + 1, k, ls);
            for (Integer in : l) result.add(a + in);
            //result.add(i+stack.pop());
        }
        return result;
    }

    public static class best_travel {
        public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
            if (ls.size() < k) return null;
            int max = 0;
            Integer[] arr = new Integer[ls.size()];
            arr = ls.toArray(arr);
            List<Integer> travel_dist = travel_toNext(k, 1, 0, arr, t);
            if (travel_dist.size() == 0) return null;
            HashSet<Integer> path = new HashSet<>(travel_dist);
            System.out.println(path);
            for (int dist : path) {
                if (dist > max && dist <= t) max = dist;
            }
            return max;
        }

        public static List<Integer> travel_toNext(int k, int depth, int dist_toPastTown, Integer[] towns, int t) {
            if (k == depth) {
                LinkedList<Integer> result = new LinkedList<>();
                for (int i = 0; i < towns.length; i++) {
                    int dist = towns[i];
                    if (dist < 0) continue;
                    result.add(dist_toPastTown + dist);
                }
                return result;
            }
            LinkedList<Integer> result = new LinkedList<>();

            for (int a = 0; a < towns.length; a++) {
                if (towns[a] + dist_toPastTown > t) continue;
                int dist = towns[a];
                if (dist == dist_toPastTown || dist < 0) continue;
                towns[a] = -1;
                List<Integer> next_towns = travel_toNext(k, depth + 1, dist + dist_toPastTown, towns, t);
                towns[a] = dist;
                for (int dist_toNext : next_towns) {
                    if (dist_toNext <= t) result.add(dist_toNext);
                }
            }
            return result;
            /*
            I have no idea how it works loll
             */

        }

        public static void solve(int k, int deph, int sum, List<Integer> towns) {
            /*//if (k==deph) sums.add(sum);
            else {
                for (Integer distance:towns){
                    solve(k,deph+1,sum+distance,towns);
                }
            }*/
        }

        public static int parseInt(String numStr) {
            System.out.println(numStr);
            Stack<String> stack = new Stack<>();
            int number = 0;
            Deque<Integer> deque = new ArrayDeque<>();
            Arrays.stream(numStr.split(" ")).forEach(stack::push);
            String first = stack.lastElement();
            int l = 0;
            int priv = 0;
            int g = 1;
            while (!stack.isEmpty()) {
                String N = stack.pop();
                int a;
                if (N.contains("-")) {
                    String[] numbers = N.split("-");
                    a = getNuber(numbers[0]) + getNuber(numbers[1]);
                    priv = a;
                    l += 2;
                } else if (!N.equals("and")) {
                    a = getNuber(N);
                    priv = a;
                    if (a == 100 || a == 1000) g *= a;
                } else {
                    continue;
                }
                if (!stack.isEmpty()) {
                    String next = stack.pop();
                    if (next.contains("-")) {
                        String[] n = next.split("-");
                        int nex = getNuber(n[0]) + getNuber(n[1]);
                        deque.addFirst(nex * a);
                    } else if (next.equals("hundred") || next.equals("thousand")) {
                        priv = getNuber(next);
                        if (!(a == 100 || a == 1000)) deque.addFirst(a);
                        else {
                            priv *= a;
                            g *= a;
                        }
                        next = stack.pop();
                        int nxt = getNuber(next);
                        while (nxt == 100 || nxt == 1000 && !stack.isEmpty()) {
                            g *= nxt;
                            priv *= nxt;
                            nxt = getNuber(stack.pop());
                        }
                        deque.addFirst(nxt * priv);
                        if (stack.isEmpty()) break;

                    } else {
                        if (next.equals("and")) deque.addFirst(a);
                        else {
                            int numb = getNuber(next) * g;
                            if (deque.isEmpty() || numb > deque.peekFirst() && first.equals("hundred") || first.equals("thousand")) {
                                deque.addFirst(numb);
                                continue;
                            }
                            numb = getNuber(next) * priv;
                            if (deque.isEmpty() || numb > deque.peekFirst()) {
                                deque.addFirst(numb);
                            } else if (!deque.isEmpty())
                                deque.addFirst((int) (getNuber(next) * Math.pow(10, deque.peekFirst().toString().length())));
                            else deque.addFirst(getNuber(next) * a);
                        }
                    }
                } else deque.addFirst(a);
            }
            System.out.println(deque);
            while (!deque.isEmpty()) number += deque.pollFirst();
            return number;
        }

        private static int getNuber(String n) {
            switch (n) {
                case "one":
                    return 1;
                case "two":
                    return 2;
                case "seven":
                    return 7;
                case "twelve":
                    return 12;
                case "seventeen":
                    return 17;
                case "three":
                    return 3;
                case "eight":
                    return 8;
                case "thirteen":
                    return 13;
                case "eighteen":
                    return 18;
                case "four":
                    return 4;
                case "nine":
                    return 9;
                case "fourteen":
                    return 14;
                case "nineteen":
                    return 19;
                case "five":
                    return 5;
                case "ten":
                    return 10;
                case "fifteen":
                    return 15;
                case "twenty":
                    return 20;
                case "six":
                    return 6;
                case "eleven":
                    return 11;
                case "sixteen":
                    return 16;
                case "zero":
                    return 0;
                case "thirty":
                    return 30;
                case "forty":
                    return 40;
                case "fifty":
                    return 50;
                case "sixty":
                    return 60;
                case "seventy":
                    return 70;
                case "eighty":
                    return 80;
                case "ninety":
                    return 90;
                case "hundred":
                    return 100;
                case "thousand":
                    return 1000;
                case "million":
                    return 1000000;
                default:
                    throw new RuntimeException("number is not valid");

            }

        }

        public static BigInteger fib(BigInteger n) {
            if (n.compareTo(BigInteger.valueOf(0)) == 0 || n.compareTo(BigInteger.valueOf(1)) == 0) return n;
            int mult = 1;
            if (n.compareTo(BigInteger.valueOf(0)) < 0) {
                mult = -1;
                n = n.multiply(BigInteger.valueOf(mult));
                if (n.longValue() % 2 != 0) mult = 1;
            }

            BigInteger[][] a = {{BigInteger.valueOf(0), BigInteger.valueOf(1)}, {BigInteger.valueOf(1), BigInteger.valueOf(1)}};
            a = matrix_in_power(a, n.intValue());
            return a[0][1].multiply(BigInteger.valueOf(mult));
        }

        static BigInteger[][] matrix_mult(BigInteger[][] a, BigInteger[][] b) {
            int n = a[0].length;
            BigInteger[][] result = new BigInteger[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = BigInteger.valueOf(0);
                    for (int k = 0; k < n; k++) {
                        result[i][j] = result[i][j].add(a[i][k].multiply(b[k][j]));
                    }
                }
            }

            return result;
        }

        static BigInteger[][] matrix_in_power(BigInteger[][] a, int power) {
            if (power == 0)
                return new BigInteger[][]{{BigInteger.valueOf(1), BigInteger.valueOf(0)}, {BigInteger.valueOf(0), BigInteger.valueOf(1)}};
            if (power == 1) return a;
            if (power % 2 == 0) {
                return matrix_mult(matrix_in_power(a, power / 2), matrix_in_power(a, power / 2));
            } else {
                return matrix_mult(matrix_in_power(a, power - 1), a);
            }
        }



        static boolean isPrime(int N) {
            boolean isPrime = true;

            // The Wheel for checking
            // prime number
            int[] arr = {7, 11, 13, 17, 19, 23, 29, 31};

            // Base Case
            if (N < 2) {
                isPrime = false;
            }

            // Check for the number taken
            // as basis
            if (N % 2 == 0 || N % 3 == 0
                    || N % 5 == 0) {
                isPrime = false;
            }

            // Check for Wheel

            for (int i = 0; i < Math.sqrt(N); i += 30) {


                for (int c : arr) {

                    if (c > Math.sqrt(N)) {
                        break;
                    } else {
                        if (N % (c + i) == 0) {
                            isPrime = false;
                            break;
                        }
                    }


                    if (!isPrime)
                        break;
                }
            }

            return isPrime;
        }

        static boolean wheelCheck(int n) {
            if (n >= Math.sqrt(Math.log(n))) return false;
            boolean result = false;
            if (n % 2 == 0) return false;
            else if (n % 3 == 0) return false;
            else if (n % 5 == 0) return false;
            final int[] primes = {7, 11, 13, 17, 19, 23, 29, 31};
            for (int i = 0; i < primes.length; i++) {
                int div = primes[i];
                int a = 1;
                while (div <= Math.sqrt(n)) {
                    if (n % div == 0) return false;
                    div = 30 * a++ + primes[i];
                }
            }
            return true;
        }

    }

    static Vector<Integer> simpleSieve(int limit, Vector<Integer> prime) {
        // Create a boolean array "mark[0..n-1]" and initialize
        // all entries of it as true. A value in mark[p] will
        // finally be false if 'p' is Not a prime, else true.
        boolean mark[] = new boolean[limit + 1];

        for (int i = 0; i < mark.length; i++)
            mark[i] = true;

        for (int p = 2; p * p < limit; p++) {
            // If p is not changed, then it is a prime
            if (mark[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i < limit; i += p)
                    mark[i] = false;
            }
        }

        // Print all prime numbers and store them in prime
        for (int p = 2; p < limit; p++) {
            if (mark[p] == true) {
                prime.add(p);
                //System.out.print(p + "  ");
            }
        }
        return prime;
    }

    // Prints all prime numbers smaller than 'n'
    static IntStream stream( ){
        int n= (int) Math.pow(10,9);
        // Compute all primes smaller than or equal
        // to square root of n using simple sieve
        int limit = (int) (Math.floor(Math.sqrt(n)) + 1);
        Vector<Integer> prime = new Vector<>();
        prime=simpleSieve(limit, prime);

        // Divide the range [0..n-1] in different segments
        // We have chosen segment size as sqrt(n).
        int low = limit;
        int high = 2 * limit;

        // While all segments of range [0..n-1] are not processed,
        // process one segment at a time
        while (low < n) {
            if (high >= n)
                high = n;

            // To mark primes in current range. A value in mark[i]
            // will finally be false if 'i-low' is Not a prime,
            // else true.
            boolean mark[] = new boolean[limit + 1];

            Arrays.fill(mark, true);

            // Use the found primes by simpleSieve() to find
            // primes in current range
            for (Integer integer : prime) {
                // Find the minimum number in [low..high] that is
                // a multiple of prime.get(i) (divisible by prime.get(i))
                // For example, if low is 31 and prime.get(i) is 3,
                // we start with 33.
                int loLim = (int) (Math.floor(low / integer) * integer);
                if (loLim < low)
                    loLim += integer;

                /*  Mark multiples of prime.get(i) in [low..high]:
                    We are marking j - low for j, i.e. each number
                    in range [low, high] is mapped to [0, high-low]
                    so if range is [50, 100]  marking 50 corresponds
                    to marking 0, marking 51 corresponds to 1 and
                    so on. In this way we need to allocate space only
                    for range  */
                for (int j = loLim; j < high; j += integer)
                    mark[j - low] = false;
            }
            // Numbers which are not marked as false are prime
            for (int i = low; i < high; i++)
                if (mark[i - low])
                   prime.add(i);

            // Update low and high for next segment
            low = low + limit;
            high = high + limit;
        }
        return prime.stream().mapToInt(Integer::intValue);
    }
}
class Test
{
    static final int max=50000000;
    static int prime_n=0;
    static int [] primes=new int[max];
    static volatile boolean[] ar;
    // This methid finds all primes smaller than 'limit'
    // using simple sieve of eratosthenes. It also stores
    // found primes in vector prime[]
    static void simpleSieve(int limit, Vector<Integer> prime)
    {
        // Create a boolean array "mark[0..n-1]" and initialize
        // all entries of it as true. A value in mark[p] will
        // finally be false if 'p' is Not a prime, else true.
        boolean mark[] = new boolean[limit+1];
        int lp[]=new int[limit+1];

        for (int i=2; i<=limit; ++i) {
            if (lp[i] == 0) {
                lp[i] = i;
                prime.add (i);
            }
            for (int j=0; j<(int)prime.size() && prime.get(j)<=lp[i] && i*prime.get(j)<=limit; ++j)
                lp[i * prime.get(j)] = prime.get(j);
        }

        // Print all prime numbers and store them in prime
       /* for (int p=2; p<limit; p++)
        {
            if (mark[p] == true)
            {
                prime.add(p);
                primes[prime_n++]=p;
            }
        }*/
    }

    // Prints all prime numbers smaller than 'n'
    static void segmentedSieve(int n)
    {
        // Compute all primes smaller than or equal
        // to square root of n using simple sieve
        int limit = (int) (Math.floor(Math.sqrt(n))+1);
        Vector<Integer> prime = new Vector<>();
        simpleSieve(limit, prime);

        // Divide the range [0..n-1] in different segments
        // We have chosen segment size as sqrt(n).
        int low  = limit;
        int high = 2*limit;

        // While all segments of range [0..n-1] are not processed,
        // process one segment at a time
        while (low < n)
        {
            if (high >= n)
                high = n;

            // To mark primes in current range. A value in mark[i]
            // will finally be false if 'i-low' is Not a prime,
            // else true.
            boolean mark[] = new boolean[limit+1];

            for (int i = 0; i < mark.length; i++)
                mark[i] = true;

            // Use the found primes by simpleSieve() to find
            // primes in current range
            for (int i = 0; i < prime.size(); i++)
            {
                // Find the minimum number in [low..high] that is
                // a multiple of prime.get(i) (divisible by prime.get(i))
                // For example, if low is 31 and prime.get(i) is 3,
                // we start with 33.
                int loLim = (int) (Math.floor(low/prime.get(i)) * prime.get(i));
                if (loLim < low)
                    loLim += prime.get(i);

                /*  Mark multiples of prime.get(i) in [low..high]:
                    We are marking j - low for j, i.e. each number
                    in range [low, high] is mapped to [0, high-low]
                    so if range is [50, 100]  marking 50 corresponds
                    to marking 0, marking 51 corresponds to 1 and
                    so on. In this way we need to allocate space only
                    for range  */
                for (int j=loLim; j<high; j+=prime.get(i))
                    mark[j-low] = false;
            }

            // Numbers which are not marked as false are prime
            for (int i = low; i<high; i++)
                if (mark[i - low] == true)
                    primes[prime_n++]=i;

            // Update low and high for next segment
            low  = low + limit;
            high = high + limit;
        }
        System.out.println(Arrays.toString(primes));
    }

    // Driver method
    public static void main(String args[])
    {
        int n = 100;
        System.out.println("Primes smaller than " + n + ":");
        segmentedSieve(n);
    }
    static  IntStream optimizedSieve(){
        int bound= (int) Math.pow(10,9);
        ar = new boolean[bound+1];
        ar[2] = true;
        ar[3] = true;
        ar[5]=true;
        ar[7]=true;
        System.out.printf("bound is %d",bound);
        // Taking into account that all primes greater than 2 and 3
        // Are of the form 6k+1 or 6k-1
        List<Thread> wheel_thread=new LinkedList<>();
        final int [] wheel_primes={1,7,11,13,17,19,23,29};
       for (int prime:wheel_primes){
            final int prime_=prime;
            Thread t=new Thread( ()->{
                for (int k=0;k+prime_<=bound;k+=30){
                    ar[k+prime_]=true;
                }
                System.out.println("Thread finished");
            });
            t.start();
            wheel_thread.add(t);
        }
        for (Thread t:wheel_thread) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread waiting finished");
        int [] primes=new int[max];
        primes[0]=2;
        prime_n=1;
        for (int j = 4; j  <= bound ; j+=2)
            Test.ar[j] = false;
        for (int i = 3;  i*i <=bound; i +=2)
        {
            if (Test.ar[i])
            {
                // Can this be optimized?
                for (int j = i*i; j  <= bound && i*i<=bound; j+=i)
                    Test.ar[j] = false;
            }
        }
        for (int i = 3; i <= bound; i+=2) {
            if (ar[i]){
                primes[prime_n++]=i;
                if (prime_n>=max-1)break;
            }
        }
        System.out.printf("primes generated:%d\n",prime_n);
        /*for (int i = 0; i < max; i++) {
            int p=primes[i];
            for (int j = 2; j <= Math.sqrt(p); j++) {
                if (p%j==0)throw new RuntimeException("Non prime found");
            }
        }*/
        System.out.println("test passed");
        return Arrays.stream(primes);
        // TODO: 4/26/2020 optimize it

    }
    static IntStream primeSieve(){

        final int max=50000000;
        final int n= (int) ((int) 9.6f*Math.pow(10,8)/2);
        boolean[] a=new boolean[n];
        int[] primes=new int[max];
        int prime_n=1;
        long t = 15810;
        int u = 0;
        long time=System.currentTimeMillis();

        for(int i = 1; i < (n-1)/3; i++) a[1+3*i] = true;
        for(int i = 2; i <= t; i++){
            u = (n-i)/(1+2*i);
            if ((i%3)-1!=0) for(int j = i; j < u; j++) a[i + j + 2*i*j] = true;}
        System.out.println("sieve created in "+(System.currentTimeMillis()-time)/1000);
        primes[0]=2;
        for(int i = 1; i<= n || prime_n < max-1; i++) if (!a[i]){
            primes[prime_n++]=i*2+1;
            if (prime_n>=max)break;

        }
        System.out.printf("primes generated:,%d\n",prime_n);
        for (int i = 0; i < 20; i++) {
            System.out.printf("%d, ",primes[max-1-i]);
        }
        return Arrays.stream(primes);
    }


}
