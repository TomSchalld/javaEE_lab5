
package ejb;

import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface SLBeanLocal {
    public String getMessage();
    public void setMessage(String message);
}
