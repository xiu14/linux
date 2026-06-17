package com.bytedance.push.interfaze;

/* loaded from: classes2.dex */
public interface IPushService {

    public enum PushType {
        OPPO(10);

        private final int type;

        PushType(int i) {
            this.type = i;
        }

        public int getType() {
            return this.type;
        }
    }

    public interface a {
        void a(String str);
    }
}
