using RockPaperScissors;

Play();

void Play()
{
    bool finished = false;

    while(!finished)
    {
        Player player = new Player();

        Console.WriteLine("Player 1");
        string player1 = player.Select();

        Console.WriteLine("Player 2");
        string player2 = player.Select();


        if (player1 == "rock" && player2 == "scissors")
        {
            Console.WriteLine("Player 1 wins!");
        }

        else if (player1 == "scissors" && player2 == "paper")
        {
            Console.WriteLine("Player 1 wins!");
        }

        else if (player1 == "paper" && player2 == "rock")
        {
            Console.WriteLine("Player 1 wins!");
        }

        else if (player1 == "scissors" && player2 == "rock")
        {
            Console.WriteLine("Player 2 wins!");
        }

        else if (player1 == "paper" && player2 == "scissors")
        {
            Console.WriteLine("Player 2 wins!");
        }

        else if (player1 == "rock" && player2 == "paper")
        {
            Console.WriteLine("Player 2 wins!");
        }

        else if (player1 == player2) Console.WriteLine("This is a draw!");

        Console.WriteLine("Do you want to play again?(Y/N)");
        string finishAnswer = Console.ReadLine();

        if (finishAnswer == "y") finished = false;
        else if (finishAnswer == "n") finished = true;  
    }    
}




