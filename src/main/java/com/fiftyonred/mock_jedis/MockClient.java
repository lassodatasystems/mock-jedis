package com.fiftyonred.mock_jedis;

import redis.clients.jedis.Client;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rhosseini
 * @date 7/15/15
 */
public class MockClient extends Client {

    boolean isInMulti;

    boolean isConnected;

    public MockClient(String host) {
        super(host);
    }

    @Override
    public void multi() {
        isInMulti = true;
    }

    @Override
    public boolean isInMulti() {
        return isInMulti;
    }

    @Override
    public void exec() {
        //isInMulti = false;
    }

    @Override
    public void disconnect() {
    }

    @Override
    public void connect() {
        this.isConnected = true;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public List<Object> getAll(int except) {
        return getAll();
    }

    @Override
    public List<Object> getAll() {
        return new ArrayList<Object>();
    }

    @Override
    public List<Object> getObjectMultiBulkReply() {
        return new ArrayList<Object>();
    }
}

