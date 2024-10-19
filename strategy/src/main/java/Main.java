import chef.Chef;

public class Main {

    public static void main(String[] args) {

        //nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Ramsay");
        chef.cook();
        //nowe zamówienie - jajka na miękko!
        chef.cook();

    }

}
