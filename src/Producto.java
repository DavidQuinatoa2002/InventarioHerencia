import java.sql.SQLOutput;
import java.util.Scanner;

public class Producto {

     String nombre;
     double precio;
     String codigo;
     int cantidad;
     String marca;

    public Producto(String nombre, double precio, String codigo, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public Producto() {
    }




///sobreesritura de metodos

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
   
    }

    public void imprimirProducto(){
        System.out.println("EL nombre del producto es: "+nombre);
        System.out.println("El precio del produco es: "+precio);
        System.out.println("El codigo del producto es: "+codigo);
        System.out.println("La cantidad del producto es: "+cantidad);
    }







}
