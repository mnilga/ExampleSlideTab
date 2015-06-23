package com.nilga.masha.exampleslidetab2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Masha on 23.06.2015.
 */
public class Catalog {

    private List<Request> allRequests = new ArrayList<Request>();
    private List<Request> newRequests = new ArrayList<Request>();
    private List<Request> currentRequests = new ArrayList<Request>();
    private List<Request> doneRequests = new ArrayList<Request>();


    public List<Request> getAllRequests() {
        return allRequests;
    }

    public List<Request> getNewRequests() {
        return newRequests;
    }

    public List<Request> getCurrentRequests() {
        return currentRequests;
    }

    public List<Request> getDoneRequests() {
        return doneRequests;
    }

    public void addRequest(Request request){
        allRequests.add(request);
        update(allRequests);
    }

    public void update (List<Request> allRequests) {
        this.allRequests = allRequests;

        for(Request r: allRequests){
            if (r.getState() == Request.NEW_STATE) {
                newRequests.add(r);
            }
            else if (r.getState() == Request.CURRENT_STATE) {
                currentRequests.add(r);
            }
            else if (r.getState() == Request.DONE_STATE) {
                doneRequests.add(r);
            }
        }
    }
}
