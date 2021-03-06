/**
 * Hash key providing class
 */

package model.graph;

/**
 * Unique key for the object of the {@link Graph}.
 * @author vicky
 *
 */
public final class Key {

	//unique id object
    private final Long id;

    public Key(Long id) {
      if (id == null) {
        throw new IllegalArgumentException();
      }
      this.id = id;
    }

    public int hashCode() {
      return id.hashCode();
    }

    public Long getId() {
        return id;
      }
    
    public boolean equals(Object obj) {
      if (!(obj instanceof Key)) return false;
      return id.equals(((Key) obj).id);
    }
    
    public String toString() {
    	return "key:"+id;
    }

}