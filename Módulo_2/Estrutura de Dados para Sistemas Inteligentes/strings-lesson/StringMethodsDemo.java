public class StringMethodsDemo {

    public static void main(String[] args) {

        String a = "airplane";
        System.out.println(a.charAt(2));

        String l = "book";
        System.out.println(l.concat("author"));

        String b = "library";
        System.out.println(b + "card");

        String x = "United";
        x += "States";
        System.out.println(x);

        String s = "Exit";
        System.out.println(s.equalsIgnoreCase("EXIT"));
        System.out.println(s.equalsIgnoreCase("tixe"));

        String c = "01234567";
        System.out.println(c.length());

        String o = "oxoxoxox";
        System.out.println(o.replace('x', 'X'));

        String f = "0123456789";
        System.out.println(f.substring(5));
        System.out.println(f.substring(5, 8));

        String g = "A new Java book";
        System.out.println(g.toLowerCase());

        String h = "A new Java book";
        System.out.println(h.toUpperCase());

        String i = "hi ";
        System.out.println(i + "x");
        System.out.println(i.trim() + "x");

        String j = "Java";
        char[] charArray = j.toCharArray();
        System.out.println(charArray.length);

        String m = "Java is a programming language";
        System.out.println(m.contains("Abel"));
        System.out.println(m.contains("Java"));

        StringBuilder sb = new StringBuilder("JavaWorld");
        sb.delete(4, 8);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("ABC");
        sb2.insert(1, "xyz");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("ABCDEF");
        sb3.replace(1, 3, "XYZ");
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("ABCDEF");
        sb4.reverse();
        System.out.println(sb4);

        StringBuilder sb5 = new StringBuilder("ABCDEF");
        sb5.setCharAt(3, 'x'); // At this point sb value is ABCxEF
        System.out.println(sb5);

    }

}