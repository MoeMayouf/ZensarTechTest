
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crumb {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("item")
    @Expose
    private String item;
    @SerializedName("clickable")
    @Expose
    private String clickable;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getClickable() {
        return clickable;
    }

    public void setClickable(String clickable) {
        this.clickable = clickable;
    }

}
