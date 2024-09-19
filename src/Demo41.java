void main(){
    byte b1 = 10;
    byte b2 = 5;
    long l1 = 2l;

    // Bitwise - Integer
    int i1 = b1 & b2;
    int i2 = b1 ^ b2;
    int i3 = b1 | b2;

    long i4 = b1 & l1;

    byte b3 = 5;
    byte b4 = 8;
    int b5 = b3 + b4;

    System.out.println(i1);
    System.out.println(i2);
    System.out.println(i3);
}