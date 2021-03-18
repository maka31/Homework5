public class Main {

    public static void main(String[] args) {

        Boss godFather = new Boss();
        godFather.setHealth(500);
        godFather.setDamage(25);
        godFather.setDefenceType("physical");

        System.out.println(godFather.getHealth() + " " + godFather.getDamage() + " " + godFather.getDefenceType());

        createHeroes();
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println("______________________");
            System.out.println("hero" + i);
            System.out.println("Health: " + createHeroes()[i].getHealth());
            System.out.println("Damage: " +  createHeroes()[i].getDamage());
            System.out.println("Super ability: " +  createHeroes()[i].getSuperAbility());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero0 = new Hero(200, 15, "physical");
        Hero hero1 = new Hero(180, 18, "magical");
        Hero hero2 = new Hero(160, 16);

        Hero[] array = {hero0, hero1, hero2};
        return array;
    }
}

