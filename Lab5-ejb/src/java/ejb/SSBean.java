/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author Thomas
 */
@Singleton
@LocalBean
public class SSBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private int prop = 0;
    public int getProp(){
        return this.prop++;
    }
}
