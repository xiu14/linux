package com.bytedance.feedbackerlib.matisse.internal.ui.adapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.CheckView;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.MediaGrid;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AlbumMediaAdapter extends RecyclerViewCursorAdapter<RecyclerView.ViewHolder> implements MediaGrid.a {

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.feedbackerlib.matisse.internal.model.a f4886c;

    /* renamed from: d, reason: collision with root package name */
    private final Drawable f4887d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.feedbackerlib.matisse.internal.entity.b f4888e;

    /* renamed from: f, reason: collision with root package name */
    private c f4889f;

    /* renamed from: g, reason: collision with root package name */
    private e f4890g;
    private RecyclerView h;
    private int i;

    class a implements View.OnClickListener {
        a(AlbumMediaAdapter albumMediaAdapter) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.getContext() instanceof f) {
                ((f) view.getContext()).c();
            }
        }
    }

    private static class b extends RecyclerView.ViewHolder {
        private TextView a;

        b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(C0838R.id.hint);
        }
    }

    public interface c {
        void d();
    }

    private static class d extends RecyclerView.ViewHolder {
        private MediaGrid a;

        d(View view) {
            super(view);
            this.a = (MediaGrid) view;
        }
    }

    public interface e {
        void i(Album album, Item item, int i);
    }

    public interface f {
        void c();
    }

    public AlbumMediaAdapter(Context context, com.bytedance.feedbackerlib.matisse.internal.model.a aVar, RecyclerView recyclerView) {
        super(null);
        com.bytedance.feedbackerlib.matisse.internal.entity.b b2 = com.bytedance.feedbackerlib.matisse.internal.entity.b.b();
        this.f4888e = b2;
        this.f4886c = aVar;
        List<Item> list = b2.q;
        if (list != null) {
            Iterator<Item> it2 = list.iterator();
            while (it2.hasNext()) {
                this.f4886c.a(it2.next());
            }
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{C0838R.attr.item_placeholder});
        this.f4887d = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.h = recyclerView;
    }

    private void e() {
        notifyDataSetChanged();
        c cVar = this.f4889f;
        if (cVar != null) {
            cVar.d();
        }
    }

    private void j(Item item, RecyclerView.ViewHolder viewHolder) {
        if (this.f4888e.f4860e) {
            if (this.f4886c.e(item) != Integer.MIN_VALUE) {
                this.f4886c.o(item);
                e();
                return;
            }
            Context context = viewHolder.itemView.getContext();
            com.bytedance.feedbackerlib.matisse.internal.entity.a i = this.f4886c.i(item);
            com.bytedance.feedbackerlib.matisse.internal.entity.a.a(context, i);
            if (i == null) {
                this.f4886c.a(item);
                e();
                return;
            }
            return;
        }
        if (this.f4886c.j(item)) {
            this.f4886c.o(item);
            e();
            return;
        }
        Context context2 = viewHolder.itemView.getContext();
        com.bytedance.feedbackerlib.matisse.internal.entity.a i2 = this.f4886c.i(item);
        com.bytedance.feedbackerlib.matisse.internal.entity.a.a(context2, i2);
        if (i2 == null) {
            this.f4886c.a(item);
            e();
        }
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.RecyclerViewCursorAdapter
    public int a(int i, Cursor cursor) {
        return (Item.e(cursor).a > (-1L) ? 1 : (Item.e(cursor).a == (-1L) ? 0 : -1)) == 0 ? 1 : 2;
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.RecyclerViewCursorAdapter
    protected void c(RecyclerView.ViewHolder viewHolder, Cursor cursor) {
        Drawable.ConstantState constantState;
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            Drawable[] compoundDrawables = bVar.a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = viewHolder.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{C0838R.attr.capture_textColor});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i = 0; i < compoundDrawables.length; i++) {
                Drawable drawable = compoundDrawables[i];
                if (drawable != null && (constantState = drawable.getConstantState()) != null) {
                    Drawable mutate = constantState.newDrawable().mutate();
                    mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    mutate.setBounds(drawable.getBounds());
                    compoundDrawables[i] = mutate;
                }
            }
            bVar.a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
            return;
        }
        if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            Item e2 = Item.e(cursor);
            MediaGrid mediaGrid = dVar.a;
            Context context = dVar.a.getContext();
            if (this.i == 0) {
                int spanCount = ((GridLayoutManager) this.h.getLayoutManager()).getSpanCount();
                int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - ((spanCount - 1) * context.getResources().getDimensionPixelSize(C0838R.dimen.media_grid_spacing))) / spanCount;
                this.i = dimensionPixelSize;
                this.i = (int) (dimensionPixelSize * this.f4888e.i);
            }
            mediaGrid.d(new MediaGrid.b(this.i, this.f4887d, this.f4888e.f4860e, viewHolder));
            dVar.a.a(e2);
            dVar.a.setOnMediaGridClickListener(this);
            MediaGrid mediaGrid2 = dVar.a;
            if (!this.f4888e.f4860e) {
                if (this.f4886c.j(e2)) {
                    mediaGrid2.setCheckEnabled(true);
                    mediaGrid2.setChecked(true);
                    return;
                } else if (this.f4886c.k()) {
                    mediaGrid2.setCheckEnabled(false);
                    mediaGrid2.setChecked(false);
                    return;
                } else {
                    mediaGrid2.setCheckEnabled(true);
                    mediaGrid2.setChecked(false);
                    return;
                }
            }
            int e3 = this.f4886c.e(e2);
            if (e3 > 0) {
                mediaGrid2.setCheckEnabled(true);
                mediaGrid2.setCheckedNum(e3);
                mediaGrid2.e();
                return;
            }
            mediaGrid2.b();
            if (this.f4886c.k()) {
                mediaGrid2.setCheckEnabled(false);
                mediaGrid2.setCheckedNum(Integer.MIN_VALUE);
            } else {
                mediaGrid2.setCheckEnabled(true);
                mediaGrid2.setCheckedNum(e3);
            }
        }
    }

    public void f(CheckView checkView, Item item, RecyclerView.ViewHolder viewHolder) {
        j(item, viewHolder);
    }

    public void g(ImageView imageView, Item item, RecyclerView.ViewHolder viewHolder) {
        if (!this.f4888e.p) {
            j(item, viewHolder);
            return;
        }
        e eVar = this.f4890g;
        if (eVar != null) {
            eVar.i(null, item, viewHolder.getAdapterPosition());
        }
    }

    public void h(c cVar) {
        this.f4889f = cVar;
    }

    public void i(e eVar) {
        this.f4890g = eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            b bVar = new b(LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.feedbacker_photo_capture_item, viewGroup, false));
            bVar.itemView.setOnClickListener(new a(this));
            return bVar;
        }
        if (i == 2) {
            return new d(LayoutInflater.from(viewGroup.getContext()).inflate(C0838R.layout.feedbacker_media_grid_item, viewGroup, false));
        }
        return null;
    }
}
