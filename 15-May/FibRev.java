import java.io.*;
class Fibonacci extends Thread {
     public void run() {
          try {
               int a=0, b=1, c=0;
               BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter the number : ");
               int n = Integer.parseInt(br.readLine());
               System.out.print("Fibonacci series : ");
               while (n>0) {
                    System.out.print(c + " ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception e) {
               System.out.println("Exception occurred" + e);
          }
     }
}
class Reverse1 extends Thread {
     public void run() {
          try {
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              System.out.print("\nEnter the number : ");
              int n = Integer.parseInt(br.readLine());
               System.out.print("Reverse is: ");
               for(int i=n;i>0;i--) {
                    System.out.print(i + " ");
               }
          }
          catch (Exception e) {
               System.out.println("Exception occurred" + e);
          }
     }
}
class FibRev {
     public static void main(String[] args) {
          try {
               Fibonacci f = new Fibonacci();
               f.start();
               Thread.sleep(5000);
               Reverse1 r = new Reverse1();
               r.start();
          }
          catch (Exception e) {
               System.out.println("Exception occurred" + e);
          }
     }
}