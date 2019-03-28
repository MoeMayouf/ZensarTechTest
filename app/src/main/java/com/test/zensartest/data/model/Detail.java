
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("facetId")
    @Expose
    private String facetId;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("qty")
    @Expose
    private String qty;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("colorSwatchUrl")
    @Expose
    private String colorSwatchUrl;
    @SerializedName("isSelected")
    @Expose
    private String isSelected;
    @SerializedName("seoUrlParts")
    @Expose
    private String seoUrlParts;

    public String getFacetId() {
        return facetId;
    }

    public void setFacetId(String facetId) {
        this.facetId = facetId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorSwatchUrl() {
        return colorSwatchUrl;
    }

    public void setColorSwatchUrl(String colorSwatchUrl) {
        this.colorSwatchUrl = colorSwatchUrl;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }

    public String getSeoUrlParts() {
        return seoUrlParts;
    }

    public void setSeoUrlParts(String seoUrlParts) {
        this.seoUrlParts = seoUrlParts;
    }

}
