package finalProject;

/*
 *
 * Aplicatia simuleaza un magazin care vinde mai multe produse. Odata ce starea unui anumit produs din
 * magazin se schimba (sunt vandute din ele sau sunt aduse unele noi), stocul total al magazinului
 * este si el actualizat.
 * Pentru proiect am folosit ca si design patterns: Observer, Abstract Factory si Composite.
 *
 * Composite-ul este folosit de catre Store, care are ca atribut o colectie de Products. In momentul in care
 * cantitatea unui produs se schimba, el va stii metoda carui produs sa o apeleze pentru a face actualizarea.
 *
 * Observer este necesar pentru a face actualizarea. Obiectul Store "asculta" orice schimbare facuta in
 * randul produselor, iar cand aceasta are loc, el porneste actualizarea cantitatii totale.
 *
 * Abstract Factory l-am folosit pentru a crea obiectele initiale ale produselor.
 *
 */

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        PencilFactory pf = new PencilFactory();
        NotebookFactory nf = new NotebookFactory();

        PencilStock pencil = (PencilStock) pf.create();
        pencil.addProducts(50);

        NotebookStock notebook = (NotebookStock) nf.create();
        notebook.addProducts(70);


        store.addProduct(pencil);
        store.addProduct(notebook);

        pencil.addListener(store);
        notebook.addListener(store);

        System.out.println("Total products before sale: " + store.getProductsInStock());

        pencil.sellProducts(21);
        notebook.sellProducts(8);
        System.out.println("Total products after sale: " + store.getProductsInStock());

        pencil.addProducts(100);
        System.out.println("Total products after restock: " + store.getProductsInStock());

        EraserFactory ef = new EraserFactory();
        EraserStock eraser = (EraserStock) ef.create();
        eraser.addProducts(12);

        store.addProduct(eraser);
        eraser.addListener(store);

        System.out.println("Total products after adding erasers: " + store.getProductsInStock());
    }
}
