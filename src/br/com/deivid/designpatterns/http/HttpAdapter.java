package br.com.deivid.designpatterns.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);

}
