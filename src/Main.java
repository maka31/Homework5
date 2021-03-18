public class Main {

    public static void main(String[] args) {

        Boss godFather = new Boss();
        godFather.setHealth(500);
        godFather.setDamage(25);
        godFather.setDefenceType("physical");

        System.out.println(godFather.getHealth() + " " + godFather.getDamage() + " " + godFather.getDefenceType());

        createHeroes();
    }

    public static int createHeroes() {
        Hero hero1 = new Hero(200, 15, "physical");
        hero1.getHealth();
        hero1.getDamage();
        hero1.getSuperAbility();

        Hero hero2 = new Hero(180, 18, "magical");
        hero2.getHealth();
        hero2.getSuperAbility();

        Hero hero3 = new Hero(160, 16);
        hero3.getHealth();
        hero3.getDamage();

        Hero[] array = {hero1, hero2, hero3};
        for (int i = 0; i < array.length; i++) {
            System.out.println();
        }
        return createHeroes();
    }
}

