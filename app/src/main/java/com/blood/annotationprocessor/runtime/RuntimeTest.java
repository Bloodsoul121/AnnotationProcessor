package com.blood.annotationprocessor.runtime;

public class RuntimeTest {

    @GET(url = "this is runtime url")
    public String getIp() {
        return "ip";
    }

}
