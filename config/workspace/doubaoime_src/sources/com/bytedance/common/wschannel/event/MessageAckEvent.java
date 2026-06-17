package com.bytedance.common.wschannel.event;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MessageAckEvent {
    private MessageState a = MessageState.Default;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4249c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4250d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f4251e;

    public enum MessageState {
        Default(0),
        TimeOut(1),
        Failed(2),
        Success(3);

        final int mState;

        MessageState(int i) {
            this.mState = i;
        }

        public int getTypeValue() {
            return this.mState;
        }

        public static MessageState valueOf(int i) {
            return i != 1 ? i != 2 ? i != 3 ? Default : Success : Failed : TimeOut;
        }
    }

    public MessageAckEvent(String str, int i, int i2, int i3, String str2) {
        this.b = str;
        this.f4249c = i;
        this.f4250d = i3;
        try {
            this.f4251e = new JSONObject(str2);
        } catch (JSONException unused) {
        }
    }

    public void a(MessageState messageState) {
        this.a = messageState;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("UniqueId:");
        M.append(this.b);
        M.append(", ChannelId:");
        M.append(this.f4249c);
        M.append(", methodId:");
        M.append(this.f4250d);
        M.append(", state:");
        M.append(this.a);
        M.append(", logInfo:");
        M.append(this.f4251e.toString());
        return M.toString();
    }
}
