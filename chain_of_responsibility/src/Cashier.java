class Cashier extends abstractAprover{

    @Override
    public void processRequest(long amount) {

//        System.out.println("Received amount1: " + amount);

        if(amount < 10000){
            System.out.println("Cashier approved to withdraw money: " + amount);
        } else if(amount >= 10000 && amount <= 1000000) {
            System.out.println("Cashier authorized & forward to Senior Officer ");
            nextApprover.processRequest(amount);
        } else {
            System.out.println("Cashier forward to Senior Officer ");
            nextApprover.processRequest(amount);
        }
    }
}

