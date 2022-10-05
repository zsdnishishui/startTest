package org.zsd.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app.rpc")
public class RpcProperties {
    private String secrete="world";

    public String getSecrete() {
        return secrete;
    }

    public void setSecrete(String secrete) {
        this.secrete = secrete;
    }
}
