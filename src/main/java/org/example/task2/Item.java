package org.example.task2;

/**
 * Клас Item представляє товар із унікальним id, назвою та ціною.
 * Клас є фінальним, щоб уникнути неправильного розширення.
 */
public final class Item {

    /** Унікальний ідентифікатор товару. */
    private final long id;

    /** Назва товару. */
    private final String name;

    /** Ціна товару. */
    private final double price;

    /**
     * Конструктор створює товар із заданими параметрами.
     *
     * @param idParam    унікальний ідентифікатор.
     * @param nameParam  назва товару.
     * @param priceParam ціна товару.
     */
    public Item(final long idParam, final String nameParam,
                final double priceParam) {
        this.id = idParam;
        this.name = nameParam;
        this.price = priceParam;
    }

    /**
     * Повертає id товару.
     *
     * @return id товару.
     */
    public long getId() {
        return id;
    }

    /**
     * Повертає назву товару.
     *
     * @return назва товару.
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає ціну товару.
     *
     * @return ціна товару.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Повертає рядкове представлення товару.
     *
     * @return рядок з id, назвою та ціною товару.
     */
    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", price=" + price
                + '}';
    }
}

