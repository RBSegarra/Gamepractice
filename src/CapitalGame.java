import java.util.Random;
import java.util.Scanner;
public class CapitalGame
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to the States and Capitals Game!");
        System.out.println("The object of the game is to enter the correct Capital when prompted with the state.");
        System.out.println("Now, Select what mode you would like. C for challenge mode, F for fun mode");
        String choice = in.nextLine();
        int score = 0;
        if (choice.compareToIgnoreCase("C") == 0)
        {
            System.out.println("The Game will begin, continue answering until the end to receive a score");
            for (int i = 0; i < 50; i+=2)
            {
                System.out.println("What is the Capital of " + capitalArray(0, i));
                if (in.nextLine().compareToIgnoreCase(capitalArray(1,i)) == 0)
                {
                    System.out.println("Correct!");
                    score++;
                } else
                    System.out.println("Incorrect");
                if (i == 48)
                    i = 1;
            }
            System.out.println("You finished! You received a score of: " + score + "/50" + "which is a " + (((double)score / 50) * 100) + "%");
        }
        if (choice.compareToIgnoreCase("F") == 0)
        {
            System.out.println("The Game will begin, play as long as you want");
            do
            {
                int num = randomnum();
                System.out.println("what is the Capital of " + capitalArray(0, num));
                if (in.nextLine().compareToIgnoreCase(capitalArray(1,num)) == 0)
                {
                    System.out.println("Correct!");
                } else
                    System.out.println("Incorrect");
                System.out.println("if you are finished enter \"Exit\" otherwise, enter \"Continue\"");
            } while (in.nextLine().compareToIgnoreCase("Exit") !=  0);

        }
    }


    /** Method takes data out of a 2d array
     *
     * @param i 0 for states 1 for capitals
     * @param y position in array
     * @return state or capital
     */
    public static String capitalArray(int i, int y)
    {
        String[][] stateCapitalArray = {{"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland","Massachusetts", "Michigan", "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey","New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina","South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"},
                        {"Montgomery", "Juneau", "Phoenix", "Little Rock", "Sacramento", "Denver", "Hartford", "Dover", "Tallahassee", "Atlanta","Honolulu", "Boise", "Springfield", "Indianapolis", "Des Moines", "Topeka", "Frankfort", "Baton Rouge", "Augusta", "Annapolis","Boston", "Lansing", "St. Paul", "Jackson", "Jefferson City", "Helena", "Lincoln", "Carson City", "Concord", "Trenton","Santa Fe", "Albany", "Raleigh", "Bismark", "Columbus", "Oklahoma City", "Salem", "Harrisburg", "Providence", "Columbia", "Pierre","Nashville", "Austin", "Salt Lake City", "Montpelier", "Richmond", "Olympia", "Charleston", "Madison", "Cheyenne"}};
        return stateCapitalArray[i][y];
    }
    public static int randomnum()
    {
       return new Random().nextInt(50);
    }
}