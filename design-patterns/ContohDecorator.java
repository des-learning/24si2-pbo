import java.util.ArrayList;
import java.util.List;

public class ContohDecorator {
    public static void main(String []args) {
        NotifierDecorator n = (new NotifierDecorator())
        .decorate(new EmailNotifier("des@gmail.com"))
        .decorate(new SMSNotifier("1234"));

        n.send("something important");
    }
}

interface Notifier {
    void send(String message);
}

class EmailNotifier implements Notifier {
    private String email;
    public EmailNotifier(String email) {
        this.email = email;
    }

    public void send(String message) {
        System.out.println("send notification to email: " + email + ": " + message);
    }
}

class SMSNotifier implements Notifier {
    private String number;

    public SMSNotifier(String number) {
        this.number =number;
    }

    public void send(String message) {
        System.out.println("send notification through sms to " + number + ": " + message);
    }
}

class NotifierDecorator implements Notifier {
    List<Notifier> ns;
    public NotifierDecorator() {
        ns = new ArrayList<>();
    }

    public NotifierDecorator decorate(Notifier n) {
        this.ns.add(n);

        return this;
    }

    public void send(String message) {
        for(Notifier n: ns) {
            n.send(message);
        }
    }
}