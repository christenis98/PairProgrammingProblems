using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace KataFizzBuzz
{
    public class Back
    {
        public void FizzBuzz(int value)
        {
            /* var myList = new Dictionary<int, string>();

             myList.Add(3, "fizz ");
             myList.Add(5, "buzz ");
             myList.Add(7, "pop ");
             */
            string result = "";
            
                        if (value % 3 == 0)
                            result += "fizz ";
                        if (value % 5 == 0)
                            result += "buzz ";
                        if (value % 7 == 0)
                            result += "pop ";

                        if (result == "")
                            result = value.ToString();
           

           

            Console.WriteLine(result);

            

        }
    }
}
