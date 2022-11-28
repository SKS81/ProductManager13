package my.idea.list;

public class ProductRepository {

    private Product[] items = new Product[0];

    public Product[] findAllProduct() {
        return items;
    }

    public void addNewProduct(Product item) {
        int length = items.length + 1;
        Product[] temp = new Product[length];
        System.arraycopy(items, 0, temp, 0, items.length);
        int lastIndex = temp.length - 1;
        temp[lastIndex] = item;
        items = temp;
    }

    public void deleteById(int id) {
        int length = items.length - 1;
        Product[] temp = new Product[length];
        int copyToIndex = 0;
        for (Product item : items) {
            if (item.getId() != id) {
                temp[copyToIndex] = item;
                copyToIndex++;
            }
        }
        items = temp;
    }
}