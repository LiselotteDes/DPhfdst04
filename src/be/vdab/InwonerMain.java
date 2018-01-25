package be.vdab;
public class InwonerMain {
    public static void main(String[] args) {
        // Probleem: Je moet veel parameters meegeven om een object aan te maken
//        Inwoner inwoner1 = new Inwoner("Olivier", "Gerard", 1, 3, true, false);
        
        // Oplossing: met een extra class (InwonerBuilder) die helpt deze class (Inwoner) stap per stap op te bouwen.
        // InwonerBuilder is een nested class van Inwoner
        Inwoner.InwonerBuilder builder = new Inwoner.InwonerBuilder();
        Inwoner inwoner = builder.metVoornaam("Olivier")
                                .metFamilienaam("Gerard")
                                .metAantalKinderen(1)
                                .metAantalKerenVerhuisd(3)
                                .metGehuwd(true)
                                .metGescheiden(false)
                                .maakInwoner();
        System.out.println(inwoner);
    }
    
}
