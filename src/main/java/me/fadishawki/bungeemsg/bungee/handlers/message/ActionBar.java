package me.fadishawki.bungeemsg.bungee.handlers.message;

/*
 * OrbitMines - @author Fadi Shawki - 2018
 */

import me.fadishawki.bungeemsg.bungee.handlers.Message;
import me.fadishawki.bungeemsg.bungee.handlers.Receiver;
import me.fadishawki.bungeemsg.bungee.handlers.filter.Filter;
import org.json.simple.JSONObject;

public class ActionBar implements Message.Type {

    private String message;

    public ActionBar(String message){
        this.message = message;
    }


    @Override
    public boolean send(Receiver receiver) {

        return false;
    }

    @Override
    public void adjustFilter(Filter filter) {

    }

    @Override
    public JSONObject serialize() {
        return null;
    }
}
