public class BasicMath {
    public static void main(String[] args) {
        Digit d=new Digit();
        d.printDigit(77894);
        d.countDigit(7823);
        d.sumOfDigit(873864);
        d.revNum(8738);
        d.palindrome(1223);
        d.checkArmStrong(372);
        d.printAllDivsiors(36);
        d.findDivisor(36);
        d.checkPrime(88);
        d.findGCD(11, 10);
        d.findLCM(15, 18);
        d.countOddDigit(1637);
        d.findLargestdigit(637648);
        System.out.println(d.factorial(5));
        d.isPerfectNumber(6);
        System.out.println(d.countPrimes(5));
        

    }

}
class Digit{
    // time complexity= o(log n) base 10
    void printDigit(int num){
        while(num>0){
            int lastdigit=num%10;
            System.out.print(lastdigit+" ");
            num/=10;
        }
        System.out.println();
    }
    
    void countDigit(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        System.out.println("Number of digits: "+count);
    }
    void sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println("Sum of digits is: "+sum);
    }

    void revNum(int num){
        int rev=0;
        while(num>0){
            int lastdigit=num%10;
            rev=rev*10+lastdigit;
            num/=10;
        }
        System.out.println("reversed num is: "+rev);
    }

    void palindrome(int num){
        int rev=0;
        int temp=num;
        while(num>0){
            int lastdigit=num%10;
            rev=rev*10+lastdigit;
            num/=10;
        }
        if(rev==temp){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }

    void checkArmStrong(int num){
        int sum=0;
        int temp=num;
        while(temp>0){
            sum+=(temp%10)*(temp%10)*(temp%10);
            temp/=10;
        }
        if(sum==num){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }

    void printAllDivsiors(int num){
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
        System.out.println();
    }

    public void findDivisor(int n) {
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                System.out.print(i+" ");

                if(i!=n/i){
                    count++;
                    System.out.print(n/i+" ");
                }
            }

        }
        System.out.println("Number of divisors: "+count);
    }

    void checkPrime(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                count++;
                if((num/i!=i)){
                    count++;
                }
            }
        }
        if(count==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }

    void findGCD(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a=a%b;
            }
            else{
                b=b%a;
            }
        }
        if(a==0){
            System.out.println("GCD is: "+b);
        }
        else{
            System.out.println("GCD is: "+a);
    }
}
    private int calGcd(int a,int b){
        while(a>0 && b>0){
            if(a>b){
                a%=b;
            }
            else{
                b%=a;
            }
        }
        if(a==0){
            return b;
        }
        else{
            return a;
        }
    }
    void findLCM(int a,int b){
        int gcd=calGcd(a,b);
        int LCM=(a*b)/gcd;
        System.out.println("LCM is: "+LCM);
    }

    void countOddDigit(int num){
        int count=0;
        while(num>0){
            int lastdigit=num%10;
            if(lastdigit%2!=0){
                count++;
            }
            num/=10;
            
        }
        System.out.println("count of odd digits:"+count);
    }

    void findLargestdigit(int num){
        int largest=0;
        while(num>0){
            int lastdigit=num%10;
            num/=10;
            if(lastdigit>largest){
                largest=lastdigit;
            }
        }
        System.out.println("Largest digit of a num is: "+largest);
    }

    int factorial(int num){
        int fact=1;
        if(num==0||num==1){
            return 1;
        }
        int factnm1=factorial(num-1);
        fact=num*factnm1;

        return fact;
    }

    void isPerfectNumber(int num){
        int sum=0;
        int temp=num;

        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                sum+=i;
                if(num/i!=i){
                    sum+=i;
                }
            }

        }
        if(temp==sum){
            System.out.println("The num "+num+" is perfect");
        }
        else{
            System.out.println("The num "+num+" is not perfect.");
        }
    }

    // Sieve of Eratosthenes: count prime nums till n(less than n strictly)

    public int countPrimes(int n) {
        // if num is already less than 2
        if(n<2){
            return 0;
        }
        boolean[] isPrime=new boolean[n+1];
        // mark all as true
        for(int i=2;i<n;i++){
            isPrime[i]=true;
        }
        // eliminate multiple of i
        for(int i=2;i<=(n-1)/i;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){ //Multiple of i
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        // count the prime nums: 
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
            }
        }
        return count;
    }

}

