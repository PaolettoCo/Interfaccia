public class Main {
    public static void main(String[] args) {
        Triangolo tri1 = new Triangolo(12,4);
        System.out.println("il lato a del tri1 ha un valore di " + tri1.getLatoA());
        System.out.println("il lato b del tri1 ha un valore di " + tri1.getLatoB());
        System.out.println("l'area del triangolo è " + tri1.calcolaArea());
        tri1.setLatoB(8);
        System.out.println("il nuovo valore del lato b del tri1 è " + tri1.getLatoB());
        System.out.println("la nuova area del triangolo è " + tri1.calcolaArea());
        System.out.println("                                                     ");
        Rettangolo rett1 = new Rettangolo(12,4);
        System.out.println("il lato a ha un valore di " + rett1.getLatoA());
        System.out.println("il lato b ha un valore di " + rett1.getLatoB());
        System.out.println("l'area del rettangolo è " + rett1.calcolaArea());
        rett1.setLatoB(8);
        System.out.println("il nuovo valore del lato b del ret1 è " + rett1.getLatoB());
        System.out.println("la nuova area del rettangolo è " + rett1.calcolaArea());
    }
}