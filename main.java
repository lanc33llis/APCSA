import java.util.*;
// import edhesive.shapes.*;

class a{
  public int i;
  a(int b){
    i = b;
  }
}

class U2_L1_Activity_Two{
    public static Scanner scan = new Scanner(System.in);
    
    public static void print(java.lang.Object obj){
      System.out.println(obj);
    }

    public static void printarray(java.lang.Object a[]){
      for(java.lang.Object b : a){
        print(b);
      }
    }

    public static void printarray(Vector<java.lang.Object> a)
    {
      for (int i = 0; i < a.size(); i++){
        print(a.get(i));
      }
    }

    public static void main(String[] args){
      Integer a = new Integer(12);
      Integer b = new Integer(22);
      print(a.compareTo(b));

    }
}
