import java.util.Arrays;

public class Customers {
    String name;
    double priceOfFurnitures;
    double wallet;


    public Customers(String name, double priceOfFurnitures, double wallet) {
        this.name = name;
        this.priceOfFurnitures = priceOfFurnitures;
        this.wallet = wallet;
    }


    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void setPriceOfFurnitures(double priceOfFurnitures) {
        this.priceOfFurnitures = priceOfFurnitures;
    }

    void customerInfo(int [] basket, Furnitures[] furnituresArray,Offers[] offers, int basketItems) {
        System.out.println("*******************************************************************************************");
        System.out.println("** Customer: "+name+" *** sum: "+ "\u001B[31m" +priceOfFurnitures+ "Kč"+"\u001B[38m" +"  *** Wallet :"+ "\u001B[31m" + wallet +"Kč"+"\u001B[38m"+ " ****");
        System.out.println("** Basket");
        int x = 1;
        for (int i = 0; i < basketItems; i++){
            for(Furnitures element: furnituresArray){
                if (basket[i] == element.id){
                    System.out.println(x+". "+ element.type + ", "+ element.name+ " : "+"\u001B[31m"+ element.price+"Kč"+"\u001B[38m");
                }
            }
            for(Offers element: offers){
                if (basket[i] == element.id){
                    System.out.println(x+". "+ element.name);
                }
            }
            x = x + 1;
        }
        if (wallet < 0) {

            System.out.println("You don't have enough money, ");
            System.out.println("for the rest of your payment you will lost "+offers[4].percent+"% for every month of your order");
        }

        System.out.println("*******************************************************************************************");
    }
    void customerBasket(Furnitures furnitures, int [] basket, int basketItems){
        priceOfFurnitures = priceOfFurnitures + furnitures.getPrice();
        wallet = wallet - furnitures.getPrice();
        basket[basketItems] = furnitures.id;
    }

    void payOrder(int [] basket,Offers [] offers, int basketItems, int months){
        for (Offers oElement: offers){
            if (oElement.type.equals("pieces")){
                if (basketItems >= oElement.furnitures){
                    priceOfFurnitures = priceOfFurnitures - ((priceOfFurnitures * oElement.percent) / 100);
                    wallet = wallet - ((priceOfFurnitures * oElement.percent) / 100);
                    basket[basketItems] = oElement.id;
                    basketItems = basketItems + 1;
                }
            }
            if (oElement.type.equals("value")){
                if (priceOfFurnitures >= oElement.minPrice){
                    priceOfFurnitures = priceOfFurnitures - ((priceOfFurnitures * oElement.percent) / 100);
                    wallet = wallet - ((priceOfFurnitures * oElement.percent) / 100);
                    basket[basketItems] = oElement.id;
                    basketItems = basketItems + 1;
                }
            }
            if (oElement.type.equals("voucher")){
                if (priceOfFurnitures >= oElement.minPrice){
                    basket[basketItems] = oElement.id;
                    basketItems = basketItems + 1;
                }
            }
            if (wallet < 0){
                basket[basketItems] = offers[4].id;
                //priceOfFurnitures = priceOfFurnitures + ((priceOfFurnitures * (offers[4].percent * months)) / 100);
                wallet = wallet + ((wallet * (offers[4].percent * months)) / 100);
            }
        }
    }
    void receipt(int [] basket, Furnitures[] furnituresArray,Offers[] offers, int basketItems, int months) {
        System.out.println("*******************************************************************************************");
        System.out.println("** IKEA Store a.s.r. **");

        int x = 1;
        for (int i = 0; i < basketItems; i++){
            for(Furnitures element: furnituresArray){
                if (basket[i] == element.id){
                    System.out.println(x+". "+ element.type + ", "+ element.name+ " : "+"\u001B[31m"+ element.price+"Kč"+"\u001B[38m");
                }
            }
            for(Offers element: offers){
                if (basket[i] == element.id){
                    System.out.println(x+". "+ element.name);
                    if (element.name.equals("Payments")){
                        System.out.println(" "+(wallet / months)+ " for " +months);
                    }
                }
            }
            x = x + 1;
        }

        System.out.println("*******************************************************************************************");
    }
}
