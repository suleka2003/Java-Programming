import java.util.*;

public class OB_Pattern {

    // Subject interface
    interface Subject {
        void subscribe(Observer o);
        void unsubscribe(Observer o);
        void notifyObservers(String message);
    }

    // Observer interface
    interface Observer {
        void update(String message);
    }

    // Concrete Subject (YouTube channel)
    static class YouTubeChannel implements Subject {
        private List<Observer> subscribers = new ArrayList<>();

        @Override
        public void subscribe(Observer o) {
            subscribers.add(o);
        }

        @Override
        public void unsubscribe(Observer o) {
            subscribers.remove(o);
        }

        @Override
        public void notifyObservers(String message) {
            for (Observer o : subscribers) {
                o.update(message);
            }
        }

        public void uploadNewVideo(String title) {
            System.out.println("New video uploaded: " + title);
            notifyObservers("Watch now: " + title);
        }

        // Concrete Observer
        static class Subscriber implements Observer {
            private String name;

            public Subscriber(String name) {
                this.name = name;
            }

            public void update(String message) {
                System.out.println("Dear " + name + ", you have a new video to watch: " + message);
            }
        }
    }

    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        Observer alice = new YouTubeChannel.Subscriber("Alice");
        Observer bob = new YouTubeChannel.Subscriber("Bob");
        Observer charlie = new YouTubeChannel.Subscriber("Charlie");

        channel.subscribe(alice);
        channel.subscribe(bob);

        channel.uploadNewVideo("Observer pattern in Java");

        channel.unsubscribe(bob);
        channel.uploadNewVideo("Strategy pattern in Java");

        channel.subscribe(charlie);
        channel.uploadNewVideo("Factory pattern in Java");
    }
}