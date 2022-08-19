class plate {
    int length1,width1;
    float length2;
    plate(int l,int w) {
        length1 = l;
        width1 = w;
        System.out.println("\nint length, int width in plate");
    }
    plate(float l,int w) {
        length2 = l;
        width1 = w;
        System.out.println("\nfloat length, int width in plate");
    }
}
class box extends plate {
    int height1;
    box(int l,int w,int h) {
        super(l,w);
        height1 = h;
        System.out.println("int length, int width, int height in box");
    }
    box(float l,int w,int h) {
        super(l,w);
        height1 = h;
        System.out.println("float length, int width, int height in box");
    }
}
class woodenbox extends box {
    int thick1;
    woodenbox(int l,int w,int h,int t) {
        super(l,w,h);
        thick1 = t;
        System.out.println("int length, int width, int height, int thick in woodenbox\n");
    }
    woodenbox(float l,int w,int h,int t) {
        super(l,w,h);
        thick1 = t;
        System.out.println("float length, int width, int height, int thick in woodenbox\n");
    }
}
class platedemo {
    public static void main(String args[]) {
        woodenbox obj1 = new woodenbox(5,10,15,20);
        woodenbox obj2 = new woodenbox(5.50f,10,15,20);
    }
}
