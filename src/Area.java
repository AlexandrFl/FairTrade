public class Area {
    private final int LENGTH;
    private final int WIGHT;
    private final int PRICE;

    public Area(int length, int wight, int price) {
        this.LENGTH = length;
        this.WIGHT = wight;
        this.PRICE = price;
    }

    public int priceForMetre() {
        return PRICE / (LENGTH * WIGHT);
    }

    @Override
    public String toString() {
        return "Участок с ценой за м2 - " + priceForMetre() + " Рублей. (Длина - " + LENGTH + " м, Ширина - " + WIGHT + " м, Стоимость - " + PRICE + " Руб.)";
    }
}
