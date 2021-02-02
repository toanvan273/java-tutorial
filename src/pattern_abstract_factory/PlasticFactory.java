package pattern_abstract_factory;

public class PlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }
}