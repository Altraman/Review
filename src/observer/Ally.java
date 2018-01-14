package observer;

import java.util.ArrayList;

/**
 * Created by HuQiang on 2018/1/9.
 */
public class Ally {
    private ArrayList<Observer> observers = new ArrayList<>();

    public void join(Observer observer) {
        observers.add(observer);
    }

    public void quit(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String name) {
        System.out.println("紧急通知，盟友" + name + "遭受敌人打击");
        for (Observer obs : observers) {
            if (!obs.getName().equalsIgnoreCase(name)) {
                obs.help();
            }
        }
    }
}
