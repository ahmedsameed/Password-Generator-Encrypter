import java.util.Random;
public class hello{
    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    public static void main(String[] args){
        hello good=new hello();
        for (int i=0;i<10;i++){
            System.out.println(good.getRandomNumberUsingNextInt(1,8));
        }
    }
}
