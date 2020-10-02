import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

class rem{
    public static Scanner scan = new Scanner(System.in);

    private static String name = "test";

    public static void print(java.lang.Object obj){
      System.out.println(obj);
    }

    public static void printarray(java.lang.Object a[]){
      for(java.lang.Object b : a){
        print(b);
      }
    }

    public static void printarray(Vector<java.lang.Object> a) {
        for (int i = 0; i < a.size(); i++) {
            print(a.get(i));
        }
    }

    static{
        rem a = new rem();
        a = null;
        System.out.print("Name of Class: ");
        name = scan.nextLine();
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        /*REMOVE*/TimeUnit.MILLISECONDS.sleep(25);

        //MAIN CODE STARTS

        print("What type of item are you buying?");
        String a = scan.nextLine();
        print("How many are you buying?");
        int b = scan.nextInt();
        print("How much does each one cost?");
        double c = scan.nextDouble();
        double sum = b * c;
        print(b + " " + a + " at $" + c + " each will cost you $" +  sum);

        //MAIN CODE ENDS

        /*REMOVE*/try {
            TimeUnit.MILLISECONDS.sleep(25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void finalize(){
        try{
            FileInputStream stream = new FileInputStream("main.java");
            DataInputStream in = new DataInputStream(stream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String s;

            print("");
            print("------SOURCE CODE------");
            print("");

            while((s = br.readLine() ) != null)
            {
                if (s.contains("class "+"rem{")){
                    print("class " + name + "{");
                }
                else if (s.contains("static{")) {
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                    br.readLine();
                }
                else if (s.contains("/*REMOVE*/try")){
                    print("    }");
                    print("}");
                    in.close();
                    break;
                }
                else if (s.contains("/*REMOVE*/Time")){
                    br.readLine();
                }
                else{
                   print(s);
                }
            }

            print("");
            print("------NORMAL RUN------");
            print("");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
