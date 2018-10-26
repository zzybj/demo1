package test;

public enum Balls {

    FOOTBALL("足球",1), BASKETBALL("篮球",2), PINGPANG("乒乓球",3);

    private String name;
    private int index;

    Balls(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static String getName(int index) {
        for (Balls ball : Balls.values() ) {
            if(ball.index == index){
                return ball.name;
            }
        }
        return null;
    }

}
