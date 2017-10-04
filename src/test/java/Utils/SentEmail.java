package Utils;

import java.util.Date;

public class SentEmail {
    String subject;
    Date date;

    public SentEmail(String subject, Date date) {
        this.subject = subject;
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "SentEmail{" +
                "subject='" + subject + '\'' +
                ", date=" + date +
                '}';
    }
}
