package com.github.meixuesong.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Payment implements Serializable {
    private PaymentType type;
    private BigDecimal amount;

    public Payment(PaymentType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    public PaymentType getType() {
        return type;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
