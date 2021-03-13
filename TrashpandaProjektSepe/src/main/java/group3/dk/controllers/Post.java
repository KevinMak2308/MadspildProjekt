package group3.dk.controllers;

public class Post {
    private double price;
    private double weight;
    /*private String productType;
    private Member member;*/

    public Post(double price, double weight/*, String productType, Member member*/) {
        this.price = price;
        this.weight = weight;
        /*this.productType = productType;
        this.member = member;*/
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /*public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Member getMember() {
        return member;
    }

    public void setProfile(Member member) {
        this.member = member;
    }*/
}
