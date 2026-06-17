package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* loaded from: classes2.dex */
public class t extends NetworkChangeNotifierAutoDetect.h implements ApplicationStatus.b {
    private boolean b;

    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.h
    protected void a() {
        if (this.b) {
            return;
        }
        ApplicationStatus.e(this);
        this.b = true;
    }

    @Override // com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.h
    protected void b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        super.b(networkChangeNotifierAutoDetect);
        ApplicationStatus.d(this);
        if (ApplicationStatus.hasVisibleActivities()) {
            c();
        } else {
            d();
        }
    }
}
