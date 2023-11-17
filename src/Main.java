public class Main {
    public static void main(String[] args) {

        //Producto p1 = new Producto("Producto generico 1", 0, "C001", 0, "sin marca");
        Producto p1 = new Producto();
        p1.ingresarProducto();


        //aqui usa la sobreeescritura del metodo del override del producto
        Alimento a1 = new Alimento();
        a1.ingresarProducto();
        a1.imprimirProducto();


        //aqui solo usa del producto
        //Electrodomestico e1 = new Electrodomestico("Lavadora", 120, "LAV0001", 500, "Mabe", 10,
        //                "China", 10, "2 años");

        Electrodomestico e1 = new Electrodomestico();
        e1.ingresarProducto();
        e1.imprimirProducto();


        //
        Tecnologia t1 = new Tecnologia();
        t1.ingresarProducto();
        t1.imprimirProducto();


    }
}



//to string es un mtodo base d la clase adi no definamos