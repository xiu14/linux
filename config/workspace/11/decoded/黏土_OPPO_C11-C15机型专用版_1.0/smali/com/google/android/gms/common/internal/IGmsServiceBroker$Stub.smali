.class public abstract Lcom/google/android/gms/common/internal/IGmsServiceBroker$Stub;
.super Landroid/os/Binder;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/common/internal/IGmsServiceBroker;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/internal/IGmsServiceBroker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "com.google.android.gms.common.internal.IGmsServiceBroker"

    .line 5
    .line 6
    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
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


# virtual methods
.method public final asBinder()Landroid/os/IBinder;
    .locals 0

    .line 1
    return-object p0
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
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

.method public final onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 4

    .line 1
    const v0, 0xffffff

    .line 2
    .line 3
    .line 4
    if-le p1, v0, :cond_0

    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :cond_0
    const-string p4, "com.google.android.gms.common.internal.IGmsServiceBroker"

    .line 12
    .line 13
    invoke-virtual {p2, p4}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 17
    .line 18
    .line 19
    move-result-object p4

    .line 20
    const/4 v0, 0x0

    .line 21
    if-nez p4, :cond_1

    .line 22
    .line 23
    move-object v2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const-string v1, "com.google.android.gms.common.internal.IGmsCallbacks"

    .line 26
    .line 27
    invoke-interface {p4, v1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    instance-of v3, v2, Lcom/google/android/gms/common/internal/IGmsCallbacks;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    check-cast v2, Lcom/google/android/gms/common/internal/IGmsCallbacks;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    new-instance v2, Lcom/google/android/gms/common/internal/zzab;

    .line 39
    .line 40
    invoke-direct {v2, p4, v1}, Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    const/16 p4, 0x2e

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    if-ne p1, p4, :cond_4

    .line 47
    .line 48
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_3

    .line 53
    .line 54
    sget-object p1, Lcom/google/android/gms/common/internal/GetServiceRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 55
    .line 56
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v0, p1

    .line 61
    check-cast v0, Lcom/google/android/gms/common/internal/GetServiceRequest;

    .line 62
    .line 63
    :cond_3
    check-cast v2, Lcom/google/android/gms/common/internal/zzd;

    .line 64
    .line 65
    invoke-interface {p0, v2, v0}, Lcom/google/android/gms/common/internal/IGmsServiceBroker;->B(Lcom/google/android/gms/common/internal/zzd;Lcom/google/android/gms/common/internal/GetServiceRequest;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p3}, Lcom/google/android/gms/common/internal/Preconditions;->d(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 72
    .line 73
    .line 74
    return v1

    .line 75
    :cond_4
    const/16 p3, 0x2f

    .line 76
    .line 77
    if-ne p1, p3, :cond_6

    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_5

    .line 84
    .line 85
    sget-object p1, Lcom/google/android/gms/common/internal/zzak;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 86
    .line 87
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/google/android/gms/common/internal/zzak;

    .line 92
    .line 93
    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 94
    .line 95
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_6
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 100
    .line 101
    .line 102
    const/4 p3, 0x4

    .line 103
    if-eq p1, p3, :cond_b

    .line 104
    .line 105
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    if-eq p1, v1, :cond_a

    .line 109
    .line 110
    const/4 p3, 0x2

    .line 111
    if-eq p1, p3, :cond_9

    .line 112
    .line 113
    const/16 p3, 0x17

    .line 114
    .line 115
    if-eq p1, p3, :cond_9

    .line 116
    .line 117
    const/16 p3, 0x19

    .line 118
    .line 119
    if-eq p1, p3, :cond_9

    .line 120
    .line 121
    const/16 p3, 0x1b

    .line 122
    .line 123
    if-eq p1, p3, :cond_9

    .line 124
    .line 125
    const/16 p3, 0x1e

    .line 126
    .line 127
    if-eq p1, p3, :cond_8

    .line 128
    .line 129
    const/16 p3, 0x22

    .line 130
    .line 131
    if-eq p1, p3, :cond_7

    .line 132
    .line 133
    const/16 p3, 0x29

    .line 134
    .line 135
    if-eq p1, p3, :cond_9

    .line 136
    .line 137
    const/16 p3, 0x2b

    .line 138
    .line 139
    if-eq p1, p3, :cond_9

    .line 140
    .line 141
    const/16 p3, 0x25

    .line 142
    .line 143
    if-eq p1, p3, :cond_9

    .line 144
    .line 145
    const/16 p3, 0x26

    .line 146
    .line 147
    if-eq p1, p3, :cond_9

    .line 148
    .line 149
    packed-switch p1, :pswitch_data_0

    .line 150
    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :pswitch_0
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_b

    .line 162
    .line 163
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 164
    .line 165
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    check-cast p1, Landroid/os/Bundle;

    .line 170
    .line 171
    goto :goto_1

    .line 172
    :pswitch_1
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :pswitch_2
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_b

    .line 199
    .line 200
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 201
    .line 202
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    check-cast p1, Landroid/os/Bundle;

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_7
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_8
    :pswitch_3
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-eqz p1, :cond_b

    .line 224
    .line 225
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 226
    .line 227
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, Landroid/os/Bundle;

    .line 232
    .line 233
    goto :goto_1

    .line 234
    :cond_9
    :pswitch_4
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    if-eqz p1, :cond_b

    .line 239
    .line 240
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 241
    .line 242
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    check-cast p1, Landroid/os/Bundle;

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_a
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p2}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    .line 259
    .line 260
    .line 261
    move-result p1

    .line 262
    if-eqz p1, :cond_b

    .line 263
    .line 264
    sget-object p1, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 265
    .line 266
    invoke-interface {p1, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Landroid/os/Bundle;

    .line 271
    .line 272
    :cond_b
    :goto_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 273
    .line 274
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 275
    .line 276
    .line 277
    throw p1

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_3
    .end packed-switch
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
.end method
