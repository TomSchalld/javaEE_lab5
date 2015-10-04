/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateful;

/**
 *
 * @author Thomas
 */
@Stateful
public class SFBean implements SFBeanLocal {

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name += name; 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public SFBean() {
        this.name = "Name ";
    }
}
