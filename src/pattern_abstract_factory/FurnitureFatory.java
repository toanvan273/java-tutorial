package pattern_abstract_factory;

public class FurnitureFatory {
    public FurnitureFatory() {

    }
    public static FurnitureAbstractFactory getFactory(MaterialType materialType){
        switch (materialType){
            case WOOD:
                return new WoodFactory();
            case FLASTIC:
                return new PlasticFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported");
        }
    }
}
