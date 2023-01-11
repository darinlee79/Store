import java.util.ArrayList;

public class Store {
    ArrayList<CISItem> items;

    public Store(){
        items = new ArrayList<CISItem>();
    }
    public void addBook(Book book){
        items.add(book);
    }
    public void addPhone(Phone phone){
        items.add(phone);
    }
    public void updatePhonesLocation(String location)
    {
        for (CISItem item : items)
        {
            if (item instanceof Phone)
            {
                item.setLocation(location);
            }
        }
    }
    public ArrayList<CISItem> getAllPhones()
    {
        ArrayList <CISItem> allPhones = new ArrayList<CISItem>();
        for (CISItem item : items)
        {
            if (item instanceof Phone)
            {
                allPhones.add(item);
            }
        }
        return allPhones;
    }
    public ArrayList <CISItem> getAllItems(String itemType)
    {
        ArrayList<CISItem> allItems = new ArrayList<CISItem>();
        for (CISItem item : items)
        {
            if (item instanceof Arduino || item instanceof Book || item instanceof Magazine || item instanceof Phone)
            {
                items.add(item);
            }
        }
        return items;
    }
    public void updateItems(String itemType, String property, String value)
    {
        ArrayList <CISItem> allItems = getAllItems(itemType);
        for (CISItem item : allItems)
        {
            if(property.equals("location"))
            {
                item.setLocation(value);
            }
        }
    }
    public void showAllInfo()
    {
        for (CISItem item : items)
        {
            System.out.println(item.toString());
        }
    }

    public ArrayList<CISItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CISItem> items) {
        this.items = items;
    }
}
