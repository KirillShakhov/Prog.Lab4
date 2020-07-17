import java.util.ArrayList;

public abstract class Thing implements IThing {
    private String name;
    private ArrayList<String> description = new ArrayList<>();

    public Thing(String name) {
        this.name = name;
    }
    public Thing(String name, ArrayList<String> des) {
        this.name = name;
        this.description = des;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(int i){
        return this.description.get(i);
    }
    public void addDescription(String des){
        this.description.add(des);
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
