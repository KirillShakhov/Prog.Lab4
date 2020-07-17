public class Act {
    Dots d = new Dots();
    void one(){
        Everything everything = new Everything("Все");


        System.out.println(everything+d.dot(DotsType.SPACE)+everything.look()+d.dot(DotsType.AND)+everything.turnBack());
    }
    void two(){
        Shadow shadow = new Shadow("тень");
        shadow.addDescription("Какая-то");

        Corner corner = new Corner("углу");
        corner.addDescription("темном");

        Wall wall = new Wall("стена", corner.getDescription(0)+d.dot(DotsType.SPACE)+corner);


        System.out.println(shadow.getDescription(0)+d.dot(DotsType.SPACE)+shadow+d.dot(DotsType.SPACE)+shadow.separate(wall.whereIs()));
    }
    void three(){
        Something something = new Something("Что-то");
        something.addDescription("серое");
        something.addDescription("сморщенное");
        Floor floor = new Floor("пол", "гостинной");

        Light light = new Light("света");
        light.addDescription("солнечого");

        Mustache mustache = new Mustache("усами");
        mustache.addDescription("седыми");

        Family family = new Family("семью муми-троллей");


        System.out.println(something+d.dot(DotsType.SPACE)+something.getDescription(0)+d.dot(DotsType.AND)+something.getDescription(1)
                +d.dot(DotsType.SPACE)+something.shuffled(floor+d.dot(DotsType.SPACE)+floor.whereIs())+d.dot(DotsType.COMMA)
                +something.blinked(light.getDescription(0)+d.dot(DotsType.SPACE)+light)+d.dot(DotsType.AND)
                +something.shake(mustache.getDescription(0)+d.dot(DotsType.SPACE)+mustache)+d.dot(DotsType.COMMA)
                +something.look(family.toString())+d.dot(DotsType.DOT));
    }
}
