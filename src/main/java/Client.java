public class Client {
    
    private String type;

    public Client(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void typeClientFormat(String type) {
        String aux = getType();
        aux = aux.replaceAll(":", "");
        setType(aux);
    }
}
