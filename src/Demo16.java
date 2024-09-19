void main(){
    int a = 2;
    double b = 2.5;
    double c = b++ + ++a;
    double r = a++ + b-- + ++c + b - (b = a + ++b) + 2.5;

    System.out.println(r++ + ++b + (a = ++a + 3));
    System.out.println(STR."b: \{(b = b++ * 2)}");
    System.out.println(STR."a: \{a}");
    System.out.println(STR."r: \{r = a++ - --b}");
}