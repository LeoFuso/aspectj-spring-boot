package com.example.aspectj.spring.boot.configuration;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.Duration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("stream.health.indicator")
public class StreamHealthIndicatorConfigurationProperties {

    @NotNull
    private Duration rebalancingThresholdTimeout = Duration.ofSeconds(15);

    @Valid
    @NotNull
    private BrokerConnectivity brokerConnectivity = new BrokerConnectivity();

    public static class BrokerConnectivity {

        @NotBlank
        private String topic = "finance.delivery-credit";

        public String getTopic() {
            return topic;
        }

        public void setTopic(final String topic) {
            this.topic = topic;
        }


    }

    public Duration getRebalancingThresholdTimeout() {
        return rebalancingThresholdTimeout;
    }

    public void setRebalancingThresholdTimeout(final Duration rebalancingThresholdTimeout) {
        this.rebalancingThresholdTimeout = rebalancingThresholdTimeout;
    }

    public BrokerConnectivity getBrokerConnectivity() {
        return brokerConnectivity;
    }

    public void setBrokerConnectivity(final BrokerConnectivity brokerConnectivity) {
        this.brokerConnectivity = brokerConnectivity;
    }
}
