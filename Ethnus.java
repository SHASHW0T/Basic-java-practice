public class Ethnus{
    public static void main(String[] args) {

        String a1 = "Saksham";
        String a2 = "sakshamkothari";
        String a3 = "shashwat vs mannan";
        System.out.println(a1.length());
        System.out.println(a2.length());
        System.out.println(a1.toUpperCase());
        System.out.println(a2.toUpperCase());
        System.out.println(a1.toLowerCase());
        System.out.println(a2.toLowerCase());
        System.out.println(a1.startsWith("Sak"));
        System.out.println(a2.endsWith("ari")); 
        System.out.println(a1.substring(3));
        System.out.println(a3.indexOf("n"));
        System.out.println(a1.replace('a','b'));
        System.out.println(a1.split("a",0));
    }
}