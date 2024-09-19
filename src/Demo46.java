void main() {
    System.out.println(true ? 5 : 2);
    System.out.println(false ? 5 : 2);

    // boolean conditional expression
    System.out.println(5 < 2 ? 4 != 2 : 5 == 2);
    // numeric conditional expression
    System.out.println(true ? 10 + 2 : 20 + 2.5);
    // reference conditional expression
    System.out.println(false ? new Object() : null);

    // reference conditional expression
    System.out.println(true ? 10 + 2 : new Object());

    boolean x = 5 < 2 ? 4 != 2 : 5 == 2;
    double d = true ? 10 + 2 : 20 + 2.5;
    Object o = true ? 10 + 2 : new Object();
    System.out.println(o);
}