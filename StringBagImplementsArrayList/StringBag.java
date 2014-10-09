import java.util.ArrayList;

public class StringBag extends ArrayList<Object> implements SimpleCollection{
	
	public static void main(String[] args) {
		
	}

	 /** Ensures that this collection contains the specified element (optional operation). */
    public boolean add ( Object stringToAdd ){
    	if(!(stringToAdd instanceof String)){
    		throw new IllegalArgumentException();
    	}
    	
    	boolean containsString = this.contains(stringToAdd);
    	
    	super.add(stringToAdd);

    	return containsString;
    }
    
    /** Returns true if this collection contains the specified element. */
    public boolean contains ( Object stringToFind ){

    	if(!(stringToFind instanceof String)){
    		throw new IllegalArgumentException();
    	}

    	return super.contains(stringToFind);
    }
    
    /** Removes a single instance of the specified element from this collection, if it is present. */
    public boolean remove ( Object stringToRemove ){
    	if(!(stringToRemove instanceof String)){
    		throw new IllegalArgumentException();
    	}

    	boolean containsString = this.contains(stringToRemove);
    	
    	super.remove(stringToRemove);

    	return containsString;
    }
}