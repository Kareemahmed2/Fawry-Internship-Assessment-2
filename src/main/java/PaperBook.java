public class PaperBook extends Book{
    private int stock;

    public PaperBook(){
        this.setShippingMethods(new ShippingByDelivery());
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int buy(int quantity,String target) {
        if (stock < quantity)
            throw new IllegalArgumentException("Not Enough in stock, remaining: " + stock + " in stock");
        this.stock -= quantity;
        return super.buy(quantity,target);
    }
}
