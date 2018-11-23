package ProductOrder;
public class Shoop {
    public static void main(String[] args) {
        productType food = productType.FOOD;
        productType electronics =productType.ELECTRONICS;
        productType drink=productType.DRINK;
        System.out.println(new ProductOrder(12,21,2,food));
        System.out.println(new ProductOrder(1,2,3,drink));
        System.out.println(new ProductOrder(13,551,65,electronics));


    }
}
