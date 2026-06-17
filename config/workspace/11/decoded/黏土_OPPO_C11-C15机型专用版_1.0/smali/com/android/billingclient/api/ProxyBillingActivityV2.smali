.class public Lcom/android/billingclient/api/ProxyBillingActivityV2;
.super Lb/q;
.source "r8-map-id-5389b39850ea3af500c7854811bd81da73ae8b6ea4d88eb7ca022411f1b5d3c1"


# annotations
.annotation build Lcom/google/android/apps/common/proguard/UsedByReflection;
    value = "PlatformActivityProxy"
.end annotation


# instance fields
.field public h:Ld/c;

.field public i:Ld/c;

.field public j:Ld/c;

.field public k:Landroid/os/ResultReceiver;

.field public l:Landroid/os/ResultReceiver;

.field public m:Landroid/os/ResultReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb/q;-><init>()V

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
    .locals 8

    .line 1
    invoke-super {p0, p1}, Lb/q;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/fragment/app/e1;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, Landroidx/fragment/app/e1;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lp3/g0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, Lp3/g0;-><init>(Lcom/android/billingclient/api/ProxyBillingActivityV2;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lb/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->h:Ld/c;

    .line 21
    .line 22
    new-instance v0, Landroidx/fragment/app/e1;

    .line 23
    .line 24
    const/4 v1, 0x3

    .line 25
    invoke-direct {v0, v1}, Landroidx/fragment/app/e1;-><init>(I)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lp3/g0;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-direct {v1, p0, v2}, Lp3/g0;-><init>(Lcom/android/billingclient/api/ProxyBillingActivityV2;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lb/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->i:Ld/c;

    .line 39
    .line 40
    new-instance v0, Landroidx/fragment/app/e1;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {v0, v1}, Landroidx/fragment/app/e1;-><init>(I)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lp3/g0;

    .line 47
    .line 48
    const/4 v2, 0x2

    .line 49
    invoke-direct {v1, p0, v2}, Lp3/g0;-><init>(Lcom/android/billingclient/api/ProxyBillingActivityV2;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v0, v1}, Lb/q;->registerForActivityResult(Le/a;Ld/b;)Ld/c;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->j:Ld/c;

    .line 57
    .line 58
    const-string v0, "external_offer_flow_result_receiver"

    .line 59
    .line 60
    const-string v1, "external_payment_dialog_result_receiver"

    .line 61
    .line 62
    const-string v2, "alternative_billing_only_dialog_result_receiver"

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    const-string p1, "ProxyBillingActivityV2"

    .line 67
    .line 68
    const-string v3, "Launching Play Store billing dialog"

    .line 69
    .line 70
    invoke-static {p1, v3}, Lcom/google/android/gms/internal/play_billing/zzc;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v3, "ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT"

    .line 78
    .line 79
    invoke-virtual {p1, v3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const-string v4, "pendingIntent.intentSender"

    .line 84
    .line 85
    const-string v5, "pendingIntent"

    .line 86
    .line 87
    const/4 v6, 0x0

    .line 88
    const/4 v7, 0x0

    .line 89
    if-eqz p1, :cond_0

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    check-cast p1, Landroid/app/PendingIntent;

    .line 100
    .line 101
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroid/os/ResultReceiver;

    .line 110
    .line 111
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->k:Landroid/os/ResultReceiver;

    .line 112
    .line 113
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->h:Ld/c;

    .line 114
    .line 115
    invoke-static {p1, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, Ld/j;

    .line 126
    .line 127
    invoke-direct {v1, p1, v6, v7, v7}, Ld/j;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1, v6}, Ld/c;->a(Ljava/lang/Object;Lb0/j;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    const-string v2, "external_payment_dialog_pending_intent"

    .line 139
    .line 140
    invoke-virtual {p1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    if-eqz p1, :cond_1

    .line 145
    .line 146
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Landroid/app/PendingIntent;

    .line 155
    .line 156
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    invoke-virtual {v0, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, Landroid/os/ResultReceiver;

    .line 165
    .line 166
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->l:Landroid/os/ResultReceiver;

    .line 167
    .line 168
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->i:Ld/c;

    .line 169
    .line 170
    invoke-static {p1, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-static {p1, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Ld/j;

    .line 181
    .line 182
    invoke-direct {v1, p1, v6, v7, v7}, Ld/j;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1, v6}, Ld/c;->a(Ljava/lang/Object;Lb0/j;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const-string v1, "external_offer_flow_pending_intent"

    .line 194
    .line 195
    invoke-virtual {p1, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_5

    .line 200
    .line 201
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Landroid/app/PendingIntent;

    .line 210
    .line 211
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {v1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    check-cast v0, Landroid/os/ResultReceiver;

    .line 220
    .line 221
    iput-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->m:Landroid/os/ResultReceiver;

    .line 222
    .line 223
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->j:Ld/c;

    .line 224
    .line 225
    invoke-static {p1, v5}, Lkotlin/jvm/internal/j;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    invoke-static {p1, v4}, Lkotlin/jvm/internal/j;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    new-instance v1, Ld/j;

    .line 236
    .line 237
    invoke-direct {v1, p1, v6, v7, v7}, Ld/j;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v0, v1, v6}, Ld/c;->a(Ljava/lang/Object;Lb0/j;)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    if-eqz v3, :cond_3

    .line 249
    .line 250
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, Landroid/os/ResultReceiver;

    .line 255
    .line 256
    iput-object v2, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->k:Landroid/os/ResultReceiver;

    .line 257
    .line 258
    :cond_3
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v2

    .line 262
    if-eqz v2, :cond_4

    .line 263
    .line 264
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    check-cast v1, Landroid/os/ResultReceiver;

    .line 269
    .line 270
    iput-object v1, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->l:Landroid/os/ResultReceiver;

    .line 271
    .line 272
    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 273
    .line 274
    .line 275
    move-result v1

    .line 276
    if-eqz v1, :cond_5

    .line 277
    .line 278
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    check-cast p1, Landroid/os/ResultReceiver;

    .line 283
    .line 284
    iput-object p1, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->m:Landroid/os/ResultReceiver;

    .line 285
    .line 286
    :cond_5
    return-void
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

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lb/q;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->k:Landroid/os/ResultReceiver;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v1, "alternative_billing_only_dialog_result_receiver"

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->l:Landroid/os/ResultReceiver;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const-string v1, "external_payment_dialog_result_receiver"

    .line 18
    .line 19
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/android/billingclient/api/ProxyBillingActivityV2;->m:Landroid/os/ResultReceiver;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const-string v1, "external_offer_flow_result_receiver"

    .line 27
    .line 28
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
