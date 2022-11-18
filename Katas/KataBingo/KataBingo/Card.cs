

namespace KataBingo
{
    class Card
    {
        int[,] card = new int[5, 5];

        
     
        /*List<int> list2 = new List<int>() { 16, 17,18 ,19, 20, 21 ,22, 23, 24 ,25, 26, 27 ,28 ,28, 30 };
        List<int> list3 = new List<int>() { 31,32,33,34,35,36,37,38,39,40,41,42,43,44,45 };
        List<int> list4 = new List<int>() { 46,47,48,49,50,51,52,53,54,55,56,57,58,59,60 };
        List<int> list5 = new List<int>() { 61,62,63,64,65,66,67,68,69,70,71,72,73,74,75 };
        */


        public void generateCard()
        {
            List<int> list1 = new List<int>() { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
            var rnd = new Random();
            
            
            for (int column = 0; column < 5; column++)
            {
                var randomized = list1.OrderBy(item => rnd.Next()).ToList();



                for (int row = 0; row < 5; row++)
                {
                    if (column == 2 && row == 2)
                        card[row, column] = 0;
                    else
                    {
                        card[column, row] = randomized[row];
                    }

                    Console.Write(card[column, row]);
                }

                for (int i = 1; i <= 15; i++)
                {
                    list1[i] += 15;
                }
                Console.Write("\n");
            }

        }        
    }
}
