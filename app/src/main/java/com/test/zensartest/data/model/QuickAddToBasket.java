
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuickAddToBasket {

    @SerializedName("showChooseSizeTriggerQV")
    @Expose
    private Boolean showChooseSizeTriggerQV;

    public Boolean getShowChooseSizeTriggerQV() {
        return showChooseSizeTriggerQV;
    }

    public void setShowChooseSizeTriggerQV(Boolean showChooseSizeTriggerQV) {
        this.showChooseSizeTriggerQV = showChooseSizeTriggerQV;
    }

}
