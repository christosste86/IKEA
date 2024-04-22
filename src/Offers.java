public class Offers {
    public int id;
    public String name;
    public String description;
    public String type;
    public int percent;
    public int furnitures;
    public int minPrice;


    public Offers(int id, String description, String name, String type, int percent, int furnitures, int minPrice) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.type = type;
        this.percent = percent;
        this.furnitures = furnitures;
        this.minPrice = minPrice;
    }

    void offer(){
        if (type.equals("pieces")) {
            System.out.println("* If you bye more than " +"\u001B[31m" +furnitures + "\u001B[38m"+" furntures you will save " +"\u001B[31m"+ percent + "%"+"\u001B[38m"+".");
        }else if (type.equals("value")){
            System.out.println("* If the value of your order is more than "+"\u001B[31m" +minPrice+"Kč"+ "\u001B[38m"+" you will save "+"\u001B[31m"+percent + "%"+"\u001B[38m"+".");
        } else if (type.equals("voucher")) {
            System.out.println("* For every "+"\u001B[31m" +minPrice +"Kč"+"\u001B[38m"+ " we invite you for one "+ description + " in IKEA Store.");
        } else if (type.equals("sale")){
            System.out.println("\u001B[31m"+percent+"Kč" +"\u001B[38m"+ "% for ale all "+ description);
        } else if (type.equals("Payments")) {
            System.out.println("* Pay "+"\u001B[31m" +percent +"%"+ "\u001B[38m"+ " of your debt per mouth");
        }
        else{
            System.out.println("No offers");
        }
    }


}

