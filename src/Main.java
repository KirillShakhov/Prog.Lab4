public class Main {
    /*
    Все обернулись и посмотрели. Какая-то тень отделилась от стены в темном углу.
    Что-то серое и сморщенное прошаркало по полу гостиной, заморгало от солнечного света и затрясло седыми усами,
    враждебно оглядывая семью муми-троллей.
     */
    public static void main(String[] args) {

        /*Everything everything = new Everything("Все");



        Shadow shadow = new Shadow("тень");
        shadow.addDescription("Какая-то");



        Corner corner = new Corner("углу");
        corner.addDescription("темном");

        Wall wall = new Wall("стена", corner.getDescription(0)+d.dot(DotsType.SPACE)+corner);


        Something something = new Something("Что-то");
        something.addDescription("серое");
        something.addDescription("сморщенное");
        Floor floor = new Floor("пол", "гостинной");

        Light light = new Light("света");
        light.addDescription("солнечого");

        Mustache mustache = new Mustache("усами");
        mustache.addDescription("седыми");

        Family family = new Family("семью муми-троллей");

        Act act = new Act();

         */
        /*
        System.out.println(everything+d.dot(DotsType.SPACE)+everything.look()+d.dot(DotsType.AND)+everything.turnBack());
        System.out.println(shadow.getDescription(0)+d.dot(DotsType.SPACE)+shadow+d.dot(DotsType.SPACE)+shadow.separate(wall.whereIs()));
        System.out.println(something+d.dot(DotsType.SPACE)+something.getDescription(0)+d.dot(DotsType.AND)+something.getDescription(1)
                +d.dot(DotsType.SPACE)+something.shuffled(floor+d.dot(DotsType.SPACE)+floor.whereIs())+d.dot(DotsType.COMMA)
                +something.blinked(light.getDescription(0)+d.dot(DotsType.SPACE)+light)+d.dot(DotsType.AND)
                +something.shake(mustache.getDescription(0)+d.dot(DotsType.SPACE)+mustache)+d.dot(DotsType.COMMA)
                +something.look(family.toString())+d.dot(DotsType.DOT));
         */
        Act act = new Act();
        act.one();
        act.two();
        act.three();
    }
}
