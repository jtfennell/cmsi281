import java.util.ArrayList;

public class StringBag implements SimpleCollection{
    private ArrayList<Object> stringGroup;
    private int numberOfStrings;
    private boolean isEmpty;

    public static void main(String[] args){
        
    }

    public StringBag(){
        stringGroup = new ArrayList<Object>();
        numberOfStrings = 0;
        isEmpty = true;
    }

    public boolean add ( Object stringToAdd ){

        //error checking to make sure the object being passed in is actually a string
       if (!(stringToAdd instanceof String)){
         throw new IllegalArgumentException();
        }

        stringGroup.add(stringToAdd);
        isEmpty = false;
        numberOfStrings++;

        return true;
    };
    
    /** Removes all of the elements from this collection (optional operation). */
    public void clear(){
        stringGroup.clear();
        numberOfStrings = 0;
        isEmpty = true;

    };
    
    /** Returns true if this collection contains the specified element. */
    public boolean contains ( Object stringToFind ){
        
        //error checking to make sure the object being passed in is actually a string
        if (!(stringToFind instanceof String)){
            throw new IllegalArgumentException();
        }
        

        int indexOfString = stringGroup.indexOf(stringToFind);
        
        //indexOf method returns -1 if the ArrayList does not contain the item
        boolean containsStringToFind = !(indexOfString == -1);

        return containsStringToFind;
    };
    
    /** Returns true if this collection contains no elements. */
    public boolean isEmpty(){
        return isEmpty;
    };
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object stringToRemove ){
       
        //error checking to make sure the object being passed in is actually a string
       if (!(stringToRemove instanceof String)){
         throw new IllegalArgumentException();
        }

        int indexOfString = stringGroup.indexOf(stringToRemove);
        
        //indexOf method returns -1 if the ArrayList does not contain the item
        boolean containsStringToRemove = !(indexOfString == -1);
        
        if (containsStringToRemove){
            stringGroup.remove(indexOfString);
            numberOfStrings--;
        }
            

        return true;
    };
    
    /** Returns the number of elements in this collection. */
    public int size(){
        return 0;
    };
    
    /** Returns an array containing all of the elements in this collection. */
    public Object[] toArray(){

    Object[] returnArray = new Object[1];
     return returnArray;
    };
}