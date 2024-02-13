package hw3.mediaManager;

import java.util.ArrayList;
import hw3.media.*;

public class StockManagerSingleton {
	
	// Data Section
    private static final StockManagerSingleton INSTANCE = new StockManagerSingleton(); // Only one instance of StockManagerSingleton
    private ArrayList<MediaProduct> inventory;
    private String inventoryFilePath = "../inventory.csv";

    //Private constructor (because its a singleton)
    private StockManagerSingleton() {
        inventory = new ArrayList<>();
    }

    // Public method to get the instance
    public static StockManagerSingleton getInstance() {
        return INSTANCE;
    }
    
    // Assignment object methods
    
    public boolean initializeStock() {
    	
    	return false;
    }

    public boolean addItem(MediaProduct product)
    {
        try 
        {
            inventory.add(product); 
            
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }

    public boolean removeItem(MediaProduct product)
    {
        try 
        {
        int index = 0; 
        for (MediaProduct item : inventory)
        {
            if (item.equals(product))
            {
                inventory.remove(index); 
                return true; 
            }

            else
            {
                index += 1; 
            }

        }

        return false; 
    }
    catch (Exception e)
    {
        return false; 
    }
    }
    
    //Rachel's method stub 1
    public boolean updateItemPrice(MediaProduct product, double newPrice) {
    	
    	return false;
    	
    }

}
