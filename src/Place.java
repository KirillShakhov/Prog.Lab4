public class Place extends Thing implements IPlace {
    private String whereIs;

    public Place(String name) {
        super(name);
    }
    public Place(String name, String whereIs) {
        super(name);
        this.whereIs = whereIs;
    }

    public String whereIs() {
        return whereIs;
    }
}
