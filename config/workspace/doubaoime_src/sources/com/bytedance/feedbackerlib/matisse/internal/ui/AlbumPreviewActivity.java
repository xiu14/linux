package com.bytedance.feedbackerlib.matisse.internal.ui;

import android.database.Cursor;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.entity.b;
import com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection;
import com.bytedance.feedbackerlib.matisse.internal.ui.adapter.PreviewPagerAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AlbumPreviewActivity extends BasePreviewActivity implements AlbumMediaCollection.a {
    private boolean s;
    private AlbumMediaCollection t = new AlbumMediaCollection();

    @Override // com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection.a
    public void g() {
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection.a
    public void k(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(Item.e(cursor));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f4874c.getAdapter();
        previewPagerAdapter.a(arrayList);
        previewPagerAdapter.notifyDataSetChanged();
        if (this.s) {
            return;
        }
        this.s = true;
        int indexOf = arrayList.indexOf((Item) getIntent().getParcelableExtra("extra_item"));
        this.f4874c.setCurrentItem(indexOf, false);
        this.i = indexOf;
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.BasePreviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!b.b().k) {
            setResult(0);
            finish();
            return;
        }
        this.t.c(this, this);
        this.t.a((Album) getIntent().getParcelableExtra("extra_album"));
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.b.f4860e) {
            this.f4876e.setCheckedNum(this.a.e(item));
        } else {
            this.f4876e.setChecked(this.a.j(item));
        }
        v(item);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.t.d();
    }
}
