package finalProject;

public class PencilFactory implements ProductAbstractFactory{

    @Override
    public Product create() {
        return new PencilStock();
    }
}
