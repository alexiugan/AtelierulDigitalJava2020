package finalProject;

public class EraserFactory implements ProductAbstractFactory{

    @Override
    public Product create() {
        return new EraserStock();
    }
}
