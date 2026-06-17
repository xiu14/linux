.class public final La6/b;
.super Ljava/lang/Object;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public final a:Ljava/util/List;

.field public b:I

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "connectionSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La6/b;->a:Ljava/util/List;

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
.end method


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Lw5/j;
    .locals 14

    .line 1
    iget v0, p0, La6/b;->b:I

    .line 2
    .line 3
    iget-object v1, p0, La6/b;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    :goto_0
    const/4 v3, 0x1

    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v4

    .line 16
    check-cast v4, Lw5/j;

    .line 17
    .line 18
    invoke-virtual {v4, p1}, Lw5/j;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    if-eqz v5, :cond_0

    .line 23
    .line 24
    add-int/2addr v0, v3

    .line 25
    iput v0, p0, La6/b;->b:I

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v4, 0x0

    .line 32
    :goto_1
    if-eqz v4, :cond_b

    .line 33
    .line 34
    iget v0, p0, La6/b;->b:I

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    :goto_2
    const/4 v5, 0x0

    .line 41
    if-ge v0, v2, :cond_3

    .line 42
    .line 43
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, Lw5/j;

    .line 48
    .line 49
    invoke-virtual {v6, p1}, Lw5/j;->b(Ljavax/net/ssl/SSLSocket;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    goto :goto_3

    .line 57
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    const/4 v0, 0x0

    .line 61
    :goto_3
    iput-boolean v0, p0, La6/b;->c:Z

    .line 62
    .line 63
    iget-boolean v0, p0, La6/b;->d:Z

    .line 64
    .line 65
    iget-object v1, v4, Lw5/j;->d:[Ljava/lang/String;

    .line 66
    .line 67
    iget-object v2, v4, Lw5/j;->c:[Ljava/lang/String;

    .line 68
    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    const-string v7, "sslSocket.enabledCipherSuites"

    .line 76
    .line 77
    invoke-static {v6, v7}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    sget-object v7, Lw5/h;->c:Lw5/g;

    .line 81
    .line 82
    invoke-static {v6, v2, v7}, Lx5/b;->n([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    goto :goto_4

    .line 87
    :cond_4
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    :goto_4
    if-eqz v1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    const-string v8, "sslSocket.enabledProtocols"

    .line 98
    .line 99
    invoke-static {v7, v8}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    sget-object v8, Ls4/a;->b:Ls4/a;

    .line 103
    .line 104
    invoke-static {v7, v1, v8}, Lx5/b;->n([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    goto :goto_5

    .line 109
    :cond_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    :goto_5
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSupportedCipherSuites()[Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    const-string v9, "supportedCipherSuites"

    .line 118
    .line 119
    invoke-static {v8, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    sget-object v9, Lw5/h;->c:Lw5/g;

    .line 123
    .line 124
    sget-object v10, Lx5/b;->a:[B

    .line 125
    .line 126
    array-length v10, v8

    .line 127
    :goto_6
    const/4 v11, -0x1

    .line 128
    if-ge v5, v10, :cond_7

    .line 129
    .line 130
    aget-object v12, v8, v5

    .line 131
    .line 132
    const-string v13, "TLS_FALLBACK_SCSV"

    .line 133
    .line 134
    invoke-virtual {v9, v12, v13}, Lw5/g;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-nez v12, :cond_6

    .line 139
    .line 140
    goto :goto_7

    .line 141
    :cond_6
    add-int/lit8 v5, v5, 0x1

    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_7
    const/4 v5, -0x1

    .line 145
    :goto_7
    const-string v9, "cipherSuitesIntersection"

    .line 146
    .line 147
    if-eqz v0, :cond_8

    .line 148
    .line 149
    if-eq v5, v11, :cond_8

    .line 150
    .line 151
    invoke-static {v6, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    aget-object v0, v8, v5

    .line 155
    .line 156
    const-string v5, "supportedCipherSuites[indexOfFallbackScsv]"

    .line 157
    .line 158
    invoke-static {v0, v5}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    array-length v5, v6

    .line 162
    add-int/2addr v5, v3

    .line 163
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    const-string v6, "copyOf(this, newSize)"

    .line 168
    .line 169
    invoke-static {v5, v6}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    move-object v6, v5

    .line 173
    check-cast v6, [Ljava/lang/String;

    .line 174
    .line 175
    array-length v5, v6

    .line 176
    sub-int/2addr v5, v3

    .line 177
    aput-object v0, v6, v5

    .line 178
    .line 179
    :cond_8
    new-instance v0, Landroidx/appcompat/widget/z3;

    .line 180
    .line 181
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    iget-boolean v3, v4, Lw5/j;->a:Z

    .line 185
    .line 186
    iput-boolean v3, v0, Landroidx/appcompat/widget/z3;->a:Z

    .line 187
    .line 188
    iput-object v2, v0, Landroidx/appcompat/widget/z3;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object v1, v0, Landroidx/appcompat/widget/z3;->d:Ljava/io/Serializable;

    .line 191
    .line 192
    iget-boolean v1, v4, Lw5/j;->b:Z

    .line 193
    .line 194
    iput-boolean v1, v0, Landroidx/appcompat/widget/z3;->b:Z

    .line 195
    .line 196
    invoke-static {v6, v9}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    array-length v1, v6

    .line 200
    invoke-static {v6, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    check-cast v1, [Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/z3;->b([Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const-string v1, "tlsVersionsIntersection"

    .line 210
    .line 211
    invoke-static {v7, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    array-length v1, v7

    .line 215
    invoke-static {v7, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, [Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/z3;->d([Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Landroidx/appcompat/widget/z3;->a()Lw5/j;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v0}, Lw5/j;->c()Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    if-eqz v1, :cond_9

    .line 233
    .line 234
    iget-object v1, v0, Lw5/j;->d:[Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p1, v1}, Ljavax/net/ssl/SSLSocket;->setEnabledProtocols([Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_9
    invoke-virtual {v0}, Lw5/j;->a()Ljava/util/List;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    iget-object v0, v0, Lw5/j;->c:[Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {p1, v0}, Ljavax/net/ssl/SSLSocket;->setEnabledCipherSuites([Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    :cond_a
    return-object v4

    .line 251
    :cond_b
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 252
    .line 253
    new-instance v2, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v3, "Unable to find acceptable protocols. isFallback="

    .line 256
    .line 257
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    iget-boolean v3, p0, La6/b;->d:Z

    .line 261
    .line 262
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    const-string v3, ", modes="

    .line 266
    .line 267
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    const-string v1, ", supported protocols="

    .line 274
    .line 275
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-static {p1}, Lkotlin/jvm/internal/j;->b(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-string v1, "toString(this)"

    .line 290
    .line 291
    invoke-static {p1, v1}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-direct {v0, p1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    throw v0
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
