void main(){
    System.out.println(5 < 2 & 4 > 2); // false & true = false
    System.out.println(5 < 2 && 4 > 2); // false && ? = false

    int x = 0;
    int y = 0;
    System.out.println(false & ++x > 0); // false & true = false
    System.out.println(false && ++y > 0); // false && ? = false

    System.out.println("x:" + x);
    System.out.println("y:" + y);

    System.out.println("------------------------");

    int a = 0;
    int b = 0;
    System.out.println(true | ++a == 0);    // true | false = true
    System.out.println(true || ++b == 0);   // true || ? = true

    System.out.println("a:" + a);
    System.out.println("b:" + b);
}