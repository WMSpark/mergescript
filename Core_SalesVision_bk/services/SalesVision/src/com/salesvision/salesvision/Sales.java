/*Copyright (c) 2019-2020 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.salesvision.salesvision;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Sales generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`SALES`")
public class Sales implements Serializable {

    private Integer id;
    private String comments;
    private Date entryDate;
    private Boolean isRenewal;
    private Integer productId;
    private Integer quoteId;
    private Integer renewalPeriod;
    private Integer sales;
    private Products products;
    private Quotes quotes;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "`ID`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`COMMENTS`", nullable = true, length = 555)
    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Column(name = "`ENTRY_DATE`", nullable = true)
    public Date getEntryDate() {
        return this.entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Column(name = "`IS_RENEWAL`", nullable = true)
    public Boolean getIsRenewal() {
        return this.isRenewal;
    }

    public void setIsRenewal(Boolean isRenewal) {
        this.isRenewal = isRenewal;
    }

    @Column(name = "`PRODUCT_ID`", nullable = true, scale = 0, precision = 10)
    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Column(name = "`QUOTE_ID`", nullable = true, scale = 0, precision = 10)
    public Integer getQuoteId() {
        return this.quoteId;
    }

    public void setQuoteId(Integer quoteId) {
        this.quoteId = quoteId;
    }

    @Column(name = "`RENEWAL_PERIOD`", nullable = true, scale = 0, precision = 10)
    public Integer getRenewalPeriod() {
        return this.renewalPeriod;
    }

    public void setRenewalPeriod(Integer renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
    }

    @Column(name = "`SALES`", nullable = true, scale = 0, precision = 10)
    public Integer getSales() {
        return this.sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`PRODUCT_ID`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_SALES_PRODUCT_ID`"))
    @Fetch(FetchMode.JOIN)
    public Products getProducts() {
        return this.products;
    }

    public void setProducts(Products products) {
        if(products != null) {
            this.productId = products.getId();
        }

        this.products = products;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "`QUOTE_ID`", referencedColumnName = "`ID`", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "`FK_SALES_QUOTE_ID`"))
    @Fetch(FetchMode.JOIN)
    public Quotes getQuotes() {
        return this.quotes;
    }

    public void setQuotes(Quotes quotes) {
        if(quotes != null) {
            this.quoteId = quotes.getId();
        }

        this.quotes = quotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sales)) return false;
        final Sales salesInstance = (Sales) o;
        return Objects.equals(getId(), salesInstance.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}