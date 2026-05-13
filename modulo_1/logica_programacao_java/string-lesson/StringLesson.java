public class StringLesson {
    public static void main(String args[]) {
        String primeira = "Java";
        String segunda = "CSharp";
        String terceira = new String("Python");
        
        System.out.println(primeira.toUpperCase());
        System.out.println(segunda.length());
        System.out.println(terceira);
        
        //Comparar a primeira com a segunda string
        boolean result = primeira.equals(segunda);
        System.out.println("Primeira e igual a segunda? " + result);
        
        //Comparar a segunda com a terceira string
        result = segunda.equals(terceira);
        System.out.println("Segunda e igual a terceira? " + result);
        
    }
}