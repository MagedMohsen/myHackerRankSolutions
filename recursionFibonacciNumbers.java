public static int fibonacci(int n) {
    //base cases: 0 or 1 is reached
    if (n==0){
        return 0;
    }
    if (n==1){
        return 1;
    }
    //return the recursion of the smaller + the second smalle number
    return (fibonacci(n-1)+fibonacci(n-2));
}