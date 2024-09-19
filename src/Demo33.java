void main(){
    byte b = 10;
    short s = 20;
    int i = 10;
    long l = 40;
    char c = 5;
    float f = 5.0f;
    double d = 6.0;

    System.out.println(5 > 2);
    System.out.println(5.2 > 2.3);
    System.out.println((2 + 3) > 2.3);

    System.out.println(b > s);
    System.out.println(s > i);
    System.out.println(l > c);
    System.out.println(f > d);
    System.out.println(i > f);
    System.out.println(l > c);

    System.out.println("-------------------");

    System.out.println(0 > -0);
    System.out.println(-0. > 0.);
    System.out.println(0 > -0.);
    System.out.println(0 > 0.);
    System.out.println(0 >= 0.);

    // System.out.println(5 / 0);
    System.out.println(5 / 0.);
}