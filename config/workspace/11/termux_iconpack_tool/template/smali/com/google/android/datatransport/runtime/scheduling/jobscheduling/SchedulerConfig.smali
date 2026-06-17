.class public abstract Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;,
        Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;,
        Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Flag;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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

.method public static b(Lcom/google/android/datatransport/runtime/time/Clock;)Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;

    .line 7
    .line 8
    invoke-direct {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    sget-object v2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 12
    .line 13
    const-string v3, "Null flags"

    .line 14
    .line 15
    if-eqz v2, :cond_5

    .line 16
    .line 17
    iput-object v2, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->c:Ljava/util/Set;

    .line 18
    .line 19
    const-wide/16 v4, 0x7530

    .line 20
    .line 21
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iput-object v4, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a:Ljava/lang/Long;

    .line 26
    .line 27
    const-wide/32 v4, 0x5265c00

    .line 28
    .line 29
    .line 30
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iput-object v4, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->b:Ljava/lang/Long;

    .line 35
    .line 36
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a()Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v5, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 41
    .line 42
    sget-object v6, Lcom/google/android/datatransport/Priority;->h:Lcom/google/android/datatransport/Priority;

    .line 43
    .line 44
    invoke-virtual {v5, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;

    .line 48
    .line 49
    invoke-direct {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;-><init>()V

    .line 50
    .line 51
    .line 52
    if-eqz v2, :cond_4

    .line 53
    .line 54
    iput-object v2, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->c:Ljava/util/Set;

    .line 55
    .line 56
    const-wide/16 v5, 0x3e8

    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    iput-object v5, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a:Ljava/lang/Long;

    .line 63
    .line 64
    iput-object v4, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->b:Ljava/lang/Long;

    .line 65
    .line 66
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a()Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v5, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 71
    .line 72
    sget-object v6, Lcom/google/android/datatransport/Priority;->j:Lcom/google/android/datatransport/Priority;

    .line 73
    .line 74
    invoke-virtual {v5, v6, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;

    .line 78
    .line 79
    invoke-direct {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;-><init>()V

    .line 80
    .line 81
    .line 82
    if-eqz v2, :cond_3

    .line 83
    .line 84
    iput-object v2, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->c:Ljava/util/Set;

    .line 85
    .line 86
    iput-object v4, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a:Ljava/lang/Long;

    .line 87
    .line 88
    iput-object v4, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->b:Ljava/lang/Long;

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    new-array v2, v2, [Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Flag;

    .line 92
    .line 93
    sget-object v4, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Flag;->i:Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Flag;

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    aput-object v4, v2, v5

    .line 97
    .line 98
    new-instance v4, Ljava/util/HashSet;

    .line 99
    .line 100
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-direct {v4, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-eqz v2, :cond_2

    .line 112
    .line 113
    iput-object v2, v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->c:Ljava/util/Set;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig_ConfigValue$Builder;->a()Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iget-object v2, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 120
    .line 121
    sget-object v3, Lcom/google/android/datatransport/Priority;->i:Lcom/google/android/datatransport/Priority;

    .line 122
    .line 123
    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    iput-object p0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->a:Lcom/google/android/datatransport/runtime/time/Clock;

    .line 127
    .line 128
    if-eqz p0, :cond_1

    .line 129
    .line 130
    iget-object p0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    invoke-static {}, Lcom/google/android/datatransport/Priority;->values()[Lcom/google/android/datatransport/Priority;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    array-length v1, v1

    .line 145
    if-lt p0, v1, :cond_0

    .line 146
    .line 147
    iget-object p0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 148
    .line 149
    new-instance v1, Ljava/util/HashMap;

    .line 150
    .line 151
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 152
    .line 153
    .line 154
    iput-object v1, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->b:Ljava/util/HashMap;

    .line 155
    .line 156
    iget-object v0, v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$Builder;->a:Lcom/google/android/datatransport/runtime/time/Clock;

    .line 157
    .line 158
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig;

    .line 159
    .line 160
    invoke-direct {v1, v0, p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/AutoValue_SchedulerConfig;-><init>(Lcom/google/android/datatransport/runtime/time/Clock;Ljava/util/Map;)V

    .line 161
    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 165
    .line 166
    const-string v0, "Not all priorities have been configured"

    .line 167
    .line 168
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw p0

    .line 172
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 173
    .line 174
    const-string v0, "missing required property: clock"

    .line 175
    .line 176
    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_2
    new-instance p0, Ljava/lang/NullPointerException;

    .line 181
    .line 182
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw p0

    .line 186
    :cond_3
    new-instance p0, Ljava/lang/NullPointerException;

    .line 187
    .line 188
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    throw p0

    .line 192
    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    .line 193
    .line 194
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw p0

    .line 198
    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    .line 199
    .line 200
    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw p0
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
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
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


# virtual methods
.method public abstract a()Lcom/google/android/datatransport/runtime/time/Clock;
.end method

.method public final c(Lcom/google/android/datatransport/Priority;JI)J
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig;->a()Lcom/google/android/datatransport/runtime/time/Clock;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lcom/google/android/datatransport/runtime/time/Clock;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sub-long/2addr p2, v0

    .line 10
    invoke-virtual {p0}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig;->d()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;->a()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    add-int/lit8 p4, p4, -0x1

    .line 25
    .line 26
    const-wide/16 v2, 0x1

    .line 27
    .line 28
    cmp-long v4, v0, v2

    .line 29
    .line 30
    if-lez v4, :cond_0

    .line 31
    .line 32
    move-wide v2, v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-wide/16 v2, 0x2

    .line 35
    .line 36
    :goto_0
    const-wide v4, 0x40c3880000000000L    # 10000.0

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    .line 42
    .line 43
    .line 44
    move-result-wide v4

    .line 45
    int-to-long v6, p4

    .line 46
    mul-long v2, v2, v6

    .line 47
    .line 48
    long-to-double v2, v2

    .line 49
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    div-double/2addr v4, v2

    .line 54
    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    .line 55
    .line 56
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(DD)D

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    const-wide/high16 v4, 0x4008000000000000L    # 3.0

    .line 61
    .line 62
    int-to-double v6, p4

    .line 63
    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->pow(DD)D

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    long-to-double v0, v0

    .line 68
    mul-double v4, v4, v0

    .line 69
    .line 70
    mul-double v4, v4, v2

    .line 71
    .line 72
    double-to-long v0, v4

    .line 73
    invoke-static {v0, v1, p2, p3}, Ljava/lang/Math;->max(JJ)J

    .line 74
    .line 75
    .line 76
    move-result-wide p2

    .line 77
    invoke-virtual {p1}, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/SchedulerConfig$ConfigValue;->c()J

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 82
    .line 83
    .line 84
    move-result-wide p1

    .line 85
    return-wide p1
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

.method public abstract d()Ljava/util/Map;
.end method
