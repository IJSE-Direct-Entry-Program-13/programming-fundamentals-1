void main() {
    int a = 5;
    int b = 2;
    int c = a++-~+b;
    int result = a+++ ++b +~--c - -~(a=a+++c)+b++- ~-(b =-++a);
    System.out.println(STR."result=\{result}");
    System.out.println(STR."a=\{a}");
    System.out.println(STR."b=\{b}");
    System.out.println(STR."c=\{c}");
}