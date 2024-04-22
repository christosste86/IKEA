import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Offers
        Offers offer01 = new Offers(1, "Bye two, save 15%","save 15%",  "pieces",15, 2, 0);
        Offers offer02 = new Offers(2,"Over 20000 save 30%","save 30%","value", 30, 1, 20000);
        Offers offer03 = new Offers(3, "Coffee free","Coffee voucher","voucher", 0, 1, 600);
        Offers offer04 = new Offers(4,"Lunch free","Lunch voucher","voucher", 0, 1, 1500);
        Offers offer05 = new Offers(5,"Payments per month","Payments","Payments", 1, 0, 1500);

        Offers [] offer = {offer01, offer02, offer03, offer04, offer05};

        //customers
        Customers customer01 = new Customers("Christos",new Integer[20],0,50000);
        Customers customer02 = new Customers("Martin",new Integer[20],0,20000);
        Customers customer03 = new Customers("Darek",new Integer[20],0,1000);
        Customers customer04 = new Customers("Petr",new Integer[20],0,8000);
        Customers customer05 = new Customers("Dominik",new Integer[20],0,0);
        Customers customer06 = new Customers("",new Integer[20],0,0);
        Customers customer07 = new Customers("",new Integer[20],0,0);
        int [] basket = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        //furnitures

        //TvTables
        Furnitures tvtable01 = new Furnitures(101,"Living Room", "Tv Table", "BESTA", "White", true, false, 2, 0, 0, 42, 180,4530);
        Furnitures tvtable02 = new Furnitures(102, "Living Room", "Tv Table", "KALLAX", "White", false, false, 0, 0, 0, 60, 147,1990);
        Furnitures tvtable03 = new Furnitures(103,"Living Room", "Tv Table", "LACK", "Black", true, false, 2, 0, 0, 35, 120,1990);
        Furnitures tvtable04 = new Furnitures(104,"Living Room", "Tv Table", "HEMNES", "White", false, false, 0, 0, 0, 47, 148,7990);
        Furnitures tvtable05 = new Furnitures(105,"Living Room", "Tv Table", "LACK", "White", false, false, 0, 0, 0, 26, 90,399);

        //Sofa
        Furnitures sofa01 = new Furnitures(106,"Living Room", "Sofa", "GLOSTAD", "Black", false, false, 0, 0, 2, 0, 0,2990);
        Furnitures sofa02 = new Furnitures(107,"Living Room", "Sofa", "FRIHETEN", "Grey", false, true, 0, 0, 3, 0, 0,10990);
        Furnitures sofa03 = new Furnitures(108,"Living Room", "Sofa", "KLIPPAN", "Black", false, false, 0, 0, 2, 0, 0,5990);
        Furnitures sofa04 = new Furnitures(109,"Living Room", "Sofa", "LINAVAS", "Black", false, false, 0, 0, 3, 0, 0,8990);
        Furnitures sofa05 = new Furnitures(110,"Living Room", "Sofa", "LANDSKRONA", "White", false, false, 0, 0, 3, 0, 0,12990);

        //Tables
        Furnitures table01 = new Furnitures(111,"Living Room", "Table", "LACK", "White", false, false, 0, 0, 0, 55, 90,249);
        Furnitures table02 = new Furnitures(112,"Living Room", "Table", "LACK", "Black", false, false, 0, 0, 0, 78, 118,799);
        Furnitures table03 = new Furnitures(113,"Living Room", "Table", "OSTAVALL", "White", false, false, 0, 0, 0, 55, 90,2990);
        Furnitures table04 = new Furnitures(114,"Living Room", "Table", "HEMNES", "White", false, false, 0, 0, 0, 90, 90,3990);

        //Bed Room
        //CupBoard
        Furnitures cupBoard01 = new Furnitures(115,"Bed Room", "Cupboard", "HAUGA", "White", true, false, 2, 0, 0, 55, 118,6990);
        Furnitures cupBoard02 = new Furnitures(116,"Bed Room", "Cupboard", "KLEPPSTAD", "White", true, false, 3, 0, 0, 79, 176,3490);
        Furnitures cupBoard03 = new Furnitures(117,"Bed Room", "Cupboard", "KLEPPSTAD", "Black", true, false, 2, 0, 0, 117, 176,1990);
        Furnitures cupBoard04 = new Furnitures(118,"Bed Room", "Cupboard", "KLEPPSTAD", "White", true, false, 2, 0, 0, 117, 176,2990);
        Furnitures cupBoard05 = new Furnitures(119,"Bed Room", "Cupboard", "METOD", "Black", true, false, 1, 0, 0, 60, 200,3700);

        //Chest
        Furnitures chest01 = new Furnitures(120,"Bed Room", "Chest", "MALM", "Black", false, false, 0, 4, 0, 80, 100,1990);
        Furnitures chest02 = new Furnitures(121,"Bed Room", "Chest", "MALM", "White", false, false, 0, 6, 0, 78, 160,3190);
        Furnitures chest03 = new Furnitures(122,"Bed Room", "Chest", "KULLEN", "White", false, false, 0, 6, 0, 72, 140,2150);
        Furnitures chest04 = new Furnitures(123,"Bed Room", "Chest", "HEMNES", "Black", false, false, 0, 3, 0, 96, 108,3990);
        Furnitures chest05 = new Furnitures(124,"Bed Room", "Chest", "MALM", "Black", false, false, 0, 3, 0, 40, 78,1190);

        //Bedside table
        Furnitures bedsideTable01 = new Furnitures(125,"Bed Room", "Cedside Table", "MALM", "White", false, false, 0, 2, 0, 40, 55,799);
        Furnitures bedsideTable02 = new Furnitures(126,"Bed Room", "Cedside Table", "KULLEN", "White", false, false, 0, 2, 0, 35, 49,559);
        Furnitures bedsideTable03 = new Furnitures(127, "Bed Room", "Cedside Table", "HEMNES", "Black", false, false, 0, 0, 0, 35, 46,999);
        Furnitures bedsideTable04 = new Furnitures(128,"Bed Room", "Cedside Table", "VIKHAMMER", "Black", false, false, 0, 0, 0, 39, 40,1690);
        Furnitures bedsideTable05 = new Furnitures(129, "Bed Room", "Cedside Table", "HEMNES", "White", false, false, 0, 2, 0, 54, 66,1990);

        Furnitures[] furnituresArr = {tvtable01, tvtable02, tvtable03, tvtable04, tvtable05, sofa01, sofa02, sofa03, sofa04, sofa05, table01, table02, table03, table04, cupBoard01, cupBoard02, cupBoard03, cupBoard04, cupBoard05, chest01, chest02, chest03, chest04, chest05, bedsideTable01, bedsideTable02, bedsideTable03, bedsideTable04, bedsideTable05};

        System.out.println("Welcome to IKEA Store");
        System.out.println("Use the special offer to the end of the month");

        System.out.println("\u001B[33m"+"*********************** - Offer - ***********************"+"\u001B[38m");

        for (Offers element:offer){
            element.offer();
        }
        System.out.println("\u001B[33m"+"*********************************************************"+"\u001B[38m");

        System.out.print("LogIn to IKEA Store: ");
        String user = scanner.nextLine();
        Customers customers[] = {customer01, customer02, customer03, customer04, customer05, customer06, customer07};
        int customerId = 0;
        for (int i = 0;i < customers.length; i++){
            if (customers[i].name.equals(user)){
                customers[i].customerInfo(basket, furnituresArr,offer, basketItems(basket));
                customerId = i;
            }
        }
        int menuPay = 1;
        while (menuPay == 1) {
            System.out.print("You interesting for your: ");


            //Forniture Category List

            int categoryLen = 1;
            for (String element : categoryName(furnituresArr)) {
                if (!(element.equals(""))) {
                    System.out.print(" "+"\u001B[34m" + categoryLen + "\u001B[38m"+". " + element);
                    categoryLen = categoryLen + 1;
                }
            }
            System.out.print(" <--select a number ");

            //Furniture category filter / select

            int selectType = scanner.nextInt();
            String fCategory = categoryName(furnituresArr)[selectType - 1];
            System.out.println("You select :" +"\u001B[34m"+ fCategory+ "\u001B[38m");

            //Furniture Type List
            System.out.print("You interesting for: ");
            int x = 1;
            for (String element : typeName(furnituresArr, selectType)) {
                if (!element.equals("")) {
                    System.out.print(" " +"\u001B[34m"+ x + "\u001B[38m"+". " + element);
                    x = x + 1;
                }
            }
            System.out.print(" <--select a number ");

            //Furniture Type filter/select
            int selectName = scanner.nextInt();
            String fType = typeName(furnituresArr, selectType)[selectName];
            System.out.println("You select :" + fType);

            //Print the furniture list by category and type selection
            int i = 1;
            for (Furnitures element : furnituresArr) {
                element.printFurnitures(fCategory, fType, i);
                i = i + 1;
            }

            //add to your basket your favorite furniture
            System.out.print("Press the number to select the " + fType + " that you want: ");
            int furnitureId = scanner.nextInt() - 1;
            customers[customerId].customerBasket(furnituresArr[furnitureId], basket, basketItems(basket));
            customers[customerId].customerInfo(basket, furnituresArr, offer, basketItems(basket));


            System.out.print("do you want to continue or pay the order? press " +"\u001B[34m"+"1"+"\u001B[38m"+". continue "+"\u001B[34m"+"2"+"\u001B[38m"+". pay "+"\u001B[34m"+"3"+"\u001B[38m"+". exit  <--select a number");

            menuPay = scanner.nextInt();
            int months = 0;
            if (customers[customerId].wallet < 0){
                System.out.println("how many months you want to repay your order? ");
                months = scanner.nextInt();
            }
            if (menuPay == 2) {
                System.out.println(basketItems(basket));
                customers[customerId].payOrder(basket,offer,basketItems(basket),months);
                customers[customerId].receipt(basket, furnituresArr, offer, basketItems(basket),months);
            }
            if (menuPay == 3){
                System.out.println("Thank you for your visiting, have a nice day.");
                System.exit(0);
            }
        }


//-------------------------------------------------------------------------------------------------------------
    }
    //Return basket array items not 0
    static int basketItems(int[] basket){
        int x = 0;
        for(int element:basket){
            if (!(element == 0)){
                x = x + 1;
            }
        }
        return x;
    }

    static String[] categoryName(Furnitures[] furnituresArr){
        String[] category = {"","","","","","",""};
        int x = 1;
        category[0] = furnituresArr[0].getCategory();
        for (int i = 1; i < furnituresArr.length; i++){
            if (!(furnituresArr[i].getCategory().equals(furnituresArr[i - 1].getCategory()))){
                category[x] = furnituresArr[i].getCategory();
                x = x +1;
            }
        }
        return category;
    }
    static String[] typeName(Furnitures[] furnituresArr,int selectType){

        String[] name = {"","","","","","",""};
        int x = 1;
        for (int i = 1; i < furnituresArr.length; i++){
            if (furnituresArr[i].getCategory().equals(categoryName(furnituresArr)[selectType-1])){
                if (!(furnituresArr[i].getType().equals(furnituresArr[i - 1].getType()))){
                    name[x] = furnituresArr[i].getType();
                    x = x + 1;
                }
            }
        }
        return name;
    }
    static String[] name(Furnitures[] furnituresArr,int selectType,int selectName){

        String[] name = {"","","","","","",""};
        for (int i = 1; i < furnituresArr.length; i++){
            if ((furnituresArr[i].getType().equals(typeName(furnituresArr,selectType)))){

            }
        }
        return name;
    }

}

