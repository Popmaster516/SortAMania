public class Runner {
    public static void main(String[] args)
    {
        SortCompetition team1 = new Team1SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randStringArr = randomStringArr(10000, 5);

        System.out.println("Unsorted");
        printArr(randIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }

    public static int[] randomIntsArr(int num)
    {
        String[] arr = new String[num];
        for(int i = 0; i<arr.length;i++)
        {
            arr[i] = (int) (Math.random()*10001);
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while (num>0)
        {
            int i = 0;
            String s = "";
            while (i<length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
