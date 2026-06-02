class TicketCounter {
    int tickets = 10;

    synchronized void bookTicket(String user, int count) {
        if (tickets >= count) {
            System.out.println(user + " booked " + count + " ticket(s)");
            tickets -= count;
            System.out.println("Remaining tickets: " + tickets);
        } else {
            System.out.println(user + " booking failed. Not enough tickets.");
        }
    }
}

class User extends Thread {
    TicketCounter counter;
    String userName;
    int ticketCount;

    User(TicketCounter counter, String userName, int ticketCount) {
        this.counter = counter;
        this.userName = userName;
        this.ticketCount = ticketCount;
    }

    public void run() {
        counter.bookTicket(userName, ticketCount);
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) throws InterruptedException {

        TicketCounter counter = new TicketCounter();

        User u1 = new User(counter, "User1", 4);
        User u2 = new User(counter, "User2", 3);
        User u3 = new User(counter, "User3", 5);

        u1.start();
        u2.start();
        u3.start();

        u1.join();
        u2.join();
        u3.join();

        System.out.println("Final Remaining Tickets: " + counter.tickets);
    }
}