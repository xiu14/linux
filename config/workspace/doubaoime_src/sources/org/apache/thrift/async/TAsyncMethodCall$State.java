package org.apache.thrift.async;

/* loaded from: classes2.dex */
public enum TAsyncMethodCall$State {
    CONNECTING,
    WRITING_REQUEST_SIZE,
    WRITING_REQUEST_BODY,
    READING_RESPONSE_SIZE,
    READING_RESPONSE_BODY,
    RESPONSE_READ,
    ERROR
}
