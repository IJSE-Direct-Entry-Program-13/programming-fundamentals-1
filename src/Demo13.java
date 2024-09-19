void main(){
    byte b = 10;
    short s = 20;
    int i = 30;
    long l = 40;
    float f = 5.0f;
    double d = 6.0;
    char c = 'A';
    boolean bool = true;

    --b;
    --s;
    --i;
    --l;
    --f;
    --d;
    --c;
    // bool++;
    // 5++;

    System.out.println(STR."byte(b): \{b}");
    System.out.println(STR."short(s): \{s}");
    System.out.println(STR."int(i): \{i}");
    System.out.println(STR."long(l): \{l}");
    System.out.println(STR."float(f): \{f}");
    System.out.println(STR."double(d): \{d}");
    System.out.println(STR."char(c): \{c} - \{c + 0}");
}