.class public final Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;
.super Landroidx/appcompat/app/u;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# instance fields
.field public h:Ljava/lang/String;

.field public i:I

.field public j:I

.field public k:Z

.field public l:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/u;-><init>()V

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


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/q0;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget p1, Lcom/github/javiersantos/piracychecker/R$layout;->activity_license:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setContentView(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v1, "content"

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v0

    .line 24
    :goto_0
    const-string v1, ""

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move-object p1, v1

    .line 30
    :goto_1
    iput-object p1, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->h:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    sget v2, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimary:I

    .line 39
    .line 40
    invoke-static {p0, v2}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    const-string v3, "colorPrimary"

    .line 45
    .line 46
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    sget p1, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimary:I

    .line 52
    .line 53
    invoke-static {p0, p1}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    :goto_2
    iput p1, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->i:I

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    sget v2, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimaryDark:I

    .line 66
    .line 67
    invoke-static {p0, v2}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const-string v3, "colorPrimaryDark"

    .line 72
    .line 73
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    goto :goto_3

    .line 78
    :cond_3
    sget p1, Lcom/github/javiersantos/piracychecker/R$color;->colorPrimaryDark:I

    .line 79
    .line 80
    invoke-static {p0, p1}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    :goto_3
    iput p1, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->j:I

    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const/4 v2, 0x0

    .line 91
    if-eqz p1, :cond_4

    .line 92
    .line 93
    const-string v3, "withLightStatusBar"

    .line 94
    .line 95
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    goto :goto_4

    .line 100
    :cond_4
    const/4 p1, 0x0

    .line 101
    :goto_4
    iput-boolean p1, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->k:Z

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/4 v3, -0x1

    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    const-string v4, "layoutXML"

    .line 111
    .line 112
    invoke-virtual {p1, v4, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    goto :goto_5

    .line 117
    :cond_5
    const/4 p1, -0x1

    .line 118
    :goto_5
    iput p1, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->l:I

    .line 119
    .line 120
    sget p1, Lcom/github/javiersantos/piracychecker/R$id;->toolbar:I

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    instance-of v4, p1, Landroidx/appcompat/widget/Toolbar;

    .line 127
    .line 128
    if-nez v4, :cond_6

    .line 129
    .line 130
    move-object p1, v0

    .line 131
    :cond_6
    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    .line 132
    .line 133
    if-eqz p1, :cond_7

    .line 134
    .line 135
    iget v4, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->i:I

    .line 136
    .line 137
    invoke-static {p0, v4}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 142
    .line 143
    .line 144
    :cond_7
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Landroidx/appcompat/app/u;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-eqz p1, :cond_d

    .line 152
    .line 153
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    if-eqz v4, :cond_8

    .line 158
    .line 159
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-eqz v4, :cond_8

    .line 168
    .line 169
    goto :goto_6

    .line 170
    :catch_0
    nop

    .line 171
    goto :goto_7

    .line 172
    :cond_8
    move-object v4, v1

    .line 173
    :goto_6
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_8

    .line 178
    :goto_7
    move-object v4, v1

    .line 179
    :goto_8
    invoke-static {v4}, Ll5/e;->t0(Ljava/lang/String;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-nez v5, :cond_9

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-lez v5, :cond_9

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_9
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    if-eqz v4, :cond_a

    .line 197
    .line 198
    iget v2, v4, Landroid/content/pm/ApplicationInfo;->labelRes:I

    .line 199
    .line 200
    :cond_a
    if-nez v2, :cond_b

    .line 201
    .line 202
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    if-eqz v2, :cond_c

    .line 207
    .line 208
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->nonLocalizedLabel:Ljava/lang/CharSequence;

    .line 209
    .line 210
    if-eqz v2, :cond_c

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    if-eqz v2, :cond_c

    .line 217
    .line 218
    move-object v1, v2

    .line 219
    goto :goto_9

    .line 220
    :cond_b
    :try_start_1
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 224
    :catch_1
    const-string v2, "try {\n            getStr\u2026\n            \"\"\n        }"

    .line 225
    .line 226
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    :cond_c
    :goto_9
    move-object v4, v1

    .line 230
    :goto_a
    invoke-virtual {p1, v4}, Landroidx/appcompat/app/a;->u(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :cond_d
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 234
    .line 235
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const-string v2, "window"

    .line 240
    .line 241
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    iget v4, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->j:I

    .line 245
    .line 246
    invoke-static {p0, v4}, Lq3/a;->D(Landroid/content/Context;I)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-virtual {v1, v4}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    const-string v2, "window.decorView"

    .line 265
    .line 266
    invoke-static {v1, v2}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-boolean v2, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->k:Z

    .line 270
    .line 271
    const/16 v4, 0x17

    .line 272
    .line 273
    if-lt p1, v4, :cond_f

    .line 274
    .line 275
    invoke-virtual {v1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-eqz v2, :cond_e

    .line 280
    .line 281
    or-int/lit16 p1, p1, 0x2000

    .line 282
    .line 283
    goto :goto_b

    .line 284
    :cond_e
    and-int/lit16 p1, p1, -0x2001

    .line 285
    .line 286
    :goto_b
    invoke-virtual {v1, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 287
    .line 288
    .line 289
    :cond_f
    sget p1, Lcom/github/javiersantos/piracychecker/R$id;->mainContainer:I

    .line 290
    .line 291
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/u;->findViewById(I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object p1

    .line 295
    check-cast p1, Landroid/widget/FrameLayout;

    .line 296
    .line 297
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    iget v2, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->l:I

    .line 302
    .line 303
    if-ne v2, v3, :cond_10

    .line 304
    .line 305
    sget v2, Lcom/github/javiersantos/piracychecker/R$layout;->activity_license_default:I

    .line 306
    .line 307
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    sget v1, Lcom/github/javiersantos/piracychecker/R$id;->piracy_checker_description:I

    .line 312
    .line 313
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Landroid/widget/TextView;

    .line 318
    .line 319
    if-eqz v1, :cond_11

    .line 320
    .line 321
    iget-object v2, p0, Lcom/github/javiersantos/piracychecker/activities/LicenseActivity;->h:Ljava/lang/String;

    .line 322
    .line 323
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 324
    .line 325
    .line 326
    goto :goto_c

    .line 327
    :cond_10
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    :cond_11
    :goto_c
    if-eqz v0, :cond_12

    .line 332
    .line 333
    if-eqz p1, :cond_12

    .line 334
    .line 335
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 336
    .line 337
    .line 338
    :cond_12
    return-void
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
