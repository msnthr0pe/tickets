package Pr2actually1;

public class TestAuthor {
    public static void main (String[] args) {
        Author a1 = new Author("Pushkin", "pushkin.a.s.@edu.mirea.ru", 'm');
        Author a2 = new Author("Gogol", "gogol.n.v.@edu.mirea.ru", 'm');
        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("pushkin@gmail.com");
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a2);
    }
}
