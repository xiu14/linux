package org.apache.thrift.transport;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public enum TSaslTransport$NegotiationStatus {
    START((byte) 1),
    OK((byte) 2),
    BAD((byte) 3),
    ERROR((byte) 4),
    COMPLETE((byte) 5);

    private static final Map<Byte, TSaslTransport$NegotiationStatus> reverseMap = new HashMap();
    private final byte value;

    static {
        for (TSaslTransport$NegotiationStatus tSaslTransport$NegotiationStatus : (TSaslTransport$NegotiationStatus[]) TSaslTransport$NegotiationStatus.class.getEnumConstants()) {
            reverseMap.put(Byte.valueOf(tSaslTransport$NegotiationStatus.getValue()), tSaslTransport$NegotiationStatus);
        }
    }

    TSaslTransport$NegotiationStatus(byte b) {
        this.value = b;
    }

    public static TSaslTransport$NegotiationStatus byValue(byte b) {
        return reverseMap.get(Byte.valueOf(b));
    }

    public byte getValue() {
        return this.value;
    }
}
