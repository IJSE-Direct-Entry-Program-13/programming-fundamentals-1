void main() {
    byte b1 = 5;
    byte b2 = 8;
    short s1 = 6;

    byte b3 = true ? b1 : b2;
    // byte b3 = true ? b1: s1;
    short s3 = true ? b1: s1;
    int i1 = true ? b1: s1;

    char c = 5;
    // byte b4 = true ? b1: c;
    // short s4 = true ? b1: c;
    // char c2 = true ? b1: c;
    int i2 = true ? b1: c;

    int i = 10;
    int b5 = true ? b1: i;

    long l3 = 1234567891;
    float f = l3;
    System.out.println(f);
}