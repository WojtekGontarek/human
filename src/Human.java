public class Human {
    private String name;
    private String surname;
    private int age;
    private EyeColor eyeColor;
    private HairColor hairColor;

    public Human(String name, String surname, int age, EyeColor eyeColor, HairColor hairColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", eyeColor=" + eyeColor +
                ", hairColor=" + hairColor +
                '}';
    }
}
