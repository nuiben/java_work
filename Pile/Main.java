class Main {
    
    private static void foo(int a) {
        //x = 18;
        System.out.println(a);
    }

    //private static int x = 25;
    
    public static void main(String[] args) {
        //int c = 9;
        char x = grade(7);
        //System.out.println(x);
    }
    
    public static char grade(int score) 
    {      
    if (score >= 9)
    {
        return 'A'; 
    } 
    else if (score >= 8)
    {
        return 'B'; 
    } 
    else if (score >= 6)
    {
        return 'C'; 
    } 
    else if (score > 4)
    {
        return 'D'; 
    } 
    else if (score < 4)
    {
        return 'F';
    }
    }
}