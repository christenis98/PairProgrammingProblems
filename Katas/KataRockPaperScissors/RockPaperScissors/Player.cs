using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RockPaperScissors
{
    public class Player
    {
        
        string itemPlayer="";
        public string Select ()
        {            

            Console.WriteLine("Object selected: (Rock, Scissors, Paper)");

            bool valid = false;

            while (!valid)
            {
                itemPlayer = Console.ReadLine();

                if (itemPlayer == "rock")
                {
                    Console.WriteLine(":)");
                    valid = true;
                }
                else if (itemPlayer == "paper")
                {
                    Console.WriteLine(":)");
                    valid = true;
                }
                else if (itemPlayer == "scissors")
                {
                    Console.WriteLine(":)");
                    valid = true;
                }
                else
                {
                    Console.WriteLine("Item no valido!");
                    Console.WriteLine("Select new item: (rock, scissors, paper)");
                }
            }

            return itemPlayer;
            
        }        
    }
}
