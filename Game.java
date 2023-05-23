import java.util.Random;
import javax.swing.JOptionPane;
public class Game
{
    public static void main(String[] args)
    {
        int lower=1;
        int high=100;
        int high_attempts=5;
        int score=0;
        Random random=new Random();
        boolean playAgain=true;
        while(playAgain)
        {
            int n=random.nextInt(high-lower+1)+lower;
            boolean isCorrect=false;
            int attempts=0;
            while(!isCorrect && attempts<high_attempts)
            {
                String str=JOptionPane.showInputDialog(null, "Guess the number " + lower+ " and "+high);
                int guess=Integer.parseInt(str);
                if(guess==n)
                {
                    isCorrect=true;
                    score+=(high_attempts-attempts)*10;
                    JOptionPane.showMessageDialog(null, "Horray! You guesses the number "+ n+" correctly.\nScore:"+score);
                }
                else if(guess<n)
                {
                    JOptionPane.showMessageDialog(null, "Too low!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Too high!");
                }
                attempts++;
            }
            if(!isCorrect)
            {
                JOptionPane.showMessageDialog(null,"Game Over! You cannot guess the number."+"The number was "+n+"." );
            }
            int choice=JOptionPane.showConfirmDialog(null,"Do you want to play again?");
            if(choice!=JOptionPane.YES_OPTION)
            {
                playAgain=false;
            }
        }
        JOptionPane.showMessageDialog(null,"Thanks for playing! Final Score: "+score);
        System.out.print("m");
    }
}