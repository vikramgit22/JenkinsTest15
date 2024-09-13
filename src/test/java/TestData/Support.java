package TestData;

public class Support {

    public Support(String url, String text) {
        this.url = url;
        this.text = text;
    }

    public String url;
    public String text;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
