
package com.test.zensartest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("productId")
    @Expose
    private String productId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("averageRating")
    @Expose
    private Double averageRating;
    @SerializedName("reviews")
    @Expose
    private Integer reviews;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("additionalServices")
    @Expose
    private List<Object> additionalServices = null;
    @SerializedName("displaySpecialOffer")
    @Expose
    private String displaySpecialOffer;
    @SerializedName("nonPromoMessage")
    @Expose
    private String nonPromoMessage;
    @SerializedName("defaultSkuId")
    @Expose
    private String defaultSkuId;
    @SerializedName("colorSwatches")
    @Expose
    private List<ColorSwatch> colorSwatches;
    @SerializedName("colorSwatchSelected")
    @Expose
    private Integer colorSwatchSelected;
    @SerializedName("colorWheelMessage")
    @Expose
    private String colorWheelMessage;
    @SerializedName("outOfStock")
    @Expose
    private Boolean outOfStock;
    @SerializedName("emailMeWhenAvailable")
    @Expose
    private Boolean emailMeWhenAvailable;
    @SerializedName("availabilityMessage")
    @Expose
    private String availabilityMessage;
    @SerializedName("compare")
    @Expose
    private Boolean compare;
    @SerializedName("fabric")
    @Expose
    private String fabric;
    @SerializedName("swatchAvailable")
    @Expose
    private Boolean swatchAvailable;
    @SerializedName("categoryQuickViewEnabled")
    @Expose
    private Boolean categoryQuickViewEnabled;
    @SerializedName("swatchCategoryType")
    @Expose
    private String swatchCategoryType;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("ageRestriction")
    @Expose
    private Integer ageRestriction;
    @SerializedName("isInStoreOnly")
    @Expose
    private Boolean isInStoreOnly;
    @SerializedName("isMadeToMeasure")
    @Expose
    private Boolean isMadeToMeasure;
    @SerializedName("isBundle")
    @Expose
    private Boolean isBundle;
    @SerializedName("isProductSet")
    @Expose
    private Boolean isProductSet;
    @SerializedName("promotionalFeatures")
    @Expose
    private List<Object> promotionalFeatures = null;
    @SerializedName("features")
    @Expose
    private List<Object> features = null;
    @SerializedName("directorate")
    @Expose
    private String directorate;
    @SerializedName("releaseDateTimestamp")
    @Expose
    private Integer releaseDateTimestamp;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getReviews() {
        return reviews;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Object> getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(List<Object> additionalServices) {
        this.additionalServices = additionalServices;
    }

    public String getDisplaySpecialOffer() {
        return displaySpecialOffer;
    }

    public void setDisplaySpecialOffer(String displaySpecialOffer) {
        this.displaySpecialOffer = displaySpecialOffer;
    }

    public String getNonPromoMessage() {
        return nonPromoMessage;
    }

    public void setNonPromoMessage(String nonPromoMessage) {
        this.nonPromoMessage = nonPromoMessage;
    }

    public String getDefaultSkuId() {
        return defaultSkuId;
    }

    public void setDefaultSkuId(String defaultSkuId) {
        this.defaultSkuId = defaultSkuId;
    }

    public List<ColorSwatch> getColorSwatches() {
        return colorSwatches;
    }

    public void setColorSwatches(List<ColorSwatch> colorSwatches) {
        this.colorSwatches = colorSwatches;
    }

    public Integer getColorSwatchSelected() {
        return colorSwatchSelected;
    }

    public void setColorSwatchSelected(Integer colorSwatchSelected) {
        this.colorSwatchSelected = colorSwatchSelected;
    }

    public String getColorWheelMessage() {
        return colorWheelMessage;
    }

    public void setColorWheelMessage(String colorWheelMessage) {
        this.colorWheelMessage = colorWheelMessage;
    }

    public Boolean getOutOfStock() {
        return outOfStock;
    }

    public void setOutOfStock(Boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public Boolean getEmailMeWhenAvailable() {
        return emailMeWhenAvailable;
    }

    public void setEmailMeWhenAvailable(Boolean emailMeWhenAvailable) {
        this.emailMeWhenAvailable = emailMeWhenAvailable;
    }

    public String getAvailabilityMessage() {
        return availabilityMessage;
    }

    public void setAvailabilityMessage(String availabilityMessage) {
        this.availabilityMessage = availabilityMessage;
    }

    public Boolean getCompare() {
        return compare;
    }

    public void setCompare(Boolean compare) {
        this.compare = compare;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public Boolean getSwatchAvailable() {
        return swatchAvailable;
    }

    public void setSwatchAvailable(Boolean swatchAvailable) {
        this.swatchAvailable = swatchAvailable;
    }

    public Boolean getCategoryQuickViewEnabled() {
        return categoryQuickViewEnabled;
    }

    public void setCategoryQuickViewEnabled(Boolean categoryQuickViewEnabled) {
        this.categoryQuickViewEnabled = categoryQuickViewEnabled;
    }

    public String getSwatchCategoryType() {
        return swatchCategoryType;
    }

    public void setSwatchCategoryType(String swatchCategoryType) {
        this.swatchCategoryType = swatchCategoryType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(Integer ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Boolean getIsInStoreOnly() {
        return isInStoreOnly;
    }

    public void setIsInStoreOnly(Boolean isInStoreOnly) {
        this.isInStoreOnly = isInStoreOnly;
    }

    public Boolean getIsMadeToMeasure() {
        return isMadeToMeasure;
    }

    public void setIsMadeToMeasure(Boolean isMadeToMeasure) {
        this.isMadeToMeasure = isMadeToMeasure;
    }

    public Boolean getIsBundle() {
        return isBundle;
    }

    public void setIsBundle(Boolean isBundle) {
        this.isBundle = isBundle;
    }

    public Boolean getIsProductSet() {
        return isProductSet;
    }

    public void setIsProductSet(Boolean isProductSet) {
        this.isProductSet = isProductSet;
    }

    public List<Object> getPromotionalFeatures() {
        return promotionalFeatures;
    }

    public void setPromotionalFeatures(List<Object> promotionalFeatures) {
        this.promotionalFeatures = promotionalFeatures;
    }

    public List<Object> getFeatures() {
        return features;
    }

    public void setFeatures(List<Object> features) {
        this.features = features;
    }

    public String getDirectorate() {
        return directorate;
    }

    public void setDirectorate(String directorate) {
        this.directorate = directorate;
    }

    public Integer getReleaseDateTimestamp() {
        return releaseDateTimestamp;
    }

    public void setReleaseDateTimestamp(Integer releaseDateTimestamp) {
        this.releaseDateTimestamp = releaseDateTimestamp;
    }

}
