package org.apache.http.impl.auth;

/* loaded from: classes2.dex */
enum NTLMScheme$State {
    UNINITIATED,
    CHALLENGE_RECEIVED,
    MSG_TYPE1_GENERATED,
    MSG_TYPE2_RECEVIED,
    MSG_TYPE3_GENERATED,
    FAILED
}
