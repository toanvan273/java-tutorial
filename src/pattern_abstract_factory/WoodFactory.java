package pattern_abstract_factory;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Table createTable() {
        return new WoodTable();
    }

    @Override
    public Chair createChair() {
        return new Woodchair();
    }
}
