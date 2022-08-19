class random {
    public static void main(String args[])
    {
        System.out.print("\nRandom number between 1 to 6: ");
        int randomnum=(int) (10*Math.random()%6)+1;
        System.out.print(randomnum+"\n\n");
    }    
}
