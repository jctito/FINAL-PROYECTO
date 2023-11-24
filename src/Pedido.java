public class Pedido {
    int id;
    double totala;
    double fecha;

    public Pedido() {

    }

    public Pedido(int id, double totala, double fecha) {
        this.id = id;
        this.totala = totala;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotala() {
        return totala;
    }

    public void setTotala(double totala) {
        this.totala = totala;
    }

    public double getFecha() {
        return fecha;
    }

    public void setFecha(double fecha) {
        this.fecha = fecha;
    }
}
