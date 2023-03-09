package chapter14;

 class HierDemo2 {
     public static void main(String[] args) {
         Gen2<String> w = new Gen2<String>("Hello", 47);

         System.out.println(w.getob()+ " ");
         System.out.println(w.getNum());
     }
}
