public class stringIndex {
    public static void main(String[] args)
    {
        String str = "Tops Technologies!";
        String str1="Hello ";
        String str2="World";
        String s = "Success";
    
        char charAt0=str.charAt(0);
        char charAt5=str.charAt(5);

        System.out.println("Character at index 0: "+charAt0);
        System.out.println("Character at index 5: "+charAt5);
        String concatStr=str1.concat(str2);
        System.out.println("Concatenated string: "+concatStr);
        

    }
}
