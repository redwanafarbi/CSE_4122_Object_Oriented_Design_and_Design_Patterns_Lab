public class bankWithdrawal {
    public static void main(String[] args) {
        // Create the chain of approval
        abstractAprover cashier = new Cashier();
        abstractAprover seniorOfficer = new SeniorOfficer();
        abstractAprover manager = new Manager();

        cashier.setNextApprover(seniorOfficer);
        seniorOfficer.setNextApprover(manager);

        long[] withdrawalRequests = {5000, 60000, 2000001};

        for (long amount : withdrawalRequests) {
            System.out.println("Requesting withdrawal of Tk. " + amount);
            cashier.processRequest(amount);
            System.out.println("Paid: " + amount);
            System.out.println();
        }

    }
}
