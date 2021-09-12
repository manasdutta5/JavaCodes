package Practice_Leetcode;

public class Country {
    String name;
    Double area;
    int provinces;
    String capital;
    Boolean muslim;
    long population;

    public Country(String name, Double area, int provinces, String capital, Boolean muslim, long population) {
        this.name = name;
        this.area = area;
        this.provinces = provinces;
        this.capital = capital;
        this.muslim = muslim;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getProvinces() {
        return provinces;
    }

    public void setProvinces(int provinces) {
        this.provinces = provinces;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Boolean getMuslim() {
        return muslim;
    }

    public void setMuslim(Boolean muslim) {
        this.muslim = muslim;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void display()
    {
        System.out.println("Country Name is "+getName());
        System.out.println("Area is "+getArea());
        System.out.println("It has "+getProvinces()+" provinces.");
        System.out.println("Its capital is "+getCapital());
        System.out.println("Is it a Muslim Country :"+getMuslim());
        System.out.println("Its population is "+getPopulation());
    }

    public void copy(Country args)
    {
        Country cn = args;
    }



}
