.class public final Lcom/google/android/gms/internal/play_billing/zzhx;
.super Lcom/google/android/gms/internal/play_billing/zzfi;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/zzgm;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/play_billing/zzhx;


# instance fields
.field private zzd:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Lcom/google/android/gms/internal/play_billing/zzig;

.field private zzi:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/zzhx;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/play_billing/zzhx;

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
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zze:I

    .line 6
    .line 7
    return-void
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

.method public static A()Lcom/google/android/gms/internal/play_billing/zzhv;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/zzfi;->h()Lcom/google/android/gms/internal/play_billing/zzfe;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzhv;

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

.method public static t([BLcom/google/android/gms/internal/play_billing/zzeu;)Lcom/google/android/gms/internal/play_billing/zzhx;
    .locals 7

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 2
    .line 3
    array-length v5, p0

    .line 4
    if-nez v5, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x4

    .line 8
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzhx;->g(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    move-object v2, v0

    .line 13
    check-cast v2, Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 14
    .line 15
    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzgs;->c:Lcom/google/android/gms/internal/play_billing/zzgs;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/zzgs;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/zzgv;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v6, Lcom/google/android/gms/internal/play_billing/zzdw;

    .line 26
    .line 27
    invoke-direct {v6, p1}, Lcom/google/android/gms/internal/play_billing/zzdw;-><init>(Lcom/google/android/gms/internal/play_billing/zzeu;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v3, p0

    .line 32
    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/play_billing/zzgv;->g(Ljava/lang/Object;[BIILcom/google/android/gms/internal/play_billing/zzdw;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/play_billing/zzgv;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/play_billing/zzfq; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/play_billing/zzhg; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :goto_0
    if-eqz v0, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    invoke-static {v0, p0}, Lcom/google/android/gms/internal/play_billing/zzfi;->e(Lcom/google/android/gms/internal/play_billing/zzfi;Z)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p0, Lcom/google/android/gms/internal/play_billing/zzhg;

    .line 50
    .line 51
    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/zzhg;-><init>()V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    :goto_1
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 65
    .line 66
    return-object v0

    .line 67
    :catch_0
    new-instance p0, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 68
    .line 69
    const-string p1, "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."

    .line 70
    .line 71
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p0

    .line 75
    :catch_1
    move-exception v0

    .line 76
    move-object p0, v0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    instance-of p1, p1, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    check-cast p0, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 90
    .line 91
    throw p0

    .line 92
    :cond_3
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :catch_2
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzfq;

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw p1

    .line 114
    :catch_3
    move-exception v0

    .line 115
    move-object p0, v0

    .line 116
    throw p0
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

.method public static v(Lcom/google/android/gms/internal/play_billing/zzhx;Lcom/google/android/gms/internal/play_billing/zzil;)V
    .locals 0

    .line 1
    iget p1, p1, Lcom/google/android/gms/internal/play_billing/zzil;->h:I

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzi:I

    .line 4
    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x4

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

    .line 10
    .line 11
    return-void
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
.end method

.method public static synthetic w(Lcom/google/android/gms/internal/play_billing/zzhx;Lcom/google/android/gms/internal/play_billing/zzig;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzh:Lcom/google/android/gms/internal/play_billing/zzig;

    .line 2
    .line 3
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

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
.end method

.method public static synthetic x(Lcom/google/android/gms/internal/play_billing/zzhx;Lcom/google/android/gms/internal/play_billing/zzjf;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzf:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x7

    .line 4
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zze:I

    .line 5
    .line 6
    return-void
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
.end method

.method public static synthetic y(Lcom/google/android/gms/internal/play_billing/zzhx;Lcom/google/android/gms/internal/play_billing/zzjv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzf:Ljava/lang/Object;

    .line 2
    .line 3
    const/4 p1, 0x6

    .line 4
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zze:I

    .line 5
    .line 6
    return-void
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
.end method

.method public static synthetic z(Lcom/google/android/gms/internal/play_billing/zzhx;I)V
    .locals 0

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzg:I

    .line 4
    .line 5
    iget p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

    .line 6
    .line 7
    or-int/lit8 p1, p1, 0x1

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzd:I

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public final g(I)Ljava/lang/Object;
    .locals 7

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_4

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    if-eq p1, v4, :cond_3

    .line 11
    .line 12
    if-eq p1, v3, :cond_2

    .line 13
    .line 14
    if-eq p1, v2, :cond_1

    .line 15
    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    sget-object p1, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

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
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzhv;

    .line 24
    .line 25
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 26
    .line 27
    invoke-direct {p1, v0}, Lcom/google/android/gms/internal/play_billing/zzfe;-><init>(Lcom/google/android/gms/internal/play_billing/zzfi;)V

    .line 28
    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 32
    .line 33
    invoke-direct {p1}, Lcom/google/android/gms/internal/play_billing/zzhx;-><init>()V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_3
    const/16 p1, 0xb

    .line 38
    .line 39
    new-array p1, p1, [Ljava/lang/Object;

    .line 40
    .line 41
    const-string v5, "zzf"

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    aput-object v5, p1, v6

    .line 45
    .line 46
    const-string v5, "zze"

    .line 47
    .line 48
    aput-object v5, p1, v0

    .line 49
    .line 50
    const-string v0, "zzd"

    .line 51
    .line 52
    aput-object v0, p1, v4

    .line 53
    .line 54
    const-string v0, "zzg"

    .line 55
    .line 56
    aput-object v0, p1, v3

    .line 57
    .line 58
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzhy;->a:Lcom/google/android/gms/internal/play_billing/zzfl;

    .line 59
    .line 60
    aput-object v0, p1, v2

    .line 61
    .line 62
    const-string v0, "zzh"

    .line 63
    .line 64
    aput-object v0, p1, v1

    .line 65
    .line 66
    const-class v0, Lcom/google/android/gms/internal/play_billing/zziz;

    .line 67
    .line 68
    const/4 v1, 0x6

    .line 69
    aput-object v0, p1, v1

    .line 70
    .line 71
    const-string v0, "zzi"

    .line 72
    .line 73
    const/4 v1, 0x7

    .line 74
    aput-object v0, p1, v1

    .line 75
    .line 76
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzik;->a:Lcom/google/android/gms/internal/play_billing/zzfl;

    .line 77
    .line 78
    const/16 v1, 0x8

    .line 79
    .line 80
    aput-object v0, p1, v1

    .line 81
    .line 82
    const-class v0, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 83
    .line 84
    const/16 v1, 0x9

    .line 85
    .line 86
    aput-object v0, p1, v1

    .line 87
    .line 88
    const-class v0, Lcom/google/android/gms/internal/play_billing/zzjf;

    .line 89
    .line 90
    const/16 v1, 0xa

    .line 91
    .line 92
    aput-object v0, p1, v1

    .line 93
    .line 94
    sget-object v0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzb:Lcom/google/android/gms/internal/play_billing/zzhx;

    .line 95
    .line 96
    new-instance v1, Lcom/google/android/gms/internal/play_billing/zzgu;

    .line 97
    .line 98
    const-string v2, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\u180c\u0000\u0002\u1009\u0001\u0004<\u0000\u0005\u180c\u0002\u0006<\u0000\u0007<\u0000"

    .line 99
    .line 100
    invoke-direct {v1, v0, v2, p1}, Lcom/google/android/gms/internal/play_billing/zzgu;-><init>(Lcom/google/android/gms/internal/play_billing/zzgl;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_4
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1
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

.method public final u()Lcom/google/android/gms/internal/play_billing/zzjf;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zze:I

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/zzhx;->zzf:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzjf;

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjf;->u()Lcom/google/android/gms/internal/play_billing/zzjf;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
