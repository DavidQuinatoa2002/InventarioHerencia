import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilAnios;
    private String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtilAnios,
                            String sitioFabricacion, double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico() {
    }


    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio: ");
        this.precio =sc.nextDouble();
        System.out.println("Ingrese el codigo: ");
        this.codigo = sc.next();
        System.out.println("Ingrese la cantidad: ");
        this.cantidad = sc.nextInt();
        System.out.println("Ingrese la marca: ");
        this.marca = sc.next();

        System.out.println("Ingrese la vida util del producto: ");
        this.vidaUtilAnios = sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion del producto: ");
        this.sitioFabricacion = sc.next();
        System.out.println("Ingrese el voltaje de fabricacion: ");
        this.voltajeAlimentacion = sc.nextDouble();
        System.out.println("Ingrese la garnatia del producto: ");
        this.garantia = sc.next();
    }


    @Override
    public void imprimirProducto(){
       // Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: "+nombre);
        System.out.println("Ingrese el precio: "+precio);
        System.out.println("Ingrese el codigo: "+codigo);
        System.out.println("Ingrese la cantidad: "+cantidad);
        System.out.println("Ingrese la marca: "+marca);
        System.out.println(" la vida util del producto: "+vidaUtilAnios);
        System.out.println(" el sitio de fabricacion del producto: "+sitioFabricacion);
        System.out.println(" el voltaje de fabricacion: "+voltajeAlimentacion);
        System.out.println(" la garnatia del producto: "+garantia);

    }


}
