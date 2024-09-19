void main(){
    int x = 5;
    System.out.println(x = 2);      // 2    (Assignment Operator)
    System.out.println(x == 2);     // true (Equality Operator)

    // 1. Numeric
    byte b = 3;
    short s = 5;
    char c = 2;
    int i = 10;
    float f = 5;
    double d = 3;
    System.out.println((b + s) == (i - c));
    System.out.println((f + d) == (b + s));

    // 2. Boolean
    boolean flag = 5 > 2;
    System.out.println(flag == true);
    // System.out.println(flag != 10);
    System.out.println(flag != 10 > 0);

    System.out.println("----------------");

    // 3. Reference
    //int y = 10 + 15;
    Object o1 = new A();
    Object o2 = new B();
    Object o3 = o1;
    System.out.println(o1 == o2);   // false
    System.out.println(o1 != o2);   // true
    System.out.println(o3 == o2);   // false
    System.out.println(o3 == o1);   // true
    // System.out.println(o1 = null); // false
    // System.out.println(null = o1); // false
    System.out.println(null == o1); // false
    o1 = null;
    System.out.println(o3 == null); // false
    System.out.println(o1 == null); // true
}

class A{}
class B{}