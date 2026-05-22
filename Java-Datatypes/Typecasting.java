// package Java-Datatypes;

public class Typecasting {
    public static void main(String[] args) {
        int a=90;
        float f=98.7f;
        float s=98.7f;
        int r=(int)s;
        a=(int)f;//explicit Typecasting
        f=a;//implicit typecasting
        System.out.println("a ="+a);
        System.out.println("f ="+f);
        System.out.println("r ="+r);
    }
}
