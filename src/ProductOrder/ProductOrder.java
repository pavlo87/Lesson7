package ProductOrder;

public class ProductOrder {
    private int price;
    private int id;
    private int size;
    private Object productType;

    public ProductOrder(int id, int price, int size,productType t) {
        this.setId(id);
        this.setPrice(price);
        this.setSize(size);
        this.setProductType(t);}
    public int getPrice() {
        return price;}
    public void setPrice(int price) {
        this.price = price;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public Object getProductType() {
        return productType;
    }


    public void setProductType(Object productType) {
        this.productType = productType;
    }
    @Override
    public String toString() {
        return "{" + id +
                "-" + price +
                "$-" + size +"-"+ getProductType() +
                '}';
    }


}


