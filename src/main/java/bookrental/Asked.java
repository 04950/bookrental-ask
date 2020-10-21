package bookrental;

public class Asked extends AbstractEvent {

    private Long rentDate;
    private String askDate;
    private String status;
    private Double bookPrice;

    public Asked(){
        super();
    }

    public Long getRentDate() {
        return rentDate;
    }

    public void setRentDate(Long rentDate) {
        this.rentDate = rentDate;
    }
    public String getAskDate() {
        return askDate;
    }

    public void setAskDate(String askDate) {
        this.askDate = askDate;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
