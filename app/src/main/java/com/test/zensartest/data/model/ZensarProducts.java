
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZensarProducts {

    @SerializedName("products")
    @Expose
    private List<Product> products;
    @SerializedName("categoryTitle")
    @Expose
    private String categoryTitle;
    @SerializedName("childCategoriesCount")
    @Expose
    private Integer childCategoriesCount;
    @SerializedName("results")
    @Expose
    private Integer results;
    @SerializedName("pagesAvailable")
    @Expose
    private Integer pagesAvailable;
    @SerializedName("dynamicBannerId")
    @Expose
    private String dynamicBannerId;
    @SerializedName("seoBannerId")
    @Expose
    private String seoBannerId;
    @SerializedName("redirectUrl")
    @Expose
    private String redirectUrl;
    @SerializedName("staticLinks")
    @Expose
    private List<Object> staticLinks = null;
    @SerializedName("selectedDept")
    @Expose
    private String selectedDept;
    @SerializedName("multiCatSelected")
    @Expose
    private String multiCatSelected;
    @SerializedName("endecaCanonical")
    @Expose
    private String endecaCanonical;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Integer getChildCategoriesCount() {
        return childCategoriesCount;
    }

    public void setChildCategoriesCount(Integer childCategoriesCount) {
        this.childCategoriesCount = childCategoriesCount;
    }

    public Integer getResults() {
        return results;
    }

    public void setResults(Integer results) {
        this.results = results;
    }

    public Integer getPagesAvailable() {
        return pagesAvailable;
    }

    public void setPagesAvailable(Integer pagesAvailable) {
        this.pagesAvailable = pagesAvailable;
    }

    public String getDynamicBannerId() {
        return dynamicBannerId;
    }

    public void setDynamicBannerId(String dynamicBannerId) {
        this.dynamicBannerId = dynamicBannerId;
    }

    public String getSeoBannerId() {
        return seoBannerId;
    }

    public void setSeoBannerId(String seoBannerId) {
        this.seoBannerId = seoBannerId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public List<Object> getStaticLinks() {
        return staticLinks;
    }

    public void setStaticLinks(List<Object> staticLinks) {
        this.staticLinks = staticLinks;
    }

    public String getSelectedDept() {
        return selectedDept;
    }

    public void setSelectedDept(String selectedDept) {
        this.selectedDept = selectedDept;
    }

    public String getMultiCatSelected() {
        return multiCatSelected;
    }

    public void setMultiCatSelected(String multiCatSelected) {
        this.multiCatSelected = multiCatSelected;
    }

    public String getEndecaCanonical() {
        return endecaCanonical;
    }

    public void setEndecaCanonical(String endecaCanonical) {
        this.endecaCanonical = endecaCanonical;
    }

}
