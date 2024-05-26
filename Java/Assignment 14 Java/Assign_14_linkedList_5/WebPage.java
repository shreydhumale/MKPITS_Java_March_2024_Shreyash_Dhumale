package Assign_14_linkedList_5;

public class WebPage {
    private String pageId;
    private String url;
    private String title;
    private String visitDate;

    public WebPage(String pageId, String url, String title, String visitDate) {
        this.pageId = pageId;
        this.url = url;
        this.title = title;
        this.visitDate = visitDate;
    }

    public String getPageId() {
        return pageId;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public String getVisitDate() {
        return visitDate;
    }

    @Override
    public String toString() {
        return "WebPage{" +
                "pageId='" + pageId + '\'' +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
