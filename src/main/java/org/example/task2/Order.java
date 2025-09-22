package org.example.task2;

/**
 * Клас Order представляє замовлення із унікальним id та ім'ям клієнта.
 * Клас є фінальним, щоб уникнути неправильного розширення.
 */
public final class Order {

    /** Унікальний ідентифікатор замовлення. */
    private final long id;

    /** Ім'я клієнта, що зробив замовлення. */
    private final String customer;

    /**
     * Конструктор створює замовлення із заданими параметрами.
     *
     * @param idParam       унікальний ідентифікатор замовлення.
     * @param customerParam ім'я клієнта.
     */
    public Order(final long idParam, final String customerParam) {
        this.id = idParam;
        this.customer = customerParam;
    }

    /**
     * Формує рахунок для переданої корзини.
     *
     * @param cart корзина товарів для замовлення.
     * @return рядок з деталями замовлення та сумарною ціною.
     */
    public String formOrderBill(final Cart cart) {
        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(id)
                .append(" for customer ").append(customer)
                .append("\n------------------\n");

        double sum = 0.0;

        for (int i = 0; i < cart.getItems().length; i++) {
            sum += cart.getItems()[i].getPrice();
            builder.append("Item id: ").append(cart.getItems()[i].getId())
                    .append(" name: ").append(cart.getItems()[i].getName())
                    .append(" price: ").append(cart.getItems()[i].getPrice())
                    .append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ").append(sum);

        return builder.toString();
    }
}

