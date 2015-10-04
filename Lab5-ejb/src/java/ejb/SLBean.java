/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 *
 * @author Thomas
 */
@Stateless
public class SLBean implements SLBeanLocal {

    private String message;

    @Override
    public String getMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SLBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.message;
    }

    @Override
    public void setMessage(String message) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(SLBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.message += message;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public SLBean() {
        this.message = "Default ";
    }
}
