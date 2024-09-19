void main(){
    int x = 2;
    int result = -(~++x) >> x + 2;
    System.out.println(result);

    int y = 2;
    y -= 2 + ++y * (y >>= ~(-y)) + y;
    System.out.println(y);

    int k = 2;
    int result2 = ~++k >= 3 ? k++ + 2 : k + 2 >= ~k ? k++ + 2 : --k * 2;
    System.out.println(result2 + k);

    int a = 3;
    int result3 = ~a >> 2 + (a + 2) > 0 ? !!true ? 2 : 3 : !false ? 2 : -1;
    System.out.println(result3);

    int b = 2;
    int result4 = b++ > (~b - 2) ? b >>> -2 : b >>> 2;
    System.out.println(result4);

    int c = 2;
    int l = 3;
    int m = ++c + (l =+ --l * 2) + 2;
    int result5 = m + (c += (c <<= 1) + 2 + c) + l & 2 ^ 3;
    System.out.println(STR."result5=\{result5}");
    System.out.println(STR."m=\{m}");
    System.out.println(STR."l=\{l}");
    System.out.println(STR."c=\{c}");
}