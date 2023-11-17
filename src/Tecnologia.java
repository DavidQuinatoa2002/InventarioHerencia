import java.util.Scanner;

public class Tecnologia extends Producto{

    private int vidaUtilAnios;
    private String sitioFabricacion;
    private double anioFabricacion;
    private String garantia;

    public Tecnologia(String nombre, double precio, String codigo, int cantidad, String marca, int vidaUtilAnios, String sitioFabricacion, double anioFabricacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.anioFabricacion = anioFabricacion;
        this.garantia = garantia;
    }

    public Tecnologia() {
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
        System.out.println("Ingrese el anio de fabricacion: ");
        this.anioFabricacion = sc.nextDouble();
        System.out.println("Ingrese la garnatia del producto: ");
        this.garantia = sc.next();
    }

    @Override
    public void imprimirProducto(){
        //Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: "+nombre);
        System.out.println("Ingrese el precio: "+precio);
        System.out.println("Ingrese el codigo: "+codigo);
        System.out.println("Ingrese la cantidad: "+cantidad);
        System.out.println("Ingrese la marca: "+marca);
        System.out.println(" la vida util del producto: "+vidaUtilAnios);
        System.out.println("Ingrese el sitio de fabricacion del producto: "+sitioFabricacion);
        System.out.println("Ingrese el anio de fabricacion: "+anioFabricacion);
        System.out.println("Ingrese la garantia del producto: "+garantia);

    }




}
