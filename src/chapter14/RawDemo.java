package chapter14;

 class RawDemo {
     public static void main(String[] args) {
         Gen<Integer> iOb = new Gen<Integer>(88);
         Gen<String> strOb = new Gen<String >("Generics test");

         Gen raw = new Gen(Double.valueOf(98.6));

         double d = (Double) raw.getob();
         System.out.println("value: " + d);

         strOb = raw;
         raw = iOb;
     }


}
