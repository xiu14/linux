.class public Lcom/google/android/gms/common/server/response/SafeParcelResponse;
.super Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation build Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable$Class;
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/server/response/SafeParcelResponse;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:I

.field public final i:Landroid/os/Parcel;

.field public final j:I

.field public final k:Lcom/google/android/gms/common/server/response/zan;

.field public final l:Ljava/lang/String;

.field public m:I

.field public n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/android/gms/common/server/response/zaq;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/common/server/response/zaq;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>(ILandroid/os/Parcel;Lcom/google/android/gms/common/server/response/zan;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/common/server/response/FastSafeParcelableJsonResponse;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->h:I

    .line 5
    .line 6
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->i:Landroid/os/Parcel;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    iput p1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->j:I

    .line 13
    .line 14
    iput-object p3, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k:Lcom/google/android/gms/common/server/response/zan;

    .line 15
    .line 16
    if-nez p3, :cond_0

    .line 17
    .line 18
    const/4 p2, 0x0

    .line 19
    :goto_0
    iput-object p2, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->l:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    iget-object p2, p3, Lcom/google/android/gms/common/server/response/zan;->j:Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :goto_1
    iput p1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m:I

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static k(Ljava/lang/StringBuilder;Ljava/util/Map;Landroid/os/Parcel;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    new-instance v2, Landroid/util/SparseArray;

    .line 6
    .line 7
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/util/Map$Entry;

    .line 29
    .line 30
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    .line 35
    .line 36
    iget v5, v5, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->n:I

    .line 37
    .line 38
    invoke-virtual {v2, v5, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v3, 0x7b

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-static {v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->s(Landroid/os/Parcel;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-ge v6, v3, :cond_23

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    int-to-char v7, v6

    .line 64
    invoke-virtual {v2, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ljava/util/Map$Entry;

    .line 69
    .line 70
    if-eqz v7, :cond_1

    .line 71
    .line 72
    const-string v8, ","

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    :cond_2
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    check-cast v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;

    .line 90
    .line 91
    const-string v9, "\""

    .line 92
    .line 93
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v5, "\":"

    .line 100
    .line 101
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v5, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->r:Lcom/google/android/gms/common/server/converter/StringToIntConverter;

    .line 105
    .line 106
    iget-object v10, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->p:Ljava/lang/String;

    .line 107
    .line 108
    iget v11, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->k:I

    .line 109
    .line 110
    const/16 v12, 0x8

    .line 111
    .line 112
    if-eqz v5, :cond_5

    .line 113
    .line 114
    packed-switch v11, :pswitch_data_0

    .line 115
    .line 116
    .line 117
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 118
    .line 119
    const-string v1, "Unknown field out type = "

    .line 120
    .line 121
    invoke-static {v11, v1}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw v0

    .line 129
    :pswitch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 130
    .line 131
    const-string v1, "Method does not accept concrete type."

    .line 132
    .line 133
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :pswitch_1
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    new-instance v6, Ljava/util/HashMap;

    .line 142
    .line 143
    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 155
    .line 156
    .line 157
    move-result v9

    .line 158
    if-eqz v9, :cond_3

    .line 159
    .line 160
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v9

    .line 164
    check-cast v9, Ljava/lang/String;

    .line 165
    .line 166
    invoke-virtual {v5, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v10

    .line 170
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    invoke-static {v7, v6}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :goto_3
    const/4 v5, 0x1

    .line 185
    goto/16 :goto_1

    .line 186
    .line 187
    :pswitch_2
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->c(Landroid/os/Parcel;I)[B

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :pswitch_3
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :pswitch_4
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v5

    .line 223
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_3

    .line 227
    :pswitch_5
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(Landroid/os/Parcel;I)Ljava/math/BigDecimal;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :pswitch_6
    invoke-static {v1, v6, v12}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->t(Landroid/os/Parcel;II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 243
    .line 244
    .line 245
    move-result-wide v5

    .line 246
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :pswitch_7
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->l(Landroid/os/Parcel;I)F

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    goto :goto_3

    .line 274
    :pswitch_8
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 275
    .line 276
    .line 277
    move-result-wide v5

    .line 278
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    goto :goto_3

    .line 290
    :pswitch_9
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 291
    .line 292
    .line 293
    move-result v5

    .line 294
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    if-nez v5, :cond_4

    .line 299
    .line 300
    const/4 v13, 0x0

    .line 301
    goto :goto_4

    .line 302
    :cond_4
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    add-int/2addr v6, v5

    .line 307
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 308
    .line 309
    .line 310
    new-instance v13, Ljava/math/BigInteger;

    .line 311
    .line 312
    invoke-direct {v13, v8}, Ljava/math/BigInteger;-><init>([B)V

    .line 313
    .line 314
    .line 315
    :goto_4
    invoke-static {v7, v13}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v5

    .line 319
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_3

    .line 323
    .line 324
    :pswitch_a
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 325
    .line 326
    .line 327
    move-result v5

    .line 328
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object v5

    .line 332
    invoke-static {v7, v5}, Lcom/google/android/gms/common/server/response/FastJsonResponse;->h(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    invoke-static {v0, v7, v5}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_3

    .line 340
    .line 341
    :cond_5
    iget-boolean v5, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->l:Z

    .line 342
    .line 343
    if-eqz v5, :cond_1c

    .line 344
    .line 345
    const-string v5, "["

    .line 346
    .line 347
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    packed-switch v11, :pswitch_data_1

    .line 351
    .line 352
    .line 353
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 354
    .line 355
    const-string v1, "Unknown field type out."

    .line 356
    .line 357
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    throw v0

    .line 361
    :pswitch_b
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 362
    .line 363
    .line 364
    move-result v5

    .line 365
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    if-nez v5, :cond_6

    .line 370
    .line 371
    const/4 v13, 0x0

    .line 372
    goto :goto_7

    .line 373
    :cond_6
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    new-array v11, v9, [Landroid/os/Parcel;

    .line 378
    .line 379
    const/4 v12, 0x0

    .line 380
    :goto_5
    if-ge v12, v9, :cond_8

    .line 381
    .line 382
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 383
    .line 384
    .line 385
    move-result v15

    .line 386
    if-eqz v15, :cond_7

    .line 387
    .line 388
    const/16 p1, 0x0

    .line 389
    .line 390
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 391
    .line 392
    .line 393
    move-result v13

    .line 394
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 395
    .line 396
    .line 397
    move-result-object v14

    .line 398
    invoke-virtual {v14, v1, v13, v15}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 399
    .line 400
    .line 401
    aput-object v14, v11, v12

    .line 402
    .line 403
    add-int/2addr v13, v15

    .line 404
    invoke-virtual {v1, v13}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_7
    const/16 p1, 0x0

    .line 409
    .line 410
    aput-object p1, v11, v12

    .line 411
    .line 412
    :goto_6
    add-int/lit8 v12, v12, 0x1

    .line 413
    .line 414
    goto :goto_5

    .line 415
    :cond_8
    add-int/2addr v6, v5

    .line 416
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 417
    .line 418
    .line 419
    move-object v13, v11

    .line 420
    :goto_7
    array-length v5, v13

    .line 421
    const/4 v6, 0x0

    .line 422
    :goto_8
    if-ge v6, v5, :cond_1b

    .line 423
    .line 424
    if-lez v6, :cond_9

    .line 425
    .line 426
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 427
    .line 428
    .line 429
    :cond_9
    aget-object v9, v13, v6

    .line 430
    .line 431
    invoke-virtual {v9, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 432
    .line 433
    .line 434
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-object v9, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->q:Lcom/google/android/gms/common/server/response/zan;

    .line 438
    .line 439
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    iget-object v9, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->q:Lcom/google/android/gms/common/server/response/zan;

    .line 443
    .line 444
    iget-object v9, v9, Lcom/google/android/gms/common/server/response/zan;->i:Ljava/util/HashMap;

    .line 445
    .line 446
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v9

    .line 450
    check-cast v9, Ljava/util/Map;

    .line 451
    .line 452
    invoke-static {v9}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    aget-object v11, v13, v6

    .line 456
    .line 457
    invoke-static {v0, v9, v11}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k(Ljava/lang/StringBuilder;Ljava/util/Map;Landroid/os/Parcel;)V

    .line 458
    .line 459
    .line 460
    add-int/lit8 v6, v6, 0x1

    .line 461
    .line 462
    goto :goto_8

    .line 463
    :pswitch_c
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 464
    .line 465
    const-string v1, "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"

    .line 466
    .line 467
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    throw v0

    .line 471
    :pswitch_d
    const/16 p1, 0x0

    .line 472
    .line 473
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 474
    .line 475
    .line 476
    move-result v5

    .line 477
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 478
    .line 479
    .line 480
    move-result v6

    .line 481
    if-nez v5, :cond_a

    .line 482
    .line 483
    move-object/from16 v13, p1

    .line 484
    .line 485
    goto :goto_9

    .line 486
    :cond_a
    invoke-virtual {v1}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v13

    .line 490
    add-int/2addr v6, v5

    .line 491
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 492
    .line 493
    .line 494
    :goto_9
    array-length v5, v13

    .line 495
    const/4 v6, 0x0

    .line 496
    :goto_a
    if-ge v6, v5, :cond_1b

    .line 497
    .line 498
    if-eqz v6, :cond_b

    .line 499
    .line 500
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    :cond_b
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    aget-object v7, v13, v6

    .line 507
    .line 508
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    add-int/lit8 v6, v6, 0x1

    .line 515
    .line 516
    goto :goto_a

    .line 517
    :pswitch_e
    const/16 p1, 0x0

    .line 518
    .line 519
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 520
    .line 521
    .line 522
    move-result v5

    .line 523
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 524
    .line 525
    .line 526
    move-result v6

    .line 527
    if-nez v5, :cond_c

    .line 528
    .line 529
    move-object/from16 v13, p1

    .line 530
    .line 531
    goto :goto_b

    .line 532
    :cond_c
    invoke-virtual {v1}, Landroid/os/Parcel;->createBooleanArray()[Z

    .line 533
    .line 534
    .line 535
    move-result-object v13

    .line 536
    add-int/2addr v6, v5

    .line 537
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 538
    .line 539
    .line 540
    :goto_b
    array-length v5, v13

    .line 541
    const/4 v6, 0x0

    .line 542
    :goto_c
    if-ge v6, v5, :cond_1b

    .line 543
    .line 544
    if-eqz v6, :cond_d

    .line 545
    .line 546
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    :cond_d
    aget-boolean v7, v13, v6

    .line 550
    .line 551
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    add-int/lit8 v6, v6, 0x1

    .line 555
    .line 556
    goto :goto_c

    .line 557
    :pswitch_f
    const/16 p1, 0x0

    .line 558
    .line 559
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    if-nez v5, :cond_e

    .line 568
    .line 569
    move-object/from16 v13, p1

    .line 570
    .line 571
    goto :goto_e

    .line 572
    :cond_e
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    new-array v13, v7, [Ljava/math/BigDecimal;

    .line 577
    .line 578
    const/4 v9, 0x0

    .line 579
    :goto_d
    if-ge v9, v7, :cond_f

    .line 580
    .line 581
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    .line 582
    .line 583
    .line 584
    move-result-object v10

    .line 585
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 586
    .line 587
    .line 588
    move-result v11

    .line 589
    new-instance v12, Ljava/math/BigDecimal;

    .line 590
    .line 591
    new-instance v14, Ljava/math/BigInteger;

    .line 592
    .line 593
    invoke-direct {v14, v10}, Ljava/math/BigInteger;-><init>([B)V

    .line 594
    .line 595
    .line 596
    invoke-direct {v12, v14, v11}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 597
    .line 598
    .line 599
    aput-object v12, v13, v9

    .line 600
    .line 601
    add-int/lit8 v9, v9, 0x1

    .line 602
    .line 603
    goto :goto_d

    .line 604
    :cond_f
    add-int/2addr v6, v5

    .line 605
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 606
    .line 607
    .line 608
    :goto_e
    array-length v5, v13

    .line 609
    const/4 v6, 0x0

    .line 610
    :goto_f
    if-ge v6, v5, :cond_1b

    .line 611
    .line 612
    if-eqz v6, :cond_10

    .line 613
    .line 614
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 615
    .line 616
    .line 617
    :cond_10
    aget-object v7, v13, v6

    .line 618
    .line 619
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 620
    .line 621
    .line 622
    add-int/lit8 v6, v6, 0x1

    .line 623
    .line 624
    goto :goto_f

    .line 625
    :pswitch_10
    const/16 p1, 0x0

    .line 626
    .line 627
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 628
    .line 629
    .line 630
    move-result v5

    .line 631
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 632
    .line 633
    .line 634
    move-result v6

    .line 635
    if-nez v5, :cond_11

    .line 636
    .line 637
    move-object/from16 v13, p1

    .line 638
    .line 639
    goto :goto_10

    .line 640
    :cond_11
    invoke-virtual {v1}, Landroid/os/Parcel;->createDoubleArray()[D

    .line 641
    .line 642
    .line 643
    move-result-object v13

    .line 644
    add-int/2addr v6, v5

    .line 645
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 646
    .line 647
    .line 648
    :goto_10
    array-length v5, v13

    .line 649
    const/4 v6, 0x0

    .line 650
    :goto_11
    if-ge v6, v5, :cond_1b

    .line 651
    .line 652
    if-eqz v6, :cond_12

    .line 653
    .line 654
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    :cond_12
    aget-wide v9, v13, v6

    .line 658
    .line 659
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 660
    .line 661
    .line 662
    add-int/lit8 v6, v6, 0x1

    .line 663
    .line 664
    goto :goto_11

    .line 665
    :pswitch_11
    const/16 p1, 0x0

    .line 666
    .line 667
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 668
    .line 669
    .line 670
    move-result v5

    .line 671
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 672
    .line 673
    .line 674
    move-result v6

    .line 675
    if-nez v5, :cond_13

    .line 676
    .line 677
    move-object/from16 v13, p1

    .line 678
    .line 679
    goto :goto_12

    .line 680
    :cond_13
    invoke-virtual {v1}, Landroid/os/Parcel;->createFloatArray()[F

    .line 681
    .line 682
    .line 683
    move-result-object v13

    .line 684
    add-int/2addr v6, v5

    .line 685
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 686
    .line 687
    .line 688
    :goto_12
    array-length v5, v13

    .line 689
    const/4 v6, 0x0

    .line 690
    :goto_13
    if-ge v6, v5, :cond_1b

    .line 691
    .line 692
    if-eqz v6, :cond_14

    .line 693
    .line 694
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 695
    .line 696
    .line 697
    :cond_14
    aget v7, v13, v6

    .line 698
    .line 699
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 700
    .line 701
    .line 702
    add-int/lit8 v6, v6, 0x1

    .line 703
    .line 704
    goto :goto_13

    .line 705
    :pswitch_12
    const/16 p1, 0x0

    .line 706
    .line 707
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 708
    .line 709
    .line 710
    move-result v5

    .line 711
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 712
    .line 713
    .line 714
    move-result v6

    .line 715
    if-nez v5, :cond_15

    .line 716
    .line 717
    move-object/from16 v13, p1

    .line 718
    .line 719
    goto :goto_14

    .line 720
    :cond_15
    invoke-virtual {v1}, Landroid/os/Parcel;->createLongArray()[J

    .line 721
    .line 722
    .line 723
    move-result-object v13

    .line 724
    add-int/2addr v6, v5

    .line 725
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 726
    .line 727
    .line 728
    :goto_14
    array-length v5, v13

    .line 729
    const/4 v6, 0x0

    .line 730
    :goto_15
    if-ge v6, v5, :cond_1b

    .line 731
    .line 732
    if-eqz v6, :cond_16

    .line 733
    .line 734
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 735
    .line 736
    .line 737
    :cond_16
    aget-wide v9, v13, v6

    .line 738
    .line 739
    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 740
    .line 741
    .line 742
    add-int/lit8 v6, v6, 0x1

    .line 743
    .line 744
    goto :goto_15

    .line 745
    :pswitch_13
    const/16 p1, 0x0

    .line 746
    .line 747
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 748
    .line 749
    .line 750
    move-result v5

    .line 751
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 752
    .line 753
    .line 754
    move-result v6

    .line 755
    if-nez v5, :cond_17

    .line 756
    .line 757
    move-object/from16 v13, p1

    .line 758
    .line 759
    goto :goto_17

    .line 760
    :cond_17
    invoke-virtual {v1}, Landroid/os/Parcel;->readInt()I

    .line 761
    .line 762
    .line 763
    move-result v7

    .line 764
    new-array v13, v7, [Ljava/math/BigInteger;

    .line 765
    .line 766
    const/4 v9, 0x0

    .line 767
    :goto_16
    if-ge v9, v7, :cond_18

    .line 768
    .line 769
    new-instance v10, Ljava/math/BigInteger;

    .line 770
    .line 771
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    .line 772
    .line 773
    .line 774
    move-result-object v11

    .line 775
    invoke-direct {v10, v11}, Ljava/math/BigInteger;-><init>([B)V

    .line 776
    .line 777
    .line 778
    aput-object v10, v13, v9

    .line 779
    .line 780
    add-int/lit8 v9, v9, 0x1

    .line 781
    .line 782
    goto :goto_16

    .line 783
    :cond_18
    add-int/2addr v6, v5

    .line 784
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 785
    .line 786
    .line 787
    :goto_17
    array-length v5, v13

    .line 788
    const/4 v6, 0x0

    .line 789
    :goto_18
    if-ge v6, v5, :cond_1b

    .line 790
    .line 791
    if-eqz v6, :cond_19

    .line 792
    .line 793
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 794
    .line 795
    .line 796
    :cond_19
    aget-object v7, v13, v6

    .line 797
    .line 798
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    add-int/lit8 v6, v6, 0x1

    .line 802
    .line 803
    goto :goto_18

    .line 804
    :pswitch_14
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->d(Landroid/os/Parcel;I)[I

    .line 805
    .line 806
    .line 807
    move-result-object v5

    .line 808
    array-length v6, v5

    .line 809
    const/4 v7, 0x0

    .line 810
    :goto_19
    if-ge v7, v6, :cond_1b

    .line 811
    .line 812
    if-eqz v7, :cond_1a

    .line 813
    .line 814
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 815
    .line 816
    .line 817
    :cond_1a
    aget v9, v5, v7

    .line 818
    .line 819
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 820
    .line 821
    .line 822
    add-int/lit8 v7, v7, 0x1

    .line 823
    .line 824
    goto :goto_19

    .line 825
    :cond_1b
    const-string v5, "]"

    .line 826
    .line 827
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 828
    .line 829
    .line 830
    goto/16 :goto_3

    .line 831
    .line 832
    :cond_1c
    const/16 p1, 0x0

    .line 833
    .line 834
    packed-switch v11, :pswitch_data_2

    .line 835
    .line 836
    .line 837
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 838
    .line 839
    const-string v1, "Unknown field type out"

    .line 840
    .line 841
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    throw v0

    .line 845
    :pswitch_15
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 846
    .line 847
    .line 848
    move-result v5

    .line 849
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    if-nez v5, :cond_1d

    .line 854
    .line 855
    move-object/from16 v13, p1

    .line 856
    .line 857
    goto :goto_1a

    .line 858
    :cond_1d
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 859
    .line 860
    .line 861
    move-result-object v13

    .line 862
    invoke-virtual {v13, v1, v6, v5}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 863
    .line 864
    .line 865
    add-int/2addr v6, v5

    .line 866
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 867
    .line 868
    .line 869
    :goto_1a
    invoke-virtual {v13, v4}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 870
    .line 871
    .line 872
    invoke-static {v10}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    iget-object v5, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->q:Lcom/google/android/gms/common/server/response/zan;

    .line 876
    .line 877
    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 878
    .line 879
    .line 880
    iget-object v5, v7, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->q:Lcom/google/android/gms/common/server/response/zan;

    .line 881
    .line 882
    iget-object v5, v5, Lcom/google/android/gms/common/server/response/zan;->i:Ljava/util/HashMap;

    .line 883
    .line 884
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object v5

    .line 888
    check-cast v5, Ljava/util/Map;

    .line 889
    .line 890
    invoke-static {v5}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 891
    .line 892
    .line 893
    invoke-static {v0, v5, v13}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k(Ljava/lang/StringBuilder;Ljava/util/Map;Landroid/os/Parcel;)V

    .line 894
    .line 895
    .line 896
    goto/16 :goto_3

    .line 897
    .line 898
    :pswitch_16
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->b(Landroid/os/Parcel;I)Landroid/os/Bundle;

    .line 899
    .line 900
    .line 901
    move-result-object v5

    .line 902
    invoke-virtual {v5}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 903
    .line 904
    .line 905
    move-result-object v6

    .line 906
    const-string v7, "{"

    .line 907
    .line 908
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 909
    .line 910
    .line 911
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    const/4 v7, 0x1

    .line 916
    :goto_1b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 917
    .line 918
    .line 919
    move-result v10

    .line 920
    if-eqz v10, :cond_1f

    .line 921
    .line 922
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v10

    .line 926
    check-cast v10, Ljava/lang/String;

    .line 927
    .line 928
    if-nez v7, :cond_1e

    .line 929
    .line 930
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    :cond_1e
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 937
    .line 938
    .line 939
    const-string v7, "\":\""

    .line 940
    .line 941
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v5, v10}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v7

    .line 948
    invoke-static {v7}, Lcom/google/android/gms/common/util/JsonUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v7

    .line 952
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 953
    .line 954
    .line 955
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 956
    .line 957
    .line 958
    const/4 v7, 0x0

    .line 959
    goto :goto_1b

    .line 960
    :cond_1f
    const-string v5, "}"

    .line 961
    .line 962
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    goto/16 :goto_3

    .line 966
    .line 967
    :pswitch_17
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->c(Landroid/os/Parcel;I)[B

    .line 968
    .line 969
    .line 970
    move-result-object v5

    .line 971
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    if-nez v5, :cond_20

    .line 975
    .line 976
    move-object/from16 v13, p1

    .line 977
    .line 978
    goto :goto_1c

    .line 979
    :cond_20
    const/16 v6, 0xa

    .line 980
    .line 981
    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v13

    .line 985
    :goto_1c
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 989
    .line 990
    .line 991
    goto/16 :goto_3

    .line 992
    .line 993
    :pswitch_18
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->c(Landroid/os/Parcel;I)[B

    .line 994
    .line 995
    .line 996
    move-result-object v5

    .line 997
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 998
    .line 999
    .line 1000
    if-nez v5, :cond_21

    .line 1001
    .line 1002
    move-object/from16 v13, p1

    .line 1003
    .line 1004
    goto :goto_1d

    .line 1005
    :cond_21
    invoke-static {v5, v4}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v13

    .line 1009
    :goto_1d
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1013
    .line 1014
    .line 1015
    goto/16 :goto_3

    .line 1016
    .line 1017
    :pswitch_19
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->f(Landroid/os/Parcel;I)Ljava/lang/String;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v5

    .line 1021
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-static {v5}, Lcom/google/android/gms/common/util/JsonUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v5

    .line 1028
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1032
    .line 1033
    .line 1034
    goto/16 :goto_3

    .line 1035
    .line 1036
    :pswitch_1a
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->k(Landroid/os/Parcel;I)Z

    .line 1037
    .line 1038
    .line 1039
    move-result v5

    .line 1040
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 1041
    .line 1042
    .line 1043
    goto/16 :goto_3

    .line 1044
    .line 1045
    :pswitch_1b
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->a(Landroid/os/Parcel;I)Ljava/math/BigDecimal;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v5

    .line 1049
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1050
    .line 1051
    .line 1052
    goto/16 :goto_3

    .line 1053
    .line 1054
    :pswitch_1c
    invoke-static {v1, v6, v12}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->t(Landroid/os/Parcel;II)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v1}, Landroid/os/Parcel;->readDouble()D

    .line 1058
    .line 1059
    .line 1060
    move-result-wide v5

    .line 1061
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 1062
    .line 1063
    .line 1064
    goto/16 :goto_3

    .line 1065
    .line 1066
    :pswitch_1d
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->l(Landroid/os/Parcel;I)F

    .line 1067
    .line 1068
    .line 1069
    move-result v5

    .line 1070
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    goto/16 :goto_3

    .line 1074
    .line 1075
    :pswitch_1e
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->o(Landroid/os/Parcel;I)J

    .line 1076
    .line 1077
    .line 1078
    move-result-wide v5

    .line 1079
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    goto/16 :goto_3

    .line 1083
    .line 1084
    :pswitch_1f
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->q(Landroid/os/Parcel;I)I

    .line 1085
    .line 1086
    .line 1087
    move-result v5

    .line 1088
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1089
    .line 1090
    .line 1091
    move-result v6

    .line 1092
    if-nez v5, :cond_22

    .line 1093
    .line 1094
    move-object/from16 v13, p1

    .line 1095
    .line 1096
    goto :goto_1e

    .line 1097
    :cond_22
    invoke-virtual {v1}, Landroid/os/Parcel;->createByteArray()[B

    .line 1098
    .line 1099
    .line 1100
    move-result-object v7

    .line 1101
    add-int/2addr v6, v5

    .line 1102
    invoke-virtual {v1, v6}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 1103
    .line 1104
    .line 1105
    new-instance v13, Ljava/math/BigInteger;

    .line 1106
    .line 1107
    invoke-direct {v13, v7}, Ljava/math/BigInteger;-><init>([B)V

    .line 1108
    .line 1109
    .line 1110
    :goto_1e
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1111
    .line 1112
    .line 1113
    goto/16 :goto_3

    .line 1114
    .line 1115
    :pswitch_20
    invoke-static {v1, v6}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader;->n(Landroid/os/Parcel;I)I

    .line 1116
    .line 1117
    .line 1118
    move-result v5

    .line 1119
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1120
    .line 1121
    .line 1122
    goto/16 :goto_3

    .line 1123
    .line 1124
    :cond_23
    invoke-virtual {v1}, Landroid/os/Parcel;->dataPosition()I

    .line 1125
    .line 1126
    .line 1127
    move-result v2

    .line 1128
    if-ne v2, v3, :cond_24

    .line 1129
    .line 1130
    const/16 v1, 0x7d

    .line 1131
    .line 1132
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1133
    .line 1134
    .line 1135
    return-void

    .line 1136
    :cond_24
    new-instance v0, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;

    .line 1137
    .line 1138
    const-string v2, "Overread allowed size end="

    .line 1139
    .line 1140
    invoke-static {v3, v2}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v2

    .line 1144
    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;-><init>(Ljava/lang/String;Landroid/os/Parcel;)V

    .line 1145
    .line 1146
    .line 1147
    throw v0

    .line 1148
    nop

    .line 1149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
    .end packed-switch

    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
    .end packed-switch
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
.end method

.method public static final l(Ljava/lang/StringBuilder;ILjava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const-string v1, "\""

    .line 3
    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 8
    .line 9
    const-string p2, "Unknown type = "

    .line 10
    .line 11
    invoke-static {p1, p2}, Landroidx/appcompat/app/b;->j(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p0

    .line 19
    :pswitch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p1, "Method does not accept concrete type."

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :pswitch_1
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast p2, Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-static {p0, p2}, Lcom/google/android/gms/common/util/MapUtils;->a(Ljava/lang/StringBuilder;Ljava/util/HashMap;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    check-cast p2, [B

    .line 40
    .line 41
    if-nez p2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/16 p1, 0xa

    .line 45
    .line 46
    invoke-static {p2, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_3
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    check-cast p2, [B

    .line 61
    .line 62
    if-nez p2, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    invoke-static {p2, p1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_1
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-static {p2}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lcom/google/android/gms/common/util/JsonUtils;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :pswitch_5
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method

.method public static final m(Ljava/lang/StringBuilder;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-boolean v0, p1, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->j:Z

    .line 2
    .line 3
    iget p1, p1, Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;->i:I

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    check-cast p2, Ljava/util/ArrayList;

    .line 8
    .line 9
    const-string v0, "["

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const-string v2, ","

    .line 24
    .line 25
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {p0, p1, v2}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->l(Ljava/lang/StringBuilder;ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    const-string p1, "]"

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->l(Ljava/lang/StringBuilder;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k:Lcom/google/android/gms/common/server/response/zan;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->l:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/gms/common/server/response/zan;->i:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/util/Map;

    .line 19
    .line 20
    return-object v0
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Converting to JSON does not require this method."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final g()Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v1, "Converting to JSON does not require this method."

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final j()Landroid/os/Parcel;
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->i:Landroid/os/Parcel;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eq v0, v3, :cond_0

    .line 10
    .line 11
    return-object v2

    .line 12
    :cond_0
    iget v0, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->n:I

    .line 13
    .line 14
    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 15
    .line 16
    .line 17
    iput v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m:I

    .line 18
    .line 19
    return-object v2

    .line 20
    :cond_1
    const/16 v0, 0x4f45

    .line 21
    .line 22
    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->h(Landroid/os/Parcel;I)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iput v0, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->n:I

    .line 27
    .line 28
    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 29
    .line 30
    .line 31
    iput v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->m:I

    .line 32
    .line 33
    return-object v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "Cannot convert to JSON on client side."

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k:Lcom/google/android/gms/common/server/response/zan;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/Preconditions;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->j()Landroid/os/Parcel;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const/16 v3, 0x64

    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->l:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v3}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lcom/google/android/gms/common/server/response/zan;->i:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Ljava/util/Map;

    .line 35
    .line 36
    invoke-static {v1}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v1, v0}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k(Ljava/lang/StringBuilder;Ljava/util/Map;Landroid/os/Parcel;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->h(Landroid/os/Parcel;I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x4

    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-static {p1, v2, v1}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->j(Landroid/os/Parcel;II)V

    .line 10
    .line 11
    .line 12
    iget v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->h:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->j()Landroid/os/Parcel;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v2, 0x2

    .line 25
    invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->h(Landroid/os/Parcel;I)I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    invoke-virtual {v1}, Landroid/os/Parcel;->dataSize()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-virtual {p1, v1, v4, v3}, Landroid/os/Parcel;->appendFrom(Landroid/os/Parcel;II)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->j:I

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    iget-object v1, p0, Lcom/google/android/gms/common/server/response/SafeParcelResponse;->k:Lcom/google/android/gms/common/server/response/zan;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v1, 0x0

    .line 48
    :goto_1
    const/4 v2, 0x3

    .line 49
    invoke-static {p1, v2, v1, p2}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->c(Landroid/os/Parcel;ILandroid/os/Parcelable;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/safeparcel/SafeParcelWriter;->i(Landroid/os/Parcel;I)V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
.end method
