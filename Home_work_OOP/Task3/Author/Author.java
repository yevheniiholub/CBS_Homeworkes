package Home_work_OOP.Task3.Author;

public class Author {
    private String authorName;      // Захищене поле

    // Конструктор
    public Author(){
    }

    // Геттер
    public String getAuthorName() {
        return authorName;
    }

    // Сеттер
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
