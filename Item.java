class Item{
    String name;
    String categoryname;
    float price;

    public void Setname(String a){
        name = a;
    }
    public void Setcategoryname(String l){
        categoryname = l;
    }
    public void Setprice(float y){
        price = y;
    }
    public String Getname(){
        return name;
    }
    public String Getcategoryname(){
        return categoryname;
    }
    public float Getprice(){
        return price;
    }
    public Item(String a, String l, float y){
        name = a;
        categoryname = l;
        price = y;
    }
}