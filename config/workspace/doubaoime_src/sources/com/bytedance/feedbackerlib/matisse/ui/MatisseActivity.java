package com.bytedance.feedbackerlib.matisse.ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.model.AlbumCollection;
import com.bytedance.feedbackerlib.matisse.internal.ui.AlbumPreviewActivity;
import com.bytedance.feedbackerlib.matisse.internal.ui.MediaSelectionFragment;
import com.bytedance.feedbackerlib.matisse.internal.ui.SelectedPreviewActivity;
import com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.CheckRadioView;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.IncapableDialog;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class MatisseActivity extends AppCompatActivity implements View.OnClickListener, AlbumCollection.a, AdapterView.OnItemSelectedListener, MediaSelectionFragment.a, AlbumMediaAdapter.c, AlbumMediaAdapter.e, AlbumMediaAdapter.f {
    private final AlbumCollection a = new AlbumCollection();
    private final com.bytedance.feedbackerlib.matisse.internal.model.a b = new com.bytedance.feedbackerlib.matisse.internal.model.a(this);

    /* renamed from: c, reason: collision with root package name */
    private com.bytedance.feedbackerlib.matisse.internal.entity.b f4908c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.feedbackerlib.matisse.internal.ui.widget.a f4909d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.feedbackerlib.matisse.internal.ui.adapter.a f4910e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f4911f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f4912g;
    private TextView h;
    private View i;
    private View j;
    private View k;
    private LinearLayout l;
    private CheckRadioView m;
    private boolean n;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MatisseActivity.this.onBackPressed();
        }
    }

    class b implements a.d {
        b() {
        }

        @Override // com.bytedance.feedbackerlib.matisse.internal.ui.widget.a.d
        public void a() {
            MatisseActivity.this.k.setVisibility(8);
        }

        @Override // com.bytedance.feedbackerlib.matisse.internal.ui.widget.a.d
        public void b() {
            MatisseActivity.this.k.setVisibility(0);
        }
    }

    class c implements F.b {
        final /* synthetic */ F a;

        c(F f2) {
            this.a = f2;
        }

        @Override // com.bytedance.feedbackerlib.manager.F.b
        public void a() {
            MatisseActivity.this.f4911f.setText(this.a.f("preview"));
            MatisseActivity.this.h.setText(this.a.f("fll_image"));
            MatisseActivity.this.f4912g.setText(this.a.f("complete"));
        }
    }

    class d implements Runnable {
        final /* synthetic */ Cursor a;

        d(Cursor cursor) {
            this.a = cursor;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.moveToPosition(MatisseActivity.this.a.a());
            com.bytedance.feedbackerlib.matisse.internal.ui.widget.a aVar = MatisseActivity.this.f4909d;
            MatisseActivity matisseActivity = MatisseActivity.this;
            aVar.l(matisseActivity, matisseActivity.a.a());
            Album i = Album.i(this.a);
            i.f();
            MatisseActivity.this.t(i);
        }
    }

    private int q() {
        int f2 = this.b.f();
        int i = 0;
        for (int i2 = 0; i2 < f2; i2++) {
            Item item = this.b.b().get(i2);
            if (item.b() && com.bytedance.feedbackerlib.matisse.d.a.a.b(item.f4854d) > this.f4908c.o) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(Album album) {
        if (album.f() && album.g()) {
            this.i.setVisibility(8);
            this.j.setVisibility(0);
            return;
        }
        this.i.setVisibility(0);
        this.j.setVisibility(8);
        MediaSelectionFragment mediaSelectionFragment = new MediaSelectionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        mediaSelectionFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(C0838R.id.container, mediaSelectionFragment, MediaSelectionFragment.class.getSimpleName()).commitAllowingStateLoss();
    }

    private void u() {
        int f2 = this.b.f();
        F d2 = F.d();
        if (f2 == 0) {
            this.f4912g.setBackgroundResource(C0838R.drawable.background_submit_tv_unavailable_new);
            this.f4911f.setEnabled(false);
            this.f4912g.setEnabled(false);
            this.f4912g.setText(d2.f("complete"));
        } else {
            if (f2 == 1) {
                com.bytedance.feedbackerlib.matisse.internal.entity.b bVar = this.f4908c;
                if (!bVar.f4860e && bVar.f4861f == 1) {
                    this.f4912g.setBackgroundResource(C0838R.drawable.background_submit_tv_available);
                    this.f4911f.setEnabled(true);
                    this.f4912g.setText(d2.f("complete"));
                    this.f4912g.setEnabled(true);
                }
            }
            this.f4912g.setBackgroundResource(C0838R.drawable.background_submit_tv_available);
            this.f4911f.setEnabled(true);
            this.f4912g.setEnabled(true);
            this.f4912g.setText(d2.f("complete") + " (" + f2 + ")");
        }
        if (!this.f4908c.l) {
            this.l.setVisibility(4);
            return;
        }
        this.l.setVisibility(0);
        this.m.setChecked(this.n);
        v();
        if (q() <= 0 || !this.n) {
            return;
        }
        IncapableDialog.l("", getString(C0838R.string.error_over_original_size, new Object[]{Integer.valueOf(this.f4908c.o)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
        this.m.setChecked(false);
        this.n = false;
    }

    private void v() {
        F d2 = F.d();
        if (!this.n) {
            this.h.setText(d2.f("fll_image"));
            return;
        }
        Iterator<Item> it2 = this.b.b().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().f4854d;
        }
        if (j <= 0) {
            this.h.setText(d2.f("fll_image"));
            return;
        }
        float b2 = com.bytedance.feedbackerlib.matisse.d.a.a.b(j);
        this.h.setText(d2.f("fll_image") + "(" + b2 + "M)");
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.MediaSelectionFragment.a
    public com.bytedance.feedbackerlib.matisse.internal.model.a b() {
        return this.b;
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter.f
    public void c() {
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter.c
    public void d() {
        u();
        Objects.requireNonNull(this.f4908c);
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter.e
    public void i(Album album, Item item, int i) {
        Intent intent = new Intent(this, (Class<?>) AlbumPreviewActivity.class);
        intent.putExtra("extra_album", album);
        intent.putExtra("extra_item", item);
        intent.putExtra("extra_default_bundle", this.b.h());
        intent.putExtra("extra_result_original_enable", this.n);
        try {
            startActivityForResult(intent, 23);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i != 23) {
            if (i == 24) {
                throw null;
            }
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("extra_result_bundle");
        ArrayList<Item> parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
        this.n = intent.getBooleanExtra("extra_result_original_enable", false);
        int i3 = bundleExtra.getInt("state_collection_type", 0);
        if (!intent.getBooleanExtra("extra_result_apply", false)) {
            this.b.n(parcelableArrayList, i3);
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(MediaSelectionFragment.class.getSimpleName());
            if (findFragmentByTag instanceof MediaSelectionFragment) {
                ((MediaSelectionFragment) findFragmentByTag).l();
            }
            u();
            return;
        }
        Intent intent2 = new Intent();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (parcelableArrayList != null) {
            Iterator<Item> it2 = parcelableArrayList.iterator();
            while (it2.hasNext()) {
                Item next = it2.next();
                arrayList.add(next.f4853c);
                arrayList2.add(com.bytedance.feedbackerlib.a.J(this, next.f4853c));
            }
        }
        if (parcelableArrayList != null) {
            intent2.putParcelableArrayListExtra("extra_result_item", parcelableArrayList);
        }
        intent2.putParcelableArrayListExtra("extra_result_selection", arrayList);
        intent2.putStringArrayListExtra("extra_result_selection_path", arrayList2);
        intent2.putExtra("extra_result_original_enable", this.n);
        setResult(-1, intent2);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(0);
        super.onBackPressed();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C0838R.id.button_preview) {
            Intent intent = new Intent(this, (Class<?>) SelectedPreviewActivity.class);
            intent.putExtra("extra_default_bundle", this.b.h());
            intent.putExtra("extra_result_original_enable", this.n);
            try {
                startActivityForResult(intent, 23);
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        if (view.getId() == C0838R.id.button_apply) {
            Intent intent2 = new Intent();
            intent2.putParcelableArrayListExtra("extra_result_selection", (ArrayList) this.b.d());
            intent2.putStringArrayListExtra("extra_result_selection_path", (ArrayList) this.b.c());
            intent2.putExtra("extra_result_original_enable", this.n);
            intent2.putParcelableArrayListExtra("extra_result_item", this.b.b());
            setResult(-1, intent2);
            finish();
            return;
        }
        if (view.getId() == C0838R.id.originalLayout) {
            int q = q();
            if (q > 0) {
                IncapableDialog.l("", getString(C0838R.string.error_over_original_count, new Object[]{Integer.valueOf(q), Integer.valueOf(this.f4908c.o)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
                return;
            }
            boolean z = !this.n;
            this.n = z;
            this.m.setChecked(z);
            Objects.requireNonNull(this.f4908c);
            v();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        com.bytedance.feedbackerlib.matisse.internal.entity.b b2 = com.bytedance.feedbackerlib.matisse.internal.entity.b.b();
        this.f4908c = b2;
        setTheme(b2.f4858c);
        super.onCreate(bundle);
        if (!this.f4908c.k) {
            setResult(0);
            finish();
            return;
        }
        setContentView(C0838R.layout.feedbacker_activity_matisse);
        com.bytedance.feedbackerlib.matisse.internal.entity.b bVar = this.f4908c;
        this.n = bVar.m;
        int i = bVar.f4859d;
        if (i != -1) {
            setRequestedOrientation(i);
        }
        Objects.requireNonNull(this.f4908c);
        setSupportActionBar((Toolbar) findViewById(C0838R.id.toolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        ((ImageView) findViewById(C0838R.id.iv_back)).setOnClickListener(new a());
        TextView textView = (TextView) findViewById(C0838R.id.button_preview);
        this.f4911f = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(C0838R.id.button_apply);
        this.f4912g = textView2;
        textView2.setOnClickListener(this);
        this.h = (TextView) findViewById(C0838R.id.tv_origin);
        this.k = findViewById(C0838R.id.fl_background);
        this.i = findViewById(C0838R.id.container);
        this.j = findViewById(C0838R.id.empty_view);
        this.l = (LinearLayout) findViewById(C0838R.id.originalLayout);
        this.m = (CheckRadioView) findViewById(C0838R.id.original);
        this.l.setOnClickListener(this);
        this.b.l(bundle);
        if (bundle != null) {
            this.n = bundle.getBoolean("checkState");
        }
        u();
        this.f4910e = new com.bytedance.feedbackerlib.matisse.internal.ui.adapter.a(this, null, false, this.b);
        com.bytedance.feedbackerlib.matisse.internal.ui.widget.a aVar = new com.bytedance.feedbackerlib.matisse.internal.ui.widget.a(this, new b());
        this.f4909d = aVar;
        aVar.i(this);
        this.f4909d.k((TextView) findViewById(C0838R.id.selected_album));
        this.f4909d.j(findViewById(C0838R.id.toolbar));
        this.f4909d.h(this.f4910e);
        this.a.c(this, this);
        this.a.f(bundle);
        this.a.b();
        F d2 = F.d();
        this.f4911f.setText(d2.f("preview"));
        this.h.setText(d2.f("fll_image"));
        this.f4912g.setText(d2.f("complete"));
        d2.j(new c(d2));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.a.d();
        Objects.requireNonNull(this.f4908c);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.a.h(i);
        this.f4910e.getCursor().moveToPosition(i);
        Album i2 = Album.i(this.f4910e.getCursor());
        i2.f();
        t(i2);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.m(bundle);
        this.a.g(bundle);
        bundle.putBoolean("checkState", this.n);
    }

    public void r(Cursor cursor) {
        this.f4910e.swapCursor(cursor);
        new Handler(Looper.getMainLooper()).post(new d(cursor));
    }

    public void s() {
        this.f4910e.swapCursor(null);
    }
}
