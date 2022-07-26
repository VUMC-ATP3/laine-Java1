package classroomFive.pirmaisUzdevums;

public class Author {
    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Autors{" +
                "Vārds='" + name + '\'' +
                ", epasts='" + email + '\'' +
                ", dzimums=" + gender +
                '}';
    }
}


