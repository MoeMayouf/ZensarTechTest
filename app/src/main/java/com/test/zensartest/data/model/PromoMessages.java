
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.test.zensartest.data.model.CustomSpecialOffer;

public class PromoMessages {

    @SerializedName("priceMatched")
    @Expose
    private String priceMatched;
    @SerializedName("offer")
    @Expose
    private String offer;
    @SerializedName("customPromotionalMessage")
    @Expose
    private String customPromotionalMessage;
    @SerializedName("bundleHeadline")
    @Expose
    private String bundleHeadline;
    @SerializedName("customSpecialOffer")
    @Expose
    private CustomSpecialOffer customSpecialOffer;

    public String getPriceMatched() {
        return priceMatched;
    }

    public void setPriceMatched(String priceMatched) {
        this.priceMatched = priceMatched;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getCustomPromotionalMessage() {
        return customPromotionalMessage;
    }

    public void setCustomPromotionalMessage(String customPromotionalMessage) {
        this.customPromotionalMessage = customPromotionalMessage;
    }

    public String getBundleHeadline() {
        return bundleHeadline;
    }

    public void setBundleHeadline(String bundleHeadline) {
        this.bundleHeadline = bundleHeadline;
    }

    public CustomSpecialOffer getCustomSpecialOffer() {
        return customSpecialOffer;
    }

    public void setCustomSpecialOffer(CustomSpecialOffer customSpecialOffer) {
        this.customSpecialOffer = customSpecialOffer;
    }

}
