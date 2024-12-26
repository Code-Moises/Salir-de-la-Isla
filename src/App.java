import java.util.Scanner;

public class App {

  public static class Valores{
    private int balsa;
    private int nutricion;
    private int energia;
    private int hidratacion;

    public Valores(int balsa, int nutricion, int energia, int hidratacion){
      this.balsa=balsa;
      this.nutricion=nutricion;
      this.energia=energia;
      this.hidratacion=hidratacion;
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int respuesta;
    Valores valores = new Valores(0, 50, 50, 50);

    do{
      PanelPrincipal(valores);
      System.out.print("Introduce opción elegida: ");
      respuesta=scanner.nextInt();
      switch (respuesta) {
        case 1:
          Construir(valores);
          break;
        case 2:
          Comer(valores);
          break;
        case 3:
          Dormir(valores);
          break;
        case 4:
          Beber(valores);
          break;
        case 0:
          System.out.println("Espero que hayas disfrutado del juego");
          break;
      
        default:
        System.out.println("Opción no valida");
          break;
      }


    }while(valores.nutricion>0 && valores.energia>0 && valores.hidratacion>0);
    if (valores.nutricion>0 && valores.energia>0 && valores.hidratacion>0) {
      System.out.println("Has perdido. ¡GAME OVER!");
    }
    scanner.close();
  }

  public static void PanelPrincipal(Valores valores){
    System.out.println("╔═══════════════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Valores actuales:  Balsa = "+valores.balsa+ "  Nutrición = "+valores.nutricion+"  Energía = " +valores.energia+ "  Hidratración = "+valores.hidratacion+ " ║");
    System.out.println("╚═══════════════════════════════════════════════════════════════════════════════╝");

    System.out.println("Posibles acciones:");
    System.out.println("0.- para salir");
    System.out.println("1.- para construir       Balsa +15     Nutrición -10    Energía -20     Hidratación -10");
    System.out.println("2.- para comer                         Nutrición +50    Energía +5      Hidratación +10");
    System.out.println("3.- para dormir                        Nutrición -20    Energía +60     Hidratación -20");
    System.out.println("4.- para beber                                                          Hidratación +30");
    System.out.println();

  }

  public static String Construir(Valores valores){
    valores.balsa+=15;
    valores.nutricion-=10;
    valores.energia-=20;
    valores.hidratacion-=10;
    return "Despues de construir tu estado es: ";
  }

  public static String Comer(Valores valores){
    valores.nutricion+=50;
    valores.energia+=5;
    valores.hidratacion+=10;
    return "Despues de comer tu estado es: ";
  }

  public static String Dormir(Valores valores){
    valores.nutricion-=20;
    valores.energia+=60;
    valores.hidratacion-=20;
    return "Despues de dormir tu estado es: ";
  }

  public static String Beber(Valores valores){
    valores.hidratacion+=30;
    return "Despues de Beber tu estado es: ";
  }
}