package pattern_abstract_factory;

public class mainClient {
    public  static void main(String[] args){
        FurnitureAbstractFactory factory = FurnitureFatory.getFactory(MaterialType.FLASTIC);

        Chair chair = factory.createChair();
        chair.create(); // create plastic chair

        Table table = factory.createTable();
        table.create(); // create plastic table
    }
}
