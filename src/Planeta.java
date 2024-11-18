public class Planeta {

private String nombre = null;
private int numero_satelites=0;
private double masa =0;
private double volumen =0;
private int diametro = 0;
private int distancia_sol =0;
private String tipo_planeta ;
private boolean Observable_simpl_vist = false;

    public Planeta(String nombre, int numero_satelites, double masa, double volumen, int diametro, int distancia_sol, String tipo_planeta, boolean observable_simpl_vist) {
        this.nombre = nombre;
        this.numero_satelites = numero_satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distancia_sol = distancia_sol;
        this.tipo_planeta = tipo_planeta;
        Observable_simpl_vist = observable_simpl_vist;
    }

    public String nombre() {
        return nombre;
    }

    public Planeta setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public int numero_satelites() {
        return numero_satelites;
    }

    public Planeta setNumero_satelites(int numero_satelites) {
        this.numero_satelites = numero_satelites;
        return this;
    }

    public double masa() {
        return masa;
    }

    public Planeta setMasa(double masa) {
        this.masa = masa;
        return this;
    }

    public double volumen() {
        return volumen;
    }

    public Planeta setVolumen(double volumen) {
        this.volumen = volumen;
        return this;
    }

    public int diametro() {
        return diametro;
    }

    public Planeta setDiametro(int diametro) {
        this.diametro = diametro;
        return this;
    }

    public int distancia_sol() {
        return distancia_sol;
    }

    public Planeta setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
        return this;
    }

    public String tipo_planeta() {
        return tipo_planeta;
    }

    public Planeta setTipo_planeta(String tipo_planeta) {
        this.tipo_planeta = tipo_planeta;
        return this;
    }

    public boolean Observable_simpl_vist() {
        return Observable_simpl_vist;
    }

    public Planeta setObservable_simpl_vist(boolean observable_simpl_vist) {
        Observable_simpl_vist = observable_simpl_vist;
        return this;
    }


    public double calcualar_densidad () {

        return masa/volumen;

    }
    public boolean es_exterior (int distancia_sol) {
        boolean exterior =false;
        if (distancia_sol>508632758){
             exterior=true;

        }
        else {
            exterior =false ;}
        return  exterior;
    }




}
