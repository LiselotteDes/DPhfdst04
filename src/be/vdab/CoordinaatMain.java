package be.vdab;
public class CoordinaatMain {
    public static void main(String[] args) {
        Coordinaat.CoordinaatBuilder builder = new Coordinaat.CoordinaatBuilder();
        Coordinaat coordinaat = builder.metX(2)
                                        .metY(4)
                                        .metZ(0)
                                        .maakCoordinaat();
        System.out.println(coordinaat);
    }
    
}
