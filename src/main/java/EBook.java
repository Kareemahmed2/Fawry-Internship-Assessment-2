public class EBook extends Book {
    private String fileType;

    public EBook(){
        this.setShippingMethods(new ShippingByEmail());
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public int buy(int quantity,String target) {
        this.getShippingMethods().delivery(this,quantity,target);
        return this.getPrice()*quantity;
    }
}
