public class TestaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Fourth Wing", "Rebeca Yarros", 2023, "Entangled: Red Tower Books");
        Livro livro2 = new Livro("Holly", "Stephen King", 2023, "Scribner");
        Livro livro3 = new Livro("The Last Devil to Die: A Thursday Murder Club Mystery", "Richard Osman", 2023,
                "Viking");

        System.out.println(livro1.toString());
        System.out.println(livro2.toString());
        System.out.println(livro3.toString());
    }
}