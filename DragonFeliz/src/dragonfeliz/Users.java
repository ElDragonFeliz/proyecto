/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonfeliz;

/**
 *
 * @author Kevin Alejandro
 */
public class Users {
    
    private String userName;
    private String userPass;
    
    public Users(String userName, String userPass){
        this.userName = userName;
        this.userPass = userPass;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getUserPass() {
        return userPass;
    }
    
}
