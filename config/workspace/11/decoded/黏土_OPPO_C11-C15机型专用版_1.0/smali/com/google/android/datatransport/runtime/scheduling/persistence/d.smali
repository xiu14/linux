.class public final synthetic Lcom/google/android/datatransport/runtime/scheduling/persistence/d;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"

# interfaces
.implements Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Function;


# instance fields
.field public final synthetic a:Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;

.field public final synthetic b:Lcom/google/android/datatransport/runtime/TransportContext;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;Lcom/google/android/datatransport/runtime/TransportContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/d;->a:Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/d;->b:Lcom/google/android/datatransport/runtime/TransportContext;

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
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/database/sqlite/SQLiteDatabase;

    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/d;->a:Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;

    .line 5
    .line 6
    iget-object v1, p1, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->k:Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStoreConfig;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStoreConfig;->c()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget-object v3, p0, Lcom/google/android/datatransport/runtime/scheduling/persistence/d;->b:Lcom/google/android/datatransport/runtime/TransportContext;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v3, v2}, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->z(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/datatransport/runtime/TransportContext;I)Ljava/util/ArrayList;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    invoke-static {}, Lcom/google/android/datatransport/Priority;->values()[Lcom/google/android/datatransport/Priority;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    array-length v4, v2

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    :goto_0
    if-ge v6, v4, :cond_2

    .line 26
    .line 27
    aget-object v7, v2, v6

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/google/android/datatransport/runtime/TransportContext;->d()Lcom/google/android/datatransport/Priority;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    if-ne v7, v9, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/EventStoreConfig;->c()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v10

    .line 44
    sub-int/2addr v9, v10

    .line 45
    if-gtz v9, :cond_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    invoke-virtual {v3, v7}, Lcom/google/android/datatransport/runtime/TransportContext;->e(Lcom/google/android/datatransport/Priority;)Lcom/google/android/datatransport/runtime/TransportContext;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    invoke-virtual {p1, v0, v7, v9}, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->z(Landroid/database/sqlite/SQLiteDatabase;Lcom/google/android/datatransport/runtime/TransportContext;I)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 57
    .line 58
    .line 59
    :goto_1
    add-int/lit8 v6, v6, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    :goto_2
    new-instance p1, Ljava/util/HashMap;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "event_id IN ("

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-ge v5, v2, :cond_4

    .line 79
    .line 80
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->b()J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    add-int/lit8 v2, v2, -0x1

    .line 98
    .line 99
    if-ge v5, v2, :cond_3

    .line 100
    .line 101
    const/16 v2, 0x2c

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    const/16 v2, 0x29

    .line 110
    .line 111
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v2, "name"

    .line 115
    .line 116
    const-string v3, "value"

    .line 117
    .line 118
    const-string v4, "event_id"

    .line 119
    .line 120
    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v7, 0x0

    .line 130
    const-string v1, "event_metadata"

    .line 131
    .line 132
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    new-instance v1, Lcom/google/android/datatransport/runtime/scheduling/persistence/f;

    .line 139
    .line 140
    const/4 v2, 0x1

    .line 141
    invoke-direct {v1, v2, p1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/f;-><init>(ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-static {v0, v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore;->N(Landroid/database/Cursor;Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Function;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/util/ArrayList;->listIterator()Ljava/util/ListIterator;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    :goto_4
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_7

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    check-cast v1, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;

    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->b()J

    .line 164
    .line 165
    .line 166
    move-result-wide v2

    .line 167
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    invoke-virtual {p1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-nez v2, :cond_5

    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_5
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->a()Lcom/google/android/datatransport/runtime/EventInternal;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-virtual {v2}, Lcom/google/android/datatransport/runtime/EventInternal;->j()Lcom/google/android/datatransport/runtime/EventInternal$Builder;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->b()J

    .line 187
    .line 188
    .line 189
    move-result-wide v3

    .line 190
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    check-cast v3, Ljava/util/Set;

    .line 199
    .line 200
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v4

    .line 208
    if-eqz v4, :cond_6

    .line 209
    .line 210
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Metadata;

    .line 215
    .line 216
    iget-object v5, v4, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Metadata;->a:Ljava/lang/String;

    .line 217
    .line 218
    iget-object v4, v4, Lcom/google/android/datatransport/runtime/scheduling/persistence/SQLiteEventStore$Metadata;->b:Ljava/lang/String;

    .line 219
    .line 220
    invoke-virtual {v2, v5, v4}, Lcom/google/android/datatransport/runtime/EventInternal$Builder;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    goto :goto_5

    .line 224
    :cond_6
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->b()J

    .line 225
    .line 226
    .line 227
    move-result-wide v3

    .line 228
    invoke-virtual {v1}, Lcom/google/android/datatransport/runtime/scheduling/persistence/PersistedEvent;->c()Lcom/google/android/datatransport/runtime/TransportContext;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v2}, Lcom/google/android/datatransport/runtime/EventInternal$Builder;->b()Lcom/google/android/datatransport/runtime/EventInternal;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    new-instance v5, Lcom/google/android/datatransport/runtime/scheduling/persistence/AutoValue_PersistedEvent;

    .line 237
    .line 238
    invoke-direct {v5, v3, v4, v1, v2}, Lcom/google/android/datatransport/runtime/scheduling/persistence/AutoValue_PersistedEvent;-><init>(JLcom/google/android/datatransport/runtime/TransportContext;Lcom/google/android/datatransport/runtime/EventInternal;)V

    .line 239
    .line 240
    .line 241
    invoke-interface {v0, v5}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    goto :goto_4

    .line 245
    :cond_7
    return-object v8
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
