package com.bytedance.feedbackerlib.matisse.internal.ui;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.entity.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SelectedPreviewActivity extends BasePreviewActivity {
    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.BasePreviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!b.b().k) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = getIntent().getBundleExtra("extra_default_bundle").getParcelableArrayList("state_selection");
        this.f4875d.a(parcelableArrayList);
        this.f4875d.notifyDataSetChanged();
        if (this.b.f4860e) {
            this.f4876e.setCheckedNum(1);
        } else {
            this.f4876e.setChecked(true);
        }
        this.i = 0;
        v((Item) parcelableArrayList.get(0));
    }
}
