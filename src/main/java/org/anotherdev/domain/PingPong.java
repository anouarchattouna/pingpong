package org.anotherdev.domain;

import java.util.Date;

/**
 * Created by anouar on 20/06/2016.
 */
public class PingPong {

    private String ping;

    private long now;

    public PingPong(String ping, long now) {
        this.ping = ping;
        this.now = now;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String pong) {
        this.ping = pong;
    }

    public long getNow() {
        return now;
    }

    public void setNow(long now) {
        this.now = now;
    }
}
