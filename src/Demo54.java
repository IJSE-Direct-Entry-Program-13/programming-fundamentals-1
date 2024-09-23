void main(){
    int a = 2;
    int b = 3;
    int result = -a++ >= ~b && a++ > (b+= a+ -b) ? b++ ^ 3 & 2 :
            "hello".equals("Hello") | b++ > a++ ? 5 + 3 :
                    (a += a) + (b -= 2) + a + b;
    System.out.println(result);
    System.out.println(STR."a=\{a}");
    System.out.println(STR."b=\{b}");
}