import java.util.*;
public class PassGen {
    static String name = new String("Ahmed");//inputs strings
    static String dob = new String("11Nov2021");
    static String fav = new String("BlackPanther");
    //static ArrayList<String> passw = new ArrayList<String>();
    static StringBuffer sb = new StringBuffer(50);
   /* public static String[] namechar = new String[10];
    public static String[] dobchar = new String[15];
    public static String[] favchar = new String[25];
     public static void printstring(String s, String k, String j) { // converting strings into arrays
        namechar = s.split("");
        dobchar = k.split("");
        favchar = j.split("");
     /*  for (int i = 0; i < k.length(); i++) {        //irrelevant to our program
            System.out.print(" " + dobchar[i] + " ");// simple print method for debugging
        }
}*/
    public static void Randomelements(String a) {
        int max = a.length();
        int min = 0;
        Random random = new Random();
        //initializing index pointer
        for (int i = 0; i < 4; i++) {
            int p = random.nextInt(max - min) + min; //Randomly choosing array elements from index
            sb.append(a.charAt(p));
            //System.out.println(a[p]);
        }
    }
    private static StringBuffer ncrypyt(StringBuffer pass) {
        String two = new String("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");   //key declared inside private method for abstraction
       StringBuffer three = new StringBuffer(50);
       for (int i = 0; i < pass.length(); i++) {
           if (two.indexOf(Character.toString(pass.charAt(i))) != -1) {
               int n = two.indexOf(Character.toString(pass.charAt(i)));
               three.append(Character.toString(two.charAt(n + 1)));
           } else {
               three.append(Character.toString(pass.charAt(i)));
           }
       }
       return three;
   }
    public static void main(String[] args) {
        PassGen.Randomelements(name);
        PassGen.Randomelements(dob);
        PassGen.Randomelements(fav);
        System.out.println("ey");
        System.out.println("Password: " + sb);
        System.out.println("Encrypted Password: "+ PassGen.ncrypyt(sb));

    }
}

