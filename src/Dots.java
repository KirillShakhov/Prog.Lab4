public class Dots {
    public String dot(DotsType dt){
        if (dt == DotsType.SPACE){return " ";}
        if (dt == DotsType.AND){return " и ";}
        if (dt == DotsType.COMMA){return ", ";}
        if (dt == DotsType.DOT){return ".";}
        else return "null";
    }
}
