package app.mrquan.pojo;

public class Person {
    private Integer id;
    private String name;
    private String province;//省
    private String city;//市
    private String county;//县
    private String detailedAddress;//详细住址
    private String tel;//电话

    public Person() {
    }

    public Person(Integer id, String name, String province, String city, String county, String detailedAddress, String tel) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.city = city;
        this.county = county;
        this.detailedAddress = detailedAddress;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
