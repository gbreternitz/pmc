package project.pmc.models;

import jakarta.persistence.OneToMany;
import java.util.List;

public class Company extends AbstractEntity{

    private String name;
    private String logoPath;

    @OneToMany(mappedBy = "company")
    private List<Product> products;

    public Company(String name, String logoPath, List<Product> products) {
        this.name = name;
        this.logoPath = logoPath;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
