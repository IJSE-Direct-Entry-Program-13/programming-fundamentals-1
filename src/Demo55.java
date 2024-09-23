void main(){
    int a = 2;
    int b = ~-~-a;
    a += b;
    boolean flag =true;
    int result = a++ * 2 + (b *= (b -= 2) + a) + ((flag ^= ((false & 5 > ~-b) || !!flag)) ? a++ : ++b ^ 1 & 3);
    System.out.println(STR."result = \{result}");
    System.out.println(STR."a = \{a}");
    System.out.println(STR."b = \{b}");
    System.out.println(STR."flag = \{flag}");
}