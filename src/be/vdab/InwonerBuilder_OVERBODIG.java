//package be.vdab;
//// De builder class:
//public class InwonerBuilder {
//    private String voornaam;
//    private String familienaam;
//    private int aantalKinderen;
//    private int aantalKeerVerhuisd;
//    private boolean gehuwd;
//    private boolean gescheiden;
//    /*
//    *** METHODS ***
//    Idere method van een builder geeft dezelfde builder terug.
//    Dit laat de fluent interface toe:
//     .metVoornaam("Olivier").metFamilienaam("Gerard")
//    */
//    public InwonerBuilder metVoornaam(String voornaam) {
//        this.voornaam = voornaam;
//        return this;
//    }
//    public InwonerBuilder metFamilienaam(String familienaam) {
//        this.familienaam = familienaam;
//        return this;
//    }
//    public InwonerBuilder metAantalKinderen(int aantalKinderen) {
//        this.aantalKinderen = aantalKinderen;
//        return this;
//    }
//    public InwonerBuilder metAantalKerenVerhuisd(int aantalKerenVerhuisd) {
//        this.aantalKeerVerhuisd = aantalKerenVerhuisd;
//        return this;
//    }
//    public InwonerBuilder metGehuwd(boolean gehuwd) {
//        this.gehuwd = gehuwd;
//        return this;
//    }
//    public InwonerBuilder metGescheiden(boolean gescheiden) {
//        this.gescheiden = gescheiden;
//        return this;
//    }
//    public Inwoner maakInwoner() {
//        return new Inwoner(voornaam, familienaam, aantalKinderen, aantalKeerVerhuisd, gehuwd, gescheiden);
//    }
//}
