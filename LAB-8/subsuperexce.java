class subsuperexce {
    public static void main(String args[]) {
        try
        {
            int arr[] = new int[3];
            arr[4] = 20;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("\nSUBCLASS: "+ e +"\n");
        }
        catch(Exception ex)
        {
            System.out.println("\nSUPERCLASS: "+ ex +"\n");
        }
        finally
        {
            System.out.println("FINAL BLOCK!!\n");
        }
    }
}
