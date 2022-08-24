/*Copyright (c) 2019-2020 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.salesvision.salesvision.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class GetExistingCustomersResponse implements Serializable {


    @ColumnAlias("NAME")
    private String name;

    @ColumnAlias("COMPANY")
    private String company;

    @ColumnAlias("SALES")
    private Integer sales;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getSales() {
        return this.sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GetExistingCustomersResponse)) return false;
        final GetExistingCustomersResponse getExistingCustomersResponse = (GetExistingCustomersResponse) o;
        return Objects.equals(getName(), getExistingCustomersResponse.getName()) &&
                Objects.equals(getCompany(), getExistingCustomersResponse.getCompany()) &&
                Objects.equals(getSales(), getExistingCustomersResponse.getSales());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),
                getCompany(),
                getSales());
    }
}