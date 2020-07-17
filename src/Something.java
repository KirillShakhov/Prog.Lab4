import java.util.ArrayList;

public class Something extends Thing {

    public Something(String name) {
        super(name);
    }

    public Something(String name, ArrayList<String> description) {
        super(name, description);
    }

    String shuffled(String wh){
        return "прошаркало по "+wh;
    }

    String blinked(String dueto){
        return "заморгало от "+dueto;
    }

    String shake(String wh){
        return "затрясло "+wh;
    }

    String look(String wh){
        return "оглядывая "+wh;
    }
}
