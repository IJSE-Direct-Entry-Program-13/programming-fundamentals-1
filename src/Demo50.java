void main() {
    int result1 = 5 + 2 * 3 + 3;

    int result2 = (5 + 2) * 3 + 3;
    int result3 = 5 + (2 * 3) + 3;
    int result4 = 5 + 2 * (3 + 3);
    int result5 = 5 + ((2 * 3) + 3);

    System.out.println(STR."5 + 2 * 3 + 3 = \{result1}");
    System.out.println(STR."(5 + 2) * 3 + 3 = \{result2}");
    System.out.println(STR."5 + (2 * 3) + 3 = \{result3}");
    System.out.println(STR."5 + 2 * (3 + 3) = \{result4}");
    System.out.println(STR."5 + ((2 * 3) + 3) = \{result5}");

    int a = 2;
    int result7 = (a++ + (++a * 2));
    System.out.println(STR."result7 = \{result7}");

    int b = 1;
    int result8 = b++ * 2 + ++b * 3;
    System.out.println(STR."result8 = \{result8}");

    int x = 1;
    int y = 5;

    int result9 = x++ + (((x++ + 2) + (--y + 2) + ++x + ++y) + ++x + ++y);
    System.out.println(STR."result9 = \{result9}");
}