package finalProject;

public class NotebookFactory implements ProductAbstractFactory{
    @Override
    public Product create() {
        return new NotebookStock();
    }
}
