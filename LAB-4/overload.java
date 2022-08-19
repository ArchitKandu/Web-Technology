class overloaddemo {
    void area(float r)
    {
        System.out.print("\nArea of Circle: " + (3.1416*r*r));
    }
    void area(float b,float h)
    {
        System.out.print("\nArea of Triangle: " + (0.5*b*h));
    }
    void area(double l)
    {
        System.out.print("\nArea of Square: " + (l*l) + "\n\n");
    }
}
class overload {
    public static void main(String args[]) {
        overloaddemo ob = new overloaddemo();
        ob.area(12.0f);
        ob.area(15.5f,17.5f);
        ob.area(12.0);
    }
}
