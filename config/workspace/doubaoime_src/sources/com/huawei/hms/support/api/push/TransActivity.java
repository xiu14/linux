package com.huawei.hms.support.api.push;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.android.doubaoime.C0838R;
import com.huawei.hms.push.t;

/* loaded from: classes2.dex */
public class TransActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.hwpush_trans_activity);
        getWindow().addFlags(67108864);
        t.a(this, getIntent());
        finish();
    }
}
