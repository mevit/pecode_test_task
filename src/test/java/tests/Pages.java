package tests;

public enum Pages {
    SIGN_IN("qa-portal/registerlogin/registerlogin.php"),
    GREET("qa-portal/greet.php");

    private final String url;

    Pages(String url) {
        this.url = url;
    }

    public String getUrl() { return url; }
}
