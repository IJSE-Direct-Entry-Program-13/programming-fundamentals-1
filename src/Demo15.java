void main(){
    int x = 2;
    int y = 5;

    System.out.println(x++ + ++y + x + y);

    int a = 2;
    int b = 3;

    System.out.println(a++ + ++a + a + b + ++b + b-- + b - a + a++);

    int k = 5;
    int m = 2;
    int n = 3;

    k = k++ + m + ++n - --m;
    m = ++k - ++m + n - k + n;
    n = m++ - --k + m + --n + n++ + k--;
    System.out.println(k++ + --m + n);
    System.out.println(STR."k: \{k}");
    System.out.println(STR."m: \{m}");
    System.out.println(STR."n: \{n}");
}