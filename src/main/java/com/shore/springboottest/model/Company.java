package com.shore.springboottest.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:test.properties")
@ConfigurationProperties(prefix = "com.zxb")
public class Company {

    private String company;

    private String address;

    private Long salary;

    public Company() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
