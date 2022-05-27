import java.util.ArrayList;
import java.util.List;

public class Cart extends Product{
    private String status = "unpaid";
    private List<Product> boughtProducts;

    public Cart(){}
    public Cart (List<Product> products){
        if (getStatus() == "paid") {
            System.out.println("The transactions is already completed! Please make a new cart!");
        }
        boughtProducts = new ArrayList<>(products);
    }

    public void pay(){
        setStatus("paid");
        System.out.println("You have successfully bought your goods! Please have a nice day!");
        Double sum = 0.0;

        for(Integer i = 0; i < getBoughtProducts().size(); i++){
            List<Product> array = getBoughtProducts();
            Double quantity = Double.valueOf(array.get(i).getQuantity());
            if(quantity == 0){
                continue;
            } else{
                System.out.println(array.get(i).toString());
                sum += quantity*array.get(i).getPrice();
            }
        }
        System.out.println(String.format("Total sum is: %.2f$", sum));
    }

    public String getStatus() {
        return status;
    }

    public List<Product> getBoughtProducts() {
        return boughtProducts;
    }

    public void setBoughtProducts(List<Product> boughtProducts) {
        this.boughtProducts = boughtProducts;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
