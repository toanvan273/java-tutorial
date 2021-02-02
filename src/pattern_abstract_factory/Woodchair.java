package pattern_abstract_factory;

public class Woodchair implements Chair{
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
