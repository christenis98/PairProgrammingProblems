
NumbersGenerator();


void NumbersGenerator()
{
    List<int> numbers=new List<int>();
    int totalNumbers = 75;
    
    for (int i=1;i<=totalNumbers;i++)
    {
        numbers.Add(i);
    }

    var rnd = new Random();
    var randomized = numbers.OrderBy(item => rnd.Next());

    foreach (int number in randomized)
    {
        Console.WriteLine(number);             
    }

/*
    Random rd = new Random();
    int rn;
    while (numbers.Count > 1)
    {
        rn = rd.Next(0, numbers.Count - 1);
        numbers.RemoveAt(rn);
        Console.WriteLine("Random Number: "+rn + " Bingo: " + numbers[rn] + " count: " + numbers.Count + "\n");
        
        for (int i = 0; i < numbers.Count; i++)
        {

            Console.Write(numbers[i] + ",");
        }
    }
*/

}


