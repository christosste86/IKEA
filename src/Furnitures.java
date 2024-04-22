import javax.sound.midi.Soundbank;

public class Furnitures {
    public int id;
    public String category;
    public String type;
    public String name;
    public String color;
    public boolean isDoors;
    public boolean isBed;
    public int doors;
    public int sockets;
    public int seats;
    public int height;
    public int width;
    public double price;

    public Furnitures(int id, String category, String type, String name, String color, boolean isDoors, boolean isBed, int doors, int sockets, int seats, int height, int width, double price) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.name = name;
        this.color = color;
        this.isDoors = type.equals("bed") || type.equals("sofa")? false:isDoors;
        this.isBed = !(type.equals("sofa"))?false:isBed;
        this.doors = (type.equals("sofa")) || (type.equals("bed"))?null:doors;
        this.sockets = !(type.equals("chest")) || !(type.equals("bedsideTable"))? 0 : sockets;
        this.seats = !(type.equals("sofa")) || !(type.equals("bed"))?0:seats;
        this.height = height;
        this.width = width;
        this.price = price;
    }

    public void printFurnitures(String fCategory, String fType, int num){
        if (category.equals(fCategory) && (type.equals(fType))){
            System.out.print("\u001B[34m"+num+". "+"\u001B[38m"+type);
            System.out.print(", Branch: "+name+", ");
            if(!(color.equals(""))) { System.out.print("Color: "+ color); }
            if((isDoors)) { System.out.print(", Doors: Yes"); }
            if(!(doors == 0)) { System.out.print(" "+doors); }
            if((isBed)) { System.out.print(", Bed: Yes"); }
            if(!(sockets == 0)) { System.out.print(", Sockets: "+sockets); }
            if(!(seats == 0)) { System.out.print(", Seats: "+seats); }
            if(!(height == 0)) { System.out.print(", Height: "+height); }
            if(!(width == 0)) { System.out.print(", Width: "+width); }
            System.out.println(", Price: "+"\u001B[31m"+price+"Kč "+"\u001B[38m");
        }
    }

    public void selectFurniture(int idFurniture){
        if (id == idFurniture) {
            System.out.print(idFurniture + ". " + type);
            System.out.print(", Branch" + name + ", ");
            if (!(color.equals(""))) {System.out.print("Color: " + color); }
            if ((isDoors)) {System.out.print(", Doors: Yes"); }
            if (!(doors == 0)) { System.out.print(" " + doors); }
            if ((isBed)) { System.out.print(", Bed: Yes"); }
            if (!(sockets == 0)) { System.out.print(", Sockets: " + sockets);}
            if (!(seats == 0)) { System.out.print(", Seats: " + seats); }
            if (!(height == 0)) { System.out.print(", Height: " + height);}
            if (!(width == 0)) { System.out.print(", Width: " + width);}
            System.out.println(", Price: " + price + "Kč ");
        }
    }


    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
