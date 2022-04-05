import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCharacterTest {
    static RandomCharacter randomCharacter;

    @Before
    public void setUp(){
        randomCharacter = new RandomCharacter();
    }

    @Test
    public final void getRandomLowerCaseLetter(){
        System.out.println("Check its lowercase letter");
        char lowerChar = randomCharacter.getRandomLowerCaseLetter();
        System.out.println("Lowercase letter: "+ lowerChar);
        assertTrue(Character.isLowerCase(lowerChar));
    }

    @Test
    public final void getRandomUpperCaseLetter(){
        System.out.println("Check its uppercase letter");
        char upperChar = randomCharacter.getRandomUpperCaseLetter();
        System.out.println("Uppercase letter: "+ upperChar);
        assertTrue(Character.isUpperCase(upperChar));
    }
    @Test
    public final void getRandomDigitCharacter(){
        System.out.println("Check its number between 0-9");
        int num = randomCharacter.getRandomDigitCharacter();
        System.out.println("Number: "+ num);
        assertTrue(num >= 0 && num<10);
    }
    @Test
    public final void getRandomCharacter(){
        char c = randomCharacter.getRandomCharacter();
        String chart=String.valueOf(c);
        String check = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        Boolean flag = false;
        System.out.println("Check if its character");
        System.out.println("Character: "+ chart);
        if(check.contains(chart)){
            flag = true;
        }
        assertTrue(flag);
    }



    @Test
    public final void CheckPrimeNum(){
        Boolean flag = true;
        int number = randomCharacter.getRandomDigitCharacter();
        //if number <=1 means it's not a prime number
        System.out.println("check is prime number");
        if(number <= 1){
            flag = false;
        }
        for (int i = 2; i<= number/2; i++) {
            if ((number % i) == 0) {
                flag = false;
            }
        }
        System.out.println("number: "+number);
        assertTrue(flag);
    }


}
