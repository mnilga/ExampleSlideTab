package com.nilga.masha.exampleslidetab2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Masha on 23.06.2015.
 */
public class Request {

    private int number = 0;
    private int state = 0;
    private String login = "";
    private String name = "";
    private String problem ="";

    static final int NEW_STATE = 1;
    static final int CURRENT_STATE = 2;
    static final int DONE_STATE = 3;


    //private Catalog catalog;

    public Request(int number, String login, int state){
        this.number = number;
        this.login = login;
        this.state = state;
        //catalog = new Catalog();
    }

    public int getNumber() {
        return number;
    }

    public String getLogin() {
        return login;
    }

    public int getState() {
        return state;
    }


    /*public void notifyCatalog(){
           catalog.update();
           }
*/
    
    void changeState(int state){
        this.state = state;
        //notifyCatalog();
    }

}
