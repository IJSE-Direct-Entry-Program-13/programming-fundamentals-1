void main() {
    int x = 2;
    //int result1 = (((x++ + x) + x) + x++ + (2 + (x * 2)));
    int result2 = x++ + x + x + x++ + 2 + x * 2;

    //System.out.println("result1=" + result1);
    System.out.println("result2=" + result2);
}