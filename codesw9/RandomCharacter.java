import java.util.Random;

public class RandomCharacter{
    public static void main(String[] arg){
        RandomCharacter c=new RandomCharacter();

        System.out.println("Random lowercase letter: "+c.getRandomLowerCaseLetter());
        System.out.println("Random random uppercase letter: "+c.getRandomUpperCaseLetter());
        System.out.println("Random digit character: "+c.getRandomDigitCharacter());
        System.out.println("Random character: "+c.getRandomCharacter());
    }

    public char getRandomLowerCaseLetter(){
        Random r=new Random();

        String alphabet="abcdefghijklmnopqrstuvwxyz";
        char letter=alphabet.charAt(r.nextInt(alphabet.length()));
        return letter;
        
    }

    public char getRandomUpperCaseLetter(){
        Random r=new Random();

        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char letter=alphabet.charAt(r.nextInt(alphabet.length()));
        return letter;
    }
    
    public int getRandomDigitCharacter(){
        Random r=new Random();

        int num=r.nextInt(10);
        return num;
    }

    public char getRandomCharacter(){
        Random r=new Random();

        String character="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char charr=character.charAt(r.nextInt(character.length()));
        return charr;
    
    }
}