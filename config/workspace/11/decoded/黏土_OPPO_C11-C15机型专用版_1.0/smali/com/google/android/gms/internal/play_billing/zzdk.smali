.class public final Lcom/google/android/gms/internal/play_billing/zzdk;
.super Lcom/google/android/gms/internal/play_billing/zzfi;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/zzgm;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/zzdk;


# instance fields
.field private zzd:Lcom/google/android/gms/internal/play_billing/zzfn;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/zzdk;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzb:Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/play_billing/zzfi;->q(Ljava/lang/Class;Lcom/google/android/gms/internal/play_billing/zzfi;)V

    .line 11
    .line 12
    .line 13
    return-void
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

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/zzfi;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzgt;->l:Lcom/google/android/gms/internal/play_billing/zzgt;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzd:Lcom/google/android/gms/internal/play_billing/zzfn;

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

.method public static t()Lcom/google/android/gms/internal/play_billing/zzdj;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzb:Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfi;->h()Lcom/google/android/gms/internal/play_billing/zzfe;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzdj;

    .line 8
    .line 9
    return-object v0
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

.method public static u(Lcom/google/android/gms/internal/play_billing/zzdk;Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzd:Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/google/android/gms/internal/play_billing/zzfn;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v1

    .line 14
    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzfn;->e(I)Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzd:Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzd:Lcom/google/android/gms/internal/play_billing/zzfn;

    .line 21
    .line 22
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzfo;->a:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    instance-of v1, p0, Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    move-object v1, p0

    .line 33
    check-cast v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    instance-of v1, p0, Lcom/google/android/gms/internal/play_billing/zzgt;

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    move-object v1, p0

    .line 49
    check-cast v1, Lcom/google/android/gms/internal/play_billing/zzgt;

    .line 50
    .line 51
    iget v2, v1, Lcom/google/android/gms/internal/play_billing/zzgt;->j:I

    .line 52
    .line 53
    add-int/2addr v2, v0

    .line 54
    iget-object v0, v1, Lcom/google/android/gms/internal/play_billing/zzgt;->i:[Ljava/lang/Object;

    .line 55
    .line 56
    array-length v0, v0

    .line 57
    if-gt v2, v0, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const/16 v3, 0xa

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    :goto_0
    if-ge v0, v2, :cond_3

    .line 65
    .line 66
    const/4 v4, 0x3

    .line 67
    const/4 v5, 0x2

    .line 68
    const/4 v6, 0x1

    .line 69
    invoke-static {v0, v4, v5, v6, v3}, Landroidx/appcompat/app/b;->h(IIIII)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    iget-object v2, v1, Lcom/google/android/gms/internal/play_billing/zzgt;->i:[Ljava/lang/Object;

    .line 75
    .line 76
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, v1, Lcom/google/android/gms/internal/play_billing/zzgt;->i:[Ljava/lang/Object;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    new-array v0, v0, [Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v0, v1, Lcom/google/android/gms/internal/play_billing/zzgt;->i:[Ljava/lang/Object;

    .line 90
    .line 91
    :cond_5
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    const/4 v2, 0x0

    .line 100
    :goto_2
    if-ge v2, v1, :cond_8

    .line 101
    .line 102
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-nez v3, :cond_7

    .line 107
    .line 108
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    sub-int/2addr p1, v0

    .line 113
    const-string v1, "Element at index "

    .line 114
    .line 115
    const-string v2, " is null."

    .line 116
    .line 117
    invoke-static {p1, v1, v2}, Landroidx/appcompat/app/b;->k(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    :goto_3
    add-int/lit8 v1, v1, -0x1

    .line 126
    .line 127
    if-lt v1, v0, :cond_6

    .line 128
    .line 129
    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    new-instance p0, Ljava/lang/NullPointerException;

    .line 134
    .line 135
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0

    .line 139
    :cond_7
    invoke-interface {p0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_8
    return-void
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
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
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
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
.end method


# virtual methods
.method public final g(I)Ljava/lang/Object;
    .locals 3

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_4

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq p1, v1, :cond_3

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_2

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/google/android/gms/internal/play_billing/zzdk;->zzb:Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    throw p1

    .line 23
    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzdj;

    .line 24
    .line 25
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzb:Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzfe;-><init>(Lcom/google/android/gms/internal/play_billing/zzfi;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 32
    .line 33
    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/zzdk;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    new-array p1, v1, [Ljava/lang/Object;

    .line 38
    .line 39
    const-string v1, "zzd"

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    aput-object v1, p1, v2

    .line 43
    .line 44
    const-class v1, Lcom/google/android/gms/internal/play_billing/zzdi;

    .line 45
    .line 46
    aput-object v1, p1, v0

    .line 47
    .line 48
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzdk;->zzb:Lcom/google/android/gms/internal/play_billing/zzdk;

    .line 49
    .line 50
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzgu;

    .line 51
    .line 52
    const-string v2, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    .line 53
    .line 54
    invoke-direct {v1, v0, v2, p1}, Lcom/google/android/gms/internal/play_billing/zzgu;-><init>(Lcom/google/android/gms/internal/play_billing/zzgl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_4
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1
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
.end method
