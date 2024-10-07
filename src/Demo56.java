void main() {
    /* Google (C) */
    int a = 10, b = 20, c = 30;
    boolean result = ((a & b) > 0 ? true: false) && ((b | c) > 0 ? true: false) ||
            ((c & ++a) > 0 ? true: false);
    System.out.println(result);
    System.out.println(STR."a=\{a}");

    // Google (Java)
    int x = 10, y = 5, z = 15;
    int result2 = x > y ? x > z ? z : x : y;
    System.out.println(result2);

    // Amazon
    a = 10; b = 20; c = 30;
    int result3 = a ^ b & c | b ^ c & a;
    System.out.println(result3);

    // Microsoft
    int a1 = 10, b1 = 20;
    // int abc = (10 + 5) + (2 * 5);
    result = (a1 < b1) || ((a1++ > 15) && (b1-- < 25));
    System.out.println(result);
    System.out.println(STR."a=\{a1}");
    System.out.println(STR."a=\{b1}");

    // Facebook
    byte b2 = 10;
    int result4 = b2 > 5 ? b2 + 1 : b2  +2 ;
    System.out.println(result4); // how the result is int here?

    // Adobe
    a = 16;
    a >>= 2;
    System.out.println(a);

    // Oracle
    x = 1;
    y = x++ + ++x + x++;
    System.out.println(STR."x=\{x}");
    System.out.println(STR."y=\{y}");

    // Google
    double d1 = 0.1;
    double d2 = 0.2;
    System.out.println(d1 + d2 == 0.3);
}