class Manager extends abstractAprover{
    @Override
    public void processRequest(long amount) {

//        System.out.println("Received amount3: " + amount);

        if(amount > 1000000){
            System.out.println("Manager Approved to withdraw money: " + amount);
        }
    }
}
