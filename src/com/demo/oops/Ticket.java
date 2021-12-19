package com.demo.oops;

import java.util.Objects;

public class Ticket {

    protected String type;
    protected int cost;
    protected double duration;

    @Override
    public String toString() {
        return "Ticket{" +
                "type='" + type + '\'' +
                ", cost=" + cost +
                ", duration=" + duration +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return cost == ticket.cost && Double.compare(ticket.duration, duration) == 0 && Objects.equals(type, ticket.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost, duration);
    }
}
