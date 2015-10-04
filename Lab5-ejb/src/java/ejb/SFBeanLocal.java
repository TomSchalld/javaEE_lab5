/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Local;

/**
 *
 * @author Thomas
 */
@Local
public interface SFBeanLocal {

    public String getName();

    public void setName(String name);
    
}
