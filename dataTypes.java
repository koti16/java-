public class dataTypes {
    byte  cat = 127;
    int u = 1000;
    short s = 10000;
    float f = 10.5f;

    public static void main(String[] args) {
        System.out.println(new dataTypes().cat);
        System.out.println(new dataTypes().u);
        System.out.println(new dataTypes().s);
        System.out.println(new dataTypes().f);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Short.SIZE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Float.SIZE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

    }
}
