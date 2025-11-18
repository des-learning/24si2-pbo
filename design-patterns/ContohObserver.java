import java.util.List;
import java.util.ArrayList;

public class ContohObserver {
    public static void main(String[] args) {
        Publisher p = new Publisher();
        Subscriber s1 = new PrintSubscriber();
        Subscriber s2 = new CountSubscriber();
        Subscriber s3 = new ImportantEventOnly();

        p.subscribe(s1);
        p.subscribe(s2);
        p.subscribe(s3);

        p.publish("event a");
        p.unsubscribe(s3);
        p.publish("event b!");
        p.publish("event c");
        p.publish("event d");
    }
}

class Publisher {
    private List<Subscriber> subscribers;

    public Publisher() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void publish(String event) {
        for (Subscriber s: subscribers) {
            s.receive(event);
        }
    }
}

interface Subscriber {
    void receive(String event);
}

class PrintSubscriber implements Subscriber {
    public void receive(String event) {
        System.out.println(event + " received");
    }
}

class CountSubscriber implements Subscriber {
    private int count = 0;

    public void receive(String event) {
        count++;
        System.out.println(count + " event received" );
    }
}

class ImportantEventOnly implements Subscriber {
    public void receive(String event) {
        if (event.contains("!")) {
            System.out.println("something important happened: " + event);
        }
    }
}
