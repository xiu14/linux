package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter;
import com.bytedance.lighten.core.ScaleType;
import com.bytedance.lighten.core.g;
import com.bytedance.lighten.core.j;
import java.util.Objects;

/* loaded from: classes.dex */
public class MediaGrid extends SquareFrameLayout implements View.OnClickListener {
    private ImageView a;
    private CheckView b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f4896c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f4897d;

    /* renamed from: e, reason: collision with root package name */
    private View f4898e;

    /* renamed from: f, reason: collision with root package name */
    private Item f4899f;

    /* renamed from: g, reason: collision with root package name */
    private b f4900g;
    private a h;

    public interface a {
    }

    public static class b {
        int a;
        Drawable b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4901c;

        /* renamed from: d, reason: collision with root package name */
        RecyclerView.ViewHolder f4902d;

        public b(int i, Drawable drawable, boolean z, RecyclerView.ViewHolder viewHolder) {
            this.a = i;
            this.b = drawable;
            this.f4901c = z;
            this.f4902d = viewHolder;
        }
    }

    public MediaGrid(Context context) {
        super(context);
        c(context);
    }

    private void c(Context context) {
        LayoutInflater.from(context).inflate(C0838R.layout.feedbacker_media_grid_content, (ViewGroup) this, true);
        this.a = (ImageView) findViewById(C0838R.id.media_thumbnail);
        this.b = (CheckView) findViewById(C0838R.id.check_view);
        this.f4896c = (ImageView) findViewById(C0838R.id.gif);
        this.f4897d = (TextView) findViewById(C0838R.id.video_duration);
        this.f4898e = findViewById(C0838R.id.fl_translucent_background);
        this.a.setOnClickListener(this);
        this.b.setOnClickListener(this);
    }

    public void a(Item item) {
        this.f4899f = item;
        this.f4896c.setVisibility(item.a() ? 0 : 8);
        this.b.setCountable(this.f4900g.f4901c);
        if (this.f4899f.a()) {
            com.bytedance.feedbackerlib.matisse.c.a.a aVar = com.bytedance.feedbackerlib.matisse.internal.entity.b.b().j;
            getContext();
            int i = this.f4900g.a;
            ImageView imageView = this.a;
            Uri uri = this.f4899f.f4853c;
            Objects.requireNonNull(aVar);
            j e2 = g.e(uri);
            e2.a(ScaleType.CENTER_CROP);
            e2.c("GlideEngine");
            e2.b(true);
            e2.D(i, i);
            e2.f(true);
            e2.x(imageView);
            e2.e();
        } else {
            com.bytedance.feedbackerlib.matisse.c.a.a aVar2 = com.bytedance.feedbackerlib.matisse.internal.entity.b.b().j;
            getContext();
            aVar2.a(this.f4900g.a, this.a, this.f4899f.f4853c);
        }
        if (!this.f4899f.c()) {
            this.f4897d.setVisibility(8);
            return;
        }
        this.f4897d.setVisibility(0);
        long j = this.f4899f.f4855e / 1000;
        long j2 = j / 3600;
        long j3 = (j % 3600) / 60;
        long j4 = j % 60;
        String str = "";
        if (j2 > 0) {
            str = "" + j2 + "h ";
        }
        if (j3 > 0) {
            str = str + j3 + "m ";
        }
        if (j4 > 0) {
            str = str + j4 + "s";
        }
        this.f4897d.setText(str);
        if (TextUtils.isEmpty(str.trim())) {
            this.f4897d.setVisibility(8);
        }
    }

    public void b() {
        this.f4898e.setVisibility(8);
    }

    public void d(b bVar) {
        this.f4900g = bVar;
    }

    public void e() {
        this.f4898e.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.h;
        if (aVar != null) {
            ImageView imageView = this.a;
            if (view == imageView) {
                ((AlbumMediaAdapter) aVar).g(imageView, this.f4899f, this.f4900g.f4902d);
                return;
            }
            CheckView checkView = this.b;
            if (view == checkView) {
                ((AlbumMediaAdapter) aVar).f(checkView, this.f4899f, this.f4900g.f4902d);
            }
        }
    }

    public void setCheckEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    public void setCheckedNum(int i) {
        this.b.setCheckedNum(i);
    }

    public void setOnMediaGridClickListener(a aVar) {
        this.h = aVar;
    }

    public MediaGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
    }
}
