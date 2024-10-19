import chef.Chef;
import chef.egg_cooker.HardBoiledEggCooker;
import chef.egg_cooker.SoftBoiledEggCooker;

public class Main {

    public static void main(String[] args) {

        //nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Ramsay");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }

}
