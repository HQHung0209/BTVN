package OOPHigher.Encapsulation;

public class Product {
    private String name;
    private float weight;

    //getter và setter : cập nhật và lấy dữ liệu thuộc tính
    //alt + insert
    public String getName(){
        return name;
    }

    public void setName(String name) throws Exception{
        if (name.isEmpty()){
            throw new Exception("Dữ liệu trống");
        }
        this.name = name;
    }

    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight) throws Exception{
        if (weight <= 0){
            throw new Exception("invalid weight");
        }
        this.weight = weight;
    }
}
