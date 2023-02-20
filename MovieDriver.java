import java.util.Scanner;

public class MovieDriver 
{
    public static void main(String[] args) throws Exception 
    {
        try (Scanner keyboard = new Scanner(System.in)) 
        {
            String answerToContinue;

            do 
            {
                Movie myMovie = new Movie();

                System.out.println("Enter the name of a movie");
                String movieTitle = keyboard.nextLine();

                myMovie.setTitle(movieTitle);

                System.out.println("Enter the rating of the movie");
                String movieRating = keyboard.nextLine();

                myMovie.setRating(movieRating);

                System.out.println("Enter the number of tickets sold for this movie");
                int movieTicketsSold = keyboard.nextInt();

                myMovie.setSoldTickets(movieTicketsSold);

                System.out.println(myMovie.toString());

                System.out.println("Do you want to enter another? (y or n)");
                keyboard.nextLine(); // to discard extra line feed
                answerToContinue = keyboard.nextLine();

                

            } while (answerToContinue.equals("y"));
        }
    }
}
