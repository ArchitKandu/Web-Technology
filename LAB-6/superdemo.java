class base {
    int a,b;
    base(int x,int y) {
        a=x;
        b=y;
        System.out.println("\nBASE CLASS A and B");
    }
    void display() {
        System.out.println("-----BASE display()-----");
        System.out.println("a: " + a + " b: " + b);
    }
}
class derived extends base {
    int c,d;
    derived(int w,int x,int y,int z) {
        super(w,x);    
        c=y;
        d=z;
        System.out.println("DERIVED CLASS C and D\n");
    }
    void display() {
        super.display();
        System.out.println("-----DERIVED display()-----");
        System.out.println("c: " + c + " d: " + d +"\n");
    }
}
class superdemo {
    public static void main(String args[]) {
        derived obj = new derived(10,20,30,40);
        obj.display();
    }
}
