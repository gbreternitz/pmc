package project.pmc.models;

import jakarta.persistence.ManyToOne;

public class Product extends AbstractEntity{

    private String name;
    private String productType;
    private String productDetails;

    @ManyToOne
    private Company company;




}
