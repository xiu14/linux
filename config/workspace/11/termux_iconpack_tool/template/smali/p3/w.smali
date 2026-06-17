.class public final synthetic Lp3/w;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lp3/x;


# direct methods
.method public synthetic constructor <init>(Lp3/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp3/w;->a:Lp3/x;

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
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lp3/w;->a:Lp3/x;

    .line 4
    .line 5
    iget-object v0, v2, Lp3/x;->d:Lp3/b;

    .line 6
    .line 7
    iget-object v3, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v3

    .line 10
    :try_start_0
    iget v4, v0, Lp3/b;->b:I

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x3

    .line 14
    if-ne v4, v6, :cond_0

    .line 15
    .line 16
    monitor-exit v3

    .line 17
    return-object v5

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto/16 :goto_1e

    .line 20
    .line 21
    :cond_0
    iget v4, v0, Lp3/b;->b:I

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    const/4 v8, 0x0

    .line 25
    if-ne v4, v7, :cond_1

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v4, 0x0

    .line 30
    :goto_0
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    new-instance v3, Landroid/os/Bundle;

    .line 38
    .line 39
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 40
    .line 41
    .line 42
    const-string v9, "accountName"

    .line 43
    .line 44
    invoke-virtual {v3, v9, v5}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v9, v0, Lp3/b;->c:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v10, v0, Lp3/b;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v11, v0, Lp3/b;->A:Ljava/lang/Long;

    .line 52
    .line 53
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 54
    .line 55
    .line 56
    move-result-wide v11

    .line 57
    invoke-static {v3, v9, v10, v11, v12}, Lcom/google/android/gms/internal/play_billing/zzc;->b(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    move-object v3, v5

    .line 62
    :goto_1
    sget-object v9, Lcom/google/android/gms/internal/play_billing/zzie;->i:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 63
    .line 64
    iget-object v10, v0, Lp3/b;->a:Ljava/lang/Object;

    .line 65
    .line 66
    monitor-enter v10

    .line 67
    :try_start_1
    iget-object v0, v0, Lp3/b;->i:Lcom/google/android/gms/internal/play_billing/zzam;

    .line 68
    .line 69
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    iget-object v0, v2, Lp3/x;->d:Lp3/b;

    .line 73
    .line 74
    invoke-virtual {v0, v8}, Lp3/b;->m(I)V

    .line 75
    .line 76
    .line 77
    sget-object v3, Lcom/google/android/gms/internal/play_billing/zzie;->k1:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 78
    .line 79
    sget-object v4, Lp3/f0;->h:Lp3/e;

    .line 80
    .line 81
    invoke-virtual {v0, v3, v4}, Lp3/b;->l(Lcom/google/android/gms/internal/play_billing/zzie;Lp3/e;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v4}, Lp3/x;->c(Lp3/e;)V

    .line 85
    .line 86
    .line 87
    return-object v5

    .line 88
    :cond_3
    iget-object v10, v2, Lp3/x;->d:Lp3/b;

    .line 89
    .line 90
    iget-object v11, v10, Lp3/b;->g:Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {v11}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v11

    .line 96
    const/16 v13, 0x19

    .line 97
    .line 98
    const/4 v14, 0x3

    .line 99
    :goto_2
    if-lt v13, v6, :cond_6

    .line 100
    .line 101
    if-nez v3, :cond_4

    .line 102
    .line 103
    :try_start_2
    const-string v14, "subs"

    .line 104
    .line 105
    invoke-interface {v0, v13, v11, v14}, Lcom/google/android/gms/internal/play_billing/zzam;->k0(ILjava/lang/String;Ljava/lang/String;)I

    .line 106
    .line 107
    .line 108
    move-result v14

    .line 109
    goto :goto_3

    .line 110
    :catch_0
    move-exception v0

    .line 111
    goto/16 :goto_18

    .line 112
    .line 113
    :cond_4
    const-string v14, "subs"

    .line 114
    .line 115
    invoke-interface {v0, v13, v11, v14, v3}, Lcom/google/android/gms/internal/play_billing/zzam;->X(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 116
    .line 117
    .line 118
    move-result v14

    .line 119
    :goto_3
    if-nez v14, :cond_5

    .line 120
    .line 121
    const-string v15, "BillingClient"

    .line 122
    .line 123
    new-instance v7, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v12, "highestLevelSupportedForSubs: "

    .line 129
    .line 130
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-static {v15, v7}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_5
    add-int/lit8 v13, v13, -0x1

    .line 145
    .line 146
    const/4 v7, 0x1

    .line 147
    goto :goto_2

    .line 148
    :cond_6
    const/4 v13, 0x0

    .line 149
    :goto_4
    if-lt v13, v6, :cond_7

    .line 150
    .line 151
    const/4 v7, 0x1

    .line 152
    goto :goto_5

    .line 153
    :cond_7
    const/4 v7, 0x0

    .line 154
    :goto_5
    iput-boolean v7, v10, Lp3/b;->k:Z

    .line 155
    .line 156
    if-ge v13, v6, :cond_8

    .line 157
    .line 158
    sget-object v9, Lcom/google/android/gms/internal/play_billing/zzie;->q:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 159
    .line 160
    const-string v7, "BillingClient"

    .line 161
    .line 162
    const-string v12, "In-app billing API does not support subscription on this device."

    .line 163
    .line 164
    invoke-static {v7, v12}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_8
    const/16 v12, 0x19

    .line 168
    .line 169
    :goto_6
    if-lt v12, v6, :cond_b

    .line 170
    .line 171
    if-nez v3, :cond_9

    .line 172
    .line 173
    const-string v7, "inapp"

    .line 174
    .line 175
    invoke-interface {v0, v12, v11, v7}, Lcom/google/android/gms/internal/play_billing/zzam;->k0(ILjava/lang/String;Ljava/lang/String;)I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    :goto_7
    move v14, v7

    .line 180
    goto :goto_8

    .line 181
    :cond_9
    const-string v7, "inapp"

    .line 182
    .line 183
    invoke-interface {v0, v12, v11, v7, v3}, Lcom/google/android/gms/internal/play_billing/zzam;->X(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)I

    .line 184
    .line 185
    .line 186
    move-result v7

    .line 187
    goto :goto_7

    .line 188
    :goto_8
    if-nez v14, :cond_a

    .line 189
    .line 190
    iput v12, v10, Lp3/b;->l:I

    .line 191
    .line 192
    const-string v0, "BillingClient"

    .line 193
    .line 194
    new-instance v3, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    const-string v7, "mHighestLevelSupportedForInApp: "

    .line 200
    .line 201
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-static {v0, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    goto :goto_9

    .line 215
    :cond_a
    add-int/lit8 v12, v12, -0x1

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_b
    :goto_9
    iget v0, v10, Lp3/b;->l:I

    .line 219
    .line 220
    iput v0, v10, Lp3/b;->l:I

    .line 221
    .line 222
    const/16 v3, 0x1a

    .line 223
    .line 224
    if-lt v0, v3, :cond_c

    .line 225
    .line 226
    const/4 v3, 0x1

    .line 227
    goto :goto_a

    .line 228
    :cond_c
    const/4 v3, 0x0

    .line 229
    :goto_a
    iput-boolean v3, v10, Lp3/b;->w:Z

    .line 230
    .line 231
    const/16 v3, 0x18

    .line 232
    .line 233
    if-lt v0, v3, :cond_d

    .line 234
    .line 235
    const/4 v3, 0x1

    .line 236
    goto :goto_b

    .line 237
    :cond_d
    const/4 v3, 0x0

    .line 238
    :goto_b
    iput-boolean v3, v10, Lp3/b;->v:Z

    .line 239
    .line 240
    const/16 v3, 0x15

    .line 241
    .line 242
    if-lt v0, v3, :cond_e

    .line 243
    .line 244
    const/4 v3, 0x1

    .line 245
    goto :goto_c

    .line 246
    :cond_e
    const/4 v3, 0x0

    .line 247
    :goto_c
    iput-boolean v3, v10, Lp3/b;->u:Z

    .line 248
    .line 249
    const/16 v3, 0x14

    .line 250
    .line 251
    if-lt v0, v3, :cond_f

    .line 252
    .line 253
    const/4 v3, 0x1

    .line 254
    goto :goto_d

    .line 255
    :cond_f
    const/4 v3, 0x0

    .line 256
    :goto_d
    iput-boolean v3, v10, Lp3/b;->t:Z

    .line 257
    .line 258
    const/16 v3, 0x13

    .line 259
    .line 260
    if-lt v0, v3, :cond_10

    .line 261
    .line 262
    const/4 v3, 0x1

    .line 263
    goto :goto_e

    .line 264
    :cond_10
    const/4 v3, 0x0

    .line 265
    :goto_e
    iput-boolean v3, v10, Lp3/b;->s:Z

    .line 266
    .line 267
    const/16 v3, 0x11

    .line 268
    .line 269
    if-lt v0, v3, :cond_11

    .line 270
    .line 271
    const/4 v3, 0x1

    .line 272
    goto :goto_f

    .line 273
    :cond_11
    const/4 v3, 0x0

    .line 274
    :goto_f
    iput-boolean v3, v10, Lp3/b;->r:Z

    .line 275
    .line 276
    const/16 v3, 0x10

    .line 277
    .line 278
    if-lt v0, v3, :cond_12

    .line 279
    .line 280
    const/4 v3, 0x1

    .line 281
    goto :goto_10

    .line 282
    :cond_12
    const/4 v3, 0x0

    .line 283
    :goto_10
    iput-boolean v3, v10, Lp3/b;->q:Z

    .line 284
    .line 285
    const/16 v3, 0xf

    .line 286
    .line 287
    if-lt v0, v3, :cond_13

    .line 288
    .line 289
    const/4 v3, 0x1

    .line 290
    goto :goto_11

    .line 291
    :cond_13
    const/4 v3, 0x0

    .line 292
    :goto_11
    iput-boolean v3, v10, Lp3/b;->p:Z

    .line 293
    .line 294
    const/16 v3, 0xe

    .line 295
    .line 296
    if-lt v0, v3, :cond_14

    .line 297
    .line 298
    const/4 v3, 0x1

    .line 299
    goto :goto_12

    .line 300
    :cond_14
    const/4 v3, 0x0

    .line 301
    :goto_12
    iput-boolean v3, v10, Lp3/b;->o:Z

    .line 302
    .line 303
    const/16 v3, 0x9

    .line 304
    .line 305
    if-lt v0, v3, :cond_15

    .line 306
    .line 307
    const/4 v3, 0x1

    .line 308
    goto :goto_13

    .line 309
    :cond_15
    const/4 v3, 0x0

    .line 310
    :goto_13
    iput-boolean v3, v10, Lp3/b;->n:Z

    .line 311
    .line 312
    const/4 v3, 0x6

    .line 313
    if-lt v0, v3, :cond_16

    .line 314
    .line 315
    const/4 v7, 0x1

    .line 316
    goto :goto_14

    .line 317
    :cond_16
    const/4 v7, 0x0

    .line 318
    :goto_14
    iput-boolean v7, v10, Lp3/b;->m:Z

    .line 319
    .line 320
    if-ge v0, v6, :cond_17

    .line 321
    .line 322
    sget-object v9, Lcom/google/android/gms/internal/play_billing/zzie;->R:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 323
    .line 324
    const-string v0, "BillingClient"

    .line 325
    .line 326
    const-string v6, "In-app billing API version 3 is not supported on this device."

    .line 327
    .line 328
    invoke-static {v0, v6}, Lcom/google/android/gms/internal/play_billing/zzc;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :cond_17
    invoke-static {v10, v14}, Lp3/b;->s(Lp3/b;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 332
    .line 333
    .line 334
    if-eqz v14, :cond_18

    .line 335
    .line 336
    sget-object v0, Lp3/f0;->a:Lp3/e;

    .line 337
    .line 338
    invoke-virtual {v2, v0, v9, v5, v4}, Lp3/x;->b(Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2, v0}, Lp3/x;->c(Lp3/e;)V

    .line 342
    .line 343
    .line 344
    return-object v5

    .line 345
    :cond_18
    :try_start_3
    invoke-virtual {v2, v4}, Lp3/x;->a(Z)Ljava/lang/Long;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-eqz v4, :cond_1a

    .line 350
    .line 351
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzib;->y()Lcom/google/android/gms/internal/play_billing/zzhz;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 356
    .line 357
    .line 358
    iget-object v6, v4, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 359
    .line 360
    check-cast v6, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 361
    .line 362
    invoke-static {v6, v3}, Lcom/google/android/gms/internal/play_billing/zzib;->x(Lcom/google/android/gms/internal/play_billing/zzib;I)V

    .line 363
    .line 364
    .line 365
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjv;->x()Lcom/google/android/gms/internal/play_billing/zzjt;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/play_billing/zzjt;->i(Z)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzjt;->l()V

    .line 373
    .line 374
    .line 375
    if-eqz v0, :cond_19

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 382
    .line 383
    .line 384
    iget-object v0, v3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 385
    .line 386
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 387
    .line 388
    invoke-static {v0, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzjv;->v(Lcom/google/android/gms/internal/play_billing/zzjv;J)V

    .line 389
    .line 390
    .line 391
    goto :goto_15

    .line 392
    :catchall_1
    move-exception v0

    .line 393
    goto :goto_16

    .line 394
    :cond_19
    :goto_15
    iget-object v0, v2, Lp3/x;->d:Lp3/b;

    .line 395
    .line 396
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 397
    .line 398
    .line 399
    iget-object v6, v4, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 400
    .line 401
    check-cast v6, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 402
    .line 403
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzjv;

    .line 408
    .line 409
    invoke-static {v6, v3}, Lcom/google/android/gms/internal/play_billing/zzib;->w(Lcom/google/android/gms/internal/play_billing/zzib;Lcom/google/android/gms/internal/play_billing/zzjv;)V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzib;

    .line 417
    .line 418
    invoke-virtual {v0, v3}, Lp3/b;->k(Lcom/google/android/gms/internal/play_billing/zzib;)V

    .line 419
    .line 420
    .line 421
    goto :goto_17

    .line 422
    :cond_1a
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzjo;->v()Lcom/google/android/gms/internal/play_billing/zzjm;

    .line 423
    .line 424
    .line 425
    move-result-object v3

    .line 426
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/zzig;->y()Lcom/google/android/gms/internal/play_billing/zzic;

    .line 427
    .line 428
    .line 429
    move-result-object v4

    .line 430
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 431
    .line 432
    .line 433
    iget-object v6, v4, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 434
    .line 435
    check-cast v6, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 436
    .line 437
    invoke-static {v6, v8}, Lcom/google/android/gms/internal/play_billing/zzig;->x(Lcom/google/android/gms/internal/play_billing/zzig;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 441
    .line 442
    .line 443
    iget-object v6, v3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 444
    .line 445
    check-cast v6, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 446
    .line 447
    invoke-virtual {v4}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    check-cast v4, Lcom/google/android/gms/internal/play_billing/zzig;

    .line 452
    .line 453
    invoke-static {v6, v4}, Lcom/google/android/gms/internal/play_billing/zzjo;->t(Lcom/google/android/gms/internal/play_billing/zzjo;Lcom/google/android/gms/internal/play_billing/zzig;)V

    .line 454
    .line 455
    .line 456
    if-eqz v0, :cond_1b

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 459
    .line 460
    .line 461
    move-result-wide v6

    .line 462
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->h()V

    .line 463
    .line 464
    .line 465
    iget-object v0, v3, Lcom/google/android/gms/internal/play_billing/zzfe;->i:Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 466
    .line 467
    check-cast v0, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 468
    .line 469
    invoke-static {v0, v6, v7}, Lcom/google/android/gms/internal/play_billing/zzjo;->u(Lcom/google/android/gms/internal/play_billing/zzjo;J)V

    .line 470
    .line 471
    .line 472
    :cond_1b
    iget-object v0, v2, Lp3/x;->d:Lp3/b;

    .line 473
    .line 474
    iget-object v0, v0, Lp3/b;->h:Lu2/c;

    .line 475
    .line 476
    invoke-virtual {v3}, Lcom/google/android/gms/internal/play_billing/zzfe;->e()Lcom/google/android/gms/internal/play_billing/zzfi;

    .line 477
    .line 478
    .line 479
    move-result-object v3

    .line 480
    check-cast v3, Lcom/google/android/gms/internal/play_billing/zzjo;

    .line 481
    .line 482
    invoke-virtual {v0, v3}, Lu2/c;->p(Lcom/google/android/gms/internal/play_billing/zzjo;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 483
    .line 484
    .line 485
    goto :goto_17

    .line 486
    :goto_16
    const-string v3, "BillingClient"

    .line 487
    .line 488
    const-string v4, "Unable to log."

    .line 489
    .line 490
    invoke-static {v3, v4, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 491
    .line 492
    .line 493
    :goto_17
    sget-object v0, Lp3/f0;->g:Lp3/e;

    .line 494
    .line 495
    invoke-virtual {v2, v0}, Lp3/x;->c(Lp3/e;)V

    .line 496
    .line 497
    .line 498
    goto :goto_1d

    .line 499
    :goto_18
    const-string v3, "BillingClient"

    .line 500
    .line 501
    const-string v6, "Exception while checking if billing is supported; try to reconnect"

    .line 502
    .line 503
    invoke-static {v3, v6, v0}, Lcom/google/android/gms/internal/play_billing/zzc;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 504
    .line 505
    .line 506
    instance-of v3, v0, Landroid/os/DeadObjectException;

    .line 507
    .line 508
    if-eqz v3, :cond_1c

    .line 509
    .line 510
    sget-object v6, Lcom/google/android/gms/internal/play_billing/zzie;->U0:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 511
    .line 512
    goto :goto_19

    .line 513
    :cond_1c
    instance-of v6, v0, Landroid/os/RemoteException;

    .line 514
    .line 515
    if-eqz v6, :cond_1d

    .line 516
    .line 517
    sget-object v6, Lcom/google/android/gms/internal/play_billing/zzie;->T0:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 518
    .line 519
    goto :goto_19

    .line 520
    :cond_1d
    instance-of v6, v0, Ljava/lang/SecurityException;

    .line 521
    .line 522
    if-eqz v6, :cond_1e

    .line 523
    .line 524
    sget-object v6, Lcom/google/android/gms/internal/play_billing/zzie;->V0:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 525
    .line 526
    goto :goto_19

    .line 527
    :cond_1e
    sget-object v6, Lcom/google/android/gms/internal/play_billing/zzie;->X:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 528
    .line 529
    :goto_19
    sget-object v7, Lcom/google/android/gms/internal/play_billing/zzie;->X:Lcom/google/android/gms/internal/play_billing/zzie;

    .line 530
    .line 531
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 532
    .line 533
    .line 534
    move-result v7

    .line 535
    if-eqz v7, :cond_1f

    .line 536
    .line 537
    invoke-static {v0}, Lp3/d0;->a(Ljava/lang/Exception;)Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object v0

    .line 541
    goto :goto_1a

    .line 542
    :cond_1f
    move-object v0, v5

    .line 543
    :goto_1a
    iget-object v7, v2, Lp3/x;->d:Lp3/b;

    .line 544
    .line 545
    invoke-virtual {v7, v8}, Lp3/b;->m(I)V

    .line 546
    .line 547
    .line 548
    if-eqz v3, :cond_20

    .line 549
    .line 550
    sget-object v7, Lp3/f0;->h:Lp3/e;

    .line 551
    .line 552
    goto :goto_1b

    .line 553
    :cond_20
    sget-object v7, Lp3/f0;->f:Lp3/e;

    .line 554
    .line 555
    :goto_1b
    invoke-virtual {v2, v7, v6, v0, v4}, Lp3/x;->b(Lp3/e;Lcom/google/android/gms/internal/play_billing/zzie;Ljava/lang/String;Z)V

    .line 556
    .line 557
    .line 558
    if-eqz v3, :cond_21

    .line 559
    .line 560
    sget-object v0, Lp3/f0;->h:Lp3/e;

    .line 561
    .line 562
    goto :goto_1c

    .line 563
    :cond_21
    sget-object v0, Lp3/f0;->f:Lp3/e;

    .line 564
    .line 565
    :goto_1c
    invoke-virtual {v2, v0}, Lp3/x;->c(Lp3/e;)V

    .line 566
    .line 567
    .line 568
    :goto_1d
    return-object v5

    .line 569
    :catchall_2
    move-exception v0

    .line 570
    :try_start_4
    monitor-exit v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 571
    throw v0

    .line 572
    :goto_1e
    :try_start_5
    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 573
    throw v0
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
.end method
