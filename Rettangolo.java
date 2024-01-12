public class Rettangolo implements Forma {
    private int latoA;
    private int latoB;

    public Rettangolo(int latoA, int latoB) {
        this.latoA = latoA;
        this.latoB = latoB;
    }

    public int getLatoA() {
        return latoA;
    }

    public int getLatoB() {
        return latoB;
    }

    public void setLatoA(int latoA) {
        this.latoA = latoA;
    }

    public void setLatoB(int latoB) {
        this.latoB = latoB;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "latoA=" + latoA +
                ", latoB=" + latoB +
                '}';
    }

    @Override
    public int calcolaArea() {
        int area;
        area = latoA * latoB;
        return area;
    }
}
