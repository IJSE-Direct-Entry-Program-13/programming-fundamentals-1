void main(){
    int result = value1() + value1() * value2();
    System.out.println(result);
}

int value1(){
    System.out.println("Value1");
    return 2;
}

int value2(){
    System.out.println("Value2");
    return 3;
}
