package be.vdab;
public class Coordinaat {
    private final int x, y, z;
    
    private Coordinaat(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public String toString() {
        return ("(" + x + ", " + y + ", " + z + ")");
    }
    
    public static class CoordinaatBuilder {
        private int x, y, z;
        public CoordinaatBuilder metX(int x) {
            this.x = x;
            return this;
        }
        public CoordinaatBuilder metY(int y) {
            this.y = y;
            return this;
        }
        public CoordinaatBuilder metZ(int z) {
            this.z = z;
            return this;
        }
        public Coordinaat maakCoordinaat() {
            return new Coordinaat(x, y, z);
        }
    }
}
