
class AirplaneCompany{
    private int id;
    private Airplane[] planes; //for diff plane types
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setPlanes(Airplane[] planes) {
        this.planes = planes;
    }

    public Airplane[] getPlanes() {
        return planes;
    }
    
}

