.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "parameters"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    return-void
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
.method public final a()Ll2/q;
    .locals 85

    .line 1
    invoke-virtual/range {p0 .. p0}, Ll2/s;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lm2/r;->e(Landroid/content/Context;)Lm2/r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, v0, Lm2/r;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    const-string v2, "workManager.workDatabase"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->g()Lu2/s;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->e()Lu2/l;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->h()Lu2/u;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->d()Lu2/i;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v0, v0, Lm2/r;->b:Ll2/a;

    .line 33
    .line 34
    iget-object v0, v0, Ll2/a;->d:Ll2/a0;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 44
    .line 45
    const-wide/16 v7, 0x1

    .line 46
    .line 47
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v7

    .line 51
    sub-long/2addr v5, v7

    .line 52
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    const-string v7, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC"

    .line 57
    .line 58
    invoke-static {v0, v7}, Landroidx/room/w0;->a(ILjava/lang/String;)Landroidx/room/w0;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-virtual {v7, v0, v5, v6}, Landroidx/room/w0;->i(IJ)V

    .line 63
    .line 64
    .line 65
    iget-object v5, v2, Lu2/s;->a:Landroidx/work/impl/WorkDatabase_Impl;

    .line 66
    .line 67
    invoke-virtual {v5}, Landroidx/room/r0;->assertNotSuspendingTransaction()V

    .line 68
    .line 69
    .line 70
    const/4 v6, 0x0

    .line 71
    invoke-static {v5, v7, v6}, Lu2/f;->C(Landroidx/room/r0;Lz1/h;Z)Landroid/database/Cursor;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    :try_start_0
    const-string v8, "id"

    .line 76
    .line 77
    invoke-static {v5, v8}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    const-string v9, "state"

    .line 82
    .line 83
    invoke-static {v5, v9}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    const-string v10, "worker_class_name"

    .line 88
    .line 89
    invoke-static {v5, v10}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v10

    .line 93
    const-string v11, "input_merger_class_name"

    .line 94
    .line 95
    invoke-static {v5, v11}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    const-string v12, "input"

    .line 100
    .line 101
    invoke-static {v5, v12}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    const-string v13, "output"

    .line 106
    .line 107
    invoke-static {v5, v13}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    const-string v14, "initial_delay"

    .line 112
    .line 113
    invoke-static {v5, v14}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    move-result v14

    .line 117
    const-string v15, "interval_duration"

    .line 118
    .line 119
    invoke-static {v5, v15}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v15

    .line 123
    const-string v0, "flex_duration"

    .line 124
    .line 125
    invoke-static {v5, v0}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const-string v6, "run_attempt_count"

    .line 130
    .line 131
    invoke-static {v5, v6}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 132
    .line 133
    .line 134
    move-result v6

    .line 135
    move-object/from16 v16, v2

    .line 136
    .line 137
    const-string v2, "backoff_policy"

    .line 138
    .line 139
    invoke-static {v5, v2}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 143
    move-object/from16 v17, v7

    .line 144
    .line 145
    :try_start_1
    const-string v7, "backoff_delay_duration"

    .line 146
    .line 147
    invoke-static {v5, v7}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    move-object/from16 v18, v1

    .line 152
    .line 153
    const-string v1, "last_enqueue_time"

    .line 154
    .line 155
    invoke-static {v5, v1}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    move-object/from16 v19, v3

    .line 160
    .line 161
    const-string v3, "minimum_retention_duration"

    .line 162
    .line 163
    invoke-static {v5, v3}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    move-object/from16 v20, v4

    .line 168
    .line 169
    const-string v4, "schedule_requested_at"

    .line 170
    .line 171
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    move/from16 v21, v4

    .line 176
    .line 177
    const-string v4, "run_in_foreground"

    .line 178
    .line 179
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    move/from16 v22, v4

    .line 184
    .line 185
    const-string v4, "out_of_quota_policy"

    .line 186
    .line 187
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    move/from16 v23, v4

    .line 192
    .line 193
    const-string v4, "period_count"

    .line 194
    .line 195
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 196
    .line 197
    .line 198
    move-result v4

    .line 199
    move/from16 v24, v4

    .line 200
    .line 201
    const-string v4, "generation"

    .line 202
    .line 203
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    move/from16 v25, v4

    .line 208
    .line 209
    const-string v4, "next_schedule_time_override"

    .line 210
    .line 211
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    move/from16 v26, v4

    .line 216
    .line 217
    const-string v4, "next_schedule_time_override_generation"

    .line 218
    .line 219
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    move/from16 v27, v4

    .line 224
    .line 225
    const-string v4, "stop_reason"

    .line 226
    .line 227
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 228
    .line 229
    .line 230
    move-result v4

    .line 231
    move/from16 v28, v4

    .line 232
    .line 233
    const-string v4, "trace_tag"

    .line 234
    .line 235
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    move/from16 v29, v4

    .line 240
    .line 241
    const-string v4, "required_network_type"

    .line 242
    .line 243
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v4

    .line 247
    move/from16 v30, v4

    .line 248
    .line 249
    const-string v4, "required_network_request"

    .line 250
    .line 251
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    move/from16 v31, v4

    .line 256
    .line 257
    const-string v4, "requires_charging"

    .line 258
    .line 259
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    move/from16 v32, v4

    .line 264
    .line 265
    const-string v4, "requires_device_idle"

    .line 266
    .line 267
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    move/from16 v33, v4

    .line 272
    .line 273
    const-string v4, "requires_battery_not_low"

    .line 274
    .line 275
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 276
    .line 277
    .line 278
    move-result v4

    .line 279
    move/from16 v34, v4

    .line 280
    .line 281
    const-string v4, "requires_storage_not_low"

    .line 282
    .line 283
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 284
    .line 285
    .line 286
    move-result v4

    .line 287
    move/from16 v35, v4

    .line 288
    .line 289
    const-string v4, "trigger_content_update_delay"

    .line 290
    .line 291
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 292
    .line 293
    .line 294
    move-result v4

    .line 295
    move/from16 v36, v4

    .line 296
    .line 297
    const-string v4, "trigger_max_content_delay"

    .line 298
    .line 299
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    move/from16 v37, v4

    .line 304
    .line 305
    const-string v4, "content_uri_triggers"

    .line 306
    .line 307
    invoke-static {v5, v4}, Lq3/a;->G(Landroid/database/Cursor;Ljava/lang/String;)I

    .line 308
    .line 309
    .line 310
    move-result v4

    .line 311
    move/from16 v38, v4

    .line 312
    .line 313
    new-instance v4, Ljava/util/ArrayList;

    .line 314
    .line 315
    move/from16 v39, v3

    .line 316
    .line 317
    invoke-interface {v5}, Landroid/database/Cursor;->getCount()I

    .line 318
    .line 319
    .line 320
    move-result v3

    .line 321
    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 322
    .line 323
    .line 324
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_6

    .line 329
    .line 330
    invoke-interface {v5, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v41

    .line 334
    invoke-interface {v5, v9}, Landroid/database/Cursor;->getInt(I)I

    .line 335
    .line 336
    .line 337
    move-result v3

    .line 338
    invoke-static {v3}, Le6/d;->x(I)I

    .line 339
    .line 340
    .line 341
    move-result v42

    .line 342
    invoke-interface {v5, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-result-object v43

    .line 346
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v44

    .line 350
    invoke-interface {v5, v12}, Landroid/database/Cursor;->getBlob(I)[B

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    invoke-static {v3}, Ll2/h;->a([B)Ll2/h;

    .line 355
    .line 356
    .line 357
    move-result-object v45

    .line 358
    invoke-interface {v5, v13}, Landroid/database/Cursor;->getBlob(I)[B

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static {v3}, Ll2/h;->a([B)Ll2/h;

    .line 363
    .line 364
    .line 365
    move-result-object v46

    .line 366
    invoke-interface {v5, v14}, Landroid/database/Cursor;->getLong(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v47

    .line 370
    invoke-interface {v5, v15}, Landroid/database/Cursor;->getLong(I)J

    .line 371
    .line 372
    .line 373
    move-result-wide v49

    .line 374
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 375
    .line 376
    .line 377
    move-result-wide v51

    .line 378
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getInt(I)I

    .line 379
    .line 380
    .line 381
    move-result v54

    .line 382
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getInt(I)I

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    invoke-static {v3}, Le6/d;->u(I)I

    .line 387
    .line 388
    .line 389
    move-result v55

    .line 390
    invoke-interface {v5, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 391
    .line 392
    .line 393
    move-result-wide v56

    .line 394
    invoke-interface {v5, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 395
    .line 396
    .line 397
    move-result-wide v58

    .line 398
    move/from16 v3, v39

    .line 399
    .line 400
    invoke-interface {v5, v3}, Landroid/database/Cursor;->getLong(I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v60

    .line 404
    move/from16 v39, v0

    .line 405
    .line 406
    move/from16 v0, v21

    .line 407
    .line 408
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 409
    .line 410
    .line 411
    move-result-wide v62

    .line 412
    move/from16 v21, v0

    .line 413
    .line 414
    move/from16 v0, v22

    .line 415
    .line 416
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 417
    .line 418
    .line 419
    move-result v22

    .line 420
    if-eqz v22, :cond_0

    .line 421
    .line 422
    const/16 v64, 0x1

    .line 423
    .line 424
    :goto_1
    move/from16 v22, v0

    .line 425
    .line 426
    move/from16 v0, v23

    .line 427
    .line 428
    goto :goto_2

    .line 429
    :cond_0
    const/16 v64, 0x0

    .line 430
    .line 431
    goto :goto_1

    .line 432
    :goto_2
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 433
    .line 434
    .line 435
    move-result v23

    .line 436
    invoke-static/range {v23 .. v23}, Le6/d;->w(I)I

    .line 437
    .line 438
    .line 439
    move-result v65

    .line 440
    move/from16 v23, v0

    .line 441
    .line 442
    move/from16 v0, v24

    .line 443
    .line 444
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 445
    .line 446
    .line 447
    move-result v66

    .line 448
    move/from16 v24, v0

    .line 449
    .line 450
    move/from16 v0, v25

    .line 451
    .line 452
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 453
    .line 454
    .line 455
    move-result v67

    .line 456
    move/from16 v25, v0

    .line 457
    .line 458
    move/from16 v0, v26

    .line 459
    .line 460
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 461
    .line 462
    .line 463
    move-result-wide v68

    .line 464
    move/from16 v26, v0

    .line 465
    .line 466
    move/from16 v0, v27

    .line 467
    .line 468
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 469
    .line 470
    .line 471
    move-result v70

    .line 472
    move/from16 v27, v0

    .line 473
    .line 474
    move/from16 v0, v28

    .line 475
    .line 476
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 477
    .line 478
    .line 479
    move-result v71

    .line 480
    move/from16 v28, v0

    .line 481
    .line 482
    move/from16 v0, v29

    .line 483
    .line 484
    invoke-interface {v5, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 485
    .line 486
    .line 487
    move-result v29

    .line 488
    if-eqz v29, :cond_1

    .line 489
    .line 490
    const/16 v29, 0x0

    .line 491
    .line 492
    :goto_3
    move-object/from16 v72, v29

    .line 493
    .line 494
    move/from16 v29, v0

    .line 495
    .line 496
    move/from16 v0, v30

    .line 497
    .line 498
    goto :goto_4

    .line 499
    :cond_1
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v29

    .line 503
    goto :goto_3

    .line 504
    :goto_4
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 505
    .line 506
    .line 507
    move-result v30

    .line 508
    invoke-static/range {v30 .. v30}, Le6/d;->v(I)I

    .line 509
    .line 510
    .line 511
    move-result v75

    .line 512
    move/from16 v30, v0

    .line 513
    .line 514
    move/from16 v0, v31

    .line 515
    .line 516
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 517
    .line 518
    .line 519
    move-result-object v31

    .line 520
    invoke-static/range {v31 .. v31}, Le6/d;->W([B)Lv2/g;

    .line 521
    .line 522
    .line 523
    move-result-object v74

    .line 524
    move/from16 v31, v0

    .line 525
    .line 526
    move/from16 v0, v32

    .line 527
    .line 528
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 529
    .line 530
    .line 531
    move-result v32

    .line 532
    if-eqz v32, :cond_2

    .line 533
    .line 534
    const/16 v76, 0x1

    .line 535
    .line 536
    :goto_5
    move/from16 v32, v0

    .line 537
    .line 538
    move/from16 v0, v33

    .line 539
    .line 540
    goto :goto_6

    .line 541
    :cond_2
    const/16 v76, 0x0

    .line 542
    .line 543
    goto :goto_5

    .line 544
    :goto_6
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 545
    .line 546
    .line 547
    move-result v33

    .line 548
    if-eqz v33, :cond_3

    .line 549
    .line 550
    const/16 v77, 0x1

    .line 551
    .line 552
    :goto_7
    move/from16 v33, v0

    .line 553
    .line 554
    move/from16 v0, v34

    .line 555
    .line 556
    goto :goto_8

    .line 557
    :cond_3
    const/16 v77, 0x0

    .line 558
    .line 559
    goto :goto_7

    .line 560
    :goto_8
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 561
    .line 562
    .line 563
    move-result v34

    .line 564
    if-eqz v34, :cond_4

    .line 565
    .line 566
    const/16 v78, 0x1

    .line 567
    .line 568
    :goto_9
    move/from16 v34, v0

    .line 569
    .line 570
    move/from16 v0, v35

    .line 571
    .line 572
    goto :goto_a

    .line 573
    :cond_4
    const/16 v78, 0x0

    .line 574
    .line 575
    goto :goto_9

    .line 576
    :goto_a
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getInt(I)I

    .line 577
    .line 578
    .line 579
    move-result v35

    .line 580
    if-eqz v35, :cond_5

    .line 581
    .line 582
    const/16 v79, 0x1

    .line 583
    .line 584
    :goto_b
    move/from16 v35, v0

    .line 585
    .line 586
    move/from16 v0, v36

    .line 587
    .line 588
    goto :goto_c

    .line 589
    :cond_5
    const/16 v79, 0x0

    .line 590
    .line 591
    goto :goto_b

    .line 592
    :goto_c
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 593
    .line 594
    .line 595
    move-result-wide v80

    .line 596
    move/from16 v36, v0

    .line 597
    .line 598
    move/from16 v0, v37

    .line 599
    .line 600
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v82

    .line 604
    move/from16 v37, v0

    .line 605
    .line 606
    move/from16 v0, v38

    .line 607
    .line 608
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getBlob(I)[B

    .line 609
    .line 610
    .line 611
    move-result-object v38

    .line 612
    invoke-static/range {v38 .. v38}, Le6/d;->d([B)Ljava/util/LinkedHashSet;

    .line 613
    .line 614
    .line 615
    move-result-object v84

    .line 616
    new-instance v53, Ll2/d;

    .line 617
    .line 618
    move-object/from16 v73, v53

    .line 619
    .line 620
    invoke-direct/range {v73 .. v84}, Ll2/d;-><init>(Lv2/g;IZZZZJJLjava/util/Set;)V

    .line 621
    .line 622
    .line 623
    move-object/from16 v53, v73

    .line 624
    .line 625
    new-instance v40, Lu2/p;

    .line 626
    .line 627
    invoke-direct/range {v40 .. v72}, Lu2/p;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ll2/h;Ll2/h;JJJLl2/d;IIJJJJZIIIJIILjava/lang/String;)V

    .line 628
    .line 629
    .line 630
    move/from16 v38, v0

    .line 631
    .line 632
    move-object/from16 v0, v40

    .line 633
    .line 634
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 635
    .line 636
    .line 637
    move/from16 v0, v39

    .line 638
    .line 639
    move/from16 v39, v3

    .line 640
    .line 641
    goto/16 :goto_0

    .line 642
    .line 643
    :catchall_0
    move-exception v0

    .line 644
    goto/16 :goto_e

    .line 645
    .line 646
    :cond_6
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 647
    .line 648
    .line 649
    invoke-virtual/range {v17 .. v17}, Landroidx/room/w0;->b()V

    .line 650
    .line 651
    .line 652
    invoke-virtual/range {v16 .. v16}, Lu2/s;->f()Ljava/util/ArrayList;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-virtual/range {v16 .. v16}, Lu2/s;->c()Ljava/util/ArrayList;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 661
    .line 662
    .line 663
    move-result v2

    .line 664
    if-nez v2, :cond_7

    .line 665
    .line 666
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    sget-object v3, Lx2/h;->a:Ljava/lang/String;

    .line 671
    .line 672
    const-string v5, "Recently completed work:\n\n"

    .line 673
    .line 674
    invoke-virtual {v2, v3, v5}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 675
    .line 676
    .line 677
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    move-object/from16 v7, v18

    .line 682
    .line 683
    move-object/from16 v5, v19

    .line 684
    .line 685
    move-object/from16 v6, v20

    .line 686
    .line 687
    invoke-static {v5, v6, v7, v4}, Lx2/h;->a(Lu2/l;Lu2/u;Lu2/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v4

    .line 691
    invoke-virtual {v2, v3, v4}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    goto :goto_d

    .line 695
    :cond_7
    move-object/from16 v7, v18

    .line 696
    .line 697
    move-object/from16 v5, v19

    .line 698
    .line 699
    move-object/from16 v6, v20

    .line 700
    .line 701
    :goto_d
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 702
    .line 703
    .line 704
    move-result v2

    .line 705
    if-nez v2, :cond_8

    .line 706
    .line 707
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    sget-object v3, Lx2/h;->a:Ljava/lang/String;

    .line 712
    .line 713
    const-string v4, "Running work:\n\n"

    .line 714
    .line 715
    invoke-virtual {v2, v3, v4}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 716
    .line 717
    .line 718
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 719
    .line 720
    .line 721
    move-result-object v2

    .line 722
    invoke-static {v5, v6, v7, v0}, Lx2/h;->a(Lu2/l;Lu2/u;Lu2/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v0

    .line 726
    invoke-virtual {v2, v3, v0}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    if-nez v0, :cond_9

    .line 734
    .line 735
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    sget-object v2, Lx2/h;->a:Ljava/lang/String;

    .line 740
    .line 741
    const-string v3, "Enqueued work:\n\n"

    .line 742
    .line 743
    invoke-virtual {v0, v2, v3}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    invoke-static {}, Ll2/t;->e()Ll2/t;

    .line 747
    .line 748
    .line 749
    move-result-object v0

    .line 750
    invoke-static {v5, v6, v7, v1}, Lx2/h;->a(Lu2/l;Lu2/u;Lu2/i;Ljava/util/ArrayList;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    invoke-virtual {v0, v2, v1}, Ll2/t;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    :cond_9
    new-instance v0, Ll2/q;

    .line 758
    .line 759
    sget-object v1, Ll2/h;->b:Ll2/h;

    .line 760
    .line 761
    invoke-direct {v0, v1}, Ll2/q;-><init>(Ll2/h;)V

    .line 762
    .line 763
    .line 764
    return-object v0

    .line 765
    :catchall_1
    move-exception v0

    .line 766
    move-object/from16 v17, v7

    .line 767
    .line 768
    :goto_e
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 769
    .line 770
    .line 771
    invoke-virtual/range {v17 .. v17}, Landroidx/room/w0;->b()V

    .line 772
    .line 773
    .line 774
    throw v0
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
