void main() {
    Object obj1 = new A();
    Object obj2 = new A();
    Object obj3 = new B();
    Object obj4 = new B();
    Object obj5 = null;
    Object obj6 = null;

    System.out.println(STR."obj1 -> A: \{obj1 instanceof A}");
    System.out.println(STR."obj2 -> A: \{obj2 instanceof A}");
    System.out.println(STR."obj3 -> A: \{obj3 instanceof A}");
    System.out.println(STR."obj4 -> A: \{obj4 instanceof A}");
    System.out.println(STR."obj1 -> B: \{obj1 instanceof B}");
    System.out.println(STR."obj2 -> B: \{obj2 instanceof B}");
    System.out.println(STR."obj3 -> B: \{obj3 instanceof B}");
    System.out.println(STR."obj4 -> B: \{obj4 instanceof B}");

    System.out.println(STR."obj5 -> B: \{obj5 instanceof A}");
    System.out.println(STR."obj6 -> B: \{obj6 instanceof B}");

    // Since Java 14, Java 16
    if (obj1 instanceof A a) {
        System.out.println(a);
        System.out.println(obj1);
    }
    if (obj1 instanceof A _) {  // Java 21 (Preview)
        // System.out.println(_);
        System.out.println(obj1);
    }
    // System.out.println(a);
//    if (obj2 instanceof A a,b) {
//
//    }
//    if (obj2 instanceof A a=10) {
//
//    }
}

class A {
}

class B {
}