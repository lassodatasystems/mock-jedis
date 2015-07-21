package com.fiftyonred.mock_jedis;

import redis.clients.jedis.Client;

/**
 * @author rhosseini
 * @date 7/15/15
 */
public class MockClient extends Client {

    boolean isInMulti;

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
        super.disconnect();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void discard() {
        super.discard();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
