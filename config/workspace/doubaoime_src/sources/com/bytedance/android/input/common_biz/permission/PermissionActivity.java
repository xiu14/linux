package com.bytedance.android.input.common_biz.permission;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import com.bytedance.android.input.basic.IAppGlobals;
import com.huawei.hms.push.AttributionReporter;
import java.util.Objects;

/* loaded from: classes.dex */
public class PermissionActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == -1) {
                if (!ActivityCompat.shouldShowRequestPermissionRationale(this, strArr[i2])) {
                    String str = strArr[i2];
                    throw null;
                }
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                aVar.j(AttributionReporter.SYSTEM_PERMISSION, strArr[i2] + " = PERMISSION_DENIED");
                String str2 = strArr[i2];
                throw null;
            }
            if (iArr[i2] == 0) {
                String str3 = strArr[i2];
                throw null;
            }
        }
        throw null;
    }
}
