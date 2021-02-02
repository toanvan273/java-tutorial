package pattern_builder;

public class main {
    public static void main(String[] args) {
        StudentBuilder studentConcreteBuilder = new StudentConcreteBuilder()
                .setFirstName("Truong")
                .setLastName("Toan");
        System.out.println(studentConcreteBuilder.build().toString());
    }
}
