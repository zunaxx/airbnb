package Airbnb;

public class Address {
    private static long nextId = 0;
    public static long Id;
    private String province;
    private String region;
    private String address;

    public Address(String province, String region, String address) {
        this.province = province;
        this.region = region;
        this.address = address;
        this.Id = nextId++;
    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        Address.nextId = nextId;
    }

    public static long getId() {
        return Id;
    }

    public static void setId(long id) {
        Id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", region='" + region + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
