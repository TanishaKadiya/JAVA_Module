public class frequentChar {
    public static void main(String[] args)
    {
        String s = "Successes";
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)]++;
        }
        char mostFreqChar=' ';
        int maxFreq=0;
        for(int i=0;i<256;i++)
        {
            if(freq[i]>maxFreq)
            {
                maxFreq=freq[i];
                mostFreqChar=(char)i;
            }
        }
        System.out.println("Second most frequent character: "+mostFreqChar);
    }
}
