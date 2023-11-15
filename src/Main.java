public class Main {
    public static void main(String[] args) {

        //Producto p1 = new Producto("Producto generico 1", 0, "C001", 0, "sin marca");
        Producto p1 = new Producto();
        p1.ingresarProducto();


        //aqui usa la sobreeescritura del metodo del override del producto
        Alimento a1 = new Alimento();
        a1.ingresarProducto();


        //aqui solo usa del producto
        Electrodomestico e1 = new Electrodomestico();
        e1.ingresarProducto();

    }
}