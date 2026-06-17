.class public abstract Lv2/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "EnqueueRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Ll2/t;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lv2/b;->a:Ljava/lang/String;

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

.method public static a(Lm2/o;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {v0}, Lm2/o;->T(Lm2/o;)Ljava/util/HashSet;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lm2/o;->a:Lm2/r;

    .line 8
    .line 9
    iget-object v3, v0, Lm2/o;->b:Ljava/util/List;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    new-array v5, v4, [Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, [Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, v2, Lm2/r;->b:Ll2/a;

    .line 21
    .line 22
    iget-object v5, v5, Ll2/a;->d:Ll2/a0;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    iget-object v7, v2, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    array-length v9, v1

    .line 36
    if-lez v9, :cond_0

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v9, 0x0

    .line 41
    :goto_0
    const/4 v10, 0x6

    .line 42
    const/4 v11, 0x4

    .line 43
    if-eqz v9, :cond_5

    .line 44
    .line 45
    array-length v12, v1

    .line 46
    const/4 v13, 0x0

    .line 47
    const/4 v14, 0x1

    .line 48
    const/4 v15, 0x0

    .line 49
    const/16 v16, 0x0

    .line 50
    .line 51
    :goto_1
    if-ge v13, v12, :cond_6

    .line 52
    .line 53
    aget-object v4, v1, v13

    .line 54
    .line 55
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v8, v4}, Lu2/s;->i(Ljava/lang/String;)Lu2/p;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    if-nez v8, :cond_1

    .line 64
    .line 65
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "Prerequisite "

    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v3, " doesn\'t exist; not enqueuing"

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    sget-object v3, Lv2/b;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v1, v3, v2}, Ll2/t;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    :goto_2
    const/4 v1, 0x1

    .line 95
    goto/16 :goto_c

    .line 96
    .line 97
    :cond_1
    iget v4, v8, Lu2/p;->b:I

    .line 98
    .line 99
    const/4 v8, 0x3

    .line 100
    if-ne v4, v8, :cond_2

    .line 101
    .line 102
    const/4 v8, 0x1

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    const/4 v8, 0x0

    .line 105
    :goto_3
    and-int/2addr v14, v8

    .line 106
    if-ne v4, v11, :cond_3

    .line 107
    .line 108
    const/16 v16, 0x1

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_3
    if-ne v4, v10, :cond_4

    .line 112
    .line 113
    const/4 v15, 0x1

    .line 114
    :cond_4
    :goto_4
    add-int/lit8 v13, v13, 0x1

    .line 115
    .line 116
    const/4 v4, 0x0

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    const/4 v14, 0x1

    .line 119
    const/4 v15, 0x0

    .line 120
    const/16 v16, 0x0

    .line 121
    .line 122
    :cond_6
    const/4 v4, 0x0

    .line 123
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-nez v8, :cond_8

    .line 128
    .line 129
    if-eqz v9, :cond_7

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const-string v0, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 140
    .line 141
    const/4 v1, 0x1

    .line 142
    invoke-static {v1, v0}, Landroidx/room/w0;->a(ILjava/lang/String;)Landroidx/room/w0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v0, v1, v4}, Landroidx/room/w0;->t(ILjava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v4

    .line 150
    :cond_8
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    const/4 v12, 0x0

    .line 155
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v13

    .line 159
    if-eqz v13, :cond_15

    .line 160
    .line 161
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v13

    .line 165
    check-cast v13, Ll2/u;

    .line 166
    .line 167
    iget-object v4, v13, Ll2/u;->b:Lu2/p;

    .line 168
    .line 169
    iget-object v10, v13, Ll2/u;->a:Ljava/util/UUID;

    .line 170
    .line 171
    if-eqz v9, :cond_b

    .line 172
    .line 173
    if-nez v14, :cond_b

    .line 174
    .line 175
    if-eqz v16, :cond_9

    .line 176
    .line 177
    iput v11, v4, Lu2/p;->b:I

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_9
    if-eqz v15, :cond_a

    .line 181
    .line 182
    const/4 v11, 0x6

    .line 183
    iput v11, v4, Lu2/p;->b:I

    .line 184
    .line 185
    goto :goto_7

    .line 186
    :cond_a
    const/4 v11, 0x5

    .line 187
    iput v11, v4, Lu2/p;->b:I

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_b
    iput-wide v5, v4, Lu2/p;->n:J

    .line 191
    .line 192
    :goto_7
    iget v11, v4, Lu2/p;->b:I

    .line 193
    .line 194
    move-object/from16 v17, v3

    .line 195
    .line 196
    const/4 v3, 0x1

    .line 197
    if-ne v11, v3, :cond_c

    .line 198
    .line 199
    const/4 v12, 0x1

    .line 200
    :cond_c
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    iget-object v11, v2, Lm2/r;->e:Ljava/util/List;

    .line 205
    .line 206
    move-object/from16 v18, v2

    .line 207
    .line 208
    const-string v2, "schedulers"

    .line 209
    .line 210
    invoke-static {v11, v2}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    iget-object v2, v4, Lu2/p;->e:Ll2/h;

    .line 214
    .line 215
    move-wide/from16 v19, v5

    .line 216
    .line 217
    const-string v5, "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"

    .line 218
    .line 219
    invoke-virtual {v2, v5}, Ll2/h;->c(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v2

    .line 223
    iget-object v6, v4, Lu2/p;->e:Ll2/h;

    .line 224
    .line 225
    move/from16 v21, v2

    .line 226
    .line 227
    const-string v2, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"

    .line 228
    .line 229
    invoke-virtual {v6, v2}, Ll2/h;->c(Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v2

    .line 233
    iget-object v6, v4, Lu2/p;->e:Ll2/h;

    .line 234
    .line 235
    move/from16 v22, v2

    .line 236
    .line 237
    const-string v2, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"

    .line 238
    .line 239
    invoke-virtual {v6, v2}, Ll2/h;->c(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v21, :cond_d

    .line 244
    .line 245
    if-eqz v22, :cond_d

    .line 246
    .line 247
    if-eqz v2, :cond_d

    .line 248
    .line 249
    iget-object v2, v4, Lu2/p;->c:Ljava/lang/String;

    .line 250
    .line 251
    new-instance v6, Landroidx/room/m0;

    .line 252
    .line 253
    move-object/from16 v21, v7

    .line 254
    .line 255
    const/4 v7, 0x2

    .line 256
    invoke-direct {v6, v7}, Landroidx/room/m0;-><init>(I)V

    .line 257
    .line 258
    .line 259
    iget-object v7, v4, Lu2/p;->e:Ll2/h;

    .line 260
    .line 261
    move/from16 v22, v8

    .line 262
    .line 263
    const-string v8, "data"

    .line 264
    .line 265
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    iget-object v7, v7, Ll2/h;->a:Ljava/util/HashMap;

    .line 269
    .line 270
    invoke-virtual {v6, v7}, Landroidx/room/m0;->d(Ljava/util/HashMap;)V

    .line 271
    .line 272
    .line 273
    iget-object v7, v6, Landroidx/room/m0;->a:Ljava/util/LinkedHashMap;

    .line 274
    .line 275
    invoke-interface {v7, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v6}, Landroidx/room/m0;->b()Ll2/h;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    const-string v5, "androidx.work.multiprocess.RemoteListenableDelegatingWorker"

    .line 283
    .line 284
    invoke-static {v4, v5, v2}, Lu2/p;->b(Lu2/p;Ljava/lang/String;Ll2/h;)Lu2/p;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    goto :goto_8

    .line 289
    :cond_d
    move-object/from16 v21, v7

    .line 290
    .line 291
    move/from16 v22, v8

    .line 292
    .line 293
    :goto_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 294
    .line 295
    const/16 v5, 0x17

    .line 296
    .line 297
    if-gt v5, v2, :cond_e

    .line 298
    .line 299
    const/16 v5, 0x1a

    .line 300
    .line 301
    if-ge v2, v5, :cond_e

    .line 302
    .line 303
    invoke-static {v4}, Lv2/h;->d(Lu2/p;)Lu2/p;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    goto :goto_9

    .line 308
    :cond_e
    const/16 v5, 0x16

    .line 309
    .line 310
    if-gt v2, v5, :cond_11

    .line 311
    .line 312
    const-string v2, "androidx.work.impl.background.gcm.GcmScheduler"

    .line 313
    .line 314
    :try_start_0
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_f

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_f
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    :cond_10
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v6

    .line 333
    if-eqz v6, :cond_11

    .line 334
    .line 335
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    check-cast v6, Lm2/f;

    .line 340
    .line 341
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    move-result-object v6

    .line 345
    invoke-virtual {v2, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 346
    .line 347
    .line 348
    move-result v6
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 349
    if-eqz v6, :cond_10

    .line 350
    .line 351
    invoke-static {v4}, Lv2/h;->d(Lu2/p;)Lu2/p;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    :catch_0
    :cond_11
    :goto_9
    iget-object v2, v3, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 356
    .line 357
    invoke-virtual {v2}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v2}, Landroidx/room/r0;->beginTransaction()V

    .line 361
    .line 362
    .line 363
    :try_start_1
    iget-object v3, v3, Lu2/s;->b:Lu2/b;

    .line 364
    .line 365
    invoke-virtual {v3, v4}, Lu2/b;->e(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v2}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    .line 372
    .line 373
    .line 374
    const-string v2, "id.toString()"

    .line 375
    .line 376
    if-eqz v9, :cond_12

    .line 377
    .line 378
    array-length v3, v1

    .line 379
    const/4 v4, 0x0

    .line 380
    :goto_a
    if-ge v4, v3, :cond_12

    .line 381
    .line 382
    aget-object v5, v1, v4

    .line 383
    .line 384
    new-instance v6, Lu2/a;

    .line 385
    .line 386
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v7

    .line 390
    invoke-static {v7, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    invoke-direct {v6, v7, v5}, Lu2/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v21 .. v21}, Landroidx/work/impl/WorkDatabase;->b()Lu2/c;

    .line 397
    .line 398
    .line 399
    move-result-object v5

    .line 400
    iget-object v7, v5, Lu2/c;->h:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v7, Landroidx/work/impl/WorkDatabase_Impl;

    .line 403
    .line 404
    invoke-virtual {v7}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v7}, Landroidx/room/r0;->beginTransaction()V

    .line 408
    .line 409
    .line 410
    :try_start_2
    iget-object v5, v5, Lu2/c;->i:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v5, Lu2/b;

    .line 413
    .line 414
    invoke-virtual {v5, v6}, Lu2/b;->e(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v7}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 418
    .line 419
    .line 420
    invoke-virtual {v7}, Landroidx/room/r0;->endTransaction()V

    .line 421
    .line 422
    .line 423
    add-int/lit8 v4, v4, 0x1

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :catchall_0
    move-exception v0

    .line 427
    invoke-virtual {v7}, Landroidx/room/r0;->endTransaction()V

    .line 428
    .line 429
    .line 430
    throw v0

    .line 431
    :cond_12
    invoke-virtual/range {v21 .. v21}, Landroidx/work/impl/WorkDatabase;->h()Lu2/u;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    invoke-static {v4, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget-object v5, v13, Ll2/u;->c:Ljava/util/Set;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    const-string v6, "tags"

    .line 448
    .line 449
    invoke-static {v5, v6}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    :goto_b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    if-eqz v6, :cond_13

    .line 461
    .line 462
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    check-cast v6, Ljava/lang/String;

    .line 467
    .line 468
    new-instance v7, Lu2/t;

    .line 469
    .line 470
    invoke-direct {v7, v6, v4}, Lu2/t;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    iget-object v6, v3, Lu2/u;->h:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v6, Landroidx/work/impl/WorkDatabase_Impl;

    .line 476
    .line 477
    invoke-virtual {v6}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v6}, Landroidx/room/r0;->beginTransaction()V

    .line 481
    .line 482
    .line 483
    :try_start_3
    iget-object v8, v3, Lu2/u;->i:Ljava/lang/Object;

    .line 484
    .line 485
    check-cast v8, Lu2/b;

    .line 486
    .line 487
    invoke-virtual {v8, v7}, Lu2/b;->e(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v6}, Landroidx/room/r0;->setTransactionSuccessful()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 491
    .line 492
    .line 493
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 494
    .line 495
    .line 496
    goto :goto_b

    .line 497
    :catchall_1
    move-exception v0

    .line 498
    invoke-virtual {v6}, Landroidx/room/r0;->endTransaction()V

    .line 499
    .line 500
    .line 501
    throw v0

    .line 502
    :cond_13
    if-eqz v22, :cond_14

    .line 503
    .line 504
    move-object/from16 v3, v17

    .line 505
    .line 506
    move-object/from16 v2, v18

    .line 507
    .line 508
    move-wide/from16 v5, v19

    .line 509
    .line 510
    move-object/from16 v7, v21

    .line 511
    .line 512
    move/from16 v8, v22

    .line 513
    .line 514
    const/4 v4, 0x0

    .line 515
    const/4 v10, 0x6

    .line 516
    const/4 v11, 0x4

    .line 517
    goto/16 :goto_6

    .line 518
    .line 519
    :cond_14
    invoke-virtual/range {v21 .. v21}, Landroidx/work/impl/WorkDatabase;->e()Lu2/l;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v10}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-static {v0, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    const-string v0, "name"

    .line 530
    .line 531
    const/4 v1, 0x0

    .line 532
    invoke-static {v1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    throw v1

    .line 536
    :catchall_2
    move-exception v0

    .line 537
    invoke-virtual {v2}, Landroidx/room/r0;->endTransaction()V

    .line 538
    .line 539
    .line 540
    throw v0

    .line 541
    :cond_15
    move v4, v12

    .line 542
    goto/16 :goto_2

    .line 543
    .line 544
    :goto_c
    iput-boolean v1, v0, Lm2/o;->e:Z

    .line 545
    .line 546
    return v4
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
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
.end method
