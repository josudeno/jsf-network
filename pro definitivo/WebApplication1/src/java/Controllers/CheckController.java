/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "CheckController")
@SessionScoped
public class CheckController implements Serializable
{
    boolean flag;
public String Changefalse()
{
    flag=false;
    return "succes";
}
    public String Changetrue()
{
    flag=true;
    return "succes";
}
    

    public CheckController() {
    }

    public CheckController(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    
    
}
