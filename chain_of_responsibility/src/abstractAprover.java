abstract class abstractAprover {
    protected abstractAprover nextApprover;

    public void setNextApprover(abstractAprover nextApprover){
        this.nextApprover = nextApprover;
    }

    public abstract void  processRequest(long amount);

}
