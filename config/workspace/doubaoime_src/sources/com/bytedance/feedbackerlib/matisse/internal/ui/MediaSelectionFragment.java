package com.bytedance.feedbackerlib.matisse.internal.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.matisse.internal.entity.Album;
import com.bytedance.feedbackerlib.matisse.internal.entity.Item;
import com.bytedance.feedbackerlib.matisse.internal.entity.b;
import com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection;
import com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter;
import com.bytedance.feedbackerlib.matisse.internal.ui.widget.MediaGridInset;

/* loaded from: classes.dex */
public class MediaSelectionFragment extends Fragment implements AlbumMediaCollection.a, AlbumMediaAdapter.c, AlbumMediaAdapter.e {
    private final AlbumMediaCollection a = new AlbumMediaCollection();
    private RecyclerView b;

    /* renamed from: c, reason: collision with root package name */
    private AlbumMediaAdapter f4882c;

    /* renamed from: d, reason: collision with root package name */
    private a f4883d;

    /* renamed from: e, reason: collision with root package name */
    private AlbumMediaAdapter.c f4884e;

    /* renamed from: f, reason: collision with root package name */
    private AlbumMediaAdapter.e f4885f;

    public interface a {
        com.bytedance.feedbackerlib.matisse.internal.model.a b();
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter.c
    public void d() {
        AlbumMediaAdapter.c cVar = this.f4884e;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection.a
    public void g() {
        this.f4882c.d(null);
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.ui.adapter.AlbumMediaAdapter.e
    public void i(Album album, Item item, int i) {
        AlbumMediaAdapter.e eVar = this.f4885f;
        if (eVar != null) {
            eVar.i((Album) getArguments().getParcelable("extra_album"), item, i);
        }
    }

    @Override // com.bytedance.feedbackerlib.matisse.internal.model.AlbumMediaCollection.a
    public void k(Cursor cursor) {
        this.f4882c.d(cursor);
    }

    public void l() {
        this.f4882c.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        Album album = (Album) getArguments().getParcelable("extra_album");
        AlbumMediaAdapter albumMediaAdapter = new AlbumMediaAdapter(getContext(), this.f4883d.b(), this.b);
        this.f4882c = albumMediaAdapter;
        albumMediaAdapter.h(this);
        this.f4882c.i(this);
        this.b.setHasFixedSize(true);
        int i = b.b().h;
        this.b.setLayoutManager(new GridLayoutManager(getContext(), i));
        this.b.addItemDecoration(new MediaGridInset(i, getResources().getDimensionPixelSize(C0838R.dimen.media_grid_spacing), false));
        this.b.setAdapter(this.f4882c);
        this.a.c(getActivity(), this);
        this.a.b(album, false);
        this.f4884e.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof a)) {
            throw new IllegalStateException("Context must implement SelectionProvider.");
        }
        this.f4883d = (a) context;
        if (context instanceof AlbumMediaAdapter.c) {
            this.f4884e = (AlbumMediaAdapter.c) context;
        }
        if (context instanceof AlbumMediaAdapter.e) {
            this.f4885f = (AlbumMediaAdapter.e) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(C0838R.layout.feedbacker_fragment_media_selection, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.b = (RecyclerView) view.findViewById(C0838R.id.recyclerview);
    }
}
