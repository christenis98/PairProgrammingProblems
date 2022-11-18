using KataFizzBuzz;

Start();

void Start()
{
    bool finished = false;

    while(!finished)
    {
        Back back = new Back();

        Console.WriteLine("Insert a number:");
        string number = Console.ReadLine();        
        back.FizzBuzz(int.Parse(number));

        Console.WriteLine("Want to play again?(Y/N)");
        string answer = Console.ReadLine();
        if(answer=="y") finished = false;    
        else if(answer=="n") finished = true;
    }
}


