public class DemoBook extends Book{
    public DemoBook(){
        this.setShippingMethods(new NoShipping());
    }

    @Override
    public int buy(int quantity,String target) {
        this.getShippingMethods().delivery(this,quantity,target);
        return 0;
    }
}
