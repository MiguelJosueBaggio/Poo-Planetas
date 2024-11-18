//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


Planeta P1 =new Planeta("Tierra",1,1000000,5000000,400000,185256147,"TERRESTRE",true);
        System.out.println("el nombre del planeta es:" + P1.nombre() );
        System.out.println("el numero de satelites es: " + P1.numero_satelites());
        System.out.println("la masa del planeta es: " + P1.masa()+ "TN");
        System.out.println("el volumen es: " + P1.volumen()+ "kg3");
        System.out.println("el diametro es: " + P1.diametro()+ "km");
        System.out.println("la distancia al sol es: " + P1.distancia_sol()+"km");
        System.out.println("el tipo de planeta es: "+ P1.tipo_planeta());
        System.out.println("Es observable?: "+ P1.Observable_simpl_vist());
        System.out.println("su densidad es:" + P1.calcualar_densidad());

        Planeta P2 =new Planeta("Marte",3,800000,2000000,300000,200256147,"TERRESTRE",false);
        System.out.println("el nombre del planeta es:" + P2.nombre() );
        System.out.println("el numero de satelites es: " + P2.numero_satelites());
        System.out.println("la masa del planeta es: " + P2.masa()+ "TN");
        System.out.println("el volumen es: " + P2.volumen()+ "kg3");
        System.out.println("el diametro es: " + P2.diametro()+ "km");
        System.out.println("la distancia al sol es: " + P2.distancia_sol()+"km");
        System.out.println("el tipo de planeta es: "+ P2.tipo_planeta());
        System.out.println("Es observable?: "+ P2.Observable_simpl_vist());
        System.out.println("su densidad es:" + P2.calcualar_densidad());











    }

}