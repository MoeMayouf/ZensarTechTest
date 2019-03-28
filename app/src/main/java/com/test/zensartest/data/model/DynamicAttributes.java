
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DynamicAttributes {

    @SerializedName("newinproducttype")
    @Expose
    private String newinproducttype;
    @SerializedName("washinginstructions")
    @Expose
    private String washinginstructions;
    @SerializedName("dressbyoccasion")
    @Expose
    private String dressbyoccasion;
    @SerializedName("dressshape")
    @Expose
    private String dressshape;
    @SerializedName("typeofpattern")
    @Expose
    private String typeofpattern;

    public String getNewinproducttype() {
        return newinproducttype;
    }

    public void setNewinproducttype(String newinproducttype) {
        this.newinproducttype = newinproducttype;
    }

    public String getWashinginstructions() {
        return washinginstructions;
    }

    public void setWashinginstructions(String washinginstructions) {
        this.washinginstructions = washinginstructions;
    }

    public String getDressbyoccasion() {
        return dressbyoccasion;
    }

    public void setDressbyoccasion(String dressbyoccasion) {
        this.dressbyoccasion = dressbyoccasion;
    }

    public String getDressshape() {
        return dressshape;
    }

    public void setDressshape(String dressshape) {
        this.dressshape = dressshape;
    }

    public String getTypeofpattern() {
        return typeofpattern;
    }

    public void setTypeofpattern(String typeofpattern) {
        this.typeofpattern = typeofpattern;
    }

}
