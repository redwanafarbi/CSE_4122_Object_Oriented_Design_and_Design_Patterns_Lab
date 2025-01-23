class SeniorOfficer extends abstractAprover{

    @Override
    public void processRequest(long amount) {

//        System.out.println("Received amount2: " + amount);

        if(amount >= 10000 && amount <= 1000000){
            System.out.println("Senior officer approved to withdraw money: " + amount);
        } else if (amount > 1000000) {
            System.out.println("Senior Officer authorized & forward to Manager ");
            nextApprover.processRequest(amount);
        }
    }
}
