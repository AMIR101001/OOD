package designpatterns.behavioral.state;

public class DeveloperDay {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setActivity(new Sleeping());

        for (int i = 0; i < 10; i++){
            developer.JustDoIt();
            developer.changeActivity();
        }
    }

}
