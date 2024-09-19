void main(){
    String s1 = "Hello";
    String s2 = "hello";
    String s3 = "HeLLo";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s2.equals(s3));

    System.out.println(s1.equalsIgnoreCase(s2));
    System.out.println(s1.equalsIgnoreCase(s3));
    System.out.println(s2.equalsIgnoreCase(s3));

    System.out.println("----------------------");

    String s4 = "null";
    String s5 = null;
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s4.equalsIgnoreCase(s5));
    System.out.println(s4.equals(s5));
}