package e.f.a.a.a.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.heytap.mcs.liquid.model.ActionInfo;
import com.heytap.mcs.liquid.model.SeedingRequest;
import e.f.a.a.a.a.b.b;
import e.f.a.a.a.a.b.c;
import java.util.List;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: e.f.a.a.a.a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0453a extends Binder implements a {
        public static final /* synthetic */ int a = 0;

        /* renamed from: e.f.a.a.a.a.a$a$a, reason: collision with other inner class name */
        private static class C0454a implements a {
            private IBinder a;

            C0454a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // e.f.a.a.a.a.a
            public void L(List<SeedingRequest> list, e.f.a.a.a.a.b.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                    obtain.writeTypedList(list);
                    obtain.writeStrongBinder(aVar.asBinder());
                    if (!this.a.transact(2, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0453a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.f.a.a.a.a.a
            public void T(String str, c cVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                    obtain.writeString(str);
                    obtain.writeStrongBinder(cVar.asBinder());
                    if (!this.a.transact(4, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0453a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // e.f.a.a.a.a.a
            public List<String> a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                    obtain.writeString(str);
                    if (!this.a.transact(3, obtain, obtain2, 0)) {
                        int i = AbstractBinderC0453a.a;
                    }
                    obtain2.readException();
                    return obtain2.createStringArrayList();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.a;
            }

            @Override // e.f.a.a.a.a.a
            public void d0(String str, int i, String str2, String str3, String str4, int i2, String str5, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.heytap.mcs.liquid.service.download.ILiquidApiService");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    obtain.writeInt(i2);
                    obtain.writeString(str5);
                    if (actionInfo != null) {
                        obtain.writeInt(1);
                        actionInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (actionInfo2 != null) {
                        obtain.writeInt(1);
                        actionInfo2.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i3);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    if (!this.a.transact(1, obtain, obtain2, 0)) {
                        int i4 = AbstractBinderC0453a.a;
                    }
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a d(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.heytap.mcs.liquid.service.download.ILiquidApiService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0454a(iBinder) : (a) queryLocalInterface;
        }
    }

    void L(List<SeedingRequest> list, e.f.a.a.a.a.b.a aVar);

    void T(String str, c cVar);

    List<String> a(String str);

    void d0(String str, int i, String str2, String str3, String str4, int i2, String str5, ActionInfo actionInfo, ActionInfo actionInfo2, int i3, b bVar);
}
