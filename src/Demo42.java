void main(){
    byte b1 = 10;
    byte b2 = 20;
    long t1 = System.nanoTime();
    int result = b1 + b2;
    long t2 = System.nanoTime();
    System.out.println("Byte: " + (t2 - t1));
    short s1 = 10;
    short s2 = 20;
    t1 = System.nanoTime();
    int result2 = s1 + s2;
    t2 = System.nanoTime();
    System.out.println("Short: " + (t2 - t1));
    int i1 = 10;
    int i2 = 20;
    t1 = System.nanoTime();
    int result3 = i1 + i2;
    t2 = System.nanoTime();
    System.out.println("Int: " + (t2 - t1));
    long l1 = 10;
    long l2 = 20;
    t1 = System.nanoTime();
    long result4 = l1 + l2;
    t2 = System.nanoTime();
    System.out.println("Long: " + (t2 - t1));
}