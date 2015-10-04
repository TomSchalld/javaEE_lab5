/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import ejb.SFBean;
import ejb.SLBeanLocal;
import ejb.SFBeanLocal;
import ejb.SLBean;
import ejb.SSBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Thomas
 */
@ManagedBean(name="myBean")
@SessionScoped
public class MyBean {

    @EJB
    SLBeanLocal statelessBean;
    
    @EJB
    SFBeanLocal sfBean;
    @EJB
    SSBean ssBean;
    /**
     * Creates a new instance of MyBean
     */
    
    public MyBean() {
     
    }
    public String getMessageSL(){
        return this.statelessBean.getMessage();
    }
    public void setMessageSL(String message){
         this.statelessBean.setMessage(message);
    }
    public String getNameSF(){
        return this.sfBean.getName();
    }
    public void setNameSF(String name){
         this.sfBean.setName(name);
    }
    public int getHits(){
        return this.ssBean.getProp();
    }
    
}
