public class Employee {
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
        if(finance) {
            double loanAmount = vehicle.getPrice() - cust.getCashOnHand();

            if(loanAmount < 0) {
                processTransaction(cust, vehicle, false);
                return ;
            }

            if(runCreditHistory(cust, loanAmount)) {
                processTransaction(cust, vehicle, finance);
            } else {
                System.out.println("Sorry, your loan is not permitted");
            }
        }
        else if(vehicle.getPrice() <= cust.getCashOnHand()) {
            processTransaction(cust, vehicle, finance);
        }
        else {
            System.out.println("Please bring more money");
        }
    }

    public void processTransaction(Customer cust, Vehicle vehicle, boolean finance) {
        System.out.println("Congrats " + cust.getName() + "! You bought a " + vehicle.getMake() + " " + vehicle.getModel());
        if(!finance) {
            System.out.println("You paid $" + vehicle.getPrice() + " all in cash");
        }
        else {
            System.out.println("Your loan is $" +(vehicle.getPrice() - cust.getCashOnHand()));
        }
    }

    public boolean runCreditHistory(Customer cust, double loanAmount) {
        int score = cust.getCreditScore();
        if(score >= 760 && loanAmount <= 20000) {
            return true;
        }
        else if(score < 760 && score >= 650 && loanAmount <= 10000) {
            return true;
        }
        else if(score < 650 && score >= 550 && loanAmount <= 5000) {
            return true;
        }
        return false;
    }
}
