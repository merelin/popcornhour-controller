package org.dyndns.merelin.pchrc.xmlapi.response.setting;

public class GetTimeZoneResponse {
    private final String timeZone;

    public GetTimeZoneResponse(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("timeZone: ");
        buf.append(timeZone);

        return buf.toString();
    }
}
