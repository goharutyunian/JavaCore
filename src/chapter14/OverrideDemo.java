package chapter14;

 class OverrideDemo {
     public static void main(String[] args) {
         Gen<Integer> iOb = new Gen<Integer>(88);
         Gen2<Integer> iOb2 = new Gen2<Integer>(99);

         System.out.println(iOb.getob());
         System.out.println(iOb2.getob());

     }



}
