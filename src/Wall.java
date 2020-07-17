public class Wall extends Place {
    public Wall(String name) {
        super(name);
    }
    public Wall(String name, String whereIs) {
        super(name, whereIs);
    }

    @Override
    public String whereIs() {
        return getName()+" в "+super.whereIs();
    }
}
