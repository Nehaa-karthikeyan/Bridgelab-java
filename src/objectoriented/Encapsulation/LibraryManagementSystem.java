package Object_Oriented.Encapsulation;
abstract class LibraryItem {
    protected int itemId;
    protected String title;

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title);
    }
}

interface Reservable {
    void reserveItem();
}

