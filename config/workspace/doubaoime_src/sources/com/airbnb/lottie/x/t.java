package com.airbnb.lottie.x;

import android.graphics.Rect;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class t {
    private static final JsonReader.a a = JsonReader.a.a(DownloadFileUtils.MODE_WRITE, "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static JsonReader.a b = JsonReader.a.a("id", "layers", DownloadFileUtils.MODE_WRITE, "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    private static final JsonReader.a f1447c = JsonReader.a.a("list");

    /* renamed from: d, reason: collision with root package name */
    private static final JsonReader.a f1448d = JsonReader.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0046. Please report as an issue. */
    public static com.airbnb.lottie.g a(JsonReader jsonReader) throws IOException {
        float f2;
        float f3;
        HashMap hashMap;
        ArrayList arrayList;
        HashMap hashMap2;
        float f4;
        float c2 = com.airbnb.lottie.y.h.c();
        LongSparseArray<Layer> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        SparseArrayCompat<com.airbnb.lottie.model.c> sparseArrayCompat = new SparseArrayCompat<>();
        com.airbnb.lottie.g gVar = new com.airbnb.lottie.g();
        jsonReader.h();
        int i = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        int i2 = 0;
        while (jsonReader.r()) {
            float f8 = f7;
            switch (jsonReader.I(a)) {
                case 0:
                    i2 = jsonReader.x();
                    f7 = f8;
                    break;
                case 1:
                    i = jsonReader.x();
                    f7 = f8;
                    break;
                case 2:
                    f5 = (float) jsonReader.w();
                    f7 = f8;
                    break;
                case 3:
                    f4 = f5;
                    f6 = ((float) jsonReader.w()) - 0.01f;
                    f7 = f8;
                    f5 = f4;
                    break;
                case 4:
                    f4 = f5;
                    f7 = (float) jsonReader.w();
                    f5 = f4;
                    break;
                case 5:
                    f2 = f5;
                    f3 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    String[] split = jsonReader.A().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    if (!(parseInt >= 4 && (parseInt > 4 || (parseInt2 >= 4 && (parseInt2 > 4 || Integer.parseInt(split[2]) >= 0))))) {
                        gVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                case 6:
                    f2 = f5;
                    f3 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.d();
                    int i3 = 0;
                    while (jsonReader.r()) {
                        Layer a2 = s.a(jsonReader, gVar);
                        if (a2.d() == Layer.LayerType.IMAGE) {
                            i3++;
                        }
                        arrayList2.add(a2);
                        longSparseArray.put(a2.b(), a2);
                        if (i3 > 4) {
                            com.airbnb.lottie.y.d.c("You have " + i3 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                    }
                    jsonReader.l();
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                case 7:
                    f2 = f5;
                    f3 = f6;
                    jsonReader.d();
                    while (jsonReader.r()) {
                        ArrayList arrayList4 = new ArrayList();
                        LongSparseArray longSparseArray2 = new LongSparseArray();
                        jsonReader.h();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i4 = 0;
                        int i5 = 0;
                        while (jsonReader.r()) {
                            int I = jsonReader.I(b);
                            if (I != 0) {
                                ArrayList arrayList5 = arrayList3;
                                if (I != 1) {
                                    if (I == 2) {
                                        i4 = jsonReader.x();
                                    } else if (I == 3) {
                                        i5 = jsonReader.x();
                                    } else if (I == 4) {
                                        str2 = jsonReader.A();
                                    } else if (I != 5) {
                                        jsonReader.M();
                                        jsonReader.N();
                                        hashMap2 = hashMap5;
                                    } else {
                                        str3 = jsonReader.A();
                                    }
                                    arrayList3 = arrayList5;
                                } else {
                                    jsonReader.d();
                                    while (jsonReader.r()) {
                                        Layer a3 = s.a(jsonReader, gVar);
                                        longSparseArray2.put(a3.b(), a3);
                                        arrayList4.add(a3);
                                        hashMap5 = hashMap5;
                                    }
                                    hashMap2 = hashMap5;
                                    jsonReader.l();
                                }
                                arrayList3 = arrayList5;
                                hashMap5 = hashMap2;
                            } else {
                                str = jsonReader.A();
                            }
                        }
                        HashMap hashMap6 = hashMap5;
                        ArrayList arrayList6 = arrayList3;
                        jsonReader.o();
                        if (str2 != null) {
                            com.airbnb.lottie.j jVar = new com.airbnb.lottie.j(i4, i5, str, str2, str3);
                            hashMap4.put(jVar.d(), jVar);
                        } else {
                            hashMap3.put(str, arrayList4);
                        }
                        arrayList3 = arrayList6;
                        hashMap5 = hashMap6;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.l();
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                case 8:
                    f2 = f5;
                    f3 = f6;
                    jsonReader.h();
                    while (jsonReader.r()) {
                        if (jsonReader.I(f1447c) != 0) {
                            jsonReader.M();
                            jsonReader.N();
                        } else {
                            jsonReader.d();
                            while (jsonReader.r()) {
                                com.airbnb.lottie.model.b a4 = k.a(jsonReader);
                                hashMap5.put(a4.b(), a4);
                            }
                            jsonReader.l();
                        }
                    }
                    jsonReader.o();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                case 9:
                    f2 = f5;
                    f3 = f6;
                    jsonReader.d();
                    while (jsonReader.r()) {
                        com.airbnb.lottie.model.c a5 = j.a(jsonReader, gVar);
                        sparseArrayCompat.put(a5.hashCode(), a5);
                    }
                    jsonReader.l();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                case 10:
                    jsonReader.d();
                    while (jsonReader.r()) {
                        jsonReader.h();
                        String str4 = null;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        while (jsonReader.r()) {
                            int I2 = jsonReader.I(f1448d);
                            if (I2 != 0) {
                                float f11 = f6;
                                if (I2 == 1) {
                                    f9 = (float) jsonReader.w();
                                } else if (I2 != 2) {
                                    jsonReader.M();
                                    jsonReader.N();
                                } else {
                                    f10 = (float) jsonReader.w();
                                }
                                f6 = f11;
                            } else {
                                str4 = jsonReader.A();
                            }
                        }
                        jsonReader.o();
                        arrayList3.add(new com.airbnb.lottie.model.g(str4, f9, f10));
                        f5 = f5;
                        f6 = f6;
                    }
                    f2 = f5;
                    f3 = f6;
                    jsonReader.l();
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
                default:
                    f2 = f5;
                    f3 = f6;
                    hashMap = hashMap5;
                    arrayList = arrayList3;
                    jsonReader.M();
                    jsonReader.N();
                    f7 = f8;
                    f5 = f2;
                    arrayList3 = arrayList;
                    f6 = f3;
                    hashMap5 = hashMap;
                    break;
            }
        }
        gVar.s(new Rect(0, 0, (int) (i2 * c2), (int) (i * c2)), f5, f6, f7, arrayList2, longSparseArray, hashMap3, hashMap4, sparseArrayCompat, hashMap5, arrayList3);
        return gVar;
    }
}
