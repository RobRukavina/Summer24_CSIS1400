public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase(){
        this.setName("none");
        this.setPrice(0);
        this.setQuantity(0);
    }

    public ItemToPurchase(String name, int price, int quantity){
        this.setName(name);;
        this.setPrice(price);
        this.setQuantity(quantity);
    }
    
    public void setName(String name){
        this.itemName = name;
    }

    public void setPrice(int price){
        this.itemPrice = price;
    }

    public void setQuantity(int quant){
        this.itemQuantity = quant;
    }

    public String getName(){
        return this.itemName;
    }

    public int getPrice(){
        return this.itemPrice;
    }

    public int getQuantity(){
        return this.itemQuantity;
    }
}