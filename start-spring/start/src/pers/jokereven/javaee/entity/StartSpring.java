package pers.jokereven.javaee.entity;

public class StartSpring {
    private String who;

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public void hello(){
        System.out.println("hello\t"+this.who);
    }
}
