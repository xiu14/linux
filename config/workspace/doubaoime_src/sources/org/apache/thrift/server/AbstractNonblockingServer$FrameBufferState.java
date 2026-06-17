package org.apache.thrift.server;

/* loaded from: classes2.dex */
enum AbstractNonblockingServer$FrameBufferState {
    READING_FRAME_SIZE,
    READING_FRAME,
    READ_FRAME_COMPLETE,
    AWAITING_REGISTER_WRITE,
    WRITING,
    AWAITING_REGISTER_READ,
    AWAITING_CLOSE
}
