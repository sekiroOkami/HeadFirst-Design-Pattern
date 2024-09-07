package com.closedHierarchy;

public sealed interface TrafficLight permits Redlight, Greenlight{
}
