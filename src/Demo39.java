void main(){
//    Object o1 = new Object();
//    System.out.println(o1);
    //    Object o2 = new A();
//    System.out.println(o2);
    String s1 = "Hello";
    String s2 = "World";
    String s3 = new String("Hello");
    String s4 = "World";
    String s5 = "IJSE";
    String s6 = "IJSE";

    System.out.println(s1 == s2);   // false
    System.out.println(s1 == s3);   // true -> false
    System.out.println(s2 == s4);   // true

    System.out.println(s1.equals(s3));
}

//class A{
//    public String toString(){return "IJSE";}
//}